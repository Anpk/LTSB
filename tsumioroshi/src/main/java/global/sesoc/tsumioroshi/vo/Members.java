package global.sesoc.tsumioroshi.vo;

public class Members {
	private String id;			//부여할아이디
	private String password; 	//비밀번호
	private String authority; 	//직위(창고직, 사무직, 마스터)
	
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
