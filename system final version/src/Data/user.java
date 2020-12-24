package Data;




import Data.user;

public class user {
	private String uid;//用户的用户名
	private String upassword;//用户密码
	public user(String uid, String upassword) {
		super();
		this.uid = uid;
		this.upassword = upassword;
	}

	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	


	}


