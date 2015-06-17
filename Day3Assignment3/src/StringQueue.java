
public class StringQueue {
	public static final int CAPACITY = 10;
int front=-1;
int end= -1;
	String values[] = new String[CAPACITY];
	public boolean isEmpty(){
		if(front < CAPACITY){
			return true;
		}
		return false;
	}
	public void insert(String str){
		if(isEmpty()){
		values[++front] = str;
		}else if(front >CAPACITY){
			System.out.println("queue Full!!");
		}
	}
	
	public String remove(){
		
		return values[++end];
		
	}
	private boolean isFull() {
		if(front == end){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		StringQueue queue = new StringQueue();
		while(!queue.isFull()){
			
		}
		queue.insert("sneha");
		queue.insert("shruthi");
		queue.insert("arun");
		queue.insert("rahul");
		queue.insert("harsha");
		queue.insert("krithika");
		queue.insert("solar");
		queue.insert("praveen");
		queue.insert("vishal");
		queue.insert("cisco");
		//queue.insert("cisco");
		
 System.out.println("Elements in queue");
    
        
   while(!queue.isFull())  {
	   System.out.println(queue.remove());
   }
	}
	

}
