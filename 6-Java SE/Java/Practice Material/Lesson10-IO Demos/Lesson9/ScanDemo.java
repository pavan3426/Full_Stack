import java.util.*;
public class ScanDemo 
{
	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);

		System.out.println(" Enter Your Emp ID");

		int empId = scanObj.nextInt();

		System.out.println(" Enter Your Name ");

		String empName = scanObj.next();
	
		String empLname=scanObj.nextLine();
		String empFullName = empName+ empLname;

		System.out.println(" Enter Your Salary ");

		double empSal = scanObj.nextDouble();

		System.out.println(empId + "\t" + empFullName + "\t" + empSal);
	}
}
