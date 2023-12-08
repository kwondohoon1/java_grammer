import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        byte num1 = 127;
//        num1++;
//        byte num2 = -128;
//        num2--;
//        System.out.println(num1);
//        System.out.println(num2);
//
////        실수 : folat, double
//        float f1 = 1.12345F;
//        double b1 = 123456789;
//        System.out.println("f1 = " + f1);
//        System.out.println("f1 = " + f1);
//
////        부동소수점 오차 테스트
//
////        미세오차는 조정되어 정상적으로 출력
////
////        반복적인 연산시 오차가 확대되어 오차확인 가능
////        for(int i=0;i<100;i++){
////        System.out.println(i);
//        double total = 0;
//        for(int i=0;i<1000;i++){
//
//            total = total + 0.1 * 10;
//            System.out.println(total / 10);
//        }
//        double d1 = 1.03;
//        double d2 = 0.42;
////        저장할때는 문자열 -> 연산할때는 정수로 변환 -> 최종결과는 실수로 변환
//        BigDecimal myBig1 = new BigDecimal("1.03");
//        BigDecimal myBig2 = new BigDecimal("0.42");
//        System.out.println(myBig1.subtract(myBig2));
//
////        문자 : char
//        char my_char = '가';
//        System.out.println(my_char);
//
////        boolean : true(1) or false(0)
//        boolean my_bool = true;
//        System.out.println(my_bool);
//    }
//
//        int bool_num1 = 20;
//        int bool_num2 = 10;
//        if (bool_num1 > bool_num2) {
//            System.out.println("조건식이 참입니다.");
//        }
//
//        묵시적 타입변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
//        System.out.println(ch1_num);
//
////        char형 알파벳 비교를 위한 묵시적 타입변환 일어난다.
//        System.out.println('A' > 'a');
//
//        int my_int1 = 10;
////        int -> double
//        double my_double1 = my_int1
//        System.out.println(my_double1);
////        에러 발생 : my_int1 = my_double1;
////        double -> int 명시적 타입은 가능 : 소수점값 손실 발생 가능성이 있다
//        my_int1 = (int)my_double1;
//        double my_double2 = 7.2f + 3;
//        System.out.println(my_double2);
//
////        명시적 타입변환
//        char my_char2 = 'b';
//        int char_num = (int)my_char2;
//        int a가 1 int b가 4일때 둘을 나눈것을 int에 담아 출력, double에 담아 출력.
//        int a = 1;
//        int b = 4;
//        int c = a/b;
//        double d = a/b;
//        System.out.println(c);
//        System.out.println(d);
//        double d2 = (double)a/b;
//        System.out.println(d2);



//        변수와 상수
//        선언과 동시에 초기화
//        int a1 = 10;
////        변수값 변경
//        a1 = 20;
////        선언만 한 뒤에 나중에 초기화
//        int a2; //지역변수는 선언만 됐을때는 값이 0으로 초기화되지 않으나, 대체로 선언될때는 0으로 초기화
//        a2 = 20;
//        객체로 만들때는 0으로 초기화
        int[] arr = new int[5];
        System.out.println(arr[0]);
////        상수는 값의 재할당이 불가능
//        final int ages = 20;
////        상수는 값의 변경이 불가능 -> ages = 30; 에러발생
////        상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java이전에는 안됐었지만 이후 가능해짐
//        final int ages2;
//        ages2 = 20;
    }
}
