import com.sun.jdi.Value;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스
//        int와 Integer간의 형변환

//        int a =10;
//        Integer b = new Integer(Value:20);
////        오토언박싱 : Integer -> int 형변환
//        int c = b;
////        언박싱 : Integer -> int 형변환
//        int d = b.intValue();
////        오토박싱
//        Integer e = a;
////        박싱
//        Integer f = Integer.valueOf(a);

//        String과 int의 형변환
//        int a = 10;
//        String st_a = Integer.toString(a); // "10"
//        String st_a2 = String.valueOf(a);
//        int c = Integer.parseInt(st_a); // 10
//
////        참조자료형에 원시자료형을 담을 때는 wrapper클래스를 써야한다 ex)컬렉션 프레임워크(List, set ...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);
//
//        String pool, String 객체
//        String mySt1 = new String("hello"); //String pool에 생성
//        String mySt2 = new String("hello"); //mySt1과 주소 공유
//        String mySt3 = "hello";
//        String mySt4 = "hello";
//        String mySt5 = mySt1;
//        System.out.println(mySt1 == mySt2);
//        System.out.println(mySt1 == mySt3);
//        System.out.println(mySt3 == mySt4);
//        System.out.println(mySt1 == mySt5);
//
//
//        System.out.println(mySt1.equals(mySt5));
//        System.out.println(mySt1.equals(mySt5));
//        System.out.println(mySt1.equals(mySt5));
//        System.out.println(mySt1.equals(mySt5));

////        문자열의 길이 : length();
//        String mySt = "hello";
//        System.out.println(mySt.length());
//
////        indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf("java"));
//
////        contains : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        String mySt3 = "hello java";
//        System.out.println(mySt3.contains("a"));

//        charAt : 문자열에서 특정위치(index)의 문자(char)를 리턴
//        String a = "hello";
//        char myChar = a.charAt(1);
//        System.out.println(myChar);


////        반복문, charAt, length를 활용한 st안에 문자a의 개수
//        int count = 0;
//        String st = "avsdvsdasdfas";
//        for(int i = 0; i<st.length(); i++){
//            if(st.charAt(i)=='a'){
//                count++;
//            }
//        }
//        System.out.println(count);

////        substring(a,b) : a이상 b미만의 index를 자른다.
//        String st1 = "hello world";
//        System.out.println(st1.substring(4, 5)); //o만 짜름
////        System.out.println(st1.substring(0,5));
////        System.out.println(st1.substring(6));


//        String s = "abcde";
//        String answer = "";
//        int mid = s.length() / 2;
//        if(s.length() % 2 == 1){
//            answer = s.substring(mid, mid+1);
//        }else{
//            // String s = "abcd";
//            // mid = 4/2 = 2
//            answer = s.substring(mid-1, mid+1);
//        }

////        trim, strip
//        String trimSt = "        hello world       ";
//        String new_trimSt = trimSt.trim();
//        System.out.println(trimSt.trim());


//        toUpperCase : 대문자 toLowerCase : 소문자
//        String a = "Hello";
//        String a1 = a.toLowerCase();
//        String a2 = a.toUpperCase();
//        System.out.println(a1);
//        System.out.println(a2);

////        문자열 더하기 : +=
//        String a = "hello";
//        a += "world";
//        a += "world";
//        a += "world";
//        a += "world";
//        a += "world";
//        System.out.println(a);
//
//
////        char -> String 으로 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);


////        알파벳만 빼고 문자를 str2에 새롭게 담기.
//        String str = "05asdf한글123";
//        String answer="";
//        for(int i = 0; i<str.length(); i++){
//            if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
//                answer = answer + str.charAt(i);
//            }
//        }
//        System.out.println(answer);
//
//        특정 문자 제거하기

