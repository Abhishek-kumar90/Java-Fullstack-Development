package Polymorphism;

public class Dynamic_Dispatch {

    public static void main(String args[]){

        A a1 = new A();
        B b1 = new B();

        A a2 = new B();
        a2.m1();
        a2.m1(12);

        
    
    }
    
}

class A{

    void m1(){
        System.out.println("m1 in A class");
    }

    void m1(int a){
        System.out.println("m1(int a) in class A");
    }

}

class B extends A{

   

}


