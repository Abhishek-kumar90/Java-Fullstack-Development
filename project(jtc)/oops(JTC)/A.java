class A {
    
    {
        System.out.println("Ib in class -A");
    }

    static{
        System.out.println("SB in class -A");
    }

}
class B{
    {
        System.out.println("Ib in class -B");
    }

    static{
        System.out.println("SB in class -B");
    }
}

class jtc{
    {
            System.out.println("Ib in class -jtc");
    }

    static{
        System.out.println("SB in class -jtc");
    }

    public static void main(String args[]){
        System.out.println("main in class -A");

        A a1 = new A();
        B b1 = new B();
        jtc j1 = new jtc();

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(j1);


    }

}
