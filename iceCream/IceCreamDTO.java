package iceCream;

public class IceCreamDTO {
	private Integer id;
	private String flavour;
	private String name;
	private Double price;
	
public IceCreamDTO() {
		
	}

	public IceCreamDTO(Integer id, String flavour, String name, Double price) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [id=" + id + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	/*public IceCreamDTO(Integer id, String flavour, String name, Double price) {
		//super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}*/