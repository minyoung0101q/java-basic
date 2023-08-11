package com.example.javabasic.tutorial15;

public class Node {
    private int x; //private: 외부에서 함부로 접근 불가, //따로 함수를 만들어서 접근할 수 있도록 만들어줌 => getX()
    private int y;

    public int getX() { //public : 외부에서 접근 가능
        return x;
    }

    public void setX(int x) { //x의 값 설정
        this.x = x; //자신이 가지고 있는 고유의 속성 값을 바꿔줄 때 this를 사용
        //즉, private int x; 에서 x를 매개변수로 들어온 x로 바꿔주는 것
        //매개변수로 들어온 x값을 넣어준다.
    }
    
    public int getY() { //y의 값을 가져오는 함수
        return y;
    }
    public void setY(int y) { //y의 값을 넣어주는 함수
        this.y =y;
    }

    public Node(int x, int y) { /* 생성자 : 객체를 만들어줄 때 자동으로 값을 초기화해주는 함수로, 클래스와 동일한 이름을 가짐 */
        this.x = x; //10을 매개변수로 받아서 현재 자신의 좌표가 x는 10이 됨 => 4줄
        this.y = y; //20을 매개변수로 받아서 현재 자신의 좌표가 y는 20이 됨 => 5줄
    }

    public Node getCenter(Node other) { //다른 노드를 인스턴스로 받음, 즉 다른 노드와 비교해서 자기 자신이 가지고 있는 x, y 좌표와 다른 노드 x, y 좌표를 비교해서 정확히 정중앙을 가지는 좌표를 하나 반환할 수 있도록 하는 것
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
}
//즉, (Main02파일)main 메서드에서 Node 클래스를 이용해서 어떠한 인스턴스를 다룰 때
//즉시, x와 y에 접근할 수 없음(private 선언), getX나 setX를 활용해서 x의 값을 가져오거나 설정할 수 있는 것 => 자바에서 객체지향 프로그래밍의 보안이라고 할 수 있음
