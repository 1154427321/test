package cn.luink.algorithm.leecode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1694. 重新格式化电话号码
 */
public class 重新格式化电话号码 {
    public static void main(String[] args) {
        String str1 = "1-23-45 6";
        String str2 = "123 4-567";
        String str3 = "123 4-5678";
        String str4 = "12";
        String str5 = "--17-5 229 35-394756";
        String str6 = "--17-5 2";
        System.out.println(reformatNumber(str6));
    }

    public static String reformatNumber(String number) {
        StringBuffer stringBuffer = new StringBuffer();
        //分隔字符
        number = number.replace("-", "")
                .replace(" ", "");

        //计数下标
        int index = 0;
        //开始循环 每次index+3 到总长度-4为止 总长小于4不进入循环
        for (;index < number.length() -4; index = index + 3) {
            //每次截取当前下标后3位 加分隔-
            stringBuffer.append(number.substring(index,index+3));
            stringBuffer.append("-");
        }
        //处理后四位，改为截取两位并增加计数
        if(number.length() - index == 4){
            stringBuffer.append(number.substring(index,index+2));
            stringBuffer.append("-");
            index = index + 2;
        }
        //如果小于4则直接加
        stringBuffer.append(number.substring(index));
        return stringBuffer.toString();
    }
}
