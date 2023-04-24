class FlipkartTester1{

    public static void main(String flipkart[]){
	
	  System.out.println("Main method started");
	  
	  String productName = "Fashion";
	  double price = Flipkart1.searchProduct(productName);
	  System.out.println("The price of " +productName+" is"+price);
	  System.out.println("Main method ended");
	
	}


}