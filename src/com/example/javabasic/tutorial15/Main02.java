package com.example.javabasic.tutorial15;

public class Main02 {
    public static void main(String[] args) {
        Node one = new Node(10,20); //실행됨과 동시에 Node.java의 public Node(int x, int y) => 생성자 부분 실행
        Node two = new Node(30, 40) ;
        Node result = one.getCenter(two);
        System.out.println("x : " + result.getX() + ", y : " + result.getY());
    }
}
/* 클래스 : 객체 지향의 기본
* - 하나의 점을 의미하는 Node 클래스를 생성할 수 있습니다. */