package oop;

public class Person {

	private String name;

	private int age;

	private String location;

	public Person(String name, int age, String location) {

		setName(name);
		setAge(age);
		setLocation(location);

	}

	public Person() {

	}

	public void intro() {
		System.out.println("Hello my name is " + name + ". I am " + age + " years old" + " and I am from " + location);
	}

	public void printPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
	}

	public void setAge(int age) {
		if (age <= 100 && age >= 1) {
			this.age = age;
		} else {
			System.out.println("Please enter an age between 1 and 100");
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		if (name.isBlank()) {
			System.out.println("Please enter a valid name");
		} else {
			this.name = name;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setLocation(String location) {
		if (location.isBlank()) {
			System.out.println("Please enter a valid location");
		} else {
			this.location = location;
		}
	}

	public String getLocation() {
		return this.location;
	}
}
