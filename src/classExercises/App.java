package classExercises;

import oop.Person;

public class App {

	public static void main(String[] args) {

		Person me = new Person();
		me.setName("");
		me.setAge(27);
		me.setLocation("Bradford");

		me.printPerson();
		me.intro();

		Person myCat = new Person();
		myCat.setName("Ember");
		myCat.setAge(6);
		myCat.setLocation("Cat City");

		myCat.printPerson();

		myCat.intro();

		me.setAge(me.getAge() + 100);

	}

}
