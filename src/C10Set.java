import java.util.*;

public class C10Set {
    public static void main(String[] args) {

////        중복없고 순서 없다.
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

////        반학생들이 좋아하는 운동 종목 : list로 만들고,
////        좋아하는 종목만 추리도록 set으로 변환
//        List<String> myList = new ArrayList<>();
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("basketball");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("tennis");
//        myList.add("tennis");
//        myList.add("tennis");
//        Set<String> mySet1 = new HashSet<>();
//        for(String a : myList){
//            mySet1.add(a);
//        }
//        System.out.println(mySet1.size());

//        for(int i=0; i<myList.size(); i++){
//            String temp = myList.get(i);
//            mySet1.add(temp);
//        }
//        System.out.println(mySet1.size());

////        list를 인자값으로 받아 초기값 세팅 가능
//        Set<String> mySet3 = new HashSet<>(myList);
//        System.out.println(myList);
//
////        배열을 인자값으로 받아 set 초기값 세팅
//        String[] myArr = {"java", "python", "java", "python", "c++"};
//        Set<String> mySet = new HashSet<>(Arrays.asList(myArr));
//        mySet.remove("java");
//        System.out.println(mySet);
//
//        int[] myArrInt = {1,2,3,4,5,6};
//        Set<Integer> mySetInt = new HashSet<>();
//        for(int a : myArrInt){
//            mySetInt.add(a);
//        }
//        System.out.println(mySetInt);

        Set<String> mySet1 = new HashSet<>(Arrays.asList("java","python","javascript"));
        Set<String> mySet2 = new HashSet<>(Arrays.asList("java","css","c++"));


//        교집합 : retainAll
        Set<String> temp1 = new HashSet<>(mySet1);
        temp1.retainAll(mySet2);
        System.out.println(temp1);
//        합집합 : addAll
        Set<String> temp2 = new HashSet<>(mySet1);
        temp2.addAll(mySet2);
        System.out.println(temp2);

//        차집합 : removeAll
        Set<String> temp3 = new HashSet<>(mySet1);
        temp3.removeAll(mySet2);
        System.out.println(temp3);

//        순서가 없으므로 enhanced for문, iterator 사용

//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello");
        mySet.add("hello1");
        mySet.add("hello2");
        mySet.add("hello3");
        mySet.add("hello4");
        System.out.println(mySet);
//        두개 뽑아서 더하기
        int[] numbers = {2,1,3,4,1};


        Set<Integer> myTreeSet = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                myTreeSet.add(numbers[i]+numbers[j]);
            }

        }
        int[] answer= new int[myTreeSet.size()];
        int count = 0;
        for(int a : myTreeSet){
            answer[count] = a;
            count++;
        }
        System.out.println(myTreeSet);






    }
}
