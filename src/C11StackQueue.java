import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11StackQueue {
    public static void main(String[] args) {
//        Stack<Integer> mySt = new Stack<>();
//        mySt.push(10);
//        mySt.push(20);
//        mySt.push(30);
////        pop : Stack에서 요소를 제거 후 해당 요소 반환
//        System.out.println(mySt.pop());
////        peek : Stack에서 마지막 요소 반환, 제거 X
//        System.out.println(mySt.peek());
//        System.out.println(mySt.size());
//
////        String 타입 5개 정도 추가 후 while문을 통해 모두 출력
//        Stack<String> myStack = new Stack<>();
//        myStack.push("hello1");
//        myStack.push("hello2");
//        myStack.push("hello3");
//        myStack.push("hello4");
//        myStack.push("hello5");
//        while (!myStack.isEmpty()){
//            System.out.println(myStack.pop());
//        }

//        웹페이지 방문
//        방문한 사이트 출력 + 뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규사이트방문일경우, 해당 주소 push
//        뒤로가기일경우 해당 주소 pop

//        웹페이지 방문
//        방문한 사이트 출력 + 뒤로가기 기능 구현
//        스캐너로 신규사이트 방문 or 뒤로가기
//        신규 사이트 방문일경우, 해당 주소 push
//        뒤로 가기일경우 해당 주소 pop

//       Stack<String> back = new Stack<>();
//       Stack<String> forwards = new Stack<>();
//        while (true){
//           System.out.println("신규 1번" + "앞으로 2번" + "뒤로가기 3번");
//           Scanner sc = new Scanner(System.in);
//           String input = sc.nextLine();
//           if(input.equals("1")){
//               System.out.println("방문하신 사이트를 입력해주세요.");
//               Scanner sc2 = new Scanner(System.in);
//               String input2 = sc2.nextLine();
//               System.out.println("방문하신 사이트는" + input2 + "입니다.");
//               back.push(input2);
//           }else if (input.equals("2")){
//               String temp = forwards.pop();
//               back.push(temp);
//               System.out.println("앞으로 가기를 통해 방문한 곳은" + temp + " 입니다.");
//           }else{
//               String temp = back.pop();
//               forwards.push(temp);
//               System.out.println("뒤로가기로 방문하신 곳은 " + back.peek() + "입니다,");
//           }
//       }

//        큐선언

//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.poll());
//        System.out.println(myQue);
//
//        프린터대기열 예제
//        문서1추가, 문서2추가, 문서3추가
//        while문을 통해 "현재 인쇄 중인 문서 : 문서1" 출력

//        Queue<String> myQue1 = new LinkedList<>();
//        myQue1.add("문서1");
//        myQue1.add("문서2");
//        myQue1.add("문서3");
//        myQue1.add("문서4");
//        myQue1.add("문서5");
//        while (!myQue1.isEmpty()){
//            System.out.println("현재 인쇄 중인 문서 : " + myQue1.poll());
//        }

////        길이의 제한이 있는 큐 : ArrayBlockingQueue
//        Queue<String> myQue = new ArrayBlockingQueue<>(3);
//
////        add와 offer의 차이
//        myQue.offer("문서1");
//        myQue.offer("문서2");
//        myQue.offer("문서3");
//        myQue.offer("문서4");
//        myQue.offer("문서5");
//
//        System.out.println(myQue);

////        우선순위 큐
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(10);
//        pq.add(35);
//        pq.add(29);
//        pq.add(21);
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        Stack<Integer> mySt = new Stack<>();
        }

    }
}
