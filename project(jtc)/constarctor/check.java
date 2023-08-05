package constarctor;

 class check{
    
    int a = 10;
    int b = 20;
    static int c  =30;

    check(){
        System.out.println("constructor in class -check");
    }

    check(int a ){
        System.out.println("1-parame constuctor in class check");
        this.a = a;
    }

    check(int a , int b){
        this.a = a;
        this.b = b;
    }

    check(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show(){

        int a = 90;
        int b = 80;
        int c = 70;

        System.out.println("Details of constructor");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);

    }
}

class test{
    public static void main(String args[]){

        check c1 = new check();
        c1.show();

        check c2 = new check(0);
        c2.show();

        check c3 = new check(0, 0);
        c3.show();

        check c4 = new check(0, 0, 0);
        c4.show();


        
    }
}
