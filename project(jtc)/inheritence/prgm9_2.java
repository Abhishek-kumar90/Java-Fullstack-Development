package inheritence;

public class prgm9_2 {

    public static void main(String args[]){

        Hello h1 = new Hello();


    }
    
}

class Hai{
    int a ;
    Hai(int a){
        System.out.println("1 -para constructor");
        this.a = a;
    }
}

class Hello extends Hai{ /// we will get error msg --> required int type argument found nothing in Hello class

    // Helllo(int a) {
    //     super(a);
    //     //TODO Auto-generated constructor stub
    // }
    

}


