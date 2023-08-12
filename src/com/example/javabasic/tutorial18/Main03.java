package com.example.javabasic.tutorial18;

public class Main03 extends Player {
    public static void main(String[] args) {
        Main03 main03 = new Main03();
        main03.play("Dun Dun Dance");
        main03.pause();
        main03.stop();
    }
    //반드시 메소드를 구현해야 한다.
    @Override
    void play(String songName) {
        System.out.println(songName + " 곡을 재생합니다.");
    }

    @Override
    void pause() {
        System.out.println("곡을 일시정지합니다.");
    }

    @Override
    void stop() {
        System.out.println("곡을 정지합니다.");
    }
}
/* 추상 클래스로 음악 플레이어를 구현합니다. */