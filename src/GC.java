import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
       WeakReference <Phone> phone=new WeakReference<>(new Phone("Apple","16 Pro Max"));
        System.out.println(phone.get());
//        phone=null;
//        System.out.println(phone);
//        System.gc();
        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }
        System.out.println(phone.get());

    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
