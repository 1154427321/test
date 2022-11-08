import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.CoordinateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class 生成活动轨迹sql {
    public static void main(String[] args) {
        String path = "DDDDWWWDDDDWWWWZZZZZZDDDDDWWWWWSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSAASSSSAASSSSSSSSSSSSSSSSSSSSSS";
        List<Coordinate> fakeHistoryData = getFakeHistoryData(path, 0.0003, new Coordinate("108.96696819402877,34.34323179644999"));
        DateTime date = DateUtil.parse("2022-10-20 12:00:00.0");

        for (Coordinate coordinate:fakeHistoryData) {
            System.out.print("insert into device_operation_track ( id, device_id, positioning_time, longitude_latitude, create_time ) values ( replace(UUID(),'-',''), 212, '" +
                    date.toString() + "','"+
                    coordinate.lng.doubleValue()+","+coordinate.lat.doubleValue()+"', " +
                    "'2022-10-14 14:21:25.247' );\n");
            date = date.offset(DateField.SECOND, 5);
        }
    }

    /**
     * 根据移动路径获取坐标点列表
     *
     * @param path 输入前进方向 W上北 S下南 A左西 D右东 Z停滞
     * @param distance 坐标移动距离
     * @param coordinate 输入起始坐标点
     * @return
     */
    public static List<Coordinate> getFakeHistoryData(String path,
                                                      double distance,
                                                      Coordinate coordinate){
        List<Coordinate> reuslt = new ArrayList<>();

        Coordinate tmp = coordinate;
        String[] pathArray = path.split("");
        for (int i = 0; i < pathArray.length; i++) {
            switch (pathArray[i]){
                case "W":{
                    tmp = new Coordinate(tmp.lng, tmp.lat.add(new BigDecimal(distance)));
                    reuslt.add(tmp);
                    break;
                }
                case "S":{
                    tmp = new Coordinate(tmp.lng, tmp.lat.subtract(new BigDecimal(distance)));
                    reuslt.add(tmp);
                    break;
                }
                case "A":{
                    tmp = new Coordinate(tmp.lng.subtract(new BigDecimal(distance)), tmp.lat );
                    reuslt.add(tmp);
                    break;
                }
                case "D":{
                    tmp = new Coordinate(tmp.lng.add(new BigDecimal(distance)), tmp.lat );
                    reuslt.add(tmp);
                    break;
                }
                case "Z":{
                    reuslt.add(tmp);
                    break;
                }

            }
        }
        return reuslt;
    }
}
class Coordinate implements Serializable {

    //经度
    BigDecimal lng;

    //纬度
    BigDecimal lat;


    public Coordinate() {
    }

    /**
     * 坐标实体类有参构造
     * @param lng 经度
     * @param lat 纬度
     */
    public Coordinate(Double lng, Double lat) {
        this.lng = new BigDecimal(lng);
        this.lat = new BigDecimal(lat);
    }

    /**
     * 坐标实体类有参构造
     * @param lng 经度
     * @param lat 纬度
     */
    public Coordinate(BigDecimal lng, BigDecimal lat) {
        this.lng = lng;
        this.lat = lat;
    }

    /**
     * 逗号分隔坐标字符串 坐标实体类
     * @param coordinate 逗号分隔坐标字符串
     */
    public Coordinate(String coordinate) {
        String[] strs = new String[2];
        if (coordinate.contains(",")) {
            strs = coordinate.split(",");
        }
        if (coordinate.contains("-")) {
            strs = coordinate.split("-");
        }
        this.lng = new BigDecimal(strs[0]);
        this.lat = new BigDecimal(strs[1]);
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "lng='" + lng.doubleValue() + '\'' +
                ", lat='" + lat.doubleValue() + '\'' +
                '}';
    }
}
