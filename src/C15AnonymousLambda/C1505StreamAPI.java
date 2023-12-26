package C15AnonymousLambda;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C1505StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {20,4,10,12};
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i]);
//        }
////        데이터와 객체 중심이 아닌, 입력에 따른 출력만이 존재하는 함수형 프로그래밍 방식
////        java에서 함수형프로그래밍을 지원하기위한 라이브러리 -> StreamApi
////        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
//        Arrays.stream(arr).sorted().forEach(a-> System.out.println(a));
//
//        String[] myArr = {"world","hello","java"};
//        String[] newMyArr = Arrays.stream(myArr).sorted().toArray(String[]::new);

//        스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        stream<객체> : 제네릭(꺽쇠)타입으로  stream객체가 생성
//        Stream<String> stStream = Arrays.stream(stArr);
//
//
//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//        int[] intArr2 = intStream.filter(a->a > 20).toArray();
//        System.out.println(Arrays.toString(intArr2));
//
////        참조변수의 스트림변환의 경우 제네릭의 타입소거 문제 발생.
////        제네릭의 타입소거란 java버전의 호환성을 위해 제네릭 타입을 런타임 시점에 제거하는 것을 의미
//
////        메소드 참조 방식으로 표현하는 것이 더 일반적
////        String[] stArr2 = stStream.filter(a->a.length()<=4).toArray(a->new String[a]);
//
////        메소드 참조 방식 : 클래식 :: 메서드
//        String[] stArr2 = stStream.filter(a->a.length()<=4).toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));

//        stream 중개연산 : filter, map, sorted, distinct

//        distict : 중복제거 후 스트림 반환
//        int[] intArr = {10,10,20,20,30,40,50};
////        중복제거 후 총합 반환
//        int answer = Arrays.stream(intArr).distinct().sum();
//        System.out.println(answer);
//
//        String[] stArr = {"java", "java", "python", "c++"};
////        중복제거 후 새로운 배열 생성
//        String[] stArr2 = Arrays.stream(stArr).sorted().distinct().toArray(String[]::new);
//        System.out.println(Arrays.toString(stArr2));
////        중복제거하고 길어가 3개 이하것으로 제한하고, 남은 배열의 길이의 총합
//
////        mapToInt를 통해 IntStream으로 변환
//        IntStream intStream = Arrays.stream(stArr).distinct()
//                                .filter(a -> a.length() <= 3).mapToInt(a -> a.length());
//
////        sorted : 정렬된 스트림반환
//        int[] arr = {5,1,3,4,3,5,2,4,6};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] new_arr =  Arrays.stream(arr).sorted().toArray();
//        System.out.println(Arrays.toString(new_arr));
//
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,6,8,4,1,4,5));
////        collect(구체적인 컬렉션 객체명시)
//        List<Integer> myList2 = myList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        List<String> stList = new ArrayList<>(Arrays.asList("java", "python", "c++", "javascript"));
////        streamAPI를 사용해서 문자열의 길이4개 이상인,문자열의 길이를 기준으로 정렬(내림)후 신규 LIST 생성
//        List<String> stList2 = stList.stream().filter(a -> a.length()>= 4).sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        }).collect(Collectors.toList());
//        System.out.println(stList2);
//
////        map : 새로운 스트림 반환 map(a->a+1).toArray, mapToInt 인트로변환가능
////        filter : 요소들을 조건에 따라 걸러내는 작업
////        distinct : 중복요소 제거
//
//        int[] arrPlus = Arrays.stream(arr).map(a->a+10).distinct().toArray();
//        System.out.println(Arrays.toString(arrPlus));
//
////        arr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라
//        int plus = Arrays.stream(arr).filter(a -> a % 2 == 0).map(a->a*a).sum();
//        System.out.println(plus);

//        스트림 소모 : forEach, reduce
//        foreach : 각 요소를 소모하여 명시된 동작을 수행
//        reduce : 누적 연산
        int[] arr = {10,20,30,40};
        Arrays.stream(arr).forEach(System.out::println);

//        초기값을 지정하지 않으면 Optional객체 return
//        Optional객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입 (java8 이후 추가)
        int result = Arrays.stream(arr).reduce(1, (a,b) -> a*b);
        System.out.println(result);
        int result1 = Arrays.stream(arr).reduce(0, (a,b) -> a+b);
        int result2 = Arrays.stream(arr).reduce((a,b) -> a+b).getAsInt();
        System.out.println(result1);
        System.out.println(result2);

        String[] stArr = {"hello", "java", "world"};
//        String answer = Arrays.stream(stArr).reduce("", (a,b) -> a+b + ",");
//        System.out.println(answer);

        Optional<String> answer = Arrays.stream(stArr).reduce((a, b) -> a + "," +b);
        if(answer.isPresent()){
            System.out.println(answer.get());
        }

//        count() : intstream 과 stream<String> map
//        intstream
//        sum() : 합계
//        min() : 최소
//        max() : 최대값
//        average() : 평균
        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(myList.stream().mapToInt(a->a).min().getAsInt());
        System.out.println(myList.stream().mapToInt(a->a).sum());
        System.out.println(myList.stream().mapToInt(a->a).max().getAsInt());
        System.out.println(myList.stream().mapToInt(a->a).average().getAsDouble());
        System.out.println(myList.stream().count());

        List<Student> mySt = new ArrayList<>();
        mySt.add(new Student("kim",25));
        mySt.add(new Student("lee",36));
        mySt.add(new Student("kwon",27));
        mySt.add(new Student("park",40));
        mySt.add(new Student("choi",35));
        Student s1 = mySt.stream().filter(a->a.getAge()>30).findFirst().get();
        System.out.println(s1);

//        가장 나이 어린사람 찾기
//        30대가 몇명인지 출력
//        모든 객체의 평균나이 출력
//        30세 이하 선착순 객체 출력
        Student s2 = mySt.stream().sorted((o1, o2) -> o1.getAge()- o2.getAge()).findFirst().get();
        System.out.println(s2);
        System.out.println(mySt.stream().filter(a->a.getAge()>=30).count());
        System.out.println(mySt.stream().mapToInt(a->a.getAge()).average().getAsDouble());
        System.out.println(mySt.stream().filter(a->a.getAge()>=30).findFirst().get());

//        기존의 java의 null
        String st = null;
//        System.out.println(st.compareTo("abc"));

//        java8이후에 나온 Optional객체를 통해 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현
//        Optional객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
        Optional<String> opt1 = Optional.empty();
//        빈값인지 아닌지 check하는 메서드 : isPresent()
        if(opt1.isPresent()){
            System.out.println(opt1.get().compareTo("abc"));
        }else {
            System.out.println("값이 없습니다.");
        }

//        Optional객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); //null있을수도 있음을 의미

//        orElse관련 메서드 사용하여 null(빈값)처리
//        orElse(), orElseGet(), orElseThrow()
//        orElse() : 값이 있으면 해당값 return, 없으면 default 지정값 return
        System.out.println(opt2.orElse("").compareTo("abc"));
//        orElseGet() : 값이 있으면 해당값 return, 없으면 매개변수로 람다함수 또는 메소드 참조 실행
        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));
//        orElseThrow() : 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생

        int result0 = opt1.orElseThrow(()->new NullPointerException("객체에 값이 없습니다.")).compareTo("abc");

//        OptionalInt.OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1,2,3,4)).stream().mapToInt(a->a).max();
        if(oi.isPresent()){

        }else{

        }
        System.out.println(oi.orElseThrow(()->new NullPointerException("no value")));










    }
}
