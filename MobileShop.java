class MobileShop{
 static String mobileNames[] = {null,null,null,null,null,null,null,null,null,null};
 static int index;
 public static boolean addMobileName(String name){
 System.out.println("addMobileName method started");
 boolean isAdded = false;
 if(mobileNames!= null && index < mobileNames.length){
 mobileNames[index++] = name;
   isAdded=true;
 System.out.println("mobile Name is added");
 }
 else{
	 System.out.println("Opps... Housefull");
 }
 System.out.println("addMobileName method ended");
return isAdded;
 }
 public static void getMobileName(){
	 System.out.println("getMobileName method started");
   for(int i=0; i<mobileNames.length; i++){
	   System.out.println(mobileNames[i]);
   }
   System.out.println("getMobileName method ended");
  return ;
 }
 public static boolean updateMobileName(String oldName, String updatedName){
	 System.out.println("UpdateMobileName method started");
 boolean isUpdated=false;
 for(int i=0; i < mobileNames.length;i++){
 if(mobileNames[i].equals(oldName)){
 mobileNames[i]=updatedName;
 isUpdated=true;
 System.out.println(mobileNames[i]);
 }
 }
 System.out.println("updateMobileNames method ended");
 return isUpdated;
  }
 public static String getMobileName(String name){
	 System.out.println("getMobileName method started");
	 for(int i=0; i < mobileNames.length; i++){
		 if(mobileNames[i].equals(name))
			 return name;
		 else{
			 System.out.println("moblie name is not found");
	 
	     }
	 }
 System.out.println("getMobileName method ended");
 return "no moblie name";
}

}