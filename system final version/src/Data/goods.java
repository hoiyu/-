package Data;

import java.util.ArrayList;

import Data.CRUD;

public class goods {
	private String gname;//��Ʒ��
	private String gType;//��Ʒ����
	private String gamount;//��Ʒ�ķ���
	private String gstock;//��Ʒ�Ŀ��
	public goods(String gname, String gType, String gamount, String gstock) {
		super();
		this.gname = gname;
		this.gType = gType;
		this.gamount = gamount;
		this.gstock = gstock;
		
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getgType() {
		return gType;
	}
	public void setgType(String gType) {
		this.gType = gType;
	}
	public String getGamount() {
		return gamount;
	}
	public void setGamount(String gamount) {
		this.gamount = gamount;
	}
	public String getGstock() {
		return gstock;
	}
	public void setGstock(String gstock) {
		this.gstock = gstock;
		
	}
public goods(){
		
	}
	
	public ArrayList<goods> deleteGood(String msg, String gname) {
		// TODO Auto-generated method stub
		return null;
	}
	public ArrayList<CRUD> foundGood(String msg, String gname2) {
		// TODO Auto-generated method stub
		return null;
	}

}
