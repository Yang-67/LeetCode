public class Offer53_1 {
    public int search(int[] nums, int target) {
        int count = 0;
        for(int num:nums){
            if(num==target){
                count++;
            }
        }
        return count;
    }
}

/**
 *统计一个数字在排序数组中出现的次数。
 */