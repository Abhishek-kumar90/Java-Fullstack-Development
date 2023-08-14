package inheritence;

public class multiLevel {
    public static void main(String args[]){
        D d1 = new D();
        d1.m1();
        System.out.println(d1.a);

    }
}

class A{
    int a  =1;
    
    void m1(){
        System.out.println("m1 in classs - A");
    }


}

class B extends A{
    void m1(){
        System.out.println("m1 in class - B");
    }
}

class c extends B{
    void m1(){
        System.out.println("m1 in class c");
    }
}

class D extends c{

    void m1(){
        System.out.println("m1 in class D");
    }
}
