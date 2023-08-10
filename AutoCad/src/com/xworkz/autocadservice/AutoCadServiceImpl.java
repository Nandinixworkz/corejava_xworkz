package com.xworkz.autocadservice;

import java.sql.SQLException;

import com.xworkz.autocaddto.AutoCadDTO;
import com.xworkz.autocadrepository.AutoCadRepository;
import com.xworkz.autocadrepository.AutoCadRepositoryImpl;

public class AutoCadServiceImpl implements AutoCadService {

	AutoCadRepository repo = new AutoCadRepositoryImpl();

	@Override
	public boolean validationAndStore(AutoCadDTO dto) throws SQLException {
		if (dto != null) {
			System.out.println("dto is not null we can store the data");
			boolean store = repo.onUpdate(dto);
			System.out.println("store :" + store);
		} else {
			System.out.println("dto is  null we can't store the data");
		}
		return false;
	}

	@Override
	public boolean onSearch(double version) throws SQLException {
		if(version!=0) {
		boolean save = repo.search(version);
		System.out.println("save :" +save);
		return true;
		}
		return false;
		}

	@Override
	public boolean search(int id) throws SQLException {
		if(id!=0) {
			boolean save = repo.onSearch(id);
			System.out.println(save);
			return true;
		}
		return false;
	}

	@Override
	public boolean searchOn(String softwareName) throws SQLException {
         if(softwareName!=null) {
        	 boolean save = repo.searchOn(softwareName);
        		System.out.println(save);
    			return true;
         }
		return false;
	}

	@Override
	public boolean update(String userName, long phoneNumber, String softwareName, double version, String doe,
			String password, int price, String osVersion, String email,int id) throws SQLException {
		if(id!=0 && userName!=null && phoneNumber!=0 && softwareName!=null && version!=0 && doe!=null && password!=null && price!=0 && osVersion!=null && email!=null) {
		boolean save=repo.updateOn(userName, phoneNumber, softwareName, version, doe,password, price, osVersion,email,id);
		System.out.println(save);
		return true;
	
		}
	return false;
	}

	@Override
	public boolean onUpdate(int price, String softwareName, String osVersion) throws SQLException {
    if(price!=0 && softwareName!=null && osVersion!=null) {
    	boolean save = repo.update(price,softwareName,osVersion);
    	System.out.println(save);
    }
		return false;
	}

	@Override
	public boolean readAll() throws SQLException {
		boolean save = repo.read();
		System.out.println(save);
		return true;
	}

	@Override
	public boolean delete(String softwareName) throws SQLException {
		if(softwareName!=null) {
			boolean delete = repo.onDelete(softwareName);
			System.out.println(delete);
		}
		return false;
	}

}



