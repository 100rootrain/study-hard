package bkw.java.constructor.reflection;

import java.lang.reflect.Constructor;
import java.util.Set;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Example
 * @since : 2024-04-05
 */
public class Example {
    public static void main(String[] args) throws Exception {

//            Class cls =  Dog.class;
//            System.out.println("Class Name : " + cls.getName());

//            Class cls = Class.forName("bkw.java.constructor.reflection.Dog");
//            System.out.println(cls.getName());

//            Class cls = Class.forName("bkw.java.constructor.reflection.Dog");
//            Constructor constructor = cls.getDeclaredConstructor();
//            System.out.println(constructor.getName());

//        Class cls = Class.forName("bkw.java.constructor.reflection.Dog");
//        Constructor constructor = cls.getDeclaredConstructor(Boolean.class); //컴파일 에러; Dog 클래스에 Boolean 타입을 파라미터로 받는 생성자가 없기 때문
//        System.out.println(constructor.getName());

//        Class cls = Class.forName("bkw.java.constructor.reflection.Dog");
//        Constructor constructors[] = cls.getDeclaredConstructors();
//        for(Constructor item : constructors)
//            System.out.println("Get constructors : " + item);

        Class cls = Class.forName("bkw.java.constructor.reflection.Dog");
        Constructor constructors[] = cls.getConstructors();
        for(Constructor item : constructors)
            System.out.println(item);

    }
}
