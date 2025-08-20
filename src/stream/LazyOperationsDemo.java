package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyOperationsDemo {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Alice","Bob","Charlie","David");

        Stream<String> stream=names.stream().filter(name->{
            System.out.println("Filter name"+name);
            return name.length()>3;
        });

        System.out.println("Before Terminal Operation");

        List<String> result=stream.toList();
        System.out.println("After Terminal Operations");
        System.out.println(result);
    }
}
