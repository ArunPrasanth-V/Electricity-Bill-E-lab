package employeesDetails;
import java.util.*;
public class Employee 
{
   
   long mobile;
   String name,add,mail,id;
   Scanner sc=new Scanner(System.in);
  void getdata()
  {
	  System.out.println("Enter the Employee Name:");
	  name=sc.nextLine();
	  System.out.println("Enter the Employee I'D:");
	  id=sc.next();
	  System.out.println("Enter the Employee Address:");
	  add=sc.next();
	  System.out.println("Enter the Employee Maill I'D:");
      mail=sc.next();
      System.out.println("Enter the Employee Mobile No.:");
      mobile=sc.nextLong();
  }
  void display()
  {
	  System.out.println("***************************************");
	  System.out.println("Employee Name:"+name);
	  System.out.println("Employee I'D:"+id);
	  System.out.println("Address:"+add);
	  System.out.println("Mail I'D:"+mail);
	  System.out.println("Mobile NO.:"+mobile);
  }
}
