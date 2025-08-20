import java.lang.reflect.Field;
import java.util.*;


public class ArrayListDemo {
    public static void main(String[] args) throws Exception{

        List<Integer> arrayList=new ArrayList<>();
        List<Integer> arrayList1=new ArrayList<>(20);
        arrayList.add(1);
        arrayList.add(12);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());

        arrayList.forEach(arr->System.out.println(arr));

        System.out.println(arrayList.contains(1));
        System.out.println(arrayList.contains(50));

        arrayList.add(1,10);
        arrayList.forEach(arr->System.out.println(arr));

        arrayList.set(1,50);
        arrayList.forEach(arr->System.out.println(arr));

        System.out.println(arrayList1.size());

        for(int i=0;i<21;i++){
            arrayList1.add(i);
        }

        System.out.println(arrayList1.size());

        List<Integer> list=List.of(5,4,3);
        arrayList1.addAll(list);
        System.out.println(arrayList1);

        var arr=arrayList1.toArray();

        Collections.sort(arrayList1);
        System.out.println(arr);
        System.out.println(arrayList1);

        arrayList1.sort((o1, o2) -> o2.compareTo(o1));
        System.out.println(arrayList1);

        List<String> stringList= Arrays.asList( "Apple","Banana","Watermelon","Peach","Rasberry");
//        list.sort(new IntegerComparator());

        stringList.sort(new StringLengthComparator());
        System.out.println(stringList);
        arrayList.sort(new IntegerComparator());
        System.out.println(arrayList);



//        Field field=ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//
//        Object[] elementData=(Object[]) field.get(arrayList1);
//
//        System.out.println("Element Capacity:"+elementData.length);
//        arrayList1.remove(10);
//        System.out.println("Element Capacity:"+elementData.length);
        stringList.sort((s1,s2)->s2.length()-s1.length());

        System.out.println(stringList);


    }





}


