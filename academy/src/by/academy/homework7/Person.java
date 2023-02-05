package by.academy.homework7;

public class Person {
	public String firstName;
	public String lastName;
	public int age;
	public String dateOfBirth;

	Person(String firstName, String lastName, int age, String dateOfBirth) {
		this.firstName = firstName;
		this.firstName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
