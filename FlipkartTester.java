class FlipkartTester{
   public static void main(String flipkart[]){
   System.out.println("Main method started");
   
    String productName = "MobilePhone";
	double price = Flipkart.searchProduct(productName);
	System.out.println("The price of " +productName +" is "+price);
	System.out.println("Main method ended");
   
   }


}