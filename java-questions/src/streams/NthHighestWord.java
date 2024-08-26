package streams;

import java.util.Arrays;
import java.util.Comparator;

public class NthHighestWord {
    public static void main(String[] args) {
        String s = "I am learning Streams API in Java";
        String result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(result);
    }
}
