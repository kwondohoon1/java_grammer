public class C1102StackFuntion2 {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        System.out.println(function(1));
        System.out.println("main함수 끝");
    }
    static int function(int a){
        System.out.println("function1시작");
        System.out.println("function1끝");
        return function2(a*2);
    }
    static int function2(int a){
        System.out.println("function2시작");
        System.out.println("function2끝");
        return a*2;
    }
}
