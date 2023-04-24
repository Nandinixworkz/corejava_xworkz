class SwiggyTester1{
     public static void main(String swiggy[]){
	 
	 String itemName = "Baby Corn";
	 double price = Swiggy.searchItem(itemName);
	 System.out.println("The price of " +itemName+" is"+price);
	 System.out.println("Main method ended");
	 }
}