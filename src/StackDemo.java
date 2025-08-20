import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.add(2,5);
        System.out.println(stack.search(3));

        //Stack Using LinkedList
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addLast(1);//push
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.removeLast();//pop
        linkedList.isEmpty();

        //ArrayList using stack
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);//peek

        arrayList.get(arrayList.size()-1);//peek
        arrayList.remove(arrayList.size()-1);//pop
    }
}
