public class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private double hourlyRate;
	private int status;
	private double grossPay;
	private double taxAmount;
	private double netPay;
	public double hoursWorked;
	
public Employee(int id, String firstName, String lastName, double hoursWorked, double hourlyRate, int status) {
	this.id= id;
	this.firstName= firstName;
	this.lastName= lastName;
	this.hoursWorked = hoursWorked;
	this.hourlyRate = hourlyRate;
	this.status= status;
}


public double computeGrossPay() {
		if (hoursWorked > 40) {
			double overTimeHours = hoursWorked-40;
			grossPay = (40 * hourlyRate) + (overTimeHours*hourlyRate*1.5);
		}
		else {
			grossPay= (hourlyRate*hoursWorked);
		}//no Overtime
		return grossPay;	
}

public double computeTaxAmount () {
	if (status == 1)	{
		
		if (grossPay <= 44) 
			taxAmount=0;
		
		else if (grossPay <= 224) 
			taxAmount=0+(0.1) * (grossPay-44);
		
		else if (grossPay <=774)
			taxAmount= 18+ (0.15) * (grossPay-224);
	
		else if (grossPay <=1812) 
			taxAmount = 100.50 + (0.25) * (grossPay- 774);
		
		else if (grossPay <=3730) 
			taxAmount = 360 + (0.28) * (grossPay- 1812);
		
		else if (grossPay <= 8058) 
			taxAmount = 879.04 +0.33 * (grossPay-3730);
		
		else if (grossPay <= 8090) 
			taxAmount= 2325.28 + 0.35 * (grossPay-8058);
			
		else if (grossPay >8090) 
			taxAmount = 2336.48 + (0.396) * (grossPay-8090);
		
	}
	
	if (status == 2) {
		
		if (grossPay<= 166) {
			taxAmount = 0;
		}
		else if (grossPay <= 525) {
			taxAmount = 0 + (0.1) * (grossPay-166);
		}
		else if (grossPay <= 1626) {
			taxAmount = 35.90 + (0.15) * (grossPay - 525);
		}
		else if (grossPay <= 3111) {
			taxAmount = 201.05 + (0.25) * (grossPay - 1626);
		}
		else if (grossPay <= 4654) {
			taxAmount = 572.30 + (0.28) * (grossPay - 3111);
		}
		else if (grossPay <= 8180) {
			taxAmount = 1004.34 + (0.33) * (grossPay-4654);
		}		
		else if (grossPay <= 9218) {
			taxAmount=2167.92 + (0.35) * (grossPay-8180);
		}
		else if (grossPay > 9218 ) {
			taxAmount = 2531.22 + (0.396) * (grossPay-9218);
		}
	}
	return taxAmount;
}

public  double computeNetPay () {
	netPay= grossPay- taxAmount;
	return netPay;
}

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public double getHoursWorked() {
	return hoursWorked;
}


public void setHoursWorked(int hoursWorked) {
	this.hoursWorked = hoursWorked;
}


public double getHourlyRate() {
	return hourlyRate;
}


public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}


public int getStatus() {
	return status;
}


public void setStatus(int status) {
	this.status = status;
}



public void displayEmployeeInfo () {
	System.out.println("Payroll Summary for Employee ID: " + getId());
	System.out.println("Name: " + getFirstName() + " " + getLastName());
	System.out.println(" ");
	System.out.println("Hours Worked: "+ getHoursWorked());
	System.out.println("Hourly Rate:  " + getHourlyRate());	
	System.out.println("Gross Pay:    " + computeGrossPay());
	System.out.println("Tax Amount:   " + computeTaxAmount());
	System.out.println("Net Pay:      "+  computeNetPay());
}

} 