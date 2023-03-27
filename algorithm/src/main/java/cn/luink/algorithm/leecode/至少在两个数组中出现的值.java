package cn.luink.algorithm.leecode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 2032. 至少在两个数组中出现的值
 * 给你三个整数数组 nums1、nums2 和 nums3 ，请你构造并返回一个 元素各不相同的 数组，且由 至少 在 两个 数组中出现的所有值组成。数组中的元素可以按 任意 顺序排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
 * 输出：[3,2]
 * 解释：至少在两个数组中出现的所有值为：
 * - 3 ，在全部三个数组中都出现过。
 * - 2 ，在数组 nums1 和 nums2 中出现过。
 *
 * 示例 2：
 *
 * 输入：nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
 * 输出：[2,3,1]
 * 解释：至少在两个数组中出现的所有值为：
 * - 2 ，在数组 nums2 和 nums3 中出现过。
 * - 3 ，在数组 nums1 和 nums2 中出现过。
 * - 1 ，在数组 nums1 和 nums3 中出现过。
 *
 * 示例 3：
 *
 * 输入：nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
 * 输出：[]
 * 解释：不存在至少在两个数组中出现的值。
 */
public class 至少在两个数组中出现的值 {
    public static void main(String[] args) {

    }

    /**
     * 传入数组 将角标作为数字 对应的元素作为数字出现的次数
     * @param nums
     * @return
     */
    private static int[] get(int[] nums) {
        //创建1到100的数组（题目规定范围）
        int[] s = new int[101];
        for (int num : nums) {
            s[num] = 1;
        }
        return s;
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] i1 = get(nums1);
        int[] i2 = get(nums2);
        int[] i3 = get(nums3);

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < i1.length; i++) {
            //如果三个数组中统一角标中的元素相加大于1则认为当前数字出现次数大于1
            if (i1[i] + i2[i] + i3[i] > 1) {
                res.add(i);
            }
        }

        return res;
    }
}
