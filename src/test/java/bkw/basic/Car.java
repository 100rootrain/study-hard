package bkw.basic;

public class Car {
    private String color;//필드가 private로 선언. 클래스 내부에서만 사용 가능
    private int speed;
    private int gear;
    public String getColor(){ // color에 대한 접근자 method
        return color;
    }
    public void setColor(String c){ // color에 대한 설정자 method
        color = c;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int s){
        if(s<0) //속도가 음수이면 0
            speed  = 0;
        else
            speed = s;
    }
    public int getGear(){
        return gear;
    }
    public void setGear(int g){
        gear = g;
    }


        public static void main(String[] args){
            Car myCar = new Car(); //객체 생성

            myCar.setColor("red");
            myCar.setSpeed(100);
            myCar.setGear(1);

            System.out.println("현재 자동차의 색상은 : "+myCar.getColor());
            System.out.println("현재 자동차의 속도는 : "+myCar.getSpeed());
            System.out.println("현재 자동차의 기어는 : "+myCar.getGear());

        }

}


/*
설정자(mutator)
 - 필드의 값을 설정
 - setXXX()형식

접근자(accessor)
 - 필드의 값을 반환하는 메서드
 - getXXX () 형식

※설정자와 접근자 method를 통하여 멤버변수에 접근한다.

설정자와 접근자를 사용하는 이유
- 클래스에서 선언된 private 변수는 다른 클래스에서 접근할 수 없기 때문에, 접근하기 위한 메서드(설정자와 접근자)를 public으로 선언하여 사용하는 것 이다.
- 설정자에서 매개변수를 통하여 잘못된 값이 넘어오는 경우, 사전에 차단할 수 있다.
- 필요할 때마다 필드값을 계산하여 반환할 수 있다.


 */
