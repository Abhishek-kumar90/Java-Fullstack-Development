package constarctor;

class prgm8_9  {
    
    int a ;
    int b ;
    static int c = 30;

    {
        System.out.println("Ib in hello");
        int a  =101;
        int b = 102;

        {
            System.out.println("local block in IB");
            int a1 = 111;
            int b1 = 222;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            System.out.println(this.a);
            System.out.println(this.b);

            System.out.println(a1);
            System.out.println(b1);

            System.out.println("local block in IB");



        }
    }

    static{
        System.out.println("SB in hello");
        int a  =101;
        int b = 202;

        {
            System.out.println("local block in SB");
            int a1 = 111;
            int b1 = 222;
            System.out.println(a);
            System.out.println(b);

            System.out.println(c);

            System.out.println(a1);
            System.out.println(b1);
            System.out.println("local block in SB");

        }
    }

    // prgm8_9 p1 = new prgm8_9();

    prgm8_9(){
        System.out.println("Default constructor in hello");
    }

    prgm8_9(int a1,int b1){
        // System.out.println("");
    }
    void m1(){
        System.out.println("m1 in hello");
    }



}

class jtc6{
    public static void main(String args[]){

        prgm8_9 p1 = new prgm8_9();
        p1.m1();
    }
}
