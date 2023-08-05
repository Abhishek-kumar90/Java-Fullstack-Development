package constarctor;

class first {
    
    first(){
        System.out.println("construcor called in class first");
    }

    void m1(){
        System.out.println("method called in class first");
    }


}


class cons{
    public static void main(String args[]){

        first f1 = new first();

        f1.m1();
    }
}