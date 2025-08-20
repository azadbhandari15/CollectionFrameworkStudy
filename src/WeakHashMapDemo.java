import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {

        WeakHashMap<String,Image> weakHashMap=new WeakHashMap<>();
        weakHashMap.put(new String("img1"),new Image("img1"));
        weakHashMap.put(new String("img2"),new Image("img2"));
        System.out.println(weakHashMap);
        System.gc();
        simulateApplicationRunning();
        System.out.println(weakHashMap);
    }

    private static void simulateApplicationRunning(){
        System.out.println("Simulating Application Running");

        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }
    }
}
class Image{
    String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}
