package Inheritance;

import java.util.Scanner;

public class A {
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c;
    void add(){
        c=a+b;
        System.out.println("sum of two number is " +c);
    }
}

class B extends A{
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c;
    void sub(){
        c=a-b;
        System.out.println("subtraction of two nume is "+c);
    }
}

class Multilevel_Inhertance extends B{
    public static void main(String[] args) {
        B ref = new B();
        ref.sub(); ref.add();
    }
}