package Polymorphism;

public class static_poly {

    public static void main(String args[]){

        System.out.println("method overloading ");
        
        Method_overloading  m = new Method_overloading();
        m.m1();

        m.m1(12, (int)(15));
        m.m1(13, (byte)(14));

        Method_overloading.m1(13,14);

        double db = m.m1(12, 12.3);
        double db1 = Method_overloading.m1(12.4, 2);
    }
    
}

class Method_overloading{

    void m1(){
        System.out.println("m1 in method_overloading class");
    }

    void m1(int a, byte b){
        System.out.println("m1(int a , byte b) in class method overloding");
        System.out.println(a+b);
    }

    public void m1(byte b, int a){
        System.out.println("m1 (byte b , int a) in class method overloading ");
        System.out.println(b+a);
    }


    static void m1(int a, int b){
        System.out.println("m1(inta , intb ) in class method overloading");
        System.out.println(a+b);
    }

    double m1(int a , double d){

        System.out.println("m1 (int a , double d ) in class method_overloading");
        return (a+d);
        
    }

    static double m1(double d, int a){
        System.out.println("m1 (int a , double d ) in class method_overloading");
        return (d+a);
    }


}
