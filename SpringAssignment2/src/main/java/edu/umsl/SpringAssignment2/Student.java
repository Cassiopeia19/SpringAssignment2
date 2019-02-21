package edu.umsl.SpringAssignment2;

public class Student {
	private String name;
	private int ssn;
	private String address;
	private double gpa;
	
public Student() {
	
}
	
public Student(String name, int ssn, String address, double gpa) {
		
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.gpa = gpa;		
	}

	@Override
	public String toString() {
		
		System.out.println("Name: " +name+ " SSN: " +ssn+ " Address: "
				+address+ " GPA: " +gpa);
		
		return super.toString();
	}


}
