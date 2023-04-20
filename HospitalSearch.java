class HospitalSearch{
 public static void main(String a[]){
 
 String[] pName={"Aishu","Deepa","Divya","Kavya","Preeti","Rama","Ravi"};
 
     for(int i=0;i<pName.length; i++){
	 
	 //System.out.println(pName[i]);
	 if(pName[i].equals("Divya")){
	    System.out.println("Name is found " +pName[i]);
		break;
	  
	 }else{
	 
	    System.out.println("Nmae is not found ");
	 
	 }
	 
	 }
 }


}