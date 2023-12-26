package C17ExceptionFileParsing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C1701Exception {
    public static void main(String[] args) {
////        ArithmeticException : 0으로 나눌 때
//        System.out.println("나눗셈 프로그램입니다. 숫자 10에 나눌 분모값을 입력해 주세요.");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
////        예외가 발생할것으로 예상되는 코드에 try catch 감싸준다.
//        try{
//            int input = sc.nextInt();
//            System.out.println("10에" + input + "을 나누면" + num/input + "입니다");
////            catch에는 try 구문안에서 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//
//        }
//        catch (InputMismatchException e){
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//
//        }
//        catch (ArithmeticException e){
//            System.out.println("예외가 발생했습니다.");
////            e 안에 예외관련된 정보들이 들어있음.
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//
//        }catch (Exception e){
//            System.out.println("알수없는 예외가 발생하였습니다.");
//        }
//        finally {
////            반드시 실행되어야 하는 구문 삽입
//        }
//        System.out.println("감사합니다.");

//        throw와 throws 예제
        String password = "1234";
        try {
            login(password);
        }catch (IllegalArgumentException e){
//            e.getMessage는 login에서 throw new한 곳에서 넘어온 메시지
            System.out.println(e.getMessage());
        }


        }

//        uncheked excepion 에서 throw를 하지 않더라도 예외는 호출한 곳으로 전파
//        이때, throw를 하는 이유는 명시적으로 예외가 발생 할 수 있음을 알리는 것일뿐.
//        cheked exception은 예외처리가 강제되고, 해당메서드에서 예외처리를 하던지, throws를 통해 호출한곳에 위임.
//        이때에 호출한 쪽에서는 예외처리가 강제된다.
        static void login(String password) {
            if(password.length()<10){
                throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }

    }
}
