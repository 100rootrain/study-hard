package bkw.java.constructor.reflection_ex2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Member
 * @since : 2024-04-08
 */

@CustomAnnotation
public class Member {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(){
        System.out.println("hello world");
    }


}

