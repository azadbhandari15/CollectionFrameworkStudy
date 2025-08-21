package designpatterns.creational;

import java.util.ArrayList;
import java.util.List;

public class BuilderDesignPatternDemo {

    public static void main(String[] args) {
        Chef chef=new Chef();
        PizzaBuilder hamPizzaBuilder=new HawaiiPizzaBuilder();
        chef.setPizzaBuilder(hamPizzaBuilder);
        chef.constructPizza();

        Pizza hawaiianPizza=chef.getPizza();
        // Output details of the pizza
        System.out.println("Hawaiian Pizza Details:");
        System.out.println("Dough: " + hawaiianPizza.getDough()); // Dough: Pan crust
        System.out.println("Sauce: " + hawaiianPizza.getSauce()); // Sauce: Tomato sauce
        System.out.println("Toppings: " + hawaiianPizza.getToppings()); // Toppings: [Ham, Pineapple]
    }
}

//Product class
class Pizza{
    private String dough;
    private String sauce;
    private List<String> toppings;

    public Pizza() {
        this.toppings = new ArrayList<>();
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addToppings(String toppings){
        this.toppings.add(toppings);
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }
}


//Builder Interface
interface PizzaBuilder{
    void buildDough();
    void buildSauce();
    void buildToppings();
    Pizza getPizza();
}


//Concrete Builder
class HawaiiPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;

    public HawaiiPizzaBuilder() {
        this.pizza=new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
    }

    @Override
    public void buildToppings() {
        pizza.addToppings("Ham");
        pizza.addToppings("Pineapple");
    }

    @Override
    public Pizza getPizza() {
       return pizza;
    }
}

class Chef{
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constructPizza(){
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildToppings();
    }
}
