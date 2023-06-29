package bkw.studyhard.exercise;

public class Exercise6_3{
    public static void main(String[] args){
        Student s = new Student("백근우",1,1,100,60,76);

        System.out.println("이름 : "+s.name);
        System.out.println("총점 : "+s.getTotal());

    }
}
