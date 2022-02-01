package Task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayInt {
    public static List<Integer> randIntGenerator() {
        return new Random()
                .ints(14, 1, 18)
                .boxed()
                .collect(Collectors.toList());
    }
}
