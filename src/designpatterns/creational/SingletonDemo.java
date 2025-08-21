package designpatterns.creational;
/*
* Single Ton Class Demo
* */
public class SingletonDemo {
}


//Eager Intialization
class SingleTonEagerIntialization{
    private static final SingleTonEagerIntialization INSTANCE=new SingleTonEagerIntialization();

    private SingleTonEagerIntialization(){}
    public static SingleTonEagerIntialization getInstance(){
        return INSTANCE;
    }
}

//Lazy Intialization
class SingleTonLazyIntialization{

    private static SingleTonLazyIntialization INSTANCE;
    private SingleTonLazyIntialization(){}

    public static SingleTonLazyIntialization getInstance(){
        if(INSTANCE==null){
            INSTANCE=new SingleTonLazyIntialization();
        }
        return INSTANCE;
    }
}

//Thread Safe Singleton Intialization
class ThreadSafeSingleTonIntialization{
    private static ThreadSafeSingleTonIntialization INSTANCE;

    private ThreadSafeSingleTonIntialization(){}

    public static synchronized ThreadSafeSingleTonIntialization getInstance(){
        if(INSTANCE==null){
            INSTANCE=new ThreadSafeSingleTonIntialization();
        }
        return INSTANCE;
    }
}

//Double Checking Single Ton
class DoubleCheckLockingSingleton{
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){}

    public static DoubleCheckLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}

//Bill Pugh Singleton Pattern
class BillPughSingletonPattern{
    private BillPughSingletonPattern(){}

    private static class SingletonHelper{
        private static final BillPughSingletonPattern INSTANCE=new BillPughSingletonPattern();
    }

    private static BillPughSingletonPattern getInstance(){
        return SingletonHelper.INSTANCE;
    }
}