package TravelPass;

public class PassCost {
	
   public static final float NORMAL_COST = 125.50f;
   public static final float EVENING_HOURS_COST = 12.75f;
   public static final float DISCOUNT = 35.46F;
   
	public static void main(String[] args) {
		int noOfPassengers = 10;
		int passduration = 5;
		char TravelType = 'N';
		char PassType = 'D';
		float passCost;
		switch(TravelType){
		case 'N': System.out.println("TravelType is normal");
		          switch(PassType){
		          case 'E':System.out.println("Evening Pass,additional charges applicable");
		                  switch(passduration){
		                  case 1: System.out.println("Pass duration is 1 day,No Discont");
		                  passCost = (float) (NORMAL_COST  + EVENING_HOURS_COST) *noOfPassengers;
		                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                  break;
		                  case 3 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		                  passCost = (float) (NORMAL_COST  + EVENING_HOURS_COST) *noOfPassengers -DISCOUNT;
		                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                  break;
		                  case 5 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		                  passCost = (float) (NORMAL_COST  + EVENING_HOURS_COST) *noOfPassengers -DISCOUNT;
		                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                  break;
		                  default: System.out.println("Invalid PassDuration");
		                  break;
		                  }break;
		          case 'D' :System.out.println("Regular Daytime Pass,no additional charges");
			          switch(passduration){
	                  case 1: System.out.println("Pass duration is 1 day,No Discont");
	                  passCost = (float) (NORMAL_COST ) *noOfPassengers;
	                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
	                  break;
	                  case 3 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
	                  passCost = (float) (NORMAL_COST ) *noOfPassengers -DISCOUNT;
	                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
	                  break;
	                  case 5 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
	                  passCost = (float) (NORMAL_COST ) *noOfPassengers -DISCOUNT;
	                  System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
	                  break;
	                  default: System.out.println("Invalid PassDuration");
	                  break;
                  }
		          }
		          break;
		case 'E' : System.out.println("Its a nonStop Pass!!,additional Charges applied");
				switch(PassType){
		        case 'E':System.out.println("Evening Pass,additional charges applicable");
		                switch(passduration){
		                case 1: System.out.println("Pass duration is 1 day,No Discont");
		                passCost = (float) ((NORMAL_COST *3.5)  + EVENING_HOURS_COST) *noOfPassengers;
		                System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                break;
		                case 3 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		                passCost = (float) ((NORMAL_COST *3.5)  + EVENING_HOURS_COST) *noOfPassengers -DISCOUNT;
		                System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                break;
		                case 5 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		                passCost = (float) ((NORMAL_COST *3.5)  + EVENING_HOURS_COST) *noOfPassengers -DISCOUNT;
		                System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		                break;
		                default: System.out.println("Invalid PassDuration");
		                break;
		                }break;
		        case 'D' :System.out.println("Regular Daytime Pass,no additional charges");
			          switch(passduration){
		            case 1: System.out.println("Pass duration is 1 day,No Discont");
		            passCost = (float) ((NORMAL_COST *3.5) ) *noOfPassengers;
		            System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		            break;
		            case 3 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		            passCost = (float) ((NORMAL_COST *3.5) ) *noOfPassengers -DISCOUNT;
		            System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		            break;
		            case 5 :System.out.println("Pass duration :" +passduration + "days.Discount Available!!");
		            passCost = (float) ((NORMAL_COST *3.5)) *noOfPassengers -DISCOUNT;
		            System.out.println("Your Estimated Cost will for " + noOfPassengers + " passengers will be:Rs." +passCost);
		            break;
		            default: System.out.println("Invalid PassDuration");
		            break;
		        }
        }
		}
		
	}
}
