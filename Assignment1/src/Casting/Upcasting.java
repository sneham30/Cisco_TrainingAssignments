package Casting;

public class Upcasting {

	public static void main(String args[]){
		byte b = 99;
		short s = (short) b;
		int i = (int) s;
		long l = (long) i;
		float f = (float) l;
		double d = (double) f ;
		System.out.println("byte number " +b +" casted to short:" +s);
		System.out.println("short number " +s + " casted to int:" +i);
		System.out.println("int number " +i + " casted to long:" +l);
		System.out.println("long number " +i + " casted to float:" +f);
		System.out.println("float number " +f + " casted to double:" + d);
		
		short s1 =  b;
		int i1 = s;
		long l1 = i;
		float f1 = l1;
		double d1=  f ;
		System.out.println("byte:" +b);
		System.out.println("short: "+s1);
		System.out.println("int:" +i1);
		System.out.println("long:"+l1);
		System.out.println("float:" +f1);
		System.out.println("double:"+d1);
	}
}
