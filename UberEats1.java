class UberEats1{
public static double searchItem(String itemName){
   
      System.out.println("searchItem method started");
          
		  double price = 0.00;
		  
     if("Banana Waffle" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 179.00;
	 } 
     if("OreoShake" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 189.00;
	 }	 
     if("Cold Coffee" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price = 270.00;
	 }	 
    if("Hubby Tubby" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 price =129.00;
	 }	 
    if("Rose Gold" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 137.00;
	}
	if("Gudbad Sundae" == itemName){
	System.out.println("Thanks for selecting" +itemName);
	price = 175.00;
	}
	if("Alphonso Mango Falooda" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 169.00;
	} 
	if("Hakka Noodles" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 139.00;
	}
    if("Fried ChickenMomo" == itemName){
	  System.out.println("Thanks for selecting" +itemName);
	  price = 139.00;
	}
    if("Cheesy Comfort" == itemName){
	 System.out.println("Thanks for selecting" +itemName);
	 price = 179.00;
	}
   if("Idli" == itemName){
    System.out.println("Thanks for selecting" +itemName);
	price = 50.00;
   }
   if("Mango Juice" == itemName){
     System.out.println("Thanks for selecting" +itemName);
      price = 45.00;
   }
     System.out.println("searchItem method ended");
	 return price;
  }
}
