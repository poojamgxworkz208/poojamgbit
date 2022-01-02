package city;

public class CityEstablisher {
public static void main(String args[]) {
	CityDTO city=new CityDTO(8, "Bengaluru", 4337.0,"BT");
	System.out.println(city);
	
	CityDAO dao=new CityDAO();
	//boolean saved = dao.saveDTO(city);
	//System.out.println(saved);
	//dao.displayTotalNumberOfRecords();
	dao.displayAll();
}
}
