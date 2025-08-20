import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {


        //Lambda Expression
        Thread t1=new Thread(()->{
            System.out.println("Run");
        });

        MathOperation m1=(a,b)->a+b;
        MathOperation m2=(a,b)->a-b;
        MathOperation m3=(a,b)->a*b;
        int result=(m1.add(1,2));
        int result2=(m2.add(1,2));
        int result3=(m3.add(1,2));
        System.out.println(result+" "+result2+" "+result3);

        //Predicate
        Predicate<Integer> predicate=a->a%2==0;
        System.out.println(predicate.test(6));
        Predicate<String> predicate1=s->s.startsWith("a");
        Predicate<String> predicate2=s->s.toLowerCase().endsWith("a");
        Predicate<String> predicate3=predicate1.and(predicate2);
        System.out.println(predicate1.test("Vipul"));
        System.out.println(predicate3.test("Goyal"));

        //Function
        Function<Integer,Integer> function=x->x*2;
        Function<Integer,Integer> function1=x->x*3;
        System.out.println(function.andThen(function1).apply(20));
        System.out.println(function.compose(function1).apply(20));
        System.out.println(function.apply(100));

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(100));

        //Consumer
        Consumer<Integer> consumer=x->System.out.println(x);
        consumer.accept(101);
        List<Integer> list= Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList=x->{
            x.forEach(i->System.out.print(i+" "));
        };
        printList.accept(list);

        //Supplier
        Supplier<String> supplier=()->"Hello World";
        System.out.println(supplier.get());

        //Combined Example
        Predicate<Integer> predicateTest=x->x%2==0;
        Function<Integer,Integer> function2=x->x*x;
        Consumer consumer1=x->System.out.println(x);
        Supplier<Integer> supplier1=()->100;

        if(predicateTest.test(supplier1.get())){
            consumer1.accept(function2.apply(supplier1.get()));
        }

        //BiPredicate,BiConsumer,BiFunction
        BiPredicate<Integer,Integer> isSumEven=(x,y)->(x+y)%2==0;
        System.out.println(isSumEven.test(10,11));
        BiConsumer<String,String> biConsumer=(x,y)->{System.out.print(x+" "+y);};
        BiFunction<Integer,Integer,Integer> integerIntegerBiFunction=(x,y)->x*y;
        biConsumer.accept("10","20");
        System.out.println(integerIntegerBiFunction.apply(10,20));

        //Unary Operator
        UnaryOperator<Integer> unaryOperator=x->x*x;
        //Binary Operator
        BinaryOperator<Integer> binaryOperator=(x,y)->x*x*x;

        //Method Reference-->use method without invoking
        List<String> strings=Arrays.asList("Ram","Shyam","Ghansham");
        strings.forEach(System.out::println);


        //Constructor Reference
        List<String> names=Arrays.asList("A","B","C");
        names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }
}


interface MathOperation{
    int add(int a,int b);
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}