package Instream;

import java.util.stream.IntStream;

public class Instreams {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
            System.out.println(n);
        });
    }
}
