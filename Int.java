public class Int extends  Applicant{
	int employeeId;
	public Int (int applicantId,String applicantName,int yrsOfExp, String skills, double expSalary, int employeeId){
		super(applicantId,applicantName,yrsOfExp,skills,expSalary);
		this.employeeId=employeeId;
	}

}
