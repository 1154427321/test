import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 获取英雄联盟英雄列表 {
    public static void main(String[] args) {
        //请求列表
        String s = HttpUtil.get("https://game.gtimg.cn/images/lol/act/img/js/heroList/hero_list.js");
        //转为jsonObject
        JSONObject jsonObject = new JSONObject(s);

        //获取其中英雄列表JSONArray
        JSONArray array =JSONUtil.parseArray(jsonObject.get("hero"));
        //转为英雄对象实例
        List<Hero> heroList = JSONUtil.toList(array, Hero.class);

        //获取每个英雄第一定位（战士、法师、辅助、坦克、射手）
        heroList.forEach(item ->{
            Object o = item.getRoles().get(0);
            String roleName = o.toString();
            item.setRole(roleName);
        });
        //根据英雄定位分组
        Map<String, List<Hero>> collect = heroList.stream()
                .collect(Collectors.groupingBy(Hero::getRole));

        //转为typora markdown语法输出
        collect.forEach((roleN,item) ->{
            System.out.println("## " +roleN);
            item.forEach(hero -> {
                System.out.println("- [ ] "+hero.name+" "+hero.getTitle());
            });
        });



    }
}
class Hero{
    //称号
    String name;

    //英雄名
    String title;

    //英雄定位
    String role;

    JSONArray roles;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public JSONArray getRoles() {
        return roles;
    }

    public void setRoles(JSONArray roles) {
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
