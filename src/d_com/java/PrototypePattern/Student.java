package d_com.java.PrototypePattern;

public class Student {
	
	private Integer Id;
	private String name;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + "]";
	}
	
	
	
}
