package bkw.java.constructor.reflection_ex2;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : HelloController
 * @since : 2024-04-08
 */
public class HelloController {
    @HelloService.InjectAnnotation
    private HelloService helloService;

    public void sayHello() {
        helloService.sayHello();
    }
}
