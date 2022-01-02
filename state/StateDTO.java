package state;

public class StateDTO {
	private Integer id;
	private String name;
	private String code;
	private String capital;
	
	public StateDTO() {
	}

	public StateDTO(Integer id, String name, String code, String capital) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return "StateDTO [id=" + id + ", name=" + name + ", code=" + code + ", capital=" + capital + "]";
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getCapital() {
		return capital;
	}
	
}
