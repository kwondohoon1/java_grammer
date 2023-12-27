package C18Thread;

import java.sql.SQLOutput;

//import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class MainClass {
    public static void main(String[] args) {
//        상속방식으로 스레드 생성
        Thread etc1 = new ExtendsThreadClass();
        etc1.start();
        Thread etc2 = new ExtendsThreadClass();
        etc2.start();
        new ExtendsThreadClass().start();
//        쓰레드가 실행시 순차적으로 실행되지 않음에 유의

//        Thread 생성자로 Runnable객체를 주입하는 방식.
//        Thread클래스에 Runnable객체가 전달되어 사용자가 정의 run 메서드가 실행
        new Thread(new RunnableimplementsClass()).start();
        new Thread(() -> System.out.println("익명객체 스레드")).start();

//        thread의 동시성 이슈테스트
//        단일 스레드 일반호출
        for(int i=0; i<1000; i++){
            Thread th = new Thread(() -> Library.barrowBook());
            th.start();
//            join메서드를 통해 다른 스레드의 완료전까지 새로운 스레드가 실행되지 않도록 막음.
//            try {
//                th.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("최종남은수량" + Library.bookcount);
    }
}
