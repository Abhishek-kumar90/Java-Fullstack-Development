package constarctor;

public class student2 {
    
    int sid;
    String sname;
    String scity;
    

    student2(int id , String name, String city){

        sid = id;
        sname = name;
        scity  = city;

    }

    void show(){
        System.out.println("---Student details-----");

        System.out.println(sid);
        System.out.println(sname);
        System.out.println(scity);


    }
}

class test{
    public static void main(String args[]){

        student2 s2 = new student2(05,"abhi","noida");
        student2 s3 = new student2(2,"gupta","delhi");

        s2.show();
        s3.show();
    }
}
