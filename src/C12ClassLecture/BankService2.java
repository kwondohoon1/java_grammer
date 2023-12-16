package C12ClassLecture;

public class BankService2 {
    public static void main(String[] args) {
        ////class신규파일 생성
////은행계좌 실습
////클래스명 : BankAccount
////객체변수 : 계좌번호(account_number), balance(잔고)
////계좌번호 setter 필요
////메서드 : 예금 (deposit), 인출 (withdraw)
////deposit에 잔액이 충분해야 인출가능
////잔액얼마 남았는지 확인하는 메서드
    }
}class BankAccount{
    private String accoutNumber;
    private String balance;

    public String getAccoutNumber() {
        return accoutNumber;
    }

    public String getBalance() {
        return balance;
    }
}
