package city;

public class CityDTO {
	private Integer c_id;
	private String c_name;
	private double c_population;
	private String famousFor;
	
	public CityDTO(Integer c_id, String c_name, double c_population, String famousFor) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_population = c_population;
		this.famousFor = famousFor;
	}
	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public double getC_population() {
		return c_population;
	}

	public void setC_population(double c_population) {
		this.c_population = c_population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
}
