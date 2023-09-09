public class Loading_static_bloack_7 {
    public static void main(String args[]){

        System.out.println("MAIN METHOD");
        TestClases t1 = null;
        System.out.println("ref classes()");
        t1 = new TestClases();
        System.out.println(t1);


    }
}

class TestClases{
    static{
        System.out.println("--Static of TestClass--");
    }

    TestClases(){
        System.out.println("testClass Constructor");
    }
}
