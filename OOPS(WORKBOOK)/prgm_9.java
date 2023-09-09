public class prgm_9 {
    public static void main(String args[]){

        System.out.println("--MAIN METHOD--");
        new Student();
        System.out.println("--student Object creted--\n");
        new Employee();
        System.out.println("employee object creted");
        
    }
}

class person{
    static{
        System.out.println("\n--static of person--");
    }

    person(){
        System.out.println("--person() Cons--");
    }
}

class Student extends person{

    static{
        System.out.println("--static of Student---");
    }

    Student(){
        System.out.println("Student cons--");
    }

}

class Employee extends person{
    static{
        System.out.println("-- static of Employee--");
    }
}