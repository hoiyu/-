package Data;

public class agoods {
 private  Object btime;//����ʱ��
 private  Object rtime;//�黹ʱ��
 private  String num;//���֤
 private  String aid;//����
 private  String phone;//�ֻ���
 private  String gn;//��Ʒ��
 public agoods(Object btime, Object rtime, String num, String aid,String phone,String gn) {
  super();
  this.btime = btime;
  this.rtime = rtime;
  this.num = num;
  this.aid = aid;
  this.phone = phone;
  this.gn = gn;
 }
 public agoods(String gn,String aid2, String num2, String phone2, Object btime2,Object rtime2) {
  // TODO Auto-generated constructor stub
 }
 public Object getBtime() {
  return btime;
 }
 public void setBtime(String btime) {
  this.btime = btime;
 }
 public Object getRtime() {
  return rtime;
 }
 public void setRtime(String rtime) {
  this.rtime = rtime;
 }
 public String getNum() {
  return num;
 }
 public void setNum(String num) {
  this.num = num;
 }
 public String getAid() {
  return aid;
 }
 public void setAid(String aid) {
  this.aid = aid;
 }
 public String getPhone() {
  return phone;
 }
 public void setPhone(String phone) {
  this.phone = phone;
 }
 public String getGn() {
	  return gn;
	 }
	 public void setGn(String gn) {
	  this.gn = gn;
	 }
	 
 

}