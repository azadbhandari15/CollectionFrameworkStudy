package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
          list.stream().map(ParallelStreams::factorial).collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken with stream " + (endTime - startTime) + " ms");
        long startTime1 = System.currentTimeMillis();
        list.parallelStream().map(ParallelStreams::factorial).toList();
        list.parallelStream().map(ParallelStreams::factorial).sequential().toList();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time Taken with parallel stream " + (endTime1 - startTime1) + " ms");

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        AtomicInteger sum=new AtomicInteger(0);



    }
    private static int factorial(int n){
        int fact=1;

        for(int i=2;i<n;i++){
            fact=fact*i;
        }
        return fact;
    }
}
