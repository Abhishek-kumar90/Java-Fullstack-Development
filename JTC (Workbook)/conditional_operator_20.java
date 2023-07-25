public class conditional_operator_20 {

    public static void main(String args[]){

        int ab  = 10;
        int bc = 20;
;       String bc1 = "hello welcome back";
        int res1 = true?ab:bc;
        int res2 = false?ab:bc;

        System.out.println(res1);
        System.out.println(res2);

        int res3 = (ab>bc)?ab:bc;
        System.out.println(res3);


        String res5 = (ab>bc)?"ten":bc1;
        System.out.println(res5);

        
    }
}