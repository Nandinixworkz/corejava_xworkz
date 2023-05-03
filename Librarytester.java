class Librarytester{
public static void main(String name[])
{
System.out.println("main started");
Library.addBookName("Jane Eyre");
Library.addBookName("Beloved");
Library.addBookName("Animal Fram");
Library.addBookName("The color purple");
Library.addBookName("White Teeth");
Library.addBookName("On the road");
Library.addBookName("Native Son");
Library.addBookName("Middlemarch");
Library.addBookName("Mazines");
Library.addBookName("Emma");
Library.addBookName("Catch22");

Library.getBookNames();

System.out.println("updated book name are");
Library.updateBookNames("Emma" ,"Wings of fire");
Library.getBookNames();

String bookName=Library.getBookNames("Jane Eyre");
System.out.println("search book name is " + bookName);
System.out.println("Main ended");
 }
}