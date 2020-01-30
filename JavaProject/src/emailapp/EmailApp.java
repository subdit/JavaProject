package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// You are an IT Support Administrator Specialist and 
		// are charge with the task of creating email accounts for new hires
		// The application should do the following 
		// Generate an email with the following Syntax: firstname.lastname@department.company.com
		// Determine the department (Sales, development, accounting) if none leave blank
		// Generate a random String for a password
		// Have set methods to change the password, set the mailbox capacity, and define an alternate email address
		// Have get methods to display the name, email, and mailbox capacity
		
		// To set up to receive constructor by calling "Email class"
		// Takes 2 parameters: Name and Last name from constructor Email Class.
		
		System.out.println("========================================");
		Email eml = new Email("John", "Smith"); 
		
		System.out.println(eml.showInfo()); // since we return showInfo as string
		                                    //we need to System out to print the .showInfo method.
		
		
//		eml.setAlternateEmail("js@gmail.com");
//		System.out.println("Your alternative email is: " + eml.getAlternateEmail());
		
	
		
	}

}
