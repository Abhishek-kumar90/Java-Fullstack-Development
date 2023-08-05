package constarctor;

 class prgm8_10 {
    
    int a =10;

    void m1(){

        int a  =20;

        {
            System.out.println("local block in m1");
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
}

class jtc7{
    public static void main(String args[]){

        prgm8_10 p1 = new prgm8_10();
        p1.m1();
    }
}
