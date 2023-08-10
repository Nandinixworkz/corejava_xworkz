package com.xworkz.autocadrepository;

import java.sql.SQLException;

import com.xworkz.autocaddto.AutoCadDTO;

public interface AutoCadRepository {

	public boolean onUpdate(AutoCadDTO dto) throws SQLException ;

	public boolean search(double version) throws SQLException;

	public boolean onSearch(int id)throws SQLException;

	public boolean searchOn(String softwareName) throws SQLException;

	public boolean updateOn(String userName, long phoneNumber, String softwareName, double version, String doe,
			String password, int price, String osVersion, String email, int id) throws SQLException;

	public boolean update(int price, String softwareName, String osVersion) throws SQLException;

	public boolean read() throws SQLException;

	public boolean onDelete(String softwareName) throws SQLException;


}
