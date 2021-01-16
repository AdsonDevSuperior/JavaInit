import java.util.Locale;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	for ( int i =0; i <50; i++) {
		System.out.println("valor de i :" + i);
	}
         sc.close();
}
}