package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudList {
    public static void main(String[] args) {

        List<String> studList = generateArray();

        System.out.println("Список студентов группы: " + studList);

        long countName = studList.stream()
                .filter(n -> n.equalsIgnoreCase("Arkadiy"))
                .count();

        System.out.println("Количество людей с именем Аркадий: " + countName);

        List<String> filterName = studList.stream()
                .map(String::toUpperCase)
                .filter(n -> n.toUpperCase().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Имена начинающиеся с буквы А: " + filterName);

        Optional<String> filterName2 = studList.stream()
                .map(String::toUpperCase)
                .sorted()
                .findFirst();

        System.out.println("Сортировка и возврат первого элемента: " + filterName2);

    }

    static ArrayList<String> generateArray() {

        ArrayList<String> arrayStr = new ArrayList<>();

        arrayStr.add("arkadiy");
        arrayStr.add("Andrian");
        arrayStr.add("Maksim");
        arrayStr.add("ivan");
        arrayStr.add("Igor");
        arrayStr.add("Katerina");
        arrayStr.add("Vladimir");
        arrayStr.add("Jana");
        arrayStr.add("Daniil");

        return arrayStr;
    }
}
