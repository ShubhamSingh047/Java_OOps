package Method.Overriden;

public class A {
    void shape(){
        System.out.println("Shape not known ");
    }
}

class B extends A{
    void shape(){
        System.out.println("square it is");
    }
}

class Method_overridden{
    public static void main(String[] args) {
        B r = new B();
        r.shape();
    }
}
