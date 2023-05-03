class Library{
 static String bookNames[] = {null,null,null,null,null,null,null,null,null,null};
 static int index;
 public static boolean addBookName(String name){
 System.out.println("addBookName method started");
 boolean isAdded = false;
 if(bookNames!= null && index < bookNames.length){
 bookNames[index++] = name;
   isAdded=true;
 System.out.println("book names are added");
 }
 else{
	 System.out.println("Opps... Housefull");
 }
 System.out.println("addBookName method ended");
return isAdded;
 }
 public static void getBookNames(){
	 System.out.println("getBookNames method started");
   for(int i=0; i<bookNames.length; i++){
	   System.out.println(bookNames[i]);
   }
   System.out.println("getBookNames method ended");
  return ;
 }
 public static boolean updateBookNames(String oldName, String updatedName){
	 System.out.println("UpdateBookNames method started");
 boolean isUpdated=false;
 for(int i=0; i<bookNames.length;i++){
 if(bookNames[i].equals(oldName)){
 bookNames[i]=updatedName;
 isUpdated=true;
 System.out.println(bookNames[i]);
 }
 }
 System.out.println("updateBookNames method ended");
 return isUpdated;
  }
 public static String getBookNames(String name){
	 System.out.println("getBookNames method started");
	 for(int i=0; i < bookNames.length; i++){
		 if(bookNames[i].equals(name))
			 return name;
		 else{
			 System.out.println("book name is not found");
	 
	     }
	 }
 System.out.println("getBookNames method ended");
 return "no book name";
}

}