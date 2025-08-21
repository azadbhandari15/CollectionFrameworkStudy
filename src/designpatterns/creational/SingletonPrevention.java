package designpatterns.creational;

public class SingletonPrevention {


    //Static to hold single instance of the class
    //Volatile hold to ensure visibility of changes to 'instance' method
    private static volatile SingletonPrevention INSTANCE;


//Private Constructor to prevent initialization from outside
    private SingletonPrevention(){

        //To avoid reflections based initialization
        if(INSTANCE!=null){
            throw new RuntimeException("Use get instance method to create");
        }
        System.out.println("Single ton created");
    }

    //To create maintain singleton property through serialization
    protected Object readResolve(){
        return getInstance();
    }



    //To avoid singleton property in clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }


    //Instance creation
    public static SingletonPrevention getInstance(){
        //Check weather the object exists or not
        if(INSTANCE==null){

            //Synchronization for thread safety
            synchronized (SingletonPrevention.class){
                if(INSTANCE==null){
                    INSTANCE=new SingletonPrevention();
                }
            }
        }
        return INSTANCE;
    }
}
