package streams;

import java.util.Arrays;
import java.util.Comparator;

public class highestLengthWord {
    public static void main(String[] args) {
        String s = "I am learning streams API in Java";

        String result = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();

        System.out.println(result);
    }
}
