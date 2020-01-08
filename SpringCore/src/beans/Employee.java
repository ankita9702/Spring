package beans;

public class Employee {
	private int code;
	private String name;
	private double salary;
	private java.util.List<String> skills;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void start(){
		System.out.println("start method");
	}
	public void stop(){
		System.out.println("stop method");
	}
	public void setSkills(java.util.List<String> skills) {
		this.skills = skills;
	}
	public java.util.List<String> getSkills() {
		return skills;
	}
}
