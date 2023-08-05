package constarctor;

public class prgm8_7 {
    
    int a;
    int b;
    static int c  =30;

    prgm8_7(int a){
        this.a =a;
        System.out.println("progrm(int a)");
    }

    prgm8_7(int ... a){
        this.a = a[0];
        System.out.println("hello(int ...a)");


    }

    void show(){
        System.out.println("show in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

class jtc4{
    prgm8_7 p1 = new prgm8_7();
    prgm8_7 p2 = new prgm8_7();

    prgm8_7 p3 = new prgm8_7();

    

    

}
