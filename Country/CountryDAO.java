package Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import city.CityDTO;
import city.SQLConstant;
import city.SQLUtil;



public class CountryDAO {
	public boolean save(CityDTO dto) {
		Connection conn=null;
		try {
			getClass();
			Class.forName(SQLConstant.driver);
			conn=DriverManager.getConnection(SQLConstant.URL,SQLConstant.USERNAME,SQLConstant.PASSWORD);
			System.out.println("Connection is successfull");
String query="insert into city_detail values("+ dto.getC_id()+",'"+dto.getC_name()+"','"+dto.getC_population()+"','"+dto.getFamousFor()+"')";
					Statement insertQuery= conn.createStatement();
			int rowsAffected=insertQuery.executeUpdate(query);
			System.out.println("Rows Affected"+rowsAffected);
			
			if(rowsAffected==1)
				return true;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
					conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public boolean delete(int id) {
		Connection connection = null;
		try {
			connection = SQLUtil.createConnection();
			String sql = "delete from city_details where city_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, id);
			return preparedStatement.executeUpdate() > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SQLUtil.closeConnection(connection);
		}
		return false;
	}
	public boolean getById(int id) {
		Connection connection = null;
		try {
			connection = SQLUtil.createConnection();
			String sql = "select * from city_details where city_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setObject(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				System.out.println(col1+" "+col2+" "+col3+" "+col4);
			}
		}catch(SQLException exception){
			exception.printStackTrace();
		}finally {
			SQLUtil.closeConnection(connection);
		}
		
		return false;
	}
	public boolean displayAll() {
		Connection connection = null;
		try {
			connection = SQLUtil.createConnection();
			String sql = "select * from city_details";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				Object col2 = resultSet.getObject(2);
				Object col3 = resultSet.getObject(3);
				Object col4 = resultSet.getObject(4);
				System.out.println(col1+" "+col2+" "+col3+" "+col4);
			}
			
		}catch(SQLException exception){
			exception.printStackTrace();
		}finally {
			SQLUtil.closeConnection(connection);
		}
		
		return false;
	}
	public boolean displayTotalNumberOfRecords() {
		Connection connection = null;
		try {
			connection = SQLUtil.createConnection();
			String sql = "select count(*) from city_details";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Object col1 = resultSet.getObject(1);
				System.out.println(col1);
			}
			
		}catch(SQLException exception){
			exception.printStackTrace();
		}finally {
			SQLUtil.closeConnection(connection);
		}
		
		return false;
	}
}