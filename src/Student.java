
public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	    
	       
	       
	       
	       public void printFullName(){
	    	     System.out.println("Nombre:" + firstName +  "\nApellidos:" + lastName );
	    	   }

	    	   public boolean  isApproved(){
	    	        if (grade >= 60) {
	    	        	System.out.println("La calificacion es mayor al 60%");
	    	         return  true;
	    	        	
	    	        }
	    	        else {
	    	        	System.out.println("La calificacion es menor al 60%");
	    	        	return false;
	    	        }
	    	   }

	    	   public int changeYearIfApproved(){
	    		   if (grade >= 60) {
	    			   System.out.println("Felicidades alumno pasas al siguiente año");
	    			   return year+1;
	    			  
	    		   }
	    	       return 0;
	    	   }
	       
	       
	       
	       
	  
}
