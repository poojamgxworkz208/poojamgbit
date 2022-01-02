package festival;

public class FestivalEstablisher {
public static void main(String[] args) {
		
		FestivalDTO dto1 = new FestivalDTO(5, "Dasara", "01/10/2021", "Karanataka");
		FestivalDTO dto2 = new FestivalDTO(6, "Deepavali", "01/11/2021", "karnataka");
		FestivalDTO dto3 = new FestivalDTO(7, "Onam", "01/01/2021", "kerala");
		FestivalDTO dto4 = new FestivalDTO(8, "Sankranti", "14/01/2021", "Karnataka");
		
		FestivalDAO dao = new FestivalDAO();
		dao.displayTotalNumberOfRecords();
		
		//dao.delete(4);
	}
}

