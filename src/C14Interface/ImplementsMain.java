package C14Interface;

public class ImplementsMain {
    public static void main(String[] args) {
        AnimalInterface1 myCat = new CatImplements();
        myCat.makeSound();
        AnimalInterface1 myDog = new DogImplements();
        myDog.makeSound();

//        타입을 interface1으로 선언하면 interface2에 정의 한 메서드는 사용 불가
        CatMultiImplements myMultiCat = new CatMultiImplements();
        System.out.println(myMultiCat.play("고양이1","고양이2"));
        DogMultiImplements myMultiDog = new DogMultiImplements();
        System.out.println(myMultiDog.play("호두","자원"));


//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부클래스 방식으로 사용가능
        AnimalInterface1 a1 = new AnimalInterface1() {
            @Override
            public void makeSound() {

            }
        };



    }
}
