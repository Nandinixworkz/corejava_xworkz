class Zomato{
   public static double searchItem(String itemName){
   
      System.out.println("searchItem method started");
   
   if("Veg Biryani" == itemName){
       System.out.println("Thanks for selecting" +itemName);
	   return 250.00;
  }
  if("Masala Dosa" == itemName){
      System.out.println("Thanks for selecting" +itemName);
	  return 75.00;
  } 
  if("Gobi" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 return 50.00;
  }
  if("French Fries" == itemName){
     System.out.println("Thanks for selecting" +itemName);
	 return 120.09;
  }
  if("Pizza" == itemName){
  System.out.println("Thanks for selecting" +itemName);
  return 199.00;
  }
  if("Corn Soup" == itemName){
   System.out.println("Thanks for selecting" +itemName);
   return 150.00;
  } 
  if("Samosa" == itemName){
   System.out.println("Thanks for selecting" +itemName);
   return 30.99;
  }
  if("Masala puri" == itemName){
   System.out.println("Thanks for selecting" +itemName);
    return 45.00;   
  }
  if("Gulam Jamuna" == itemName){
   System.out.println("Thanks for selecting" +itemName);
    return 25.00;   
  }
  if("Fried Rice" == itemName){
   System.out.println("Thanks for selecting" +itemName);
    return 190.00;   
  }  
  System.out.println("searchItem method ended");
   return 0.00;
   }
   
}