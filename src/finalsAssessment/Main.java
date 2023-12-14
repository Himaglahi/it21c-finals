package finalsAssessment;

public class Main {

	public static void main(String[] args) {
	   
		School school_01 = new School();
		school_01.displaySchoolName();
		
		Programs[] program_list = Programs.initializePrograms();
		Programs.displayPrograms(program_list);
		Programs.selectProgram(program_list);
		
	}

}