package C14Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements mi = new MyImplements();
        mi.method();
        System.out.println(MyImplements.my_constant);

    }
}

interface myinterface{
//    아래 변수는 컴파일타임에 static final이 붙는다.
    int my_constant = 100;
    void method();

}
class MyImplements implements myinterface{

    @Override
    public void method() {
        System.out.println("hello world");
    }
}
