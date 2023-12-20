package BankService;

import java.util.Scanner;

/* BankController : 사용자요청처리
BankService 인터페이스
BankService 구현체 : BankCardService, BankKapayService
BankAccount 엔티티
 */
public class BankController {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력하시오");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount dohoon = new BankAccount(accountNumber);

        System.out.println("1번 입금, 2번 출금");
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("1번 카카오입금, 2번 카드입금");
                int number2 = sc.nextInt();
                switch (number2){
                    case 1 :
                }

        }
    }
}

