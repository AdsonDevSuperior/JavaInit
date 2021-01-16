import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  

    int num = 0;
    
    while (num <= 50) {
    	if (num %2 ==0) {
    	System.out.println(num);
    	num++;
	    }
    	else {
    		System.out.println("impar");
    	}
   num = sc.nextInt();
    }
sc.close();
	}
}