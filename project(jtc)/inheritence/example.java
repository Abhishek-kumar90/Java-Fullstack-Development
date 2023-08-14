package inheritence;

public class example {
    public static void main(String[] args) {
        student s1 = new student(011, "abhishek", "noida", "jtc", "class -A");
        Teacher t1 = new Teacher(102, "vivek", "delhi", "23 feb 2021", "java");
        s1.show();
        t1.show();
    }
    
}

class Details{
     int id;
    String name;
    String city;
}


class student extends Details{
   
    String collage;
    String std;

    student(int id, String name, String city , String colleage , String std){
        
        this.collage = collage;
        this.std = std;
    }

    void show(){
        System.out.println("-----Student details--------");
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("city "+city);
        System.out.println("coolage "+collage);
        System.out.println("std "+std);
    }
}

class Teacher extends Details{
   
    String doj;
    String subject;

    Teacher(int id, String name , String city , String doj, String subject){
        this.id  = id ;
        this.name = name;
        this.city = city;
        this.doj  = doj;
        this.subject = subject;
    }


    void show(){
        System.out.println("-------Teacher Details-----");
        System.out.println("id "+id);
        System.out.println("name"+name);
        System.out.println("city "+city);
        System.out.println("doj "+doj);
        System.out.println("std "+subject);
    }


}