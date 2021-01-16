import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Person person;
		
		
		System.out.print("Enter name : ");
		String name = sc.nextLine();
	
		System.out.print("Enter date of birth: ");
		int date = sc.nextInt();
		System.out.print("Enter time :");		
		double time = sc.nextDouble();
		person = new Person(name, date, time);
		System.out.println(person);
		
		Calendar p= Calendar.getInstance();
	sc.close();
}

}