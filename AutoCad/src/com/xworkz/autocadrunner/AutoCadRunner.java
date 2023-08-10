package com.xworkz.autocadrunner;

import java.sql.SQLException;

import com.xworkz.autocaddto.AutoCadDTO;
import com.xworkz.autocadservice.AutoCadService;
import com.xworkz.autocadservice.AutoCadServiceImpl;

public class AutoCadRunner {
	public static void main(String[] args) throws SQLException {
		AutoCadDTO dto = new AutoCadDTO();

		dto.setId(4);
		dto.setUserName("Nivedita");
		dto.setPhoneNumber(779442L);
		dto.setSoftwareName("Auto Cad");
		dto.setVersion(1.90);
		dto.setDoe("12-Aug-2030");
		dto.setPassword("nivedita@2222");
		dto.setPrice(10036);
		dto.setOsVersion("mac12");
		dto.setEmail("nivedit@gmail.com");
		System.out.print(dto.toString());

		AutoCadService service = new AutoCadServiceImpl();
		// service.validationAndStore(dto);
		// service.onSearch(1.19);
		//service.search(1);
		// service.delete("Window11");
		 //service.searchOn("Auto Cad");
		service.update("Laxmi",910892234L,"eclipse",3.21,"30-Sep-2026","laxmi@34",5000,"apple23","laxmi@gmail.com",2);
        //service.onUpdate(2000,"IntelliJ IDE","Window10");
		//service.readAll();
		//service.delete("eclipse");
	}

}
