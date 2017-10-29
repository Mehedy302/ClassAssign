 
class C {
int i;
protected int j;
void setij(int x, int y) {
i = x;
j = y;
}
}
 
 class D extends C {
	 int total;
	 void sum() {
	 total = i + j;  //Here j is private so, it is not accessable.
	 }
	 }
 
public  class Access {
	 public static void main(String args[]) {
	 D subOb = new D();
	 subOb.setij(10, 12);
	 subOb.sum();
	 System.out.println("Total is " + subOb.total);
	 }
	 }