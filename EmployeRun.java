import java.util.Scanner;
public class EmployeRun {
	public static void main(String[] args) {
			
		int id;
		double hoursWorked=0, hourlyRate = 0, grossPay=0, taxAmount=0, netPay=0;
		int status=0; 
		double employeeInfo=0;
		String firstName;
		String lastName;


		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to our Payroll System!");
		System.out.println("Enter the Following Information.");
		
		do {
		System.out.println("Employee id:");
		id= keyboard.nextInt();
		} while(id<=0);
		
		System.out.println("Employee First Name: ");
		firstName = keyboard.next();
		
		
		System.out.println("Employee Last Name: ");
		lastName = keyboard.next();
		
		do {
			System.out.println("Hours Worked:");
			hoursWorked= keyboard.nextDouble();
		} while (hoursWorked<=0);
		
		do {
		System.out.println("Hourly Rate:");
		hourlyRate = keyboard.nextDouble();
		} while (hourlyRate<=0);		
		
		do {
		System.out.println("Please Enter Your Marital Status. (Please type " + "1 " + "for single and "+ "2 " + "for married.)");
		status= keyboard.nextInt();
		} while(status != 1 && status!=2);
		
		
		Employee Dave = new Employee(id, firstName, lastName, hoursWorked, hourlyRate, status);
		
		Dave.displayEmployeeInfo();

		keyboard.close();
		
	}
}



