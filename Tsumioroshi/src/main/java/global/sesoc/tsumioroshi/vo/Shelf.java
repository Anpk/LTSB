package global.sesoc.tsumioroshi.vo;

public class Shelf {
	
	private String shelf_Name;
	private String shelf_Size;
	private String shelf_Location;
	private String shelf_Condition;
	private String shelf_Tag;
	
	public Shelf() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shelf(String shelf_Name, String shelf_Size, String shelf_Location, String shelf_Condition,
			String shelf_Tag) {
		super();
		this.shelf_Name = shelf_Name;
		this.shelf_Size = shelf_Size;
		this.shelf_Location = shelf_Location;
		this.shelf_Condition = shelf_Condition;
		this.shelf_Tag = shelf_Tag;
	}

	public String getShelf_Name() {
		return shelf_Name;
	}

	public void setShelf_Name(String shelf_Name) {
		this.shelf_Name = shelf_Name;
	}

	public String getShelf_Size() {
		return shelf_Size;
	}

	public void setShelf_Size(String shelf_Size) {
		this.shelf_Size = shelf_Size;
	}

	public String getShelf_Location() {
		return shelf_Location;
	}

	public void setShelf_Location(String shelf_Location) {
		this.shelf_Location = shelf_Location;
	}

	public String getShelf_Condition() {
		return shelf_Condition;
	}

	public void setShelf_Condition(String shelf_Condition) {
		this.shelf_Condition = shelf_Condition;
	}

	public String getShelf_Tag() {
		return shelf_Tag;
	}

	public void setShelf_Tag(String shelf_Tag) {
		this.shelf_Tag = shelf_Tag;
	}

	@Override
	public String toString() {
		return "Shelf [shelf_Name=" + shelf_Name + ", shelf_Size=" + shelf_Size + ", shelf_Location=" + shelf_Location
				+ ", shelf_Condition=" + shelf_Condition + ", shelf_Tag=" + shelf_Tag + "]";
	}	
}