
public class Pattern2withNum {
	public static void main(String args[]){
		int row = 4;
		int num =1;
		for(int i=0;i<row;i++){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<row-i;j++){
				System.out.print(num++);
			}
			
			System.out.println();
		}
	}
}
