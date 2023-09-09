public class method_invocation {
    public static void main(String[] args) {
     
        Calculator c1 = new Calculator();

        int result = c1.add(12, 23);
        System.out.println(result);
    }
}

class Calculator{

    public int add(int a , int b){

        return a+b;
    }
}
