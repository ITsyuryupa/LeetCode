package ITsyuryupa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbersSet(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for (int i = 1; i <= n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static List<Integer> findDisappearedNumbersCyclicSort(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while(i < n){
            int pos = nums[i] - 1;
            if (nums[i] != nums[pos]) {
                //equal nums[i], nums[pos] = nums[pos], nums[i]
                nums[i] = nums[pos] + nums[i];
                nums[pos] = nums[i] - nums[pos];
                nums[i] = nums[i] - nums[pos];
            } else {
                i += 1;
            }
        }

        for (i = 1; i <= n; i++){
            if (nums[i - 1] != i) {
                ans.add(i);
            }
        }
        return ans;
    }
}
