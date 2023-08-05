// package constarctor;

class prgm8_11 {
    
    int a  =10;
    private int b  =30;

    void m1(){
        System.out.println("m1 in hello");
        System.out.println(a);
        System.out.println(b);
    }
}

class jtc8{
    public static void main(String args[]){

        prgm8_11 p1 = new prgm8_11();
        p1.m1();
        System.out.println(p1.a);
    }
}
