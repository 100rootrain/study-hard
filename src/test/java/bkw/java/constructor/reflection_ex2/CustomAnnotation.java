package bkw.java.constructor.reflection_ex2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : CustomAnnotation
 * @since : 2024-04-08
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnnotation {
    //

    //어노테이션의 기본이 @Retention(RetentionPolicy.CLASS) 이기 때문에 클래스파일 까지만 유지(Retation)된다.
    //@Retention(RetentionPolicy.RUNTIME)으로 바꾸면, 리플렉션을 통해서 접근 할 수 있다.
}
