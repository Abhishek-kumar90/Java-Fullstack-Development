// package constarctor;

class chec2 {
    int a = 10;
    int b  =20;
    static int c  =30;

    {
        System.out.println("IB in chec2 class");
        System.out.println(this);
        System.out.println(this.hashCode());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static {
        System.out.println("Sb in class check ");
        System.out.println(c);


    }

    void show(){
        System.out.println("show the details ");
        int a  =100;
        int b = 200;
        int c = 300;

        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

    static void show1(){
        System.out.println("show the details ");
        int a  =101;
        int b = 202;
        int c = 303;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
    }



}

class test{
    public static void main(String args[]){
            chec2 c1 = new chec2();
            c1.show();
            c1.show1();

            chec2 c3 = new chec2();
            c3.show();
            c3.show1();

    }
}
