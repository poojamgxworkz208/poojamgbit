package state;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class StateDAO {

		public boolean save(StateDTO dto) {
			Connection connection = null;
			try {
				connection = SQLUtil.createConnection();
				String sql = "insert into state_details values(?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setObject(1, dto.getId());
				preparedStatement.setObject(2, dto.getName());
				preparedStatement.setObject(3, dto.getCode());
				preparedStatement.setObject(4, dto.getCapital());
				return preparedStatement.executeUpdate() > 0 ? true : false;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SQLUtil.closeConnection(connection);
			}
			return false;
		}

		public boolean dalete(Integer id) {
			Connection connection = null;
			try {
				connection = SQLUtil.createConnection();
				String sql = "delete from state_details where state_id=?";
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
				String sql = "select * from state_details where state_id=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setObject(1, id);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object col1 = resultSet.getObject(1);
					Object col2 = resultSet.getObject(2);
					Object col3 = resultSet.getObject(3);
					Object col4 = resultSet.getObject(4);
					System.out.println(col1 + " " + col2 + " " + col3 + " " + col4);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SQLUtil.closeConnection(connection);
			}
			return false;
		}
		
		public boolean displayAll() {
			Connection connection = null;
			try {
				connection = SQLUtil.createConnection();
				String sql = "select * from state_details";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object col1 = resultSet.getObject(1);
					Object col2 = resultSet.getObject(2);
					Object col3 = resultSet.getObject(3);
					Object col4 = resultSet.getObject(4);
					System.out.println(col1 + " " + col2 + " " + col3 + " " + col4);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SQLUtil.closeConnection(connection);
			}
			return false;
		}
		
		public boolean displayTotalNumberOfRecords() {
			Connection connection = null;
			try {
				connection = SQLUtil.createConnection();
				String sql = "select count(*) from state_details";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					Object col1 = resultSet.getObject(1);
					System.out.println(col1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				SQLUtil.closeConnection(connection);
			}
			return false;
		}

		public void getById1(int id) {
			// TODO Auto-generated method stub
			
		}
}
