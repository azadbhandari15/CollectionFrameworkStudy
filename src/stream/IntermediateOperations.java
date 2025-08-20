package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //Intermediate Operations transform one stream to another stream
        //they are lazy meaning they don't execute until a terminal operator is invoked

        List<String> list= Arrays.asList("Akshit","Ram","Shyam","Ghanshyam");
        //1.Filter
        Stream<String> stringStream = list.stream().filter(name -> name.toLowerCase().startsWith("a"));
        //No Filterting at this point
        long a=stringStream.count();

        //2.Map
        Stream<String> stringStream1=list.stream().map(String::toUpperCase);

        //3. Sorted
        Stream<String> stringString=list.stream().sorted();
        Stream<String> stringString1=list.stream().sorted((x,y)->x.length()-y.length());

        //4. Distinct
        Stream<String> distinctList=list.stream().distinct();

        //%. Limit
        Stream<String> stringStream2=list.stream().limit(2);

        //6. Skip
        Stream<String> stringStream3=list.stream().skip(2);

        //7.Peek
        Stream.iterate(1,x->x+1).skip(10).limit(1000).peek(System.out::println).count();

        //8. To Array
        Stream.of(1,2,3).toArray();

        //9. Min, Max
        System.out.println(Stream.of(2,44,69).max(Comparator.naturalOrder()).get());
        System.out.println(Stream.of(2,44,69).min(Comparator.naturalOrder()).get());

        //10.FlatMap
        List<List<String>> listOfList=Arrays.asList(Arrays.asList("apple","banana")
                ,Arrays.asList("apple","banana"),Arrays.asList("apple","banana"));

        //11. For Each Ordered

        List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Using forEach with paralled stream");
        System.out.println();
        integers.parallelStream().forEach(System.out::print);
        System.out.println();
        integers.parallelStream().forEachOrdered(System.out::print);
        System.out.println();

        //Examples
        System.out.println(listOfList
                .stream().flatMap(Collection::stream).map(String::toUpperCase).toList());

        List<String> sentence=Arrays.asList("Hello World","Java are Powerful","flat map is useful");
       System.out.println(sentence.stream().flatMap(s->Arrays.stream(s.split(" ")))
                .map(String::toUpperCase)
                .toList());

    }
}
