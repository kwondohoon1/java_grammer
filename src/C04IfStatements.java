import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
//        if(조건식) {
//            조건식의 결과가 참일 때 실행하고자 하는 명령문;
//        }
//        if/else 문
//                if(조건식) {
//                    조건식의 결과가 참일 때 실행하고자 하는 명령문;
//                } else {
//                    조건식의 결과가 거짓일 때 실행하고자 하는 명령문;
//                }

//        도어락키 if문 예제
//        int anser = 1234;
//        System.out.println("비밀번호를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(anser == input){
//            System.out.println("문이 열렸습니다.");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }

//        String 사용
//        String answer = "0234";
//        System.out.println("비밀번호를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        if(answer.equals(input)){
//            System.out.println("문이 열렸습니다.");
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
//

//        묵시적 타입 변환
//        a : 97, A : 65
//        사용자한테 알파벳을 아무거나 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        Scanner sc = new Scanner(System.in);
//        char ch = sc.nextLine().charAt(0);
//        if(ch >= 'a' && ch <= 'z'){
//            System.out.println("소문자 입니다.");
//        } else if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("대문자 입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }


//      버스카드 예제
//      내 돈이 얼마있는지를 입력
//        버스요금 1500이다.
//        돈이 더 적으면 탑승불가, 돈이 더 많으면 정상처리 출력.
//        도난여부 boolean 설정(입력x).

//        Scanner sc = new Scanner(System.in);
//        int money = sc.nextInt();
//        if(money >= 1500){
//            System.out.println("정상처리");
//        } else if(money <= 1500){
//            System.out.println("탑승불가");
//        }
//
//        int myMoney = 10000;
//        boolean inStolen = false;
//        System.out.println("도난카드입니까? 예/아니오로 대답하시오");
//        Scanner sc = new Scanner(System.in);
//        if(sc.nextLine().equals("예")){
//            inStolen = true;
//        }
//        if(myMoney < 1500 || inStolen==true){
//            System.out.println("탑승불가입니다.");
//        }else {
//            System.out.println("정상탑승되엇습니다.");
//        }
//        if(myMoney >= 1500 && inStolen==false){
//            System.out.println("정상 탑승되었습니다.");
//        }else {
//            System.out.println("탑승불가입니다.");
//        }
//        삼항연산자
//        문법
//        결과값 = 조건식 ? 반환값1 : 반환값2
//        String answer = "0234";
//        System.out.println("비밀번호를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String result = answer.equals(input) ? "문이 열렸습니다" : "비밀번호가 틀렸습니다";
//        System.out.println(result);

//        myMoney : 10000
//        택시 : 10000원
//        버스 : 3000원
//        킥보드 : 2000원
//        걸어가기 : 0원
//        System.out.println("금액을 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        if (10000 <= myMoney) {
//            System.out.println("택시를 타시오");
//        } else if (3000 <= myMoney && 10000 > myMoney) {
//            System.out.println("버스를 타시오");
//        } else if (2000 <= myMoney && 3000 > myMoney) {
//            System.out.println("킥보드를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }
//

//        int myMoney = 10000;
//        int texiFee = 10000;
//        int busFee = 3000;
//        int kickBoardFee = 2000;
//        if(myMoney >= texiFee){
//            System.out.println("택시를 타시오");
//        } else if(myMoney >= busFee){
//            System.out.println("버스를 타시오");
//        } else if(myMoney >= kickBoardFee){
//        System.out.println("킥보드를 타시오");
//        } else {
//            System.out.println("걸어가시오");
//        }

//        switch 고객센터 출력 예제
//            원하시는 번호를 입력해주세요
//            1. 대출서비스 입니다. 2. 예금 3. 적금
//            0. 상담사 연결 입니다. 그 외 : 잘못누르셨습니다.
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        switch (input){
//            case 1 :
//                System.out.println("대출서비스 입니다.");
//                break;
//            case 2 :
//                System.out.println("예금");
//                break;
//            case 3 :
//                System.out.println("적금");
//                break;
//            case 0 :
//                System.out.println("상담사연결입니다.");
//                break;
//            default:
//                System.out.println("잘못누르셨습니다.");
//                break;
//        }
//
        }
}
