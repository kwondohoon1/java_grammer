package C13Inheritance;

public class C1304ProtectedClassTest {
    public static void main(String[] args) {
        C1304ProtectedClass protectedClass = new C1304ProtectedClass();
//        default접근가능
        System.out.println(protectedClass.st2);
//        protected접근가능
        System.out.println(protectedClass.st3);
//        public접근가능
        System.out.println(protectedClass.st4);
    }
}
