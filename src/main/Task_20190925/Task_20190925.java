package main.Task_20190925;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// https://stepik.org/lesson/12781/step/11?unit=3128
public class Task_20190925 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pseudoRandomStream(13).toArray()));
    }

    public static IntStream pseudoRandomStream(Integer seed) {
        return IntStream.iterate(seed, value -> value * value / 10 % 1000).limit(10);
    }
}
