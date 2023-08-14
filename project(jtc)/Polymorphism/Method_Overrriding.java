package Polymorphism;

public class Method_Overrriding {

    public static void main(String args[]){

        new A().m1();

        new B().m1();

        new C().m1(10);
    }
    

}

class A{

    void m1(){
        System.out.println("m1 in A class");

    }


}

class B extends A{

    void m1(){
        System.out.println("m1 in class B");
    }


}

class C extends A{

    void m1(int a ){
       
        System.out.println("m1 in class C");
    }
}
