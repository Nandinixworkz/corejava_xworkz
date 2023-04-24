class New{
    static String chatsName[] = {"Pani Puri","Bhel Puri","Sukha Bhel","Sev Puri","Dahi Vada",
                             "Aloo Tikki","Samosa","Pizza","Vada Pav","Tawa Sandwich",
						"Cutlet Chat","Veg Burger","Masala Puri","French Fry","Gobi Manchurian"};
	
	static String companyName[] = {"Microsoft","Apple","TCS","IBM","Accenture","LTI","Amazon","Google",
                            "Coca Cola","Pepsi","Flipkart","Tech Mahindra","Sony","Infosys","Wipro",
							"LG","L&T","Dell","Acer","Nokia"};
							
    static String groceriesName[] = {"Dal","Ghee","Sunflower oil","Atta","Sooji","Besan","Rice","Sugar",
                         "Dry Fruits","Jaggery","Salt","Egg","Pulses","Maida","Maggi"};
   
    static String chocolatesName[] = {"Dairy Milk","KitKat","Munch","Lacto King","Snickers","Ferrero Rocher",
                            "Kisses","Dove","Kinder","Mars","Cadbury","Alpenliebe","Galaxy","Nestle",
							"Hersheys","Park"};

    static String shampoosName[]={"Shiny","Loreal Paris","Tresemme Keratin","Clinic Plus","Dove","Sunsilk",
                                "Head&Shoulders","Pantene","Himalaya","Nyle","Vatika","Loreal","Beer",
								"Indulekha","Mediker",};

    static String perfumes[]={"Fogg","Nivea","Engage","Park Avenue","Axe","Wild Stone","Queen","Skinn",
                           "Ossum","Sweet Heart","Osr Girl","Denver","Burberry Hero","Dove",};
	
    static String soaps[]={"Dove","No1","Santoor","Lux","Medimix","Mysore Sandle","Rexon","Dettol","Pears",
                        "Cinthol","Wheel","Rin","Ayush","Lollipop Soap","Tide"};

    static String brandsOfTshirts[]={"Puma","Arrow","Rararabbit","UnitedColours","Vanheusan",
                    "Jack&Jones", "Mufti","Polo","adidas","PepeJeans","JohnPlayer","Park Avenue",
								 "Avasaa","Spunk","Nike"};
						
    static String[] godNames ={"Brahma","Vishnu","Shiva","Saraswati","Lakshmi","Parvati",
                            "Durga","Kali","Ganesha","Hanuman","Ayyappan","Kartikeya","Ashvins",
							"Surya","Padmavathi","Rama","Krishna","Sita"};

    static String[] brandName={"Arun","Bluebell","Ben&Jerry's","BlueBunny","Edy's","Magnum","Amul",
                            "Top'N Town","Mother Dairy","Vadilal","Giani","Kwality Walls","Havmor",
							"Dinshaw's","Creambell","Nirula's","Natural's Ice cream"};

     public static void main(String nandini[]){
	 
	System.out.println("Main started");
	      getChartsName();
		  getCompanyName();
	      getGroceriesName();
	      getChocolatesName();
		  getShampoosName();
		  getPerfumes();
		  getSoaps();
		  getBrandsOfTshirts();
	      getGodNames();	  
		  getBrandName();
	System.out.println("Main ended");
	 }

    public static void getChartsName(){
	  
	  System.out.println("Calling getChartsName method");
	  System.out.println("List of Chats :");
	       for(int i=0; i<chatsName.length; i++){
		   
		   System.out.println(chatsName[i]);
		   }
	  System.out.println("end of getChartsName method");
	  return;
	  
	  }
	  
	public static void getCompanyName(){
		  
		System.out.println("Calling getCompanyName method");
        System.out.println("List of Companies");
             for(int i=0; i<companyName.length; i++){
				 
				 System.out.println(companyName[i]);
				 
			 }
		System.out.println("End of getCompanyName method");
		return;
	  }
	  
	  
	public static void getGroceriesName(){
		  
		System.out.println("Calling getGroceriesName method");
        System.out.println("List of Groceries :");
    
          for(int i = 0; i<groceriesName.length; i++){
			  
			  System.out.println(groceriesName[i]);
			  
		  }	
		System.out.println("End of getGroceriesName method");
        return;		
	  } 
	  
	public static void getChocolatesName(){
		  
		  System.out.println("Calling getChocolatesName method");
		  System.out.println("List chocolatesName :");
		  
		     for(int i =0; i<chocolatesName.length; i++){
				 
				 System.out.println(chocolatesName[i]);
				 
			 }
		  
		  System.out.println("End of the getChocolatesName method");
		 
	  }
	  
	public static void getShampoosName(){
		  
		  System.out.println("Calling getShampoosName method");
		  System.out.println("List shampoos Name :");
		     for(int i=0; i<shampoosName.length; i++){
				 
				 System.out.println(shampoosName[i]);
			 }
		  
		  System.out.println("End of the getShampoosName method");
		  return;
	  }
	  
	public static void getPerfumes(){
		  
		  System.out.println("Calling getPerfumes method");
		  System.out.println("List of Perfume Name :");
		      for(int i=0; i<perfumes.length;i++){
				  
				  System.out.println(perfumes[i]);
				  
			  }
		  System.out.println("End of getPerfumes method");
		  return;
	  }
	  
	  
	public static void getSoaps(){
		  
		  System.out.println("Calling getSoaps method");
		  System.out.println("list of Soaps");
		      for(int i=0; i<soaps.length; i++){
				  
				  System.out.println(soaps[i]);
			  }
		  
		  System.out.println("End of getSoaps method");
		  return;
	  }
	  
	public static void getBrandsOfTshirts(){
		  
		  System.out.println("Calling getBrandsOfTshirts method");
		  System.out.println("List of Brand Tshirts :");
		       for(int i=0; i<brandsOfTshirts.length; i++){
				   
				   System.out.println(brandsOfTshirts[i]);
				   
			   }
		  System.out.println("End of getBrandsOfTshirts method");
		  return;
	  }
	  
	public static void getGodNames(){
		  
		  System.out.println("Calling getGodNames method");
		  System.out.println("List of gods names :");
		    for(int i=0; i<godNames.length; i++){
				
				System.out.println(godNames[i]);
			}
		  System.out.println("End of getGodNames method");
		  return;
	  }
   
    public static void getBrandName(){
		
		System.out.println("Calling getBrandName method");
		System.out.println("List of IceCream brandName :");
		
		for(int i=0; i<brandName.length; i++){
			
			System.out.println(brandName[i]);
		}
		
		System.out.println("End of getBrandName method");
	}
}