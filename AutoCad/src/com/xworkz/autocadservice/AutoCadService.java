package com.xworkz.autocadservice;

import java.sql.SQLException;

import com.xworkz.autocaddto.AutoCadDTO;

public interface AutoCadService {
	public boolean validationAndStore(AutoCadDTO dto) throws SQLException;

	public boolean onSearch(double version) throws SQLException;

	public boolean search(int id) throws SQLException;

	public boolean searchOn(String softwareName) throws SQLException;

	public boolean update(String userName, long phoneNumber, String softwareName, double version, String doe,
			String password, int price, String osVersion, String email,int id) throws SQLException;
	
	public boolean onUpdate(int price, String softwareName,String osVersion) throws SQLException;
	
	public boolean readAll() throws SQLException;
	
	public boolean delete(String softwareName) throws SQLException;

}
