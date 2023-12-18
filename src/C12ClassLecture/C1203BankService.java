package C12ClassLecture;


//public class BankService {
////    public static void main(String[] args) {
//        BankAccount jongwon = new BankAccount("1234");
//        jongwon.deposit(1000000000);
//        jongwon.withdraw(500000);
//        System.out.println(jongwon.getAccountNumber());
//        BankAccount hun = new BankAccount("12345");
//        hun.deposit(150000);
//        hun.withdraw(200000);
//        System.out.println(hun.getAccountNumber());
//    }
//}
//
////class신규파일 생성
////은행계좌 실습
////클래스명 : BankAccount
////객체변수 : 계좌번호(account_number), balance(잔고)
////계좌번호 setter 필요
////메서드 : 예금 (deposit), 인출 (withdraw)
////deposit에 잔액이 충분해야 인출가능
////잔액얼마 남았는지 확인하는 메서드
//class BankAccount{
//    private String accountNumber;
//    private int balance;
//    //    생성자란 클래스가 객체화 될때 자동으로 실행되는 메서드
////    클래스명(){} : 생성자의 형태
////    별도의 생성자를 만들지 않으면 매개변수없는 기본생성자가 숨겨져있다.
//    BankAccount(String accountNumber){
//        this.accountNumber = accountNumber;
//    }
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//    //    예금
//    public void deposit(int money){
//        this.balance += money;
//        System.out.println(money + "원 입금되었습니다.");
//    }
//    //    출금
//    public void withdraw(int money){
//        if(this.balance < money){
//            System.out.println("잔액이 부족합니다.");
//        }else {
//            this.balance -= money;
//            System.out.println(money + "원 출금되었습니다.");
//        }
//    }
//    public int checkBalance(){
//        return this.balance;
//    }
//}*/
