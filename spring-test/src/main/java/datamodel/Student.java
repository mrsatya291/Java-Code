package datamodel;

public class Student {
	private String name;
	
	public Student() {
		
	}

	public  Student(String name){
		System.out.println("Constructor");
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println(getName());
	}
}
