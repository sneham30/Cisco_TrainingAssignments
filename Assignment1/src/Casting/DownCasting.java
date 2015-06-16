package Casting;

public class DownCasting {
	public static void main(String args[]){
		double number = 12312.12119;
		float fnum = (float) number;
		int inum = (int) fnum;
		short snum = (short) inum;
		byte bnum = (byte) snum;
		System.out.println("Double number " +number +" casted to float:" +fnum);
		System.out.println("Float number " +fnum + " casted to int:" +inum);
		System.out.println("int number " +inum + " casted to short:" +snum);
		System.out.println("short number " +snum + " casted to byte:" +bnum);
	}
}
