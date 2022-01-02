package Country;

public class CountryDTO {
	private Integer y_id;
	private String y_name;
	private double y_code;
	private String y_continent;
	public CountryDTO(Integer y_id, String y_name, double y_code, String y_continent) {
		super();
		this.y_id = y_id;
		this.y_name = y_name;
		this.y_code = y_code;
		this.y_continent = y_continent;
	}
	public Integer getY_id() {
		return y_id;
	}
	public void setY_id(Integer y_id) {
		this.y_id = y_id;
	}
	public String getY_name() {
		return y_name;
	}
	public void setY_name(String y_name) {
		this.y_name = y_name;
	}
	public double getY_code() {
		return y_code;
	}
	public void setY_code(double y_code) {
		this.y_code = y_code;
	}
	public String getY_continent() {
		return y_continent;
	}
	public void setY_continent(String y_continent) {
		this.y_continent = y_continent;
	}
}