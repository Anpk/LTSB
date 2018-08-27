package global.sesoc.tsumioroshi.vo;

public class Members {
	private String id;			//�ο��Ҿ��̵�
	private String password; 	//��й�ȣ
	private String authority; 	//����(â����, �繫��, ������)
	
	public Members(String id, String password, String authority) {
		this.id = id;
		this.password = password;
		this.authority = authority;
	}

	public Members() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Members [id=" + id + ", password=" + password + ", authority=" + authority + "]";
	}
	
	
	
	
}
