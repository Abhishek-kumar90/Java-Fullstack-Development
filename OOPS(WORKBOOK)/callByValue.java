public class callByValue {
    public static void main(String args[]){

    }
}

class User{
    int uid;
    long phone;
}
class Methodpara{
    void modify(int ab){
        System.out.println("--modify(int--)");
        System.out.println("befor modify int "+ab);

        ab = ab+1000;
        System.out.println("after modify ab"+ab);
    }

    void modify(User user){
        System.out.println("--MODIFY USER---");
        System.out.println("Before modifying \t"+user.uid+"\t"+user.phone);

        User = new User();
    }
}
