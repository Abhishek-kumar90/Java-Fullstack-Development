public class method_para_1{

    public static void main(String[] args) {

        MethodService m1 = new MethodService();
        m1.show('A');
        byte by1 = 123;
        m1.show(123);
        m1.show(by1);

        m1.show((int) 123l);
        m1.display((byte) 123);
        m1.display(by1);

        
    }
}

class MethodService{

    void show(int ab){
        System.out.println("show in class MethodService: \t"+ab);

    }

    void display(byte by1){
        System.out.println("display in class MethodService: \t"+by1);
    }



}