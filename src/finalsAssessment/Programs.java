package finalsAssessment;
//package e213c;
import java.util.Scanner;

public class Programs{
	private String program_name;
	private String program_code;
	
	protected Programs(String program_code,String program_name) {
		this.program_code = program_code;
		this.program_name = program_name;
	}
	
	protected String getProgramCode() {
		return program_code;
	}
	protected String getProgramName() {
		return program_name;
	}
	
	protected void setSchoolName(String new_program_name) {
		program_name = new_program_name;	
	}
	
	protected static Programs[] initializePrograms() {
		Programs[] program_list = new Programs[3];
        program_list[0] = new Programs("1", "Bachelor of Science in Business Administration");
        program_list[1] = new Programs("2", "Bachelor of Science in Education");
        program_list[2] = new Programs("3", "Bachelor of Science in Information Technology");
        
        return program_list;
	}

	protected static void displayPrograms(Programs[] program_list) {
		 System.out.println("-----------------------------------------------");
	     System.out.println("Programs Offered");
	        for (int i = 0; i < program_list.length; i++) {
	            System.out.println(program_list[i].getProgramCode() + " " + program_list[i].getProgramName());
	        }
	        System.out.println("-----------------------------------------------");
	 }
	 
	protected static void selectProgram(Programs[] program_list) {
		 Scanner scanner = new Scanner(System.in);

	     boolean validInput = false;
	     String selectedProgramCode = "";

	     while(!validInput) {
	    	System.out.print("Enter the program code: ");
	        selectedProgramCode = scanner.nextLine();
	            
	        for (Programs program : program_list) {
		         if (program.getProgramCode().equals(selectedProgramCode)) {
		             System.out.println("Selected Program: " + program.getProgramName());
		             System.out.println("-----------------------------------------------");
		             validInput = true;
		             break;
		         }
		     }
	        
		     if (!validInput){
		        System.out.println("Program not found for code:" + selectedProgramCode);
		     }
	     }
	     
	     scanner.close();
	 }
	  
}