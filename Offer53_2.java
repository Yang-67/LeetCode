public class Offer53_2 {
    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1];
        int flag = 0;
        for (int num : nums) {
            arr[num]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                flag = i;
        }
        return flag;
    }
}


/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */