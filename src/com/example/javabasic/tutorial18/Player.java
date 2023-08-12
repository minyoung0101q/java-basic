package com.example.javabasic.tutorial18;

abstract class Player {
    abstract void play(String songName); //곡의 이름이 들어가면 곡을 실행
    abstract void pause(); //정지
    abstract void stop(); //하나의 곡을 정지시킴
}
/* 추상의 개념을 이용하여 음악 플레이어 클래스를 구현합니다. */
