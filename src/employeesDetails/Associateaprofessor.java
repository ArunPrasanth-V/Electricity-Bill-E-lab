package employeesDetails;

public class Associateaprofessor extends Employee
{
	 double salary=0.0,da,bp,hra,pf,club,net,gross;
	  void getcalcassociate()
	  {
		  System.out.println("Enter the basic pay");
		  bp=sc.nextDouble();
	  }
	  void calcassociate() 
	  {
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+hra+da);
		net=(gross-pf-club);
		 System.out.println("********PAY SLIP FOR ASSOCIATE PROFESSOR*********");
		 System.out.println("BASIC PAY :RS:"+bp);
		 System.out.println("DA :RS:"+da);
		 System.out.println("HRA :RS:"+hra);
		 System.out.println("PF :RS"+pf);
		 System.out.println("CLUB :RS:"+club);
		 System.out.println("GROSS PAY :RS:"+gross);
		 System.out.println("NET PAY :RS:"+net);
	  }
}
