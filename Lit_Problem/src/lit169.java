
import java.util.Scanner;

public class lit169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
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

        int majority = majorityElement(nums);
        System.out.println("Элемент большинства: " + majority);
    }
}
