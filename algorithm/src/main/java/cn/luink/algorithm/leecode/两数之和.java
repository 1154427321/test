package cn.luink.algorithm.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        int[] ints = twoSum(nums1, 9);

        System.out.println("["+ints[0]+","+ints[1]+"]");

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
