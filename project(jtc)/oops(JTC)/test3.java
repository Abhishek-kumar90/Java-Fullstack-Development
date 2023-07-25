//Programe 6.4

class Hello{
	void m1(){
		System.out.println("m1 in hello");
	}
}

class jtc{
	int a = 10;
	static int b = 20;
	
	Hello h1 = new Hello();
	static Hello h2 = new Hello();
	

	public static void main(String args[]){

		h2.m1();
		//System.out.println(a);
		System.out.println(b);
		System.out.println(h2);
	}

}