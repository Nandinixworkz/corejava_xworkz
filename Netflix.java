class Netflix{
 static String kannadaMovies[] ={"Kranti","A","Om","Rajkumara","KGF","Googly","Jogi","Galipata",
                                 "Uppi2","MungaruMale","Kantara","Nagara Havu"};
 static String tamilMovies[] ={"Raja Rani","Vikram","Ps1","Enemy","Pasha","Vathi","MAster","Sir"};


          //method
		  public static void main(String netflix[]){
		    System.out.println("Main started");
		     getKannadaMovies();
			 getTamilMovies();
			System.out.println("Main ended");
		  }
		  
   //method
   //Declaration of a method

     public static void getKannadaMovies(){
	  System.out.println("Calling getKannadaMovies method");
	  System.out.println("List of Kannada movies :");
	    
		for(int index=0; index < kannadaMovies.length; index++){
		   System.out.println(kannadaMovies[index]);
		}
		   System.out.println("end of getKannadaMovies method");
    return;	
	 }
    public static void getTamilMovies(){
	  System.out.println("Calling getTamilMovies method");
	  System.out.println("List of Tamil Movies :");
	  
	    for(int i=0; i < tamilMovies.length; i++){
		
		System.out.println(tamilMovies[i]);	
		}
		 System.out.println("end of getTamilMovies method");
		return;
	}
}