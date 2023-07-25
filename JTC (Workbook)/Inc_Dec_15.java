public class Inc_Dec_15 {
    public static void main(String args[]){

        byte b1 = 15;
        // by1 = b1+12;  error :-> rsolved the variable 
        b1++;
        b1 = (byte)(b1+1);
        System.out.println(b1);

        char ch = 'A';
        // ch = ch+1;
        ch = (char)ch;
        System.out.println(ch);
        ch++;
        ch = (char)(ch+1);
        System.out.println(ch);

        byte b2 = 127;
        b2++;
        b2 = (byte)(b2+1);
        System.out.println(b2);

        int res = 128;
        byte b3 = (byte)(res+1);
        System.out.println(b3);





    }
}
