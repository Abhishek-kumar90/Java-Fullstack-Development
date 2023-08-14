package Polymorphism;

public class overloading {

    public static void main(String args[]){

        jtc j1 = new jtc();

        j1.m1();

        j1.m1(12);

        j1.m1("abhishek");

        j1.m1("abhi", 12);

        j1.m1(12,"gupta");
    }
    

}

class jtc{

    void m1(){
        System.out.println("M1 in class jtc");
    }

    void m1(int a ){
        System.out.println("m1(int a ) in class jtc");
    }

    public void m1(String s){
        System.out.println("m1(String s) in class jtc");
    }

    void m1(String s1 , int a){
        System.out.println("m1(string s , int a ) in class jtc");
    }

    void m1(int a , String s1){
        System.out.println("m1(int a, String s1) in class jtc");
    }


}
