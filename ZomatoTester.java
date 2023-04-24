class ZomatoTester{
   public static void main(String zomato[]){
   System.out.println("Main method started");
   
   String itemName = "Veg Biryani";
   double price = Zomato.searchItem(itemName);
   System.out.println("The price of " +itemName +" is "+price);
   System.out.println("Main method ended");
   
   }
}