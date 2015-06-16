package TicketFare;

public class CalculateFare {
 public static final float ADULT_FARE = 162.35f;//variable holding adult fare
 public static final float SERVICE_TAX = 14;//service tax applied on each ticket
	
	public static void main(String[] args) {
		
		float totalChildFare ;//= 0.0f;
		float totaladultFare;// = 0.0f;
		int noOfChildren = 1;
		int noOfAdults = 5;
		//calculating childFare
		totalChildFare = (float) (noOfChildren * ( 0.7 * ADULT_FARE));
		System.out.println("Total Children's Fare:Rs." +totalChildFare);
		//calculating ADULT_FARE
		totaladultFare = noOfAdults * ADULT_FARE ;
		System.out.println("Total Adults Fare:Rs." +totaladultFare);
		
		//Calculating total fare
		float baseFare = (totaladultFare + totalChildFare);
		System.out.println("BASE FARE:Rs. " +baseFare);
		float totalFare =  baseFare + ((SERVICE_TAX /100)*baseFare);
		System.out.println("Total FARE:Rs." +totalFare);
		

	}

}
