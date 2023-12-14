package C12ClassLecture;

public class C1203Class {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("권도훈");
        person.email = "kwon@naver.com";
        person.password = "권도훈";
        person.age = 1223;
        System.out.println(person.whoIs());

        Person person2 = new Person();
        person2.setName("홍길동");
        person2.email = "abc@naver.com";
        person2.password = "2131";
        person2.age = 1222133;
        System.out.println(person2.whoIs());

    }
}

//Person클래스를 만들고
//객체면수는 name, email, password, age
//객체메서드 whoIs() : name, email, password, age 입니다. ->출력
//객체 생성후 whoIs메서드 출력
class Person{
    private String name;
    String email;
    String password;
    int age;
    public void setName(String name) {
        if(name.length()>10) System.out.println("설정가능한 글자 수의 범위는 10글자입니다.");
        else this.name = name;
    }
    public String whoIs(){
        return this.name + this.email + this.password + this.age + "입니다.";
    }
}
