public class C05LoopPractice {
    public static void main(String[] args) {
//        1~20까지의 짝수의 합 계산하기
//        int sum = 0;
//        for(int a=1; a<21; a++){
//            if(a % 2 == 0){
//                sum += a;
//            }
//            System.out.println(sum);
//        }
//
////        숫자뒤집기
//        int num = 1234;
//        int result = 0;
//        while(true){
//            int temp = num % 10;
//            result = 0*10 + temp;
//            num /= 10;
//            if(num=0){
//                break;
//            }
//        }
//        System.out.println(result);

//
//        최대공약수 구하기
//        int a = 24; int b = 36;
//        int answer = 0;
//        for(int i =1 ; i<=24; i++){
//            if(24 % i == 0 && 36 % i == 0){
//                answer = i;
//            }
//        }

        int a = 24; int b = 36;
        int num = a > b ? b : a;
        int maxNum = 0;
        for(int i=1; i<=num; i++){
            maxNum = i;
        }
        int minNum = a/maxNum * b/maxNum;


    }
}
