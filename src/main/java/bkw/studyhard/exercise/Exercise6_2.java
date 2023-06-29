package bkw.studyhard.exercise;

class Exercise6_2 {
    public static void main(String args[]) {
        Student s = new Student("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
        System.out.println((int)(236 / 3f * 10 + 0.5f));
        System.out.println((int)(236 / 3f * 10 + 0.5f)/1f);
        System.out.println((int)(236 / 3f * 10 + 0.5f)/.1f);
        System.out.println((int)(236 / 3f * 10 + 0.5f)/10f);
        System.out.println(((int)(236 / 3f * 10 + 0.5f) / 100f));
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(){} //기본생성자
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String info() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+(kor+eng+math)
                +","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)
                ;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal()/3f*10+0.5f/10f);
    }
}