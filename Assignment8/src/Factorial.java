
public class Factorial {

	public static void main(String[] args) {
		int n = 6; int fact = 1;
		int num =n;
		while(n != 0){
			fact = fact * n-- ;
			
		}
        System.out.println("Factorial of "+num+":" +fact);
	}

}
