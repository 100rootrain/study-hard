package bkw.java.reverseorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 사용자 정의 객체 역순 정렬
 *
 * @author : kma04
 * @fileName : Student
 * @since : 2024-04-08
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        System.out.println("other.age : " + other.age + "this.age : " + this.age + "compare :" + Integer.compare(other.age, this.age));
        return Integer.compare(other.age, this.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + "세)";
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("철수", 22));
        students.add(new Student("근우", 33));
        students.add(new Student("나무", 55));
        System.out.println("students : " + students); // 역순전
        Collections.sort(students);                   // 역순후

        System.out.println("나이 역순 정렬된 학생 리스트" + students);
    }

}
