class SwiggyTester{
   public static void main(String swiggy[]){
   
   String itemName = "Boiled Egg";
   double price = Swiggy.searchItem(itemName);
   System.out.println("The price of "+itemName + "is " +price);
   System.out.println("Main method enden");
   
   }

}