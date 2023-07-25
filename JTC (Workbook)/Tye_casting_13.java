public class Tye_casting_13 {
    public static void main(String args[]){

        int xy = 19;
        // byte b1 = xy; // cann't convert from int to byte ---> tyoe conversion 
        byte b2 = (byte)xy;
        System.out.println(b2);

        int ab = 110;
        // char ch = ab; /// cann''t convert the value to int to char'
        char ch1 = (char)ab;
        System.out.println(ch1);

        // int mn = 123.45;
        double mn1 = (int)123.45;
        System.out.println(mn1);

        
        int val = 5657;
        byte b5 = (byte)val;
        System.out.println(b5);

        int bd = 300;
        byte b6 = (byte)bd;
        System.out.println(b6);



        byte b8 = 10;
        byte b9 = 11;

        byte b0 = (byte)(b8+b9);
        System.out.println(b0);

        // String st = (String)10;

        // int n1 = (int)true; // cann't cast from boolean to int 
        // boolean boll = (boolean)0; // cann't cast from int to boolean


        





    }
}
