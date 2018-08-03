import java.util.*;

class PersonTest {
	public static void main(String args[]) {
		Person person1 = new Person("Udit", 18, 11, 1995);
		Person person2 = new Person("Ripu", 20, 4, 2010);
		Person person3 = new Person("Ripu", 20, 4, 2010);

		System.out.println("First Person Details : ");
		person1.display();

		System.out.println("\nSecond Person Details : ");
		person2.display();
		person3.older(person1, person2);

	}

}