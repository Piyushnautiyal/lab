public class MethodOverLoadingDemo {

	{
		System.out.println("One");
	}
	
	static {
		System.out.println("two");
	}
	
	public MethodOverLoadingDemo(){
		System.out.println("three");
	}
	
	public static void main(String args []) {
		System.out.println("four");
		MethodOverLoadingDemo methodOverLoadingDemo	= new MethodOverLoadingDemo();
		
		/*
		 * methodOverLoadingDemo.m1(null);
		 */
		methodOverLoadingDemo.m1("1");
		methodOverLoadingDemo.m1("1.1");
		methodOverLoadingDemo.m1(1);
		methodOverLoadingDemo.m1(1l);
		methodOverLoadingDemo.m1(1.1);
		methodOverLoadingDemo.m1(1.1f);
		methodOverLoadingDemo.m1(1.1d);
		
	}
	
	public void m1(Object o) {
		System.out.println("Object method called.");
	}
	
	public void m1(String s) {
		System.out.println("String mehtod called.");
	}
	
	public void m1(Float f) {
		System.out.println("Float method called.");
	}
	
	public void m1(Double i) {
		System.out.println("Double method called.");
	}
	
	public void m1(Long i) {
		System.out.println("Long method called.");
	}
}
