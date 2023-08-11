package com.example.javabasic.tutorial17;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("총 몇 명의 학생이 존재합니까 ? ");
        int number = sc.nextInt();
        Student[] students = new Student[number];
        for(int i = 0; i < number; i++)
        {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            double GPA;
            System.out.print("학생의 이름을 입력하세요 : ");
            name = sc.next();
            System.out.print("학생의 나이를 입력하세요 : ");
            age = sc.nextInt();
            System.out.print("학생의 키를 입력하세요 : ");
            height = sc.nextInt();
            System.out.print("학생의 몸무게를 입력하세요 : ");
            weight = sc.nextInt();
            System.out.print("학생의 학번을 입력하세요 : ");
            studentID = sc.next();
            System.out.print("학생의 학년을 입력하세요 : ");
            grade = sc.nextInt();
            System.out.print("학생의 학점을 입력하세요 : ");
            GPA = sc.nextDouble();
            students[i] = new Student(name, age, height, weight, studentID, grade, GPA);
        }
        for(int i = 0; i < number; i++) {
            students[i].show();
        }
    }
}