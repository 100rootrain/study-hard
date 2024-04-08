package bkw.studyhard;

import bkw.java.constructor.ex1.Dog;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * 테스트 클래스
 *
 * @author : kma04
 * @fileName : test
 * @since : 2024-04-05
 */
public class test {
    /**
     * 리플렉션
     */
    @Test
    public void getConstructorParameters(){
        Class<Dog> dogClass = Dog.class;

        //Dog 클래스의 모든 생성자 정보를 가져온다.
        Constructor<?>[] constructors = dogClass.getConstructors();

        // 모든 생성자의 파라미터 정보를 출력한다.
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            System.out.println("<파라미터 개수 : " + constructor.getParameterCount() +">");
            Parameter[] parameters = constructor.getParameters();
            for(Parameter parameter : parameters){
                System.out.println("파라미터 이름 : " + parameter.getName());
                System.out.println("파라미터 타입 : " + parameter.getType());
            }
            System.out.println("-----------------------------------------------------");
        }
    }

}
