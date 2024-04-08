package bkw.java.constructor.ex1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Dog
 * @since : 2024-04-05
 */
public class Dog {
    public static final String CATEGORY = "동물";
    private String name;
    public int age;

    private Dog() {
        this.name = "누렁이";
        this.age = 0;
    }

    public Dog(final String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

}


