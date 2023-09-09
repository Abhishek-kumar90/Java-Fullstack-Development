public class Constructor_chaining_5 {
    public static void main(String args[]){

      new Employee(99).show();
      System.out.println();
      new Employee("chandan").show();
      System.out.println();
      new Employee(98,"Abhishek").show();
      System.out.println();
      new Employee(97, "gupta", 926448).show();
      System.out.println();
      new Employee(96, "singh", 88888, 1500000).show();
      System.out.println();
      new Employee(9876, "shah", 54000000).show();  

    }
}

class Employee{

    int eid;
    String name;
    long phone;
    float salary;

    Employee(int eid){
        System.out.println("Employee (int)--\t"+this);
        this.eid = eid;
    }

    Employee(String name){
        super();
        System.out.println("Employee (String)--\t"+this);
        this.name = name;
    }

    Employee(int eid, String name){
        this(eid);
        System.out.println("Employee (int,String)--\t"+this);
        // Employee(eid);
        // this(eid) // Constructor call must be the first statement of the constructor 
        this.name = name;
    }

    Employee(int eid, String name,long phone){
        this(eid,name);
        System.out.println("Employee (int eid,String name, long phone)--\t"+this);
        this.phone = phone;
    }

    Employee(int eid, String name,long phone,float salary){
        this(eid,name,phone);
        System.out.println("Employee(int,string,long,float)--\t"+this);
        this.salary = salary;
    }

    Employee(long phone,String name,float salary){
        this(name);
        System.out.println("Employee(long staring float)--\t"+this);
        this.phone = phone;
        this.salary = salary;
    }

    void show(){
        System.out.println(eid+"\t"+name+"\t"+phone+"\t"+salary);
    }
}
