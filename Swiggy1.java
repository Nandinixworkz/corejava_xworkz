class Swiggy1{
     public static double searchItem(String itemName){
	 
	 System.out.println("searchItem method started");
	 
	   double price = 0.00;
	   
	if("Burger" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 199.00;
	 } 
    if("Tandoori Bites" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 239.00;
	 }	 
    if("Baby Corn" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 270.00;
	 }	 
    if("Chicken Lollypop" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 290.00;
	 }	 
    if("Boiled Egg" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 37.00;
	}
	if("Butterscotch Cake" == itemName){
	System.out.println("Thanks for selecting" +itemName);
	price = 496.00;
	}
	if("Chicken Sandwich" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 300.00;
	} 
	if("Green Salad" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 140.00;
	}
    if("Manchow" == itemName){
	  System.out.println("Thanks for selecting" +itemName);
	  price = 180.00;
	}
    if("Nutella Mud" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 170.00;
	}
   if("Smilies" == itemName){
    System.out.println("Thanks for selecting" +itemName);
	price = 95.00;
   }
   if("Litchi Lassi" == itemName){
     System.out.println("Thanks for selecting" +itemName);
      price = 100.00;
   }
  
     System.out.println("searchItem method ended");
	 return price;
	 }
}