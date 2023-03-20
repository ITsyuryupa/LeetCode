package ITsyuryupa;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public static int missingNumberSet(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        for (int i = 0; i <= n; i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return -1;
    }

    public static int missingNumberArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }

        return n;
    }

    public static int missingNumberSum(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums){
            sum += num;
        }
        return (1+n)*n/2 - sum;
    }

    public static int missingNumberSum2(int[] nums) {
        return (1+nums.length)*nums.length/2 - Arrays.stream(nums).sum();
    }

}
