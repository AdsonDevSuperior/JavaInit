package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		
		System.out.println("How many roons will be hanted?");
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println();
			System.out.print("Rent #" + i +":");
			sc.nextLine();
			System.out.print("Name :");			
			
			String name = sc.nextLine();
			System.out.print("Email :");
			String email = sc.nextLine();
			System.out.print("Roon: ");
			int roon = sc.nextInt();
			vect[roon] = new Rent(name,email);
			
		}
	}

}