////        String my_string, String letter
//       String my_string = "abcdef";
//       String answer="";
//       for(int i = 0; i<my_string.length(); i++){
//           if(my_string.charAt(i) != letter.charAt(0))
//               answer = answer + my_string.charAt(i);
//       }
//        System.out.println(answer);
//
////       replace(a,b) : a문제를 b문제로 대체
//        String str1 = "hello world";
//        String str2 = str1.replace("world","java");
//        System.out.println(str2);
//
////        replaceAll(a,b)
//        String str3 = str1.replaceAll("l","x");
//        System.out.println(str3);

//        String str = "adf132한글123";
////        [a-z] : 소문자 알파벳
//        String str2 = str.replaceAll("[a-z]","");
//        System.out.println(str2);
////        [가-힣] : 한글
//        String str3 = str.replaceAll("[가-힣]","");
//        System.out.println(str3);
////        [0-9] : 숫자
//        String str4 = str.replaceAll("[0-9]","");
//        System.out.println(str4);
////        [a-zA-Z]
//        String str5 = str.replaceAll("[a-zA-Z]","");
//        System.out.println(str5);
////        [a-zA-Z0-9]
//        String str6 = str.replaceAll("[a-zA-Z0-9]","");
//        System.out.println(str6);

////        Pattern클래스
//        boolean metchar = Pattern.matches("[a-z]","helloworld");
//        System.out.println(metchar);

////        전화번호 검증
//        boolean metchar2 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$","010-1234-1234");
//        System.out.println(metchar2);

////        이메일 검증
//        boolean metchar3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$","hello123@naver.com");
//        System.out.println(metchar3);

////        split
//        String a = "a:b:c:d";
//        String[] stArr = a.split(":");
//        System.out.println(Arrays.toString(stArr));


//        String b = "a b c d";
//        String[] stArr2 = b.split(" ");
//        System.out.println(Arrays.toString(stArr2));
//        String[] stArr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(stArr3));


////        isEmpty 와 null구분
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1==null);
//        System.out.println(st2==null);
//        System.out.println(st2.isEmpty());
////        NullPointer Exception 예외 발생
//        System.out.println(st1.isEmpty());
//
//        String[] arr = new String[5];
//        arr[0] = "hello";
//        arr[1] = "world";

//        join : String[] -> String
//        String[] arr = {"java", "python", "C++", "javascript"};
//        String arrSt = String.join(" ", arr);
//        System.out.println(arrSt);
//
//        StringBuffer but = new StringBuffer("hello");
//        but.append("java") // 마지막자리에 문자열 추가
//        but.append("world") // 마지막자리에 문자열 추가
//        String new_str = but.toString() //새로운 String문자열로 변환

//        append 메소드를 사용하여 계속하여 문자열 마지막에 추가대상 문자열을 추가
//        String 경우 +=를 통해 추가하는것처럼 보이나, 추가가 아닌 재선언

//        insert 메소드는 특정n번째 위치렝 원하는 문자열을 삽입
//        sb.insert(5,"hello");

//        substring String자료형의 substring 메소드와 동일하게 사용

//        delete(1, 2) start부터 end만큼 삭제

//        그 외 대부분 메서드는 String과 동일

////        StringBuffer
////        String st1 = "hello";
////        StringBuffer sb1 = new StringBuffer(st1);
////        sb1.append(" world");
////        sb1.insert(5, " java"); //0번째가 h앞자리
////        System.out.println(sb1);
////        System.out.println(sb1.substring(6,10));
////        System.out.println(sb1.delete(6,11));
////
//////        성능 : String < StringBuffer < StringBuilder(스레드 safeX)
////        StringBuilder sb2 = new StringBuilder("hello");
////        sb2.append(" world");
////        System.out.println(sb2);

//        String mySt2 = "hello java";
//        System.out.println(mySt2.indexOf("java"));
//
//        String A = "hello";
//        String B = "ohell";
//        int answer = 0;
//        StringBuilder sb = new StringBuilder(A);
//        while (true) {
//            if (sb.toString().equals()) {
//                break;
//            }
//            answer++;
//            sb.insert(0, sb.charAt(sb.length() - 1));
//            sb.delete(sb.length() - 1, sb.length());
//            if (answer > A.length()) {
//                answer = -1;
//                break;
//            }
//        }
    }
}
