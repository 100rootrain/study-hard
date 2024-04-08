package bkw.java.constructor.reflection_ex2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Container
 * @since : 2024-04-08
 */
public class Container {
    public static <T>T getObject(Class<T> clazz){
        T instance = createNewInstance(clazz);

        // 클래스내에 선언된 필드들 중에서 어노테이션이 있는것
        Field[] fields = clazz.getDeclaredFields();

        for(Field field : fields){
            if(field.isAnnotationPresent(HelloService.InjectAnnotation.class)){
                //해당 필드의 타입을 새로 만들고
                Object fieldInstance = createNewInstance(field.getType());
                System.out.println("->"+field.getType());

                // 필드의 접근 제어가 private인 경우 수정이 가능하도록 변경
                field.setAccessible(true);
                try{
                    //인스턴스에 생성된 필드를 주입한다.
                    field.set(instance,fieldInstance);
                }catch(IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        }
        return instance;
    }

    // 반복되는 instance를 만드는 것을 메서드로 추출
    public static <T>T createNewInstance(Class<T>clazz){
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        HelloController helloController = Container.getObject(HelloController.class);
        helloController.sayHello();
    }
}
