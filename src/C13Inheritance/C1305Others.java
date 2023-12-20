package C13Inheritance;

//import java.util * / utill하위의 모든 클래스/인터페이스 파일 import가능
//imprt java * : 불가능, 특정 패키지의 하위패키지의 모든 파일까지 inport하는것은 불가능
//final 클래스는 상속 불가
//public class C1305Others extends FinalClass {
public class C1305Others{
    public static void main(String[] args) {
        C1305Dog myDog = new C1305Dog();
        myDog.makeSound1();
        myDog.makeSound2();

        C1305Animal myAnimal = new C1305Animal() {
            @Override
            void makeSound1() {

            }
        };
        System.out.println(myDog.getClass());
        System.out.println(myAnimal.getClass());
    }
}
final class FinalClass{
}
abstract class C1305Animal{
//    final void makeSound(){
//        System.out.println("동물은 소리를 냅니다.");
//    }
    abstract void makeSound1();
    void makeSound2(){
        System.out.println("makesound2");
    }
}
class C1305Dog extends C1305Animal {
    @Override
    void makeSound1() {
        System.out.println("makesound1");

    }
//    final 메서드는 오버라이딩 불가
//    @Override
//    void makeSound(){
//        System.out.println("멍멍");
//    }
}
