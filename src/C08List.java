import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        list선언방법
//        ArrayList<String> myList = new ArrayList<>();
//        가장 일반적인 방식
//        왼쪽에 인터페이스, 오른쪽에 구현체
//        List<String> myList = new ArrayList<>();
//
////        초기값 생성방법1. 하나씩 add
//        myList.add("java");
//        myList.add("python");
//        myList.add("c++");
//        System.out.println(myList);


//        초기값 생성방법2. 한꺼번에 add (배열을 이용한 변환)
//        String[] myArr1 = {"java", "python", "c++"};
//        List<String> myList = new ArrayList<>(Arrays.asList(myArr1));
////        배열이 int 인 경우 -> 형변환 이슈 발생
//        int[] myIntArr1 = {1, 2, 3};
//        List<Integer> myIntArr1 = new ArrayList<>();
//        for (int a : myIntArr1) {
//            myIntArr1.add(a);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
////        add(int index, int elements) : 중간에 값 삽입은 기본적으로 성능 저하
//        myList.add(1,15);
//        System.out.println(myList);
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//
////        addAll(Colletion객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList2);
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 출력
////        size() : 리스트의 개수 변환
//        for(int i=0; i<myList.size(); i++){
//            myList.get(i);
//        }
//
////        remove : 요소삭제
////        remove는 value삭제, index를 통한 삭제
//
////        remove를 통한 index삭제 : 0번째
//        myList.remove(0);
//        System.out.println(myList);
////        객체를 통한 삭제 : Intager.valueOf
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
////        set(int index, E element) : index자리에 값 변경
////        마지막자리값 : 100으로 세팅 후 출력
//        myList.set(myList.size()-1, 100);
//
////        contains : 특정값이 있는지 없는 boolean return
//        System.out.println(myList.contains(30));

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        indexOf : 몇번쨰 index에 위치한지 return
////        같은 숫자가 있으면 첫번째 index로 return
//        System.out.println(myList.indexOf(20));
//
////        isEmpty : 값이 비었는지, 안비었는지
////        전체삭제 : clear
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList);

////        리스트 출력
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[1]);
//        myList.add(new int[2]);
//        myList.add(new int[3]);
//        myList.get(1)[0] = 10;
//        myList.get(1)[1] = 20;
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
////        위 list에 값 1,2,3 10,20,30 100,200
//        int value = 1;
//        for(int i=0; i<myList.size(); i++){
//            for(int j=0; j<myList.get(i).length; i++){
//                myList.get(i)[j] = (j+1)*value;
//            }
//            value *= 10;
//        }

//        List<Integer> myList = new ArrayList<>(Arrays.asList(5,3,2,1,5));
////        리스트 정렬 1 : collection.sort()
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        리스트 정렬 2: 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);
//
////        1.String배열을 List로 변경
//        String[] stArr = {"java", "spring", "django"};
////        1-1 Arrays.asList()
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
////        1-2 for문담기
//        List<String> stList2 = new ArrayList<>();
//        for(String a : stArr){
//            stList2.add(a);
//        }
////        1-3 streamApi : 참고만
//        List<String> stList3 = Arrays.stream(stArr).collect(Collectors.toList());
//
////        2.int배열을 List로 변경
//        int[] intArr = {10,20,30,40};
////        1-1 Arrays.asList 사용불가
////        1-2 for문 담기 사용가능
////        1-3 streamAPI 사용가능

////        3.String 리스트를 String배열로 변환
//        ArrayList<String> stList = new ArrayList<>();
//        stList.add("hello");
//        stList.add("java");
//        stList.add("world");
//        String[] stArr = new String[stList.size()];
//        for (int i = 0; i < stArr.length; i++) {
//            stList[i] = stList.get(i);
//        }
////        3-2 streamAPI : 참고만
//        String[] stArr2 = stList.stream().toArray(a->new String[a]);

//        4.int리스트를 INT 배열로 변환
//        4-1 for문으로 변환
//        4-2 streamAPI로 변환

//        두개뽑아서 더하기 : 리스트
//        n의 배수 고르기
//        int[] numbers = {2,1,3,4,1};
//        List<Integer> myList = new ArrayList<>();
//        for(int i=0; i<numbers.length-1; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                myList.add(numbers[i]+numbers[j]);
//            }
//        }
//        Collections.sort(myList);
//        List<Integer> new_list = new ArrayList<>();
//        for(int a : myList){
//            if(!new_list.contains(a)){
//                new_list.add(a);
//            }
//        }
//        System.out.println(new_list);
//
//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> mylist = new ArrayList<>();
//        for(int a : numlist){
//            if(a% n ==0){
//                myList.add(a);
//            }
//        }
//        int[] answer = new int[myList.size()];
//        for(int i=0; i<answer.length; i++){
//            answer[i] = myList.get(i);
//        }
//        return answer;

    }
}
