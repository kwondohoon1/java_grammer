package C12ClassLecture;

import java.util.Arrays;

public class C1206RecursiveBasic {
    public static void main(String[] args) {
//        for문을 이용해서 1~10까지 누적합계
        int total = 0;

        for(int i = 1; i<=10; i++){
            total += i;



        }
        System.out.println(total);
        System.out.println(add_acc(10));


//        fibonacci for문으로만(배열없이)
        int first = 1;
        int second = 1;
        for (int i=2; i<10; i++){
            int third = first + second;
            first = second;
            second = third;
        }

//        fibonach 재귀함수
        System.out.println(fibonacci(9));


//        fibonacci for문으로만(배열활용)
//        메모이제이션(기억알고리즘 : DP)
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));




    }
    static int fibonacci(int n){
        if(n <= 1){
            return 1;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

//    메서드가 자기자신을 호출하는 메서드를 재귀함수라고 하고, 이러한 호출방식을 재귀호출이라고 한다.
    static int add_acc(int n){
        if(n==1){
            return 1;
        }
        return add_acc(n-1);

    }
    static int add_acc2(int n){
        if(n<=1){
            return 1;

        }
        return n*add_acc2(n-1);
    }

}
