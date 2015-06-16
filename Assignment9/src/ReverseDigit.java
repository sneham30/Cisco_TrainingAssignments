
public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 526871;
		int rev =0;
		while(num!=0){
			
			
			rev = rev *10;
			rev = rev + num%10 ;
			num = num/10;
		}
         System.out.println("Reversed number:" + rev);
	}

}
