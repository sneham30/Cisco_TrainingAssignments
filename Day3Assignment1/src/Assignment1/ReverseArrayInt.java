package Assignment1;

import java.util.Scanner;

public class ReverseArrayInt {
	public static void main(String args[]){
        Integer num;
		char array[] = new char[6];
		System.out.print("Enter a 6 digit number: ");
	   Scanner scan = new Scanner(System.in);
	   num = scan.nextInt();
	  array = num.toString().toCharArray();
	  if(!(array.length==6)){
		  System.out.println("Please enter 6 digit number");
		   num = scan.nextInt();
		   array = num.toString().toCharArray();
	  }
	  char revarr[] = new char[6];
		 for(int i=0,j=array.length-1;i<array.length;i++){
			 revarr[i] = array[j--];
		 }
		 System.out.print("Reversed array: ");
		 for(char n : revarr){
			 System.out.print(n);
		 }
}
}
