
public class A {
	
	protected int i = 10;
	protected int j  = 20;
	
	void showIJ()
	{
		
	System.out.println("From A:"+"i = "+i+" j = "+j);
		
	}
	
	
	
	public static void main(String []arguments) {
		
		B ob1 = new B();
		
		ob1.showIJ();
		ob1.show();
		
	}
	
	
	
}
	
class B  extends  A { 
		
		
	 void show()
	 {
		 
		 System.out.println("From B:"+"i , j : "+super.i+" "+super.j);
		 
		 
	 }
		
	}

 
	
	


