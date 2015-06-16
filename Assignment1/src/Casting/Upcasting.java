package Casting;

public class Upcasting {

	public static void main(String args[]){
		byte b = 99;
		short s = (short) b;
		int i = (int) s;
		float f = (float) i;
		double d = (double) f ;
		System.out.println("byte number " +b +" casted to short:" +s);
		System.out.println("short number " +s + " casted to int:" +i);
		System.out.println("int number " +i + " casted to float:" +f);
		System.out.println("float number " +f + " casted to double:" + d);
	}
}
