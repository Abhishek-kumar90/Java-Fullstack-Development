package constarctor;

public class prgm8_6 {
    

}

class Hello{
    void m1(){
        System.out.println("m1 in hello class");
    }

    void m1(int ... a){
        System.out.println("m1(int a ) in hello");
        System.out.println(a);
    }

    void m1(prgm8_6 prg){
        System.out.println("m1( prg8_6 in prg)");
    }

    void m2(Object O){
        System.out.println("m2(object o in hello");

    }

    void m2(Hello h){
        System.out.println("m2 in (hello h) in hello");

    }

    void m2(String arg){
        System.out.println("m2 in hello string args");
    }


}

class jtc1{
    public static void main(String args[]){

        Hello h1 = new Hello();
        h1.m1();
        h1.m1(12,23,45);
        h1.m1(12); // prgm8_6 prg for this method only
        
    }
}


