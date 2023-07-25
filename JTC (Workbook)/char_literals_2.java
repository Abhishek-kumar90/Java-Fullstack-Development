import java.util.*;
public class char_literals_2 {
    public static void main(String args[]){

        // char ch = 'a';
        // char ch1 = 'b';

        // System.out.println("print the value of character value :"+ch);
        // System.out.println("print the value of character value : "+ch1);


        // if(ch=='a'){
        //     System.out.println("a for :- Abhishek gupta");
        // }else{
        //     System.out.println("b for :- bole baba ");
        // }


        // char ch12  = '\u0045';
        // System.out.println(ch12);

        for(char c=0;c<255;c++){
            int x = c;
            System.out.print(x);
            System.out.println('\t');
            System.out.print(c); 
            System.out.println();
        }


    }
}
