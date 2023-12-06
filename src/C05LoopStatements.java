import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
////        while문 사용해서 2~10까지 출력
//        int a = 2;
//        while (a<=10){
//            System.out.println(a);
//            a++;
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해주세요.");
//        int input = sc.nextInt();
//        System.out.println(input + "X" + 1 + " = " + input*1);
//        System.out.println(input + "X" + 2 + " = " + input*2);
//        System.out.println(input + "X" + 3 + " = " + input*3);
//        System.out.println(input + "X" + 4 + " = " + input*4);
//        System.out.println(input + "X" + 5 + " = " + input*5);
//        System.out.println(input + "X" + 6 + " = " + input*6);
//        System.out.println(input + "X" + 7 + " = " + input*7);
//        System.out.println(input + "X" + 8 + " = " + input*8);
//        System.out.println(input + "X" + 9 + " = " + input*9);

//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요.");
//            int input = sc.nextInt();
//            int a = 1;
//            while (a < 10) {
//                System.out.println(input + "X" + a + " = " + input * a);
//                a++;
//            }
//        }
//
//        실습
//        int a = 0;
//        while (a < 5) {
//            String answer = "0234";
//            System.out.println("비밀번호를 입력해주세요.");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if (answer.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//            } else {
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if (a == 5) {
//                System.out.println("입력횟수를 초과했습니다.");
//                break;
//            }
//        }
//        do while 문 작성
//        int a = 2;
//        do{
//            a++;
//            System.out.println(a);
//        } while(a < 10);

////        for문을 통해 2~10까지 출력
//        for(int a=2; a<=10; a++){
//            System.out.println(a);
//        }
//        continue를 사용해서 홀수만 출력 되도록 (1~10까지 수 중에)
//        for(int a=1; a<=10; a++){
//            if(a % 2 == 0){
//                continue;
//            }
//            System.out.println(a);
//        }

//        배열과 enhanced for 문
//        int[] myArr = {1,5,7,9,10};
//        for(int i=0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
////        enhanced for문
//        for(int a :myArr){
//            System.out.println(a);
//        }
//
////        일반 for문을 통해 myArr의 값에 10씩 더한뒤에 출력
//
//        for (int i = 0; i < 5 ; i++) {
//            myArr[i] = myArr[i] + 10;
//        }
//        System.out.println(Arrays.toString(myArr));
////
////        자바 변수의 유효 범위 : {}
//        int num = 10;
//        if(num > 1){
//            int abc = 20;
//            num = 20;
//        }
//        System.out.println(num); // if문 밖에서 선언문 변수값을 if안에서 접근하며 변경하는것은
//        System.out.println(); //if문 안에서 정의된 변수는 인지 불가

//        다중 반복문
        for(int num=2; num< 10; num++) {
            System.out.println(num + "단 입니다.");
            for (int j=1; j<=9; j++) {
                System.out.println(num + " X " + j +" = " + num*j);
            }
        }
//        2중 for문을 통해 배열 접근
        int[][] arr = {{1,2,3,4}, {5,6,7,8}};
        for(int k = 0; k<arr.length; k**){
            for (int i = 0; i < arr[k].length; i **){
                System.out.println(arr[k][i]);
            }
        }



    }
}

