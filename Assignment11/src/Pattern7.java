
public class Pattern7 {

	public static void main(String args[]){
		int row = 9;
		int star=row;
		int space=0;
		//int space =;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
			}
			if(i<row/2)
			{
				space++;
				star=star-2;
			}
			else
			{
				space--;
				star=star+2;
			}
			System.out.println();
		}
		/*for(int i=0;i<row;i++){
			for(int j =0;j<space;j++){
				System.out.print(" ");
			}
			for(int k= 0; k<2*(row-i)-1;k++){
				System.out.print("*");
			}
		
			System.out.println();
			space++;
		}
	space = row-1;
	for(int i=1;i<row;i++){
		
		for(int j=0;j<space;j++){
			System.out.print(" ");
		}
		for(int k= 0;k<2*i-1;k++){
			System.out.print("*");
		}
		System.out.println();
		space--;

	}*/
}
}
