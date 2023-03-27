package cn.luink.algorithm.leecode;

public class 字符串轮转 {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";

        String s3 = "abc";
        String s4 = "a";

        System.out.println(isFlipedString(s1,s2));
    }

    public static boolean isFlipedString(String s1, String s2) {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return true;
            }
            return false;
        }
        String s3 = s1+s1;

        return s3.contains(s2);
    }
}
