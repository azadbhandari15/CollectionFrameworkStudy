import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {
        //Arrays of Same Size as Enum
        //No Hashing
        //Ordinal is used
        Map<Days,String> map = new EnumMap<>(Days.class);
        map.put(Days.TUESDAY,"Gym");
        map.put(Days.MONDAY,"Walk");
        System.out.println(map);
        System.out.println(Days.FRIDAY.ordinal());
    }
}

enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
}
