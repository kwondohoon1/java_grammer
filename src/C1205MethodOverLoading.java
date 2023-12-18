import java.util.ArrayList;
import java.util.List;

public class C1205MethodOverLoading {
    public static void main(String[] args) {
        //        메서드1)int2개를 매개변수로 받아서 더한값 return 메서드 : sum으로 만들기
//        메서드2)int3개를 매개변수로 받아서 더한값 return 메서드 : sum으로 만들기

        C1205MethodOverLoading mto = new C1205MethodOverLoading();
//        메서드 오버로딩을 통해 같은 메서드명 재활용
        System.out.println(mto.sum(10,20));
        System.out.println(mto.sum(10,20,30));
        System.out.println(mto.sum(10.5,15.5));
//        제네릭을 통해 타입 재활용
        List<Integer> myList = new ArrayList<>();

    }

    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    double sum(double a, double b){
        return a+b;
    }


}

