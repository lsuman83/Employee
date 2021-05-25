/* Sean Bordelon
 * COP 3330 0R02 Assignment #2
 * 1/25/2018
 * Employee.java Program to output Employee name and yearly salary. Then program gives employee 10% 
 * raise and outputs new yearly salary.
 */

// Beginning of class EmployeeTest
public class EmployeeTest 
{
	// "main" body function used to display output from the program
	public static void main(String[] args)
	{
		// set method Employee to the values given 
		Employee employee1 = new Employee ("Kevin", "Faulk", 2800.00);
		Employee employee2 = new Employee ("Sarah", "Fox", -3200.00);
		
		// output of first employee information
		System.out.println ("Employee 001");
		System.out.printf ("First Name: %s\n", employee1.getFirstName());
		System.out.printf ("Last Name: %s%n", employee1.getLastName());
		System.out.printf("Yearly Salary: $%.2f%n", employee1.getYearlySalary());
		System.out.printf("\nYearly Salary for %s %s after 10 percent raise: $%.2f%n\n", employee1.getFirstName(), 
				employee1.getLastName(), employee1.getSalaryIncrease());
		
		// output of second employee information
		System.out.println ("Employee 002");
		System.out.printf ("First Name: %s\n", employee2.getFirstName());
		System.out.printf ("Last Name: %s%n", employee2.getLastName());
		System.out.printf("Yearly Salary: $%.2f%n", employee2.getYearlySalary());
		System.out.printf("\nYearly Salary for %s %s after 10 percent raise: $%.2f%n\n",employee2.getFirstName(), 
				employee2.getLastName(), employee2.getSalaryIncrease());
		
	} // end of main

}// end of class EmployeeTest
