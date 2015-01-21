// A class to represent legal secretaries.

// Add class header below
public class LegalSecretary extends Secretary
{
  
  		// Add method fileLegalBriefs that prints "I could file all day!"
      public void fileLegalBriefs() {
         System.out.print("I could file all day!");
      }   
   
      public double getSalary() {
         return super.getSalary() + 5000.0;
      } 

		// Add method that overrides getSalary from Employee class
      // for salary of 45000.0 per year 
	
}