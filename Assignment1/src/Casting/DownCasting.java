package Casting;

public class DownCasting {
	public static void main(String args[]){
		double number = 12312.12119;
		float fnum = (float) number;
		long lnum = (long) fnum;
		int inum = (int) fnum;
		short snum = (short) inum;
		byte bnum = (byte) snum;
		System.out.println("Double number " +number +" casted to float:" +fnum);
		System.out.println("Float number " +fnum + " casted to long:" +lnum);
		System.out.println("long number " +lnum + " casted to int:" +inum);
		System.out.println("int number " +inum + " casted to short:" +snum);
		System.out.println("short number " +snum + " casted to byte:" +bnum);
		
		
		float f = 10.3f;
		//double l = 10.6;
		int i =1000;
		short s = 122;
		byte b = 12;
		
		System.out.println("Float:"+f);
		System.out.println("int:"+i);
		System.out.println("short"+s);
		System.out.println("byte:"+b);
		
	}
}
