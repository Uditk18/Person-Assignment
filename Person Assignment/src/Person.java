import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
//import java.sql.Date;

class Person {
	private String name;
	private LocalDate dob;
	private int day, month, year;
//constructor to initialize Person objects

	public Person(String name, int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.name = name;
		this.dob = LocalDate.of(year, month - 1, day);
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Date of birth : " + dob);
		LocalDate birth = LocalDate.of(year, month, day);
		LocalDate curr = LocalDate.now();
		Period age1 = Period.between(birth, curr);
		System.out.println(
				"Age : " + age1.getYears() + " years " + age1.getMonths() + " months " + age1.getDays() + " days");

	}

	public void older(Person person1, Person person2) {
		if (person1.dob.isAfter(person2.dob)) {
			System.out.println(person2.name + " is older by ");
			Period age = Period.between(person2.dob, person1.dob);
			System.out.println(age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days");

		} else {
			System.out.println(person1.name + " is older by ");
			Period age2 = Period.between(person1.dob, person2.dob);
			System.out.println(age2.getYears() + " years " + age2.getMonths() + " months " + age2.getDays() + " days");
		}

	}
}