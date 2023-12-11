import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr);
//        System.out.println(Arrays.toString(st_arr));
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//        Integer[] arr_integer = {5,1,2,5,1,7,8};
//        Arrays.sort(arr_integer, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(arr_integer));

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
//
//        int[] arr2 = {30,20,2,7,3,1,2};
//        for(int i=0; i< arr2.length; i++) {
//         for(int j=i+1; j < arr2.length; j++){
//             if(arr2[i] > arr2[j]){
//                 int temp = arr2[i];
//                 arr2[i] = arr2[j];
//                 arr2[j] = temp;
//             }
//        }
//        }
//        System.out.println(Arrays.toString(arr2));
//
////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을때 만들어 질 수 있는 2개의 조합의 합을 출력하라
//
//        int[] int_arr = {10,20,30,40,50,60};
//        for(int i=0; i<int_arr.length-1; i++){
//            for(int j=i+1; j<int_arr.length; j++){
//                System.out.println(int_arr[i]+ " + " + int_arr[j] + " = " + (int_arr[i]+int_arr[j]));
//            }
//        }

//        중복제거하기
//        int[] temp = {10,10,40,5,7};
//        Arrays.sort(temp);
//        int[] new_temp = new int[temp.length];
//        int j=0;
////        int[] new_temp = Arrays.copyOfRange(temp, 0, 5);
//        for(int i=0; i< temp.length; i++){
//            if(i==temp.length-1){
//                new_temp[j] = temp[i];
//                j++;
//                break;
//            }
//            if(temp[i] != temp[i+1]){
//                new_temp[j] = temp[i];
//                j++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(new_temp,0,j);
//        System.out.println(Arrays.toString(answer));
//
//
//
//        int[] arr = {10,10,40,5,7};
//        Arrays.sort(arr);
//        int[] newArr = Arrays.stream(arr).distinct().toArray();
//        System.out.println(Arrays.toString(newArr));
//
//        int[] numbers = {2,1,3,4,1};
//        int[] numbers_combination = new int[numbers.length * numbers.length];
//        int combination_count = 1;
//        for(int i=0; i<numbers.length-1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                numbers_combination[combination_count] = numbers[i] + numbers[j];
//                combination_count++;
//            }
//        }
//        int[] temp = Arrays.copyOfRange(numbers_combination, 0, combination_count);
//
//
//        int[] a = {5,1,9,7,2,3};
//        for(int i=0; i< a.length-1; i++){
//            for(int j=0; j<a.length-1; j++){
//                if(a[j+1] < a[j]){
//                    int temp = a[j+1];
//                    a[j+1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
//
//        int[] a = {5,1,9,7,2,3};
//        for(int i=0; i< a.length-1; i++){
//            for(int j=0; j<a.length-1; j++){
//                if(a[j+1] < a[j]){
//                    int temp = a[j+1];
//                    a[j+1] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));

//        배열의 검색

//    int arr = {5,3,1,8,7};
//    int answer = 0
//        for(int i=0; i< arr.; i++)
//
////       이진검색(Binay Serch)
////            사전에 오름차수 정렬이 되어 있어야
//            int[] arr = {1,3,6,8,9,11};
//            int answer = Arrays.binarySearch(arr, 0);
//        System.out.println(answer);
//
////        배열간 비교 : eguals;
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {20+,30,10};
//        System.out.println(Arrays.equals(arr1, arr2));

//        배열복사 : copyOf, copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] new_arr1 = Arrays.copyOf(arr,10);
//        int[] new_arr2 = Arrays.copyOfRange(arr,1,4);
//        System.out.println(Arrays.toString(new_arr1));
//        System.out.println(Arrays.toString(new_arr2));
//
//        2차원 배열 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
////        2차원 가변 배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
//
//        System.out.println(Arrays.deepToString(arr2));
//
//
////        가변 배열 리터럴 방식
//        int[][] arr3 =  {{10},{10,20},{10,20,30}};
//        System.out.println(Arrays.deepToString(arr3));

//        [3][4] 사이즈의 배열을 선언 한 뒤 1~12 까지의 숫자값 각 배열에 할당

//        int[][] arr = new int [3][4];
//        int num = 1;
//        for(int i=0; i< arr.length; i++){
//            for (int j=0; j< arr[i].length; j++){
//                arr[i][j] = num;
//                num++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

//        가변배열 만들기 : 전체 사이즈
//        각 배열 마다 사이즈 1,2,3,4,5로 커지도록 : for문
//        각사이즈 별로 1은 1이 모두 들어가고 2는 2가 모두 들어가고 3은 3이 모두

        int[][] arr = new int [5][];
        int count = 1;
        for(int i=0; i< arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count * 10;
                count++;
            }
            count++;
        }System.out.println(Arrays.deepToString(arr));



    }
}
