/* Sean Bordelon
 * COP 3330 0R02 Assignment #2
 * 1/25/2018
 * Employee.java Program to output Employee name and yearly salary. Then program gives employee 10% 
 * raise and outputs new yearly salary.
 */

// Beginning of class Employee
public class Employee
{
	// intializing instance variables
	private String f_name; // set f_name to a string value
	private String l_name; // set l_name to string value
	private double monthSal; // set monthSal to a double value
	
	double yearSal; // set yearSal to a double value
	
	// a method to call the values for the Employee
	public Employee (String f_name, String l_name, double monthSal)
	{
		
		this.f_name = f_name; // instance variable
		this.l_name = l_name; // instance variable
		
		if (monthSal > 0.0) // set value to 0.0 if monthSal less than 0.0
			this.monthSal = monthSal;
	}

	// method to set value of f_name to variable
	public void setFirstName (String f_name)
	{
		this.f_name = f_name;
	}
	
	// method to set value of l_name to variable
	public void setLastName (String l_name)
	{
		this.l_name = l_name;
	}
	
	// method to set value of monthSal to variable
	public void setMonthlySalary (double monthSal)
	{
		this.monthSal = monthSal;
	}
	
	// method to get value of f_name and return it to call
	public String getFirstName ()
	{
		return f_name;
	}
	
	// method to get value of l_name and return it to call
	public String getLastName ()
	{
		return l_name;
	}
	
	// method to get value of monthSal and return it to call
	public double getMonthlySalary ()
	{
		return monthSal;
	}
	
	// method used to calculate the yearly salary of the employee
	public double getYearlySalary()
	{
		yearSal = getMonthlySalary() * 12;
		
		return yearSal;
	}
	
	// method used to calculate the new yearly salary of the employee with a 10% pay increase
	public double getSalaryIncrease ()
	{
		yearSal = (getYearlySalary() * .10) + getYearlySalary();
		
		return yearSal;
	}
} // end of class Employee



