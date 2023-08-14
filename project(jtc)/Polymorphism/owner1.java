package Polymorphism;

public class owner1 {

    public static void main(String args[]){

        student s1 = new student();

        Teacher t1 = new Teacher();

        Admin a1 = new Admin();

        university ownerSee = new university();

        owner1.show(s1);
		owner1.show(t1);
		owner1.show(a1);
    }

    
    
}

class universty{

    void generateId(){

    }

    void show(student s1){
        s1.generateId();
    }

    void show(Teacher t1){
        t1.generateId();
    }

    void show(Admin a1){
        a1.generateId();
    }
}

class student extends university{

    void generateId(){
        System.out.println("Student Id start with 'S' ");
    }
}

class Teacher extends university{

    void generateId(){
        System.out.println("Teacher Id start with 'T' " );
    }
}

class Admin extends university{

    void generateId(){
        System.out.println("Admin Id start with 'A' ");
    }
}

