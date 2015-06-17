package Assignment1;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[]){
         String num;
		char array[] = new char[6];
		System.out.print("Enter a 6 digit number: ");
	   Scanner scan = new Scanner(System.in);
	   num = scan.next();
	   if(!(num.length()==6)){
		   System.out.println("Please enter 6 digit number");
		   num = scan.next();
	   }
	 array = num.toCharArray();
	 /*for(char n : array){
		 System.out.println(n);
	 }*/
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
