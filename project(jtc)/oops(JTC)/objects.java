class objects{
    int sid ;
    String sname;
    String scity;

}

    class objects1 {
        public static void main(String args[]){

            objects obj = new objects();
            objects obj1 = new objects();
            obj.sid = 101;
            obj.sname= "Abhishek kumar";
            obj.scity = "delhi";

            obj1.sid = 102;
            obj1.sname= "Abhishek gupta";
            obj1.scity = "gr noida";

            System.out.println(obj.sid);
            System.out.println(obj.sname);
            System.out.println(obj.scity);

            System.out.println(obj1.sid);
            System.out.println(obj1.sname);
            System.out.println(obj1.scity);

    }
}