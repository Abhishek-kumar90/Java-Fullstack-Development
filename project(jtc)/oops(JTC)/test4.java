class hello{
	int a  = 10;
	int b = 20;
	static int c = 30;

	
	{
		System.out.println("IB in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} 

	static{

		System.out.println("SB in hello");
		System.out.println(c);
	}

	void m1(){
		System.out.println("m1 in hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	 static void m2(){

		System.out.println("m2 in hello");
		System.out.println(c);
	}


}

class jtc{
	public static void main(String args[]){

		hello h1 = new hello();
		hello h2 = new hello();

		
}

}