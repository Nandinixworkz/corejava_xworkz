class MobileShoptester{
public static void main(String name[])
{
System.out.println("main started");
MobileShop.addMobileName("Apple");
MobileShop.addMobileName("Vivo");
MobileShop.addMobileName("Oppo");
MobileShop.addMobileName("Redmi");
MobileShop.addMobileName("One Plus");
MobileShop.addMobileName("Real me");
MobileShop.addMobileName("Moto G");
MobileShop.addMobileName("Lenovo");
MobileShop.addMobileName("Nokia");
MobileShop.addMobileName("Micromax");
MobileShop.addMobileName("LG");

MobileShop.getMobileName();

System.out.println("updated mobile name is");
MobileShop.updateMobileName("LG" ,"Poco");
MobileShop.getMobileName();

String mobileName = MobileShop.getMobileName("One Plus");
System.out.println("search mobile name is " + mobileName);
System.out.println("Main ended");
 }
}