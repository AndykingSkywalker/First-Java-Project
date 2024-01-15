package classExercises;

public class Person {
	String name;

	int age;

	String location;

	void intro() {
		System.out.println("Hello my name is " + name + ". I am " + age + " years old" + " and I am from " + location);
	}

	void printPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(location);
	}
}
