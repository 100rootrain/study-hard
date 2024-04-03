package bkw.java.anonymous.ex3;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Child
 * @since : 2024-04-03
 */
public class Child extends Parent{
    String name = "Child Class";

    @Override
    void methodParent() {
        System.out.println("class name(Child) :" + this.name);
        super.methodParent();
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.methodParent();
    }

}

/*

new Child() : 이 부분은 자식 클래스인 Child의 객체를 생성하는 부분입니다. 따라서 Child 클래스의 생성자가 호출됩니다.

Parent parent : 생성된 Child 객체를 Parent 타입의 변수 parent에 할당하고 있습니다. 이것은 다형성(polymorphism)의 개념을 나타냅니다.
다형성이란 하나의 변수가 여러 타입의 객체를 참조할 수 있는 성질을 말합니다.
Child 클래스는 Parent 클래스의 서브 클래스이므로 Child 객체는 Parent 타입의 변수에 할당될 수 있습니다.
이것은 상위 클래스 타입의 변수가 하위 클래스의 객체를 참조할 수 있다는 것을 의미합니다.










*/