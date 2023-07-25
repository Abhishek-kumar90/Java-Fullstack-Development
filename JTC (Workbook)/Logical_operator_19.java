public class Logical_operator_19 {
    public static void main(String args[]){

        System.out.println("LOGICAL OPERATOR");

        int res = 90;
        boolean b1 = (res==90);
        boolean b2 = !(res==90);
        boolean b3 = !b1;
        System.out.println(b3);
        System.out.println(b2);


        System.out.println("LOGICAL AND ");

        int ab = 14;
        boolean b4 = ab<16 && ab++<4;
        System.out.println(b4+"\t"+ab);

        int xy = 14;
        boolean b5 = xy >16 && xy++<4;
        System.out.println(b5+"\t"+b5);


        int mn = 16;
        boolean b6 = mn<16 || mn++<4;
        System.out.println(b6+"\t"+b6);

        


    }
}
