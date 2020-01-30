package emailapp;

import java.util.Scanner;

public class Email {
	// The application should do the following 
	// Generate an email with the following Syntax: firstname.lastname@department.company.com
	// Determine the department (Sales, development, accounting) if none leave blank
	// Generate a random String for a password
	
	// To set a private, we don't want anyone to access this 
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500 ; // assigned email capacity
	private int defaultPasswordLength = 10; // set the length to be able to generate the randomPassword
	private String alternateEmail;
	private String companySuffix = "easycompany.com";
	
	
	// Set Constructor to receive the firstName and lastName to be able to run at "Main EmailApp Class"
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED TO: " + this.firstName+ " " + this.lastName);
		
		// Call a method asking for the department to return the department
		this.department = setDepartment();
		System.out.println("Your Department is: " + this.department);
		
		// Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		
		// Combine elements to generate email
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		// System.out.println("Your email is: " + email);
		
	}
	
	// Ask for the department(prompting the input) and set it to "private" 
	private String setDepartment() {
		System.out.print("New employee: " + firstName + "\nDepartment Code:\n\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n\nEnter Your Department Code: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt(); // reading input
		if (depChoice == 1 ) { return "sales"; }
		else if (depChoice == 2 ) { return "dev"; }
		else if (depChoice == 3 ) { return "acct"; }
		else { return " "; }	
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYC0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int ran = (int) (Math.random() * passwordSet.length()); // set Math.random(0,1)* passwordSet.length
			password[i] = passwordSet.charAt(ran); // set the random charAt(ran) to password[i]
		}
		return new String(password); // to return a new string set of password. 
	}
	
	// Set the mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Allow access through get method only for the purpose of encapsulation (data hiding/data binding)  
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
		
		
		
		
		
	}
}
