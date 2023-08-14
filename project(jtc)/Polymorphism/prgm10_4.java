package Polymorphism;

public class prgm10_4 {

    public static void main(String args[]){

        Hai hai = new Hai();
        hai.m1();
        
    }
    
}

class A{

}

class B extends A{

}

class Hello{

    A m1(){
        System.out.println("m1 in class A");
        return new A();
    }

    B m2(){
        System.out.println("m2 in clas B");
        return new B();
    }

    A m3(A a1){
        System.out.println("m3 in class A");
        return a1;
    }

    B m4(B b1){
        System.out.println("m4 in Class B");
        return b1;

    }


}

class Hai{

    B m1(){
        System.out.println("m1 in class Hai");
        return new B();
    }

    A m2(){
        System.out.println("m2 in class A");
        return new A();
    }

    A m4(A a1){
        System.out.println("m4 in class Hai");
        return new A();
    }

    A m3(B b1){
        System.out.println("m3 in class A");
        return new A();
    }

}

