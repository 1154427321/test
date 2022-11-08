package cn.luink.algorithm.leecode;

/**
 * 704. 二分查找
 */
public class 二分查找 {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        int[] nums2 = {-1,0,3,5,9,12};
        int[] nums3 = new int[100];
        for (int i = 1; i < nums3.length; i++) {
            nums3[i] = 2*i;
        }
        int search = search(nums3, 94);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        //定义首尾数组下标
        int m = 0;
        int n = nums.length-1;
        int i =1;
        while(m<=n){
            //获取中间下标,加起始位是因为要记录上次最左边下标以缩小范围
            int mid = (n-m)/2 + m;
            System.out.println("第"+i+"次循环");
            System.out.println("n："+n);
            System.out.println("m："+m);
            System.out.println("中间数下标："+mid);
            System.out.println("中间数："+nums[mid]);
            //获取下标为mid的数
            int num = nums[mid];
            if(num == target){
                return mid;
            }
            //左
            if(num > target){
                //中间下标向前,进入下次循环
                n=mid-1;
            }
            //右
            if(num < target){
                //中间下标向后,进入下次循环
                m=mid+1;
            }
            i++;

        }

        return -1;
    }
}
