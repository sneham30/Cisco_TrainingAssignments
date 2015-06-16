package TravelPass;

public class PassCost {
	
   public static final float NORMAL_COST = 125.50f;
   public static final float EVENING_HOURS_COST = 12.75f;
   
	public static void main(String[] args) {
		int noOfPassengers = 10;
		boolean nonStop = false;
		boolean eveningPass = false;
		float passCost;
		
		if(eveningPass){
			System.out.println("Evening pass hours 5 PM – 9 PM, additional evening visit charge applicable for each pass");
		}else{
			System.out.println("Regular pass hours 9 AM – 5 PM, no additional charge applicable");
		}
		
		if(nonStop){
			if(eveningPass){
				//Calculating Pass Cost
				passCost = (float) ((NORMAL_COST * 3.5) + EVENING_HOURS_COST) * noOfPassengers;
			System.out.println("Its a nonStop PASS!! Your Travel time is 5PM - 9PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
			System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
			}else {
				passCost = (float) ((NORMAL_COST * 3.5) * noOfPassengers) ;
				System.out.println("Its a nonStop PASS!!Your Travel time is 9AM - 5PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
				System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
			}
		}else{
			
			if(eveningPass){
				//Calculating Pass Cost
				passCost = (float) (NORMAL_COST  + EVENING_HOURS_COST) *noOfPassengers;
				System.out.println("Your Travel time is 5PM - 9PM, additional evening visit charges applicable");
				System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
			}else {
				passCost = (float) (NORMAL_COST) *noOfPassengers;
					System.out.println("Your Travel time is 9AM - 5PM, no additional charges");
					System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}
			
		}
		
		
}

}
