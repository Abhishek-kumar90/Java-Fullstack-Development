public class prgm_8 {
    
    public static void main(String args[]){

        System.out.println("---MAIN METHOD--");
        System.out.println(xyz.var);
        System.out.println(new xyz());

    }
}

class xyz{

    static int var = 123;
    static{
        System.out.println("--Static of xyz--");
    }
}
