package bkw.java.constructor.reflection;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Dog1
 * @since : 2024-04-05
 */
public class Dog extends Animal {
    private String myName = "뽀삐";
    public  String myCity = "서울";

    public Integer age = 7;

    public Dog() {
    }

    private Dog(String myName) {
        this.myName = myName;
    }

    private Dog(Integer age){
        this.age = age;
    }

    private void myName(String name){
        System.out.println("myName : " + name);
    }

    private void myCity(String city){
        System.out.println("myCity : " + city);
    }

    private void hello(){
        System.out.println("hello~");
    }

}
