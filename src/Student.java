
public class Student {
	       String firstName;
	       String lastName;
	       int registration;
	       int grade;
	       int year;
	       
	       
	       public Student (String firstName , String lastName , int registration , int grade , int year) {
	    	   this.firstName = firstName;
	    	   this.lastName = lastName;
	    	   this.registration = registration;
	    	   this.grade = grade;
	    	   this.year = year ; 
	       }
	    
	       public Student (String firstName , String lastName , int year) {
	    	   this.firstName = firstName;
	    	   this.lastName = lastName;
	    	   this.year = year ;
	    	   
	       }
	       
	       public Student (int registration ,int grade ) {
	    	   this.registration = registration;
	    	   this.grade = grade;
	    	   
	       }
	       
	       
	       
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
	    			   this.year= this.year + 1;
	    			   System.out.println("Felicidades alumno pasas al siguiente año");
	    			   return this.year;
	    		   }
	    		   else {
	    			   return year;
	    		   }
	    	   }
	       
	       
	       
	       
	  
} //class student 
