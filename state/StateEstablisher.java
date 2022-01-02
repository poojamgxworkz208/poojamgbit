package state;

public class StateEstablisher {
public static void main(String[] args) {
		
		StateDTO dto = new StateDTO(1, "Karnataka", "11", "Bangalore");

		StateDAO dao = new StateDAO();
		//dao.save(dto);
		dao.getById(1);
	}
}
