package C16EtcClass;

import java.util.Arrays;

public class C1603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "javascript", "python"};
//        0번째 1번째 자리 change
        swap(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1, 2, 3, 4};
        swap(intArr, 2, 3);
        System.out.println(Arrays.toString(intArr));
        class GenericStudent<T> {

            public String name;
            public T age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public T getAge() {
                return age;
            }

            public void setAge(T age) {
                this.age = age;
            }

            GenericStudent(String name, T age){
                this.name = name;
                this.age = age;
            }
        }
        GenericStudent<String> student1 = new GenericStudent<String>("KIM","15");
        GenericStudent<Integer> student2 = new GenericStudent<Integer>("KIM",16);
        System.out.println(student1.name);
        System.out.println(student1.getAge().getClass());
        System.out.println(student2.getAge().getClass());


    }
//
//    static void strSwap(String[] stArr, int a, int b) {
//        for (int i = 0; i < stArr.length; i++) {
//            String temp = stArr[a];
//            stArr[a] = stArr[b];
//            stArr[a] = temp;
//        }
//
//    }
//
//    static void intSwap(Integer[] intArr, int a, int b) {
//            Integer temp = intArr[a];
//            intArr[a] = intArr[b];
//            intArr[b] = temp;
//
//    }

    //        제너릭 메서드 생성 : 반환타입 왼쪽에 <T> 선언
    //        제네릭은 객체 타입이 들어가야함에 유의

    static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;


    }
}

