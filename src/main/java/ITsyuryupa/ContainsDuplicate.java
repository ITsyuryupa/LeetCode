package ITsyuryupa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public static Boolean containsDuplicateHashMap(int[] nums) {
        Hashtable<Integer, Integer> numH = new Hashtable<>();
        for (int num : nums) {
            if (numH.containsKey(num)) {
                return true;
            } else {
                numH.put(num, 1);
            }
        }
        return false;
    }

    public static Boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> numHS = new HashSet<>();

        for (int num : nums) {
            if (numHS.contains(num)) {
                return true;
            } else {
                numHS.add(num);
            }
        }
        return false;
    }

    public static Boolean containsDuplicateHashSetStreamAPI(int[] nums) {
        HashSet<Integer> numHS = new HashSet<>();

        return IntStream.of(nums).anyMatch(numHS::add);
    }

    public static Boolean containsDuplicateArrSort(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static Boolean containsDuplicateArrSortStreamAPI(int[] nums) {
        Arrays.sort(nums);

        return Arrays.stream(nums).anyMatch(i -> nums[i] == nums[i + 1]);
    }

    public static Boolean containsDuplicateArrSortStreamAPIDistinct(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
    }
}
