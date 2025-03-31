
import java.util.HashMap;

public class lit1995{
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();


        for (int d = n - 1; d >= 3; d--) {

            map.put(nums[d], map.getOrDefault(nums[d], 0) + 1);

            for (int a = 0; a < d - 2; a++) {
                for (int b = a + 1; b < d - 1; b++) {
                    for (int c = b + 1; c < d; c++) {
                        int sum = nums[a] + nums[b] + nums[c];

                        count += map.getOrDefault(sum, 0);
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        lit1995 solution = new lit1995();

        int[] nums1 = {1, 2, 3, 6};
        System.out.println("Вывод: " + solution.countQuadruplets(nums1));
    }
}
