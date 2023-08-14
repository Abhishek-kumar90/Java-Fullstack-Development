package Polymorphism;

public class without_overriding {

    public static void main(String args[]){

        A a1 = new B();

        a1.m1();
    }
    
}

class A{

    void m1(){
        System.out.println("m1 in class A");
    }
}

class B extends A{

    void m1(){
        System.out.println("m1 in class B");
    }
}
