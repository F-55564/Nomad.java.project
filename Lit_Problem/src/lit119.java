import java.util.ArrayList;
import java.util.List;

public class lit119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }

        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 5;
        List<Integer> row = getRow(rowIndex);

        System.out.println("Строка " + rowIndex + " треугольника Паскаля:");
        System.out.println(row);
    }
}
