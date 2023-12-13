import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {

////        <String, String> -> Map
////        삽입된 데이터에 순서가 없다.
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("baseball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("basketball"));
////        size(), isEmpty()
//        System.out.println(myMap.size());
//        System.out.println(myMap.isEmpty());
//        myMap.put("basketball", "탁구");
////        없으면 put이 putIfAbsent
//        myMap.putIfAbsent("baseball", "배구");
//        System.out.println(myMap);
//
////        getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("tennis","스포츠"));
//
//        System.out.println(myMap.containsKey("soccer"));
//        myMap.remove("baseball");
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
////        enhanced for : key값 하나씩 출력.
//        for(String a : myMap.keySet()){
//            System.out.println(myMap.get(a));
//        }

        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball", "농구");
        myMap.put("soccer", "축구");
        myMap.put("baseball", "야구");
//        iterator를 통해 key값  하나씩 출력.
        Iterator<String> myIter = myMap.keySet().iterator();
//        next 메서드는 데이터를 소모시키면서 return
//        System.out.println(myIter.next());
        System.out.println(myIter);
//        hasNext() : iterator안에 값이 있는지 없는지.
        while (myIter.hasNext()){
            System.out.println(myIter.next());
        }

//        아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
        List<String> myList = new ArrayList<>();
        myList.add("basketball");
        myList.add("basketball");
        myList.add("basketball");
        myList.add("baseball");
        myList.add("baseball");
        myList.add("tennis");
        myList.add("tennis");
        myList.add("tennis");
//      basketball을 n명이 좋아한다.
        Map<String, Iterator> myMap = new HashMap<>();
        for(String a : myList){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1);
//            }else{
//                myMap.put(a, 1);
//            }
            myMap.put(a, myMap.getOrDefault(a,0)+1);


//            완주하지 못한 선수

            String[] participant = ["leo", "kiki", "eden"]
            String[] completion =  ["eden", "kiki"]

            List<String> myList = new ArrayList<>();

            HashMap<String, Integer> myMap = new HashMap<>();
            for (String player : participant){
                myMap.put(player, myMap.getOrDefault(player, 0);
            }
            for (String player : completion){
                myMap.put(player, myMap.get(player);
                }







        }



    }
}
