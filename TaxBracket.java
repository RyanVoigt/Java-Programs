/*This program was created by Ryan Voigt*
 * This program takes you pay and hours worked, and creates a pay slip
 */
import java.util.*;
public class Tax {
	static double grossPay;
	static double netPay;
	public static void main (String [] args){
		//Variable are created
	String fullName;
	String familyName;
	String choice;
	String greeting;
	double donation = 20;
	double pay;
	double hoursWorked;
	double hourlyPay;
	char agree;
	//Scanner gets inputs
	Scanner input = new Scanner (System.in);
	//Ask for name
	System.out.println("What is your family's name?");
	familyName = input.nextLine();
	System.out.println("What is your name?");
	fullName = input.nextLine();
	//Scanner gets inputs
	// send info to greeter class
	Greeter WorldGreeter = new Greeter(fullName,familyName);
	greeting = WorldGreeter.sayHello();
	//print out greeter from greeter class
	System.out.println(greeting);
	
	System.out.println("How many hours did you work this week?");
	hoursWorked = input.nextDouble();
	//Scanner gets inputs
	System.out.println("how much do you make an hour?");
	hourlyPay = input.nextDouble();
	//Scanner gets inputs
	GrossPay calcGross = new GrossPay(hourlyPay,hoursWorked);
	grossPay=GrossPay.getGross();
	//Scanner gets inputs
	System.out.println("Would you like to donate 20 dollars to charity? (Please enter yes or no)");
	Scanner input2 = new Scanner (System.in);
	//Scanner gets inputs
	choice= input2.nextLine();
	agree = choice.charAt(0);
	pay = hourlyPay;
	
		
    //gross pay is sent to tax class to remove tax
	TaxB calcTax = new TaxB(grossPay);
	netPay=TaxB.getnet();
	//net pay is brought back from tax class
	//net pay is sent to NetPay class to remove money for donation is applicable
	NetPay calcNet = new NetPay(netPay,agree);
	netPay=NetPay.getNet();
	//net pay brought back from class

	//all info sent to PrintState class
	PrintState print = new PrintState(fullName,familyName,hoursWorked,pay,netPay,grossPay,agree);
	
	
	}
}






public class Greeter {
	String name, name2;
    //constructor created for variables
	public Greeter(String fullName, String familyName) {
	name = fullName;
	name2 = familyName;
	}
	//method created to send infro back to main
	public String sayHello(){
		return "Hello, " + name + " " + name2 +"!";
	}
}




public class GrossPay {
	static double grossPay;
    //constructor created for variables
	public GrossPay(double hourlyPay, double hoursWorked) {
		

	//calculate gross pay
		grossPay = (hourlyPay * hoursWorked);
		//If statement is used to check if variable is less then 40 (for overtime)
		if (hoursWorked >40){
		grossPay = (hourlyPay * 1.5 * (hoursWorked-40) + hourlyPay*40);}
		}

	//method created to send info back to main
	public static double getGross(){
		return grossPay;
}
}























public class TaxB {
	static double grossPay;
	static double netPay;
    //constructor created for variables
	public TaxB(double X) {
		grossPay=X;
		netPay=0;
		//if statement is used to check tax category and then the net pay is set equal to gross with the tax taken off
		if (grossPay <= 150){
			System.out.println("Tax catergory A");
			netPay= grossPay;

		}else if (grossPay<= 500){
			System.out.println("Tax catergory B");
			netPay= grossPay*0.9;

		}else if (grossPay<= 750 ){
			System.out.println("Tax catergory C");
			netPay= grossPay*0.8;

		}else if (grossPay <=1500){
			System.out.println("Tax catergory D");
			netPay= grossPay*.71;

		}else if (grossPay >1500 ){
			System.out.println("Tax catergory E");
			netPay= grossPay*.65;}
		}
	//method created to send info back
	public static double getnet() {
		return netPay;
	}
}









public class PrintState {

    //constructor created for variables
	public PrintState(String fullName, String familyName, double hoursWorked, double pay, double netPay, double grossPay,char X) {
		char agree=X;
		//print statements to send out information
		System.out.println("" + familyName + " " + fullName);
		System.out.printf("Hours worked %.2f %n" ,hoursWorked);
		System.out.printf("Rate of pay $%.2f %n" , pay);
		System.out.printf("Gross pay $%.2f %n" ,grossPay);
		System.out.printf("Your total net pay is $%.2f %n", netPay);
		//final if statement to thank them for donating if applicable
		if (agree == 'y'|| agree =='Y'){
			System.out.println("Thank you for Donating $20 to the United Way.");}
	
	
	}

}


