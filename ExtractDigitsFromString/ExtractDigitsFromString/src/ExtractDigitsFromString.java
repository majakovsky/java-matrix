import java.util.ArrayList;
import java.util.List;

public class ExtractDigitsFromString {
    public static void main(String[] args) {
        String input = "I have 3 cats, 4 dogs, and 1 turtle";
        List<Integer> box = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                box.add(Character.getNumericValue(c));
            }
        }

        // Преобразуем список в массив
        int[] digitArray = box.stream().mapToInt(i -> i).toArray();
        // Выводим массив для проверки
        for (int num : digitArray) {
            System.out.print(num + " ");
        }
    }
}