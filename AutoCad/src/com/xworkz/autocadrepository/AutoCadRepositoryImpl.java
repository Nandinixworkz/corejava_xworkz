package com.xworkz.autocadrepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.autocaddto.AutoCadDTO;

public class AutoCadRepositoryImpl implements AutoCadRepository {

	@Override
	public boolean onUpdate(AutoCadDTO dto) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");

		String query = "insert into autocad_info values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, dto.getId());
		preparedStatement.setString(2, dto.getUserName());
		preparedStatement.setLong(3, dto.getPhoneNumber());
		preparedStatement.setString(4, dto.getSoftwareName());
		preparedStatement.setDouble(5, dto.getVersion());
		preparedStatement.setString(6, dto.getDoe());
		preparedStatement.setString(7, dto.getPassword());
		preparedStatement.setInt(8, dto.getPrice());
		preparedStatement.setString(9, dto.getOsVersion());
		preparedStatement.setString(10, dto.getEmail());

		int rows = preparedStatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean search(double version) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");

		String query = "select * from autocad_info where version=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("After: " + preparedStatement);
		preparedStatement.setDouble(1, version);
		System.out.println("Before: " + preparedStatement);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			System.out.println(" version : " + result.getDouble(1));
		}

		return true;
	}

	@Override
	public boolean onSearch(int id) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");
		String query = "select * from autocad_info where id=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Before: " + preparedStatement);
		preparedStatement.setInt(1, id);
		System.out.println("After: " + preparedStatement);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			System.out.println(" id : " + result.getInt(1));
		}
		return true;
	}

	@Override
	public boolean searchOn(String softwareName) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");
		String query = "select * from autocad_info where softwareName=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		System.out.println("Before: " + preparedStatement);
		preparedStatement.setString(1, softwareName);
		System.out.println("After: " + preparedStatement);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			System.out.println(" softwareName : " + result.getString(1));
		}
		return true;
	}

	@Override
	public boolean updateOn(String userName, long phoneNumber, String softwareName, double version, String doe,
			String password, int price, String osVersion, String email, int id) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");
		String query = "update autocad_info set userName=?,phoneNumber=?,softwareName=?,version=?,doe=?,password=?,price=?,osVersion=?,email=? where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userName);
		preparedStatement.setLong(2, phoneNumber);
		preparedStatement.setString(3, softwareName);
		preparedStatement.setDouble(4, version);
		preparedStatement.setString(5, doe);
		preparedStatement.setString(6, password);
		preparedStatement.setInt(7, price);
		preparedStatement.setString(8, osVersion);
		preparedStatement.setString(9, email);
		preparedStatement.setInt(10, id);

		int rows = preparedStatement.executeUpdate();
		if (rows > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean update(int price, String softwareName, String osVersion) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");

		String query = "update autocad_info set price=?,softwareName=? where osVersion=?";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, price);
		preparedStatement.setString(2, softwareName);
		preparedStatement.setString(3, osVersion);
		int row = preparedStatement.executeUpdate();
		if (row > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean read() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad", "root",
				"Tejashwini@123");

		String query = "select * from autocad_info";

		PreparedStatement preparedStatement = connection.prepareStatement(query);
		ResultSet result = preparedStatement.executeQuery();
		while (result.next()) {
			System.out.println(" id : " + result.getInt(1) + " userName : " + result.getString(2) + " phoneNumber : "
					+ result.getLong(3) + " softwareName : " + result.getString(4) + " version : " + result.getDouble(5)
					+ " doe : " + result.getString(6) + " password : " + result.getString(7) + " price :"
					+ result.getInt(8) + " osVersion : " + result.getString(9) + " email :" + result.getString(10));
		}
		return false;

	}

	@Override
	public boolean onDelete(String softwareName) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/autocad","root","Tejashwini@123");
		
		String query = "delete from autocad_info where softwareName = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,softwareName);
		int row = preparedStatement.executeUpdate();
		if(row>0) {
			return true;
		}else {
		
		return false;
		}
	}

}
