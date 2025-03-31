
import java.util.HashMap;
import java.util.Scanner;

public class lit2006 {
    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count += map.getOrDefault(num - k, 0);
            count += map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Введите значение k: ");
        int k = scanner.nextInt();

        int result = countKDifference(nums, k);
        System.out.println("Количество пар: " + result);
    }
}
