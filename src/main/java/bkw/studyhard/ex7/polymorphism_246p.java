package bkw.studyhard.ex7;

public class polymorphism_246p {
    class Tv{
        boolean power;
        int channel;

        void power(){
            power = !power;
        }

        void channelUp(){
            ++channel;
        }

        void channelDown(){
            --channel;
        }
    }

    class SmartTv extends Tv{
        String text;
        void caption(){}
    }

    public void main(String[] args) {
        SmartTv s = new SmartTv();
        Tv t = new SmartTv(); // 조상타입의 참조변수로 자손 타입 인스턴스 참조 O

        s.text = "안녕하세요.";
        s.channel = 119;
        s.caption();

        t.channel = 123;


        //t.text;
        //t.caption();

        // SmartTv s1 = new Tv(); 자손타입의 참조변수로 조상타입의 인스턴스 참조 X

    }
}
