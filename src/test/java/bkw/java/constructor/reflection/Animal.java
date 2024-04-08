package bkw.java.constructor.reflection;

/**
 * Animal
 *
 * @author : kma04
 * @fileName : Animal
 * @since : 2024-04-05
 */
public class Animal {
    public String name = "myName ?";
    private String city = "myCity ?";

    public Animal() {
    }

    private void sleep(){
        System.out.println("sleep");
    }

    private void eat(String x){
        System.out.println("eat : " + x);
    }

    private void walk(){
        System.out.println("walk");
    }
}
