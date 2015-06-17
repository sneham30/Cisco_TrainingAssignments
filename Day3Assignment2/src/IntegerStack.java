import java.util.Scanner;


public class IntegerStack {
	public static final int LENGTH = 5;
	private int value[] = new int[LENGTH];
	int index = -1;
	public boolean isEmpty(){
		
		if(index == -1){
			return true;
		}
		return false;
		
	}
	public void push(int element){
		if(!isFull()){
		
	        value[++index] = element;
		}
	}
	private boolean isFull() {
	  if(index>LENGTH){
		  System.out.println("Stack OverFlow!!");
		  return true;
	  }
		return false;
	}
	public int pop(){
		return value[index--];
		
	}

	public static void main(String[] args) {
		//int i =0;
		Scanner scan = new Scanner(System.in);
		IntegerStack st = new IntegerStack();
		System.out.println("Enter elements to push");
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		st.push(scan.nextInt());
		
		
			System.out.println("Elements in Stack:");
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}

	}

}
