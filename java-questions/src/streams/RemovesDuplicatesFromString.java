package streams;

import java.util.Arrays;

public class RemovesDuplicatesFromString {
    public static void main(String[] args) {
        String s = "dabcadefg";
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
