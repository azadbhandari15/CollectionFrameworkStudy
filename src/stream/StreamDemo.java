package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        //How to use Stream
        //Source, (intermediate & terminal)Operation

//        List<Integer> list= Arrays.asList(1,2,3,4,5);
//        Stream<Integer> stream=list.stream();
//        System.out.println(stream.filter(x->x%2==0).count());

        //Create Streams
        //1. From Collections
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream=list.stream();

        //2. From Arrays
        String[] arr={"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);
        //3. Stream of
        Stream<String> a = Stream.of("a", "b", "C");
        //4. Infinite Stream
        Stream.generate(()->1).limit(1000);
        //5. Stream Iterate
        System.out.println(Stream.iterate(1,x->x+1).limit(100).collect(Collectors.toList()));
    }
}
