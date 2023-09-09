public class Overloded_method_3 {
    public static void main(String args[]){

        OverloadManager m1 = new OverloadManager();
        m1.show((byte)12, 12);
        m1.show(23, (byte)12);

        String str = null;
        Object obj = null;
        int arr[] = null;

        m1.display(obj);
        m1.display(str);
        m1.showValue(arr);
        m1.showValue(str);
        // String str = null;

    }
}


class OverloadManager{

    void show(int ab, byte b1){
        System.out.println("show (int ab, bye b1)");
    }

    void show(byte b1, int ab){
        System.out.println("show(byte , int)");
    }

    void display(String str){
        System.out.println("display(Object)");
    }

    void display(Object obj){
        System.out.println("display (Object)");
    }

    void showValue(String str){
        System.out.println("showValue (String)");
    }

    void showValue(int arr[]){
        System.out.println("showValue(array)");
    }
}