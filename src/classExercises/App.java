package classExercises;

public class App {

	public static void main(String[] args) {

		Person me = new Person();
		me.name = "Andrew";
		me.age = 27;
		me.location = "Bradford";

		me.printPerson();
		me.intro();

		Person myCat = new Person();
		myCat.name = "Ember";
		myCat.age = 6;
		myCat.location = "Cat City";

		myCat.printPerson();

		myCat.intro();

	}
}
