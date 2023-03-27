package cn.luink.algorithm.test;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test02 {
    public static void main(String[] args) {
        Integer[][] aa = new Integer[][]{{0,1},{0,1},{0,1,3},{1,55,9,4},{1,2}};
        Map<Integer,String> map = new HashMap<>(){{
            put(1,"Aa");
            put(3,"Bb");
            put(5,"Cc");
            put(7,"Dd");
            put(2,"Zz");
        }};
        var str = map.entrySet().stream()
                .sorted((o1, o2) -> o1.getKey()-o2.getKey())
                .map(Map.Entry::getValue)
                .reduce("",(res,elm)-> res+elm);
        System.out.println(str);

    }
}
