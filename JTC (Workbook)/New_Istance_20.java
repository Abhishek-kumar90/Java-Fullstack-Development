public class New_Istance_20 {
    public static void main(String args[]){

        String s1 = new String("abhishek");
        String s2  = new String("gupta");

        New_Istance_20 t1 = new New_Istance_20();
        New_Istance_20 t2 = new New_Istance_20();


        System.out.println(s1+" "+s2);


        System.out.println(s1==s2);


        int arr[] = new int[20];
        System.out.println(arr);System.out.println(s1 instanceof String);

        Object ref = s1;
        System.out.println(ref);

        Object ref1 = t2;
        System.out.println(ref1);

        ref = t2;
        System.out.println(ref);



    }
}
