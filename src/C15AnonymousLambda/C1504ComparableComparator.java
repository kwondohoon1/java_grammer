package C15AnonymousLambda;

import java.util.*;

public class C1504ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개제공 : Comparable, Comparator
//        Comparable 인터페이스에는 comperaTo메서드가 선언 , 그리고 자바의 클래스에서 구현하고 있음 => 일반적으로 클래스에서 직접 만들어서 활용
//        Comparator 인터페이스에는 compere메서드가 선언. => 일반적으로 익명개체를 만들어서 활용

//        두문자열의 각 문자를 앞에서부터 순차적으로 비교
//        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 차이를 반환.
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b));
        List<String> myList = new ArrayList<>();
        myList.add(a);
        myList.add(b);
        Collections.sort(myList); //Comparable의 compareTo메서드를 통해 정렬

        Integer intA = 1;
        Integer intB = 1;
        System.out.println(intA.compareTo(intB));

//        Student 객체 정렬
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("kim",52));
        studentsList.add(new Student("lee",62));
        studentsList.add(new Student("park",22));
        studentsList.add(new Student("shin",24));
        studentsList.add(new Student("hong",20));

//        방법1 : Comparator를 익명객체 방식으로 활용하여 정렬(매개변수2개)
//        나이로정렬
        studentsList.sort((o1, o2) -> {
//                기본은 오름차순 정렬하려고 시도
//
            return o1.getAge()- o2.getAge();
        });
        System.out.println(studentsList);

//        이름으로정렬
        studentsList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()) );
//        글자길이수로 오름차순 정렬
        String[] stArr = {"hello", "java", "c++", "world"};
        Arrays.sort(stArr,Comparator.reverseOrder());
        Arrays.sort(stArr, (o1, o2) -> o1.length() - o2.length());
//        Priority Queue 내림차순
        Queue<String> myQue = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());

//        3, 30, 34, 5, 9
//        이 문자로 이루어진 가장 큰숫자를 구하라

//        방법2 : Comparable인터페이스 implements 후 compareTo메서드 구현(매개변수1개)
//        Collections.sort(studentsList);
        Collections.sort(studentsList);
        "hello".compareTo("world");

//        쓰레드 구현방식 : 쓰레드상속, Runnable방식
        Thread t1 = new Thread(() -> System.out.println("새로만든 쓰레드 입니다."));

        System.out.println("main의 쓰레드 입니다.");

//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("새로만든 쓰레드 입니다.");
//            }
//        });


    }
} class Student implements Comparable<Student>{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

// 조상클래스의 Object클래스의 toString을 override하여 객체호출시 자동으로 toString 에서도 호출
@Override
    public String toString(){
        return "이름은" + this.name + "나이는" + this.age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
