import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        표현식1
//        int[] int_arr1 = {1,2,3,4};
////        표현식2
//        int[] int_arr2 = new int[4];
//        int_arr2[0]=1;
//        int_arr2[1]=2;
//        int_arr2[2]=3;
//        int_arr2[3]=4;
////        표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
////        표현식4 불가능 : 자바의 배열은 반드시 길이가 지정되어야함.
////        int[] int_arr4 = new int[];

////        표현식5 불가능
//        String[] arr_st = new String[5];
//        for(int i=0; i< arr_st.length; i++){
//            if(arr_st[i].isEmpty()){
//                System.out.println(arr_st[i].length());
//            }
//
//        }


////        85, 65, 90 안 배열을 선언하되, 총합, 평균값
//        int[] arr = {85,65,90};
//        int sum = 0;
//        for(int i = 0; i< arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//        System.out.println(sum / (double)arr.length);
//
//        int[] arr1 = {10,20,30,12,8,17};
//        int max = arr1[0];
//        int min = arr1[0];
//        for(int i=0; i<arr.length; i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]){
//                min = arr[i];
//        }

////        배열의 순서바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));
////        System.out.println(arr);
        
//        0번째 index부터 마지막까지 자리 change
//        int[] arr2 = {10,20,30,40,50,60,70};
//        for(int i = 0; i< arr2.length-1; i++){
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));
//
////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규 배열 선언
//        int[] arr2 = new int[arr.length];
//        for(int i = 0; i< arr.length; i++) {
//            arr2[arr2.length - 1 - i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));
//
////        배열 뒤집기 2 : arr 그자체를 뒤집기
//        int[] arr = {1,2,3,4,5};
//        for(int i = 0; i< arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length -1 -i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

////        정렬 : sort() 함수 사용
//        int[] arr = {5,1,2,7,3,1,2};
////        오름차순정렬이 기본
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        내림차순
//        방법1.Comparator클래스 사용
//        객체타입인 경우에만 Comparator클래스 사용 가능
        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(st_arr);
        System.out.println(Arrays.toString(st_arr));
        Arrays.sort(st_arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(st_arr));
        Integer[] arr_integer = {5,1,2,5,1,7,8};
        Arrays.sort(arr_integer, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr_integer));

//        Comperator클래스는 기본형타입은 처리불가
//        Arrays.sort(arr, Comparator.reverseOrder());
//        방법2.배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        for(int i = 0; i< arr.length/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length -1 -i];
//            arr[arr.length-1-i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        StreamApi, lambda를 활용한 내림차순 정렬
//        int[] arr2 = {5,1,2,7,3,1,2};
//        int[] new_arr2 = Arrays.stream(arr2)//arr2를 대상으로 stream객체생성
//                        .boxed() //Integer 형변환한 스트림 객체생성
//                        .sorted(Comparator.reverseOrder()) //내림차순정렬
//                        .mapToInt(a->a) //Integer를 int로 변환
//                        .toArray(); //배열로 변환
//        System.out.println(Arrays.toString(new_arr2));
    }
}
