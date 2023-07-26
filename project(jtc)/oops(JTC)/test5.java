public class test6 {
    
    int a = 10;
    int b = 20;
    static int c = 30;

    {
        System.out.println(" IB in test6");
    }

    static{
        System.out.println("SB in test6");
    }

    int m1(){
        System.out.println("m1 in test6");
        return 10;
    }

    void m2(){
        System.out.println("m2 in test6");
    }

    static void m3(){
        System.out.println("m3 in static test6");
    }

    static int m4(int a){
        System.out.println("m4 in test6");
        return a;
    }


}

class jtc{
    public static void main(String args[]){

        test6 t1 = new test6();
        int i1 = t1.m1();
        t1.m2();
        System.out.println(i1);

        int i4 = test6.m4(123);
        System.out.println(i4);

        t1.m3();


    }
}
