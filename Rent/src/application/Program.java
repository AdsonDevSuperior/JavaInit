package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Haw many rooms will be rented: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++){
		System.out.println();
		System.out.println("Rent #" +i+ ": ");
		System.out.println();
		System.out.print("Enter name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		System.out.print("Enter number rooms: ");
		int rooms = sc.nextInt();
		vect[rooms] = new Rent(name,email);
	}
		System.out.println();
		System.out.println("Busy Rooms: ");
		for (int i=1; i<vect.length; i++){
			if (vect[i] !=null) {
				System.out.println(i + ": " +i+ vect[i]);
			}
		}
		
		
	

		
sc.close();
}
}