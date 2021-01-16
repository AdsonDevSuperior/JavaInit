package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.emplyoee;



public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		List<emplyoee> list = new ArrayList<>();
		
		System.out.print("Haw many emplyoees will be registed: ");
		int x = sc.nextInt();
		
		for (int i =0; i <= x; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) +": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already take! try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Enter name :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary ");
			Double salario = sc.nextDouble();
			
			emplyoee emp = new emplyoee(id,name,salario);
			
			list.add(emp);
			
			}
		System.out.println();
			System.out.print("Enter the employee id that will have salary increase : ");
			int idsalary = sc.nextInt();
			emplyoee emp = list.stream().filter(n -> n.getId() == idsalary).findFirst().orElse(null);
			
		
			if (emp == null) {
				System.out.println("This id does not exist:! ");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percent = sc.nextDouble();
				emp.increaseSalary(percent);
			}
			
			System.out.println();
			System.out.println("List of employee: ");
			for (emplyoee e : list) {
				System.out.println(emp);
			}
			sc.close();
		}
		
		public static Integer position(List<emplyoee> list,int id) {
			for (int i = 0 ; i < list.size(); i ++) {
				if (list.get(i).getId() == id) {
					return i;
				}
			}
			return null;
		}
		public static boolean hasId(List<emplyoee> list, int id) {
			emplyoee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
		}
	}


