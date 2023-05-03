class Restauranttester{
public static void main(String name[])
{
System.out.println("main started");
Restaurant.addMenu("Pizza");
Restaurant.addMenu("Veg Paluo");
Restaurant.addMenu("Mango Juice");
Restaurant.addMenu("Masala Dosa");
Restaurant.addMenu("Cold Coffee");
Restaurant.addMenu("Pasata");
Restaurant.addMenu("Tomato Rice");
Restaurant.addMenu("Lemon Rice");
Restaurant.addMenu("Masala Puri");
Restaurant.addMenu("Idali");
Restaurant.addMenu("Pani Puri");

Restaurant.getMenu();

System.out.println("updated menu is");
Restaurant.updateMenu("Pasata" ,"Veg Biriyani");
Restaurant.getMenu();

String item=Restaurant.getMenu("Cold Coffee");
System.out.println("search menu is " + item);
System.out.println("Main ended");
 }
}