package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        //1. Collecting to a list
        List<String> names= Arrays.asList("Alice","Bob","Charlie");
        System.out.println(names.stream()
                .filter(name->name.startsWith("A"))
                .collect(Collectors.toSet()));

        //2. Collecting to a Set
        List<Integer> nums=Arrays.asList(1,2,2,3,4,4,5);
        System.out.println(nums.stream().collect(Collectors.toSet()));

        //3. Collecting to a specific collection
        System.out.println(names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>())));

        //4. Joining String
        String collect = names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(collect);

        //5. Summarizing Data
        List<Integer> numbers=Arrays.asList(2,3,5,7,11);
        System.out.println(numbers.stream().collect(Collectors.summarizingInt(x->x)));

        //6. Calculating Averages
        System.out.println(numbers.stream().collect(Collectors.averagingInt(x->x)));

        //7. Calculating Count
        System.out.println(numbers.stream().collect(Collectors.counting()));

        //8. Grouping Elements
        List<String> words=Arrays.asList("hello","world","java","stream","collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.joining(" "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.counting())));
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        //9. Parition Elements
        System.out.println(words.stream().collect(Collectors.partitioningBy(x->x.length()>5)));

        //10. Mapping and Collecting
        System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));

        //Example 1: Collecting names by length
        List<String> l1=Arrays.asList("Anna","bob","Alexander","Josh");
        System.out.println(l1.stream().collect(Collectors.groupingBy(x->x.length())));

        //Example 2 Counting Word Occurances
        String sentence="hello world java hello";
        Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));

        //Example 3 Paritioning Even and Odd Number
        List<Integer> l2=Arrays.asList(1,2,3,4,5,6);
        l2.stream().collect(Collectors.partitioningBy(x->x%2==0));

        //Example 4 Summing Values in a Map
        Map<String,Integer> items=new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        items.values().stream().reduce(Integer::sum);
        items.values().stream().collect(Collectors.summarizingInt(x->x));

        //Example 5 Create a Map From Stream elements
        List<String> fruits=Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x->x,String::length)));

        //Example 6: Collect Occurannce of Words
        List<String> words2=Arrays.asList("apple","banana","apple","orange","banana","apple");
        //Merge Functions
        System.out.println(words2.stream().collect(Collectors.toMap(k->k, v->1,(x,y)->(x+y))));
    }
}
