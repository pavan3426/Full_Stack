public class TestPassByValue {
	public static void main(String[] args) {
		
		int i = 10;
		
		// Print the value of i
		System.out.println("start of the main method and i = " + i);
		
		
		test( i );
		// print the value of i. please note that i not changed
		System.out.println("end of the main method and i = " + i);
		}
		
		// Another static method in the TestPassByValue class
		
		public static void test(int j){
		
		System.out.println("start of the test method and j = " + j);
		// change value of parameter i
		j = 33;
		
		System.out.println("end of the test method and j = " + j);
	}
}