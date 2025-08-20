package stream;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        //1.Collect
        List<Integer> collect = list.stream().skip(1).toList();
        System.out.println(collect);

        //2.For Each
        list.stream().forEach(System.out::println);

        //3. Reduce
        System.out.println(list.stream().reduce(Integer::sum).get());

        //4.Count
        System.out.println(list.stream().count());

        //5. anyMatch, noneMatch, allMatch
        System.out.println(list.stream().anyMatch(x->x%2==0));
        System.out.println(list.stream().noneMatch(x->x%2==0));
        System.out.println(list.stream().allMatch(x->x%2==0));

        //6.Find First Find Any
        System.out.println(list.stream().findAny());
        System.out.println(list.stream().findFirst());

        //Examples
        List<String> names=Arrays.asList("Anna","Bob","Charlie","David");

        //1. Length Greater than 3
        System.out.println(names.stream().filter(name->name.length()>3).toList());

        //2.Square and Sorting Numbers
        List<Integer> numbers=Arrays.asList(5,2,3,9,1,6);
        System.out.println(numbers.stream().map(x->x*x).sorted().toList());

        //3.Summing Values
        List<Integer> numbersList=Arrays.asList(1,2,3,4,5);
        System.out.println(numbersList.stream().reduce(Integer::sum).get());

        //4 Counting Occurence of Characters
        String sentence="Hello World";
        IntStream chars = sentence.chars();
        System.out.println(chars.filter(x->x=='l').count());

        //Examples
        //Stream Cannot be used after a terminal operations is called off
//        Stream<String> stream=names.stream();
//        stream.forEach(System.out::println);
//        stream.map(String::toUpperCase).peek(System.out::print);
    }
}
