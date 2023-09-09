public class invocation_1 {
    public static void main(String args[]){

        int ab = 98;
        System.out.println("ab in main Before \t"+ab);
        Mno m1 = new Mno();
        m1.showValue(ab);
        System.out.println("ab in main After\t:"+ab);

    }
}

class Mno{

    void showValue(int ab){
        System.out.println("showValue in class Mno:- \t"+ab);


        if(ab!=0){
        showValue(ab/10);
        System.out.println("After show value \t:"+ab);
    
    }
    }

   
}
