package designpatterns.creational;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Application application;
        String type="text";
        if(type.equalsIgnoreCase("sheets")){
            application=new TextApplication();
        }
        else {
            application=new SpreadSheetApplication();
        }

        application.newDocument();
    }

}
//Product Interface
interface Document{
    void open();
    void close();
    void show();
}


//Concrete class
class TextDocument implements Document{

    @Override
    public void open() {
        System.out.println("Opening TextDocument...");
    }

    @Override
    public void close() {
        System.out.println("Closing TextDocument ...");
    }

    @Override
    public void show() {
        System.out.println("Showing TextDocument");
    }
}

class SpreadsheetDocument implements Document{

    @Override
    public void open() {
        System.out.println("Opening SpreadsheetDocument...");
    }

    @Override
    public void close() {
        System.out.println("Opening SpreadsheetDocument...");
    }

    @Override
    public void show() {
        System.out.println("Opening SpreadsheetDocument...");
    }
}

//Creator class
abstract class Application{
    protected abstract Document createDocument();

    public void newDocument(){
        Document document=createDocument();
        document.open();
        document.show();
        document.close();
    }
}


//Concrete Creator Class
class TextApplication extends Application{

    @Override
    protected Document createDocument() {
        return new TextDocument();
    }
}
class SpreadSheetApplication extends Application{

    @Override
    protected Document createDocument() {
        return new SpreadsheetDocument();
    }
}

