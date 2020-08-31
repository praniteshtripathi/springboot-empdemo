package demo.springboot;

public class Employee {
	private String name;
	private String empNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public Employee(String name, String empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}

}
