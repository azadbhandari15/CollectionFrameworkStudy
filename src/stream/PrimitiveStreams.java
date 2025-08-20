package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};

        System.out.println(IntStream.range(0,10).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(0,10).boxed().collect(Collectors.toList()));

        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.boxed().collect(Collectors.toSet()));

        IntStream intStream=new Random().ints(5);
        System.out.println(intStream.boxed().collect(Collectors.toSet()));
    }
}
