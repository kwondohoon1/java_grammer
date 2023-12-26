package C16EtcClass;

public class C1605EnumMain{
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("kim");
        s1.setClassGrade("first");
//        타입이 여전히 string 타입이므로, 클래스 변수를 사용하지 않을수도 있다.
        s1.setName("hong");
        EnumStudent s4 = new EnumStudent();
        s4.setName("hong4");
//        String으로 세팅불가 - > 타입까지 체크하므로
//        Enum 타입 사용시에는 static final 변수와 동일한 방법으로 사용
        s4.setRole(Role.ADMIN_USER);
        System.out.println(s4.getRole());
        System.out.println(s4.getRole().getClass());
//        enum값 내부에는 저장된 순서대로 0부터 index값이 내부적으로 할당
        System.out.println(s4.getRole().ordinal());


    }


}
class ClassGrade {
    static final String  a1 = "first_grade";
    static final String  a2 = "second_grade";
    static final String  a3 = "third_grade";

}




enum Role{
//    각 열거형 상수는 콤마로 구분하고, 상수 목록 끝에는 세미클론으로 마무리.
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}
class EnumStudent{
    private String name;
    private String classGrade;

//    string 타입이 아닌 Role 타입을 신규로 지정
    private Role role;

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
