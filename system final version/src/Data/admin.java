package Data;

public class admin {
	private String aid;//管理员的用户名
	private String apassword;//管理员的密码
	public admin(String aid, String apassword) {
		super();
		this.aid = aid;
		this.apassword = apassword;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	

}
