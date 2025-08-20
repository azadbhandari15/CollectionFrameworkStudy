import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i:list){
            System.out.println(i);
        }

        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
//        for(Integer i:list1){
//            if(i%2==0){
//                list1.remove(i);
//            }
//        }

        Iterator<Integer> listI=list1.iterator();
        while (listI.hasNext()){
            Integer integer=listI.next();
            if(integer%2==0){
                listI.remove();
            }
        }

        System.out.println(list1);
//        ListIterator<Integer> integerListIterator = list1.listIterator();
//        while (integerListIterator.hasNext()){
//            integerListIterator.set(10);
//        }
//

    }
}
