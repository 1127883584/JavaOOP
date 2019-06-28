package model;

public class Student {
	private String name;
	private String sex;
	private String number;
	public Student(String name, String sex, String number){
		this.name = name;
		this.sex = sex;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
}
