package constarctor;

public class prm8_4 {
    
    int a  =10;
    int b  =20;
    void m1(){
        System.out.println("m1 in hello");
    }

    void m1(int a ){
        System.out.println("m1(int a in hello)");
    }

    void m1(int ... a){
        System.out.println("m1(int a in hello");
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    void m1(double d, int a){
        System.out.println("m1(double d and int a in hello class)");

    }

    void m2(int ... a){
        System.out.println("m1(double d int a in hello )");

        // System.out.println(Modifier.PUBLIC);
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}

class jtc{
    public static void main(String args[]){

        prm8_4 p1 = new prm8_4();
        p1.m1(123d, 12);
        
        
    }
}
