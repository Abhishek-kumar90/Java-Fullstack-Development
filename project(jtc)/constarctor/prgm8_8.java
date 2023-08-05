package constarctor;

class prgm8_8 {
    static prgm8_8 h1 = new prgm8_8();
}

class Hello{
    Hello(){
        
        System.out.println("Default constructor in hello class");
        System.out.println(this);
        
    }

    Hello(Hello h1){
        System.out.println("1 param constructor in hello");
    }

    Hello(Hello h1 , Hello h2){
        System.out.println("2 param constructor in hello class");
    }
}

class jtc5{
    public static void main(String args[]){

        Hello h1 = new Hello();
        System.out.println(h1);
    }
}
