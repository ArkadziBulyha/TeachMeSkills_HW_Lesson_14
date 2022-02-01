package Task1;

import Task1.ArrayInt;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> listInt = ArrayInt.randIntGenerator();
        System.out.println(listInt);

        List<Integer> justList = listInt.stream()
                .distinct()
                .filter(n -> (n % 2 == 0) && n >= 7 && n <= 17)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Без дубликатов с чётными цифрами в диапазоне от 7 до 17 и умноженные на 2: " + justList);

        long countInt = listInt.stream()
                .count();
        System.out.println("Количество чисел " + countInt);

        double sum = listInt.stream()
                .mapToInt(Integer::intValue)
                .sum() / (double) listInt.size();
        System.out.println("Среднее арифметическое чисел = " + sum);

    }
}
