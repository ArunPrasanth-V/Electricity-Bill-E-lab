package employeesDetails;
import java.util.*;
public class Details
{
    public static void main(String args[])
    {
    	         int choose;
    		     Scanner c=new Scanner(System.in);
    			 System.out.println("*******ENTER YOUR CHOICE******** \n 1)PROGRAMMER \n 2)ASSISTANT PROFESSER \n 3)ASSOCIATE PROFESSER \n 4)PROFESSER");
    	         choose =c.nextInt();
    	    
    	         switch(choose)
    	         
    	         {
    	         case 1 :
    	        	     
    	        	     Programmer p=new Programmer();
    	        	     p.getdata();
    	        	     p.getprogrammer();
    	        	     p.display();
    	        	     p.calcprogrammer();
    	        	     break ;
    	         case 2 :
    	        	 AssistantProfesser e=new AssistantProfesser();
    	        	 e. getdata();
    	    	     e.getcalcassist();
    	    	     e.display();
    	    	     e.calcassist();
    	        	     break ;
    	         case 3 :
    	        	     Associateaprofessor as=new Associateaprofessor();
    	        	     as.getdata();
    	        	     as.getcalcassociate();
    	        	     as.display();
    	        	     as.calcassociate();
    	        	     break ;
    	         case 4 :
    	        	    Professor pc=new Professor();
    	        	    pc.getdata();
    	        	    pc.getcalcprofessor();
    	        	    pc.display();
    	        	    pc.calcprofessor();
    	        	    break;
    	        default :
    	        	   System.out.println("YOU ARE CHOOSING THE WRONG DITINATION.....PLZZ..TRY AGIN....");
           c.close();    	       
    	}
    	         System.out.println("***************************************");
}
}