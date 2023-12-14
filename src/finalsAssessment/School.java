package finalsAssessment;
//package 213c;
public class School{
	private String school_name = "Northern Bukidnon State College" ;
	
	protected String getSchoolName() {
		return school_name;
	}
	
	public void setSchoolName(String new_school_name) {
		school_name = new_school_name;	
	}
	
	void displaySchoolName() {
		System.out.println("Welcome to :" +school_name);
	}

}