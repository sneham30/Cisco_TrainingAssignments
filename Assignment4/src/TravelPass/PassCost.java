package TravelPass;

public class PassCost {
	
   public static final float NORMAL_COST = 125.50f;
   public static final float EVENING_HOURS_COST = 12.75f;
   public static final float DISCOUNT = 35.46F;
   
	public static void main(String[] args) {
		int noOfPassengers = 10;
		int passduration = 1;
		boolean nonStop = true;
		boolean eveningPass = true;
		float passCost;
		
		if(eveningPass){
			System.out.println("Evening pass hours 5 PM – 9 PM, additional evening visit charge applicable for each pass");
		}else{
			System.out.println("Regular pass hours 9 AM – 5 PM, no additional charge applicable");
		}
		
		if(nonStop){
			if(eveningPass){
				if(passduration == 1){
				//Calculating Pass Cost
				passCost = (float) ((NORMAL_COST * 3.5) + EVENING_HOURS_COST) * noOfPassengers;
			    System.out.println("Evening Pass, Duration of 1 day. Added evening fare. No discount");
			    System.out.println("Its a nonStop PASS!! Your Travel time is 5PM - 9PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
			
			    System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else if(passduration == 3 || passduration == 5){
					passCost = (float) ((NORMAL_COST * 3.5) + EVENING_HOURS_COST) * noOfPassengers *passduration - DISCOUNT;
				    System.out.println("Evening Pass, Duration of 3 or 5 days: Added evening fare. Discount for multiple day pass");
				    System.out.println("Its a nonStop PASS!! Your Travel time is 5PM - 9PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
				
				    System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else{
					System.out.println("Invalid PassDuration");
				}
			}else {
				if(passduration == 1){
				passCost = (float) ((NORMAL_COST * 3.5) * noOfPassengers) ;
				System.out.println("Regular (daytime) pass,Duration of 1 day.No added fare.No Discount");
				System.out.println("Its a nonStop PASS!!Your Travel time is 9AM - 5PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
				System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
			}else if(passduration == 3 || passduration == 5){
				passCost = (float) ((NORMAL_COST * 3.5) * noOfPassengers)*passduration -DISCOUNT ;
				System.out.println("Regular (daytime) pass,Duration of 3 0r 5 days.No added fare.Discount!!");
				System.out.println("Its a nonStop PASS!!Your Travel time is 9AM - 5PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
				System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
			}else{
				System.out.println("Invalid PassDuration");
			}
				
			}
		}else{
			
			if(eveningPass){
				if(passduration == 1){
					
				
				//Calculating Pass Cost
				passCost = (float) (NORMAL_COST  + EVENING_HOURS_COST) *noOfPassengers;
				 System.out.println("Evening Pass, Duration of 1 day. Added evening fare. No discount");
				System.out.println("Your Travel time is 5PM - 9PM, additional evening visit charges applicable");
				System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else if(passduration == 3 || passduration == 5){
					passCost = (float) ((NORMAL_COST  + EVENING_HOURS_COST) * noOfPassengers)- DISCOUNT;
				    System.out.println("Evening Pass, Duration of 3 or 5 days: Added evening fare. Discount for multiple day pass");
				    System.out.println("Its a nonStop PASS!! Your Travel time is 5PM - 9PM, additional evening visit charge and nonStop charges(3.5 times normal) applied");
				
				    System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else{
					System.out.println("Invalid PassDuration");
				}
			}else {
				if(passduration == 1){
				passCost = (float) (NORMAL_COST) *noOfPassengers;
				System.out.println("Regular (daytime) pass,Duration of 1 day.No added fare.No Discount");
					System.out.println("Your Travel time is 9AM - 5PM, no additional charges");
					System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else if(passduration == 3 || passduration == 5){
					passCost = (float) (NORMAL_COST) *noOfPassengers -DISCOUNT;
					System.out.println("Regular (daytime) pass,Duration of 3 0r 5 days.No added fare.Discount!!");
						System.out.println("Your Travel time is 9AM - 5PM, no additional charges");
						System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
				}else{
					System.out.println("Invalid PassDuration");
				}
			
			}
		
		
}
	}
}
