package iceCream;

public class IceCreamEstablisher {
public static void main(String[] args) {
		
		IceCreamDTO dto = new IceCreamDTO(2, "Arun Spiral", "PineApple Vanilla", 50.0);
		
		IceCreamDAO dao = new IceCreamDAO();
		dao.save(dto);
	// dao.displayAll();
	}
}
