package inheritence;

public class example2 {

    public static void main(String args[]){

        
    }
    
}


class jtc{
    int sid;
}

class currentStudent extends jtc{
    int batch_Id;
    int Batch_time;

}

class oldStudent extends jtc{
    int mop;
    String cmp;
}

class onlineStudent extends currentStudent{
    String labAcess;

}

class offlineStudent extends currentStudent{
    String lmsAcess;

}


