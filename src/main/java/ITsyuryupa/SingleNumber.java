package ITsyuryupa;

import java.util.Arrays;

public class SingleNumber {
    public static int singleNumberArrSort(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i+=2){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static int singleNumberXor(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }
        return ans;
    }
}
