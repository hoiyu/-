package Data;




import Data.user;

public class user {
	private String uid;//�û����û���
	private String upassword;//�û�����
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


