package festival;

public class FestivalDTO {
	private Integer f_id;
	private String f_name;
	private String f_date;
	private String f_state;
	
	public FestivalDTO(Integer f_id, String f_name, String string, String f_state) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.f_date = f_date;
		this.f_state = f_state;
	}

	public Integer getF_id() {
		return f_id;
	}

	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getF_date() {
		return f_date;
	}

	public void setF_date(String f_date) {
		this.f_date = f_date;
	}

	public String getF_state() {
		return f_state;
	}

	public void setF_state(String f_state) {
		this.f_state = f_state;
	}
}