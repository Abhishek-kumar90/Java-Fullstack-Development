package Polymorphism;

public class university {

    public static void main(String args[]){

        Student s1 = new Student();

        Teacher t1 = new Teacher();

        Admin a1 = new Admin();

        s1.generatId();
        t1.generatId();
        a1.generatId();

    }
    
}


class university1{

    void generatId(){
        System.out.println("--- University Details ----");
    }


}

class Student extends university1{

    void generatId(){
        System.out.println("Student Id statrt with 'S' ");
    }
}

class Teacher extends university1{

    void generatId(){
        System.out.println("Teacher Id start with 'T' ");
    }
}

class Admin extends university1{

    void generatId(){
        System.out.println("Admin Id start with 'A' ");
    }
}

