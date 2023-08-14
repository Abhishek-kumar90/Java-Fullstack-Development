package Polymorphism;

public class prgm10_2 {

    public static void main(String args[]){

        Hai hai = new Hai();
        hai.m1();
        hai.m2(14);
        hai.m2(34, 54);
    }
    
}

class Hello{

    void m1(){
        System.out.println("m1 in class Hello");

    }

    void m2(){
        System.out.println("m2 in claa Hello");
    }

    private void m3(){
        System.out.println("m3 in class Hello");
    }

    protected void m4(){
        System.out.println("m4 in class Hello");
    }


}

class Hai extends Hello{

    void m1(){
        System.out.println("m1 in class Hai");
    }

    void m2(int a){
        System.out.println("m2(int a) in class Hai");
    }

    void m2(int a , int b){
        System.out.println("m2(int a, int b) in class Hai");
    }

    public void m3(){
        System.out.println("m3 in class Hai");
    }

    public int M4(){
        System.out.println("m4 in class Hai");
        return 12;
    }

    private void m5(){
        System.out.println("m5 in class Hai");
    }
}
