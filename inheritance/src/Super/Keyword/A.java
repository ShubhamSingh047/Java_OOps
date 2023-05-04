package Super.Keyword;

public class A {
    int a=10;
    void show(){
        System.out.println(
                a
        );
    }
}
class B extends A{
    int a=20;
    void show(){
        System.out.println(a+" of class B");
        System.out.println(super.a+" of class super");
    }
}
class Inheritance_Super{
    public static void main(String[] args) {
        B ref = new B();
        ref.show();
    }
}
