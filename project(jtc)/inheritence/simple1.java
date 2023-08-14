package inheritence;

public class simple1 {
    public static void main(String args[]){

        currentSudent c1 = new currentSudent();
        c1.newStudent(12, "abhishek", "noida", "123", "java", "no");
        c1.currentStudentDetails();
    }
}

class jtcStudent{
    int sid;
    String sname;
    String scity;

    void creteStudent(int sid,String sname,String scity){
        this.sid = sid;
        this.sname = sname;
        this.scity = scity;

    }

    void details(){
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(scity);
    }
}


class currentSudent extends jtcStudent{

    String BatchId;
    String batchType;
    String LMSAcess;

    void newStudent(int sid,String sname,String scity,String BatchId,String batchType,String LMSAcess){
        System.out.println("new student details");

        creteStudent(sid, sname, scity);
        this.BatchId = BatchId;
        this.batchType = batchType;
        this.LMSAcess = LMSAcess;

        
    }

    void currentStudentDetails(){

        details();
        System.out.println(batchType);
        System.out.println(BatchId);
        System.out.println(LMSAcess);
    }


}
