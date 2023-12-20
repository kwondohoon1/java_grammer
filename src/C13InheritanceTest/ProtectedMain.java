package C13InheritanceTest;

import C13Inheritance.C1304ProtectedClass;

public class ProtectedMain extends C1304ProtectedClass{
    public static void main(String[] args) {
//        접근 범위에 상속 관계가 영향을 못 끼침
//        C1304ProtectedClass protectedClass = new C1304ProtectedClass();
//        다른패키지이기 때문에 pro
//        System.out.println(protectedClass.st);
        ProtectedMain pm = new ProtectedMain();
//        상속한 객체에서 protected 변수 접근 가능
//        System.out.println(pm.st2);
        System.out.println(pm.st3);
        System.out.println(pm.st4);
    }
}
