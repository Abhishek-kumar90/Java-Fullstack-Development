public class test7 {
    int a = 10;
    int b = 20;
    static int c = 30;

    void m1(){
        System.out.println("m1 in test7");
    }

    static void m2(){
        System.out.println("m2 in test7");
    }

    void m11(){
        System.out.println("m11 in test7");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    static void m22(test7 t1){
        System.out.println("m22 in test7");
        System.out.println(c);
        System.out.println(t1.a);
        System.out.println(t1.b);

        m2();
        t1.m1();

    }


}

class jtc{
    public static void main(String args[]){

        test7.m22(new test7());
        test7.m22(null);
    }

       
}
