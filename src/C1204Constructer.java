import java.security.PrivateKey;

public class C1204Constructer {
    public static void main(String[] args) {
        Calender calender1 = new Calender("2023년","12월","15일");
        Calender calender2 = new Calender("2022년","1월");

    }
}
class Calender{
    private String year;
    private String month;
    private String day;
    Calender(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    메서드 오버로딩을 통해 같은 이름의 생성자 생성가능
    Calender(String year, String month){
        this.year = year;
        this.month = month;
    }
//    this() 키워드를 통해 클래스내 매개변수에 맞는 생성자 호출 가능
    Calender(String year){
        this(year,null,null);
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}