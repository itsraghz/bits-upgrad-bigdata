import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student{
	//Store name, AdmissionNo, Standard
	private String name;
	private String admissionNo;
	private String standard;

	public Student(String name, String admissionNo, String standard) {
		this.name=name;
		this.admissionNo=admissionNo;
		this.standard=standard;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getAdmissionNo() {
		return this.admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard=standard;
	}
}

class Report extends Student{
	//Store percentage and pass and also the attributes of student class(super keyword)
	private String percentage;
	private String passResult;

	public Report(String name, String admissionNo, String standard, String percentage, String passResult) {
		super(name, admissionNo, standard);
		this.percentage=percentage;
		this.passResult=passResult;
	}

	public String getPercentage() {
		return this.percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getPassResult() {
		return this.passResult;
	}

	public void setPassResult(String passResult) {
		this.passResult = passResult;
	}
}

class Bus extends Student {
	//Store route and BG and also the attributes of student class(super keyword)
	private String route;
	private String bloodGroup;

	public Bus(String name, String admissionNo, String standard, String route, String bloodGroup) {
		super(name, admissionNo, standard);
		this.route=route;
		this.bloodGroup=bloodGroup;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}

public class Source {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
	//A 1 9 99 yes 27 B+ 
    	strNums1 = br.readLine().split("\\s");
    	strNums2 = br.readLine().split("\\s");
    	/*Store these details by making objects of both classes and then with the help of if-else, return the correct output.*/
	Report report1 = new Report(strNums1[0], strNums1[1], strNums1[2], strNums1[3], strNums1[4]);
	Bus bus1 = new Bus(strNums1[0], strNums1[1], strNums1[2], strNums1[5], strNums1[6]);
	Report report2 = new Report(strNums2[0], strNums2[1], strNums2[2], strNums2[3], strNums2[4]);
	Bus bus2 = new Bus(strNums2[0], strNums2[1], strNums2[2], strNums2[5], strNums2[6]);
    
	String input = br.readLine();
	if(report1.getAdmissionNo().equals(input)) {
		System.out.println(report1.getName() + " " + report1.getPercentage() + " " + bus1.getRoute());
	}
	else if(report2.getAdmissionNo().equals(input)) {
		System.out.println(report2.getName() + " " + report2.getPercentage() + " " + bus2.getRoute());
	}
	else {
		System.out.println("No entry found");
	}
    }
}
