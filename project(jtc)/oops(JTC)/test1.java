class Hello1{

	int a = 10;
	int b  = 20;
	static int c =30;

	void m1(){
		int ab = 101;
		System.out.println("m1 in hello1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(ab);
	}

	static void m2(){
		int bb = 12;
		System.out.println("m2 in hello2");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(bb);
	}
}

class jtc2{
	public static void main(String args[]){
		Hello1 h1 = new Hello1();
		h1.m1();
		h1.m2();
	}
}