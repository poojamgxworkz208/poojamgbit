package Country;

public class CountryEstablisher {
public static void main(String[] args) {
	
	CountryDTO dto1 = new CountryDTO(7,"India",454,"Asia");
	CountryDTO dto2 = new CountryDTO(3,"America",656,"Antartica");
	CountryDTO dto3 = new CountryDTO(5,"China",494,"Asia");
	CountryDTO dto4 = new CountryDTO(8,"Japan",986,"Antartica");
	
		CountryDAO dao = new CountryDAO();
		dao.displayTotalNumberOfRecords();
		//dao.delete(4);
	}
}
