package emailapp;

import java.util.Scanner;

public class Email {
	 private String firstName;
	    private String lastName;
	    private String password ;
	    private String department;
	    private int mailboxCapacity=500;
	    private String email;
	    private String alternateEmail;
	    private int defaultPasswordlength = 10;
	    private String companySuffix="yahooh.com";

	    // Constructor for receiving first and last name
  public Email(String firstName, String lastName)
	    {
	        this.firstName=firstName;
	        this.lastName=lastName;
	        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
	        this.department=setDepartment();
	        
	      //  System.out.println("Department=" +this.department);
	        
	        // calling a method to return random password
	        this.password=randomPassword(defaultPasswordlength);
	        System.out.println("Your password is:="+this.password);
	        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
	        //System.out.println("Yous email is :"+email);
	        
	    }

  // Calling for Department Method
private String setDepartment()

{
	System.out.println("ENTER THE DEPARTMENT CODE: \n1.For Sales\n2.Development Team\n3.For Accounting\n0.for none\nEnter the department:\n");
	Scanner in=new Scanner(System.in);
	int depChoice = in.nextInt();
	if(depChoice==1)
	{
		return "sales";
		
	}
	else if(depChoice==2)
	{
		return "dev";
		
	}
	else if(depChoice==3)
	{
		return "acct";
		
	}
	else { return "";}
}

private String randomPassword(int length) 
{
	String passwordSet= "ASFAJJFNJFAJJFLFA21445";
	char[]password= new char[length];
	for(int i=0; i<length; i++)
	{
		int rand=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(rand);
		 }
	return new String(password);
}


//set mailbox capacity
public void setMailboxCapacity(int capacity)
{
	this.mailboxCapacity=capacity;
}

public void setAlternateEmail(String altEmail)
{
	this.alternateEmail=altEmail;

}

public void changePassword(String password)
{
	this.password=password;
	
}

public int getMailboxCapacity() {return mailboxCapacity ;}
public String getAlternateEmail() { return alternateEmail ;}
public String getPassword() {return password;}

public String showInfo()
{
	return "DISPLAY EMAIL :"+firstName+" "+lastName+
			"\nCOMPANY EMAIL :"+email+
			
			"\nMAILBOX CAPACITY : "+ mailboxCapacity+"" ;
}
  
}
