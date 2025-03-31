
import java.util.*;

public class lit2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, Integer> countMap = new HashMap<>();

        addUniqueElements(nums1, countMap);
        addUniqueElements(nums2, countMap);
        addUniqueElements(nums3, countMap);

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= 2) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    private static void addUniqueElements(int[] nums, Map<Integer, Integer> countMap) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        for (int num : uniqueElements) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String[] args) {
        lit2032 solution = new lit2032();

        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};

        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        System.out.println("Числа, встречающиеся минимум в двух массивах: " + result);
    }
}
