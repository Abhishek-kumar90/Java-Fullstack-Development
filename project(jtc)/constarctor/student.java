package constarctor;

public class student {
    

    int sid;
    String sname;
    String scity;

    student(int id, String name, String city){

        sid = id;
        sname = name;
        scity = city;


    }

    void show(){

        System.out.println("---Student details ----");

        System.out.println(sid);
        System.out.println(sname);
        System.out.println(scity);
    }
}

class result{
    public static void main(String args[]){

        student s1 = new student(101, "Abhishek", "Noida");
        student s2 = new student(102, "rahul", "delhi");

        s1.show();
        s2.show();
    }
}
