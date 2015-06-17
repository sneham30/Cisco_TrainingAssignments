import java.util.Scanner;


public class TwoDArray {

	public static void main(String[] args) {
		String array[][] = new String[10][5];
	    Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i<10;i++){
			for(int j =0 ;j <5; j++){
				if(j==0){
					System.out.println("enter country Name:");
					array[i][j]=scan.next();
				}
				System.out.println("enter city");
				array[i][j] = scan.next();
				
				
				}
			}
		System.out.println("Array:");
		for(int i =0 ; i<10;i++){
			for(int j =0 ;j <5; j++){
				if(j==0){
					System.out.print(array[i][j] + ":");
				}
				
				System.out.print(array[i][j]+",");
				
				}
			System.out.println();
			}
		
	 
	}
	}


