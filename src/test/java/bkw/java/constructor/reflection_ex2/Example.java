package bkw.java.constructor.reflection_ex2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Example
 * @since : 2024-04-08
 */


public class Example {
    public static void main(String[] args) throws Exception {

        //클래스 정보 가져오기
        // 1. 인스턴스에서 가져오기
        Member member = new Member();
        Class<? extends Member> m1Class = member.getClass();

        // 2. 타입으로 접근하는 방법
        Class<Member> m2Class = Member.class;

        // 3. 패키지 경로로 가져오는 방법
        Class<?> m3Class = Class.forName("bkw.java.constructor.reflection_ex2.Member");

        // 메서드 정보 출력
        Method[] methods = m3Class.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method.toString());
        }

        // memberInstance 만들기
        Member memberInstance = (Member) m3Class.getDeclaredConstructor().newInstance();
        memberInstance.setName("andrew");
        memberInstance.setAge(32);

        Method sayHello = m3Class.getMethod("sayHello");
        sayHello.invoke(m3Class.getDeclaredConstructor().newInstance());
        // Member Class에서 메서드를 가져와서 호출(invoke)
        // 파라미터로는 해당 메서드를 호출하는 새롭게 만든 인스턴스 를 넘겨야 된다.
        // newInstance() 메서드로 m3Class를 새롭게 인스턴스화 시켰다.


        //클래스에 선언한 어노테이션 정보를 가져온다.
        Annotation[] annotations = m3Class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation = " + annotation);
        }
    }
}
