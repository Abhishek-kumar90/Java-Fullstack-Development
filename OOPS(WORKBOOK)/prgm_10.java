public class prgm_10 {
    public static void main(String args[]){


    }
}

class Mno{
    final static int Val =9090;

    static{
        System.out.println("Static Block of Mno\t"+Val);
    }
}

ClassLoader load = Test60.class.getClassLoader();

