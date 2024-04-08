package bkw.java.constructor.reflection_ex2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : HelloService
 * @since : 2024-04-08
 */
public class HelloService {
    public void sayHello(){
        System.out.println("hi, hello~ ");
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface InjectAnnotation {}
}
