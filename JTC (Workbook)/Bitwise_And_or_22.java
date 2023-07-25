public class Bitwise_And_or_22 {
    public static void main(String args[]){

        int ab = 7514;
        int bc = 2967;

        System.out.println(ab);
        System.out.println(bc);

        System.out.println(true&true);
        System.out.println(false&true);

        int res1 = ab & bc ;
        System.out.println(res1);
        System.out.println(Integer.toBinaryString(res1));



        int n = 123;
        boolean b1 = n>100 & n++>10;
        System.out.println(b1);

        System.out.println(true^true);
        System.out.println(false^false);
        System.out.println(true^false);
        System.out.println(false^true);

        

    }
}
