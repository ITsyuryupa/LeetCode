package ITsyuryupa;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {

        int max = nums[0];
        int curent_max = nums[0];

        for(int i = 1; i < nums.length; i++){
            int num = nums[i];

            curent_max = Math.max(curent_max + num, num);
            max = Math.max(curent_max, max);
        }

        return max;
    }
}
