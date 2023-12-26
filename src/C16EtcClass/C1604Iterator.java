package C16EtcClass;

import java.util.*;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

//        enhanced for 문 : 원본 변경 x -> remove 불가
        for(String a : myList){
            System.out.println(a);
//            remove 메서드 없음
        }

//        Iterator사용 : 참조하고 있는 원본데이터 삭제가능 -> remove
        Iterator<String> myIter =  myList.iterator();
        while(myIter.hasNext()){
            if(myIter.next().equals("banana")){
                myIter.remove();
            }
            System.out.println(myList);
        }

    }
}
