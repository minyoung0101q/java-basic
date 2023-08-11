package com.example.javabasic.tutorial17;

public class Teacher extends Person {
    private String teacherID;
    private int monthSalary;
    private int workedYear; //변수를 다른 곳에서 접근하지 못하게 private으로 선언함, main 클래스에서 접근하기 위해서는 getter setter 함수를 만들어줘야 함

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getWorkedYear() {
        return workedYear;
    }

    public void setWorkedYear(int workedYear) {
        this.workedYear = workedYear;
    }

    //Teacher라는 클래스를 이용해서 인스턴스 변수를 만들 때 한 번에 변수들을 초기화해줄 수 있는 constructor, 생성자 생성
    public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthSalary = monthSalary;
        this.workedYear = workedYear;
    }

    public void show() {
        System.out.println("-----------");
        System.out.println("교사 이름 : " + getName());
        System.out.println("교사 나이 : " + getAge());
        System.out.println("교사 키 : " + getHeight());
        System.out.println("교사 몸무게 : " + getWeight());
        System.out.println("교사 번호 : " + getTeacherID());
        System.out.println("교사 월급 : " + getMonthSalary());
        System.out.println("교사 연차 : " + getWorkedYear());
    }
}
