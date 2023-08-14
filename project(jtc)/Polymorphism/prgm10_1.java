package Polymorphism;

public class prgm10_1 {

    public static void main(String[] args) {
        
        Hello h1 = new Hello();
        
        h1.m12();

        int i = h1.m12();
        System.out.println(i);

        h1.m16();

        A a1 = h1.m13();

        B b1 = (B)h1.m14();

        b1.m1();
        b1.m2();
        

    }
    
}

class A{

    void m1(){
        System.out.println("m1 in class A");
    }
}

class B extends A{

    void m2(){
        System.out.println("m1 in class B");
    }
}


class Hello{

    void m11(){
        System.out.println("m11 in hello");
    }

    int m12(){
        System.out.println("m12 in hello");
        return 12;
    }

    A m13(){
        System.out.println("m13 in class A");
        return new A();
    }

    A m14(){

        System.out.println("m14 in class A");
        return new A();
    }

    B m15(){
        System.out.println("m15 in class B");
        return new B();
    }

    B m16(){
        System.out.println("m16 in class B");

        return (B)m14();

    }


}