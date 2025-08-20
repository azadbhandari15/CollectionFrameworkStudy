import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        List<String> shoppingList=new CopyOnWriteArrayList<>();
        shoppingList.add("Bread");
        shoppingList.add("Butter");
        shoppingList.add("Milk");

        for(String str:shoppingList){
            if(str.equalsIgnoreCase("Butter")){
                shoppingList.add("Eggs");
                System.out.println("Added Butter while reading");
            }

        }
    }
}
