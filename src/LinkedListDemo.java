import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.get(2);
        list.addFirst(3);
        list.addLast(3);
        list.getFirst();
        list.getLast();
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        list.removeIf(x->x%2==1);
        System.out.println(list);

        LinkedList<String> linkedList=new LinkedList<>(Arrays.asList("Tree","Graph","Python"));
        LinkedList<String> linkedList1=new LinkedList<>(Arrays.asList("Python"));
        linkedList.removeAll(linkedList1);
        System.out.println(linkedList);

    }
}
