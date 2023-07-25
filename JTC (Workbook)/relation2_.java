public class relation2_ {
    public static void main(String args[]){

        String str = "ABC";
        relation2_ test = new relation2_();

        Object obj = str;
        System.out.println(obj==str);
        System.out.println(obj==str);
        obj=test;
        // System.out.println(obj);
        System.out.println(obj==str);
        System.out.println(obj==str);

        System.out.println(20/2 == 40/2);
        System.out.println(0.0/0.0==0.0/0.0);
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(0.0/0.0 != 0.0/0.0);
        int ab = 10;
        System.out.println(ab==ab);
        
        



    }
}
