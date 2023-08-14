package inheritence;

public class simple {
    public static void main(String args[]){

        B b1 = new B();
        b1.m1();
        System.out.println(b1.a);

    }

    
}

class A{
    int a  =10;
}

class B extends A{

    void m1(){
        System.out.println("m1 in class B");
        System.out.println("a :"+a);
    }
}
