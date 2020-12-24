package Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.DataConnection;
import Data.goods;


public class CRUD {
	private static Connection conn;
	private static PreparedStatement pst;
	private static String sql;
	private static ResultSet rs;
	
	public static boolean userQuery(String uid, String upassword) {
		String sql = "select * from user where uid = ? and upassword = ?";
		pst = DataConnection.getPs(sql);
		try {
			pst.setString(1, uid);
			pst.setString(2, upassword);
			rs = pst.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	public static boolean adminQuery(String aid, String apassword){
		boolean flag;
		try {
			sql = "select * from user where aid = ? and apassword = ?";
			pst = DataConnection.getPs(sql);
			pst.setString(1, aid);
			pst.setString(2, apassword);
			rs = pst.executeQuery();
			flag = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	 public static boolean add(String gn,Object btime, Object rtime, String num, String aid,String phone){
		  boolean flag;
		  
		  try {
		   sql = "insert into agoods(gn,btime, rtime, num, aid,phone) values (?, ?, ?, ?, ?, ?)";
		   pst = DataConnection.getPs(sql); 
		   pst.setString(1, gn);
		   pst.setObject(2, btime);
		   pst.setObject(3, rtime);
		   pst.setString(4, num);
		   pst.setString(5, aid);
		   pst.setString(6, phone);
		   
		   
		   pst.executeUpdate();
		   flag = true; 
		  } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   flag = false;
		  }
		  return flag;
		 }
		 
		 public static ArrayList<agoods> getRentAgoods() {
		  ArrayList<agoods> agoods = new ArrayList<agoods>();
		  String sql = "select * from agoods";
		  PreparedStatement ps = DataConnection.getPs(sql);
		  try {
		   ResultSet rs = ps.executeQuery();
		   while (rs.next()) {
			String gn = rs.getString("gn");
		    String aid = rs.getString("aid");
		    String num = rs.getString("num");
		    String phone = rs.getString("phone");
		    Object btime = rs.getObject("btime");
		    Object rtime = rs.getObject("rtime");
		    agoods good = new agoods(gn,aid, num, phone, btime,rtime);
		    agoods.add(good);
		   }
		  } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		  }
		  return agoods;
		  
		 }
		 
	 
		 public static boolean addcomment(String gn,String ucomment){
			  boolean flag;
			  
			  try {
			   sql = "insert into ucomment(gn,ucomment) values (?, ?)";
			   pst = DataConnection.getPs(sql); 
			   pst.setString(1, gn);		
			   pst.setString(2, ucomment);
			   
			   
			   pst.executeUpdate();
			   flag = true; 
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			   flag = false;
			  }
			  return flag;
			 }
			 
			 public static ArrayList<comments>getComment() {
			  ArrayList<comments> comments = new ArrayList<comments>();
			  String sql = "select * from ucomment";
			  PreparedStatement ps = DataConnection.getPs(sql);
			  try {
			   ResultSet rs = ps.executeQuery();
			   while (rs.next()) {
				String gn = rs.getString("gn");
			    String ucomment = rs.getString("ucomment");
			   
			    comments comment = new comments(gn,ucomment);
			    comments.add(comment);
			   }
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
			  return comments;
			  
			 }
		 
		 
		 
	public static boolean addGood(String gname, String gType, String gamount, String gstock){
		boolean flag;
		
		try {
			sql = "insert into goods(gname, gType, gamount, gstock) values (?, ?, ?, ?)";
			pst = DataConnection.getPs(sql);
			pst.setString(1, gname);
			pst.setString(2, gType);
			pst.setString(3, gamount);
			pst.setString(4, gstock);
			
			pst.executeUpdate();
			flag = true;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public static boolean addUser(String uid, String upassword){
		boolean flag;
		
		try {
			sql = "insert into user(uid, upassword) values (?, ?)";
			pst = DataConnection.getPs(sql);
			pst.setString(1, uid);
			pst.setString(2, upassword);
			
			
			pst.executeUpdate();
			flag = true;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public static boolean addComment(String ucomment){
		boolean flag;
		
		try {
			sql = "insert into ucomment(ucomment) values (?)";
			pst = DataConnection.getPs(sql);
			pst.setString(1, ucomment);
			
			pst.executeUpdate();
			flag = true;	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
		
	}
	public static ArrayList<goods> getGoods() {
		ArrayList<goods> goods = new ArrayList<goods>();
		String sql = "select * from goods";
		PreparedStatement ps = DataConnection.getPs(sql);
		try {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String gname = rs.getString("gname");
				String gType = rs.getString("gType");
				String gamount = rs.getString("gamount");
				String gstock = rs.getString("gstock");
				goods good = new goods(gname, gType, gamount, gstock);
				goods.add(good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
		
	}
	
	public static ArrayList<agoods> getOrder() {
		ArrayList<agoods> agoods = new ArrayList<agoods>();
		String sql = "select * from agoods";
		PreparedStatement ps = DataConnection.getPs(sql);
		try {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String gn = rs.getString("gn");
				Object btime = rs.getString("btime");
				Object rtime = rs.getString("rtime");
				String num = rs.getString("num");
				String aid = rs.getString("aid");
				String phone = rs.getString("phone");
				agoods agood = new agoods( btime, rtime, num,aid,phone,gn);
				agoods.add(agood);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return agoods;
		
	}
	
	
	
	public static boolean deleteGood(String gname){
		
		
		try {
			sql = "select * from goods where gname = ?";
			pst = DataConnection.getPs(sql);
			pst.setString(1, gname);
			rs = pst.executeQuery();
			if (!(rs.next())) {
				return false;
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		boolean flag = false;
		try {
			sql = "delete from goods where gname = ?";
			pst = DataConnection.getPs(sql);
			pst.setString(1, gname);
			
			pst.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}
	
	public static ArrayList<goods> foundGood(String gname) {
		ArrayList<goods> goods = new ArrayList<goods>();
		try {
			if ("".equals(gname.trim())) {
				sql = "select * from goods";
				pst = DataConnection.getPs(sql);
				rs = pst.executeQuery();
				while (rs.next()) {
					goods.add(new goods(rs.getString(1), rs.getString(2), rs
							.getString(3), rs.getString(4)));
				}
			
			}
			else {
				sql = "select * from goods where gname = ?";
				pst = DataConnection.getPs(sql);
				pst.setString(1, gname);
				rs = pst.executeQuery();
				while (rs.next()) {
					goods.add(new goods(rs.getString(1), rs.getString(2), rs
							.getString(3), rs.getString(4)));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

	public static boolean changeGood(String Newnames, String gType, String gamount, String gstock, String gname ) {
		boolean flag;
		try {
			sql = "update goods set gname = ? ,gType = ?, gamount = ?, gstock = ? where gname = ?";
			pst = DataConnection.getPs(sql);
			pst.setString(1, Newnames);
			pst.setString(2, gType);
			pst.setString(3, gamount);
			pst.setString(4, gstock);
			pst.setString(5, gname);

			pst.executeUpdate();
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}
		return flag;
	}



	public static Connection getConn() {
		return conn;
	}
	public static void setConn(Connection conn) {
		CRUD.conn = conn;
	}
	

}
