/*
 * UserRentUI.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import javax.swing.JOptionPane;

import Data.CRUD;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.text.JTextComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author  __USER__
 */
public class UserRentUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7482319660337119381L;

	/** Creates new form UserRentUI */
	public UserRentUI() {
		initComponents();
		MyPrintStream mps = new MyPrintStream(System.out, jTextField4);
		System.setOut(mps);
		System.setErr(mps);

		setLocationRelativeTo(null);

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		jComboBox2 = new javax.swing.JComboBox();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel9 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField4 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/bigui.png"))); // NOI18N

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/logo.png"))); // NOI18N

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel7.setText("\u79df\u8d41\u9875\u9762");

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/exitlogo.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel3.setForeground(new java.awt.Color(58, 98, 215));
		jLabel3.setText("\u59d3       \u540d");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel4.setForeground(new java.awt.Color(58, 98, 215));
		jLabel4.setText("\u8eab  \u4efd  \u8bc1");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel5.setForeground(new java.awt.Color(58, 98, 215));
		jLabel5.setText("\u8054\u7cfb\u65b9\u5f0f");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel6.setForeground(new java.awt.Color(58, 98, 215));
		jLabel6.setText("\u8d77\u79df\u65e5\u671f");

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jComboBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"12月26日", "12月27日", "12月28日", "12月29日", "12月30日", "12月31日" }));
		jComboBox2.setBorder(new javax.swing.border.SoftBevelBorder(
				javax.swing.border.BevelBorder.RAISED));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}
		});

		jComboBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"12月25日", "12月26日", "12月27日", "12月28日", "12月29日", "12月30日",
				"12月31日" }));
		jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(
				javax.swing.border.BevelBorder.RAISED));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel9.setForeground(new java.awt.Color(58, 98, 215));
		jLabel9.setText("\u5f52\u8fd8\u65e5\u671f");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/confirmbutton.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextField4.setEditable(false);
		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel8.setForeground(new java.awt.Color(58, 98, 215));
		jLabel8.setText("\u7269\u54c1\u540d\u79f0");

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(jLabel1)
								.addPreferredGap(
										org.jdesktop.layout.LayoutStyle.RELATED)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.LEADING)
										.add(jPanel1Layout
												.createSequentialGroup()
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(jPanel1Layout
																.createSequentialGroup()
																.addPreferredGap(
																		org.jdesktop.layout.LayoutStyle.UNRELATED)
																.add(jLabel2)
																.add(jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.LEADING)
																		.add(org.jdesktop.layout.GroupLayout.TRAILING,
																				jPanel1Layout
																						.createSequentialGroup()
																						.addPreferredGap(
																								org.jdesktop.layout.LayoutStyle.RELATED)
																						.add(jLabel7,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								139,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								org.jdesktop.layout.LayoutStyle.RELATED,
																								503,
																								Short.MAX_VALUE)
																						.add(jButton2,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								86,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																		.add(jPanel1Layout
																				.createSequentialGroup()
																				.add(128,
																						128,
																						128)
																				.add(jLabel8)
																				.addPreferredGap(
																						org.jdesktop.layout.LayoutStyle.RELATED)
																				.add(jTextField4,
																						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																						318,
																						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(72, 72, 72)
																.add(jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.LEADING)
																		.add(jLabel3,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				98,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(jLabel4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				98,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(jLabel5,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				98,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(jLabel6,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				98,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
																.add(46, 46, 46)
																.add(jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.LEADING)
																		.add(jTextField2,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				505,
																				Short.MAX_VALUE)
																		.add(jTextField1,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				505,
																				Short.MAX_VALUE)
																		.add(jTextField3,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				505,
																				Short.MAX_VALUE)
																		.add(org.jdesktop.layout.GroupLayout.TRAILING,
																				jPanel1Layout
																						.createSequentialGroup()
																						.add(jComboBox1,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								171,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								org.jdesktop.layout.LayoutStyle.RELATED,
																								53,
																								Short.MAX_VALUE)
																						.add(jLabel9,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								98,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								org.jdesktop.layout.LayoutStyle.UNRELATED)
																						.add(jComboBox2,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																								171,
																								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(
																		org.jdesktop.layout.LayoutStyle.RELATED,
																		113,
																		Short.MAX_VALUE)))
												.addContainerGap())
										.add(org.jdesktop.layout.GroupLayout.TRAILING,
												jPanel1Layout
														.createSequentialGroup()
														.add(jButton1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																154,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(324, 324, 324)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jLabel1,
								org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
								634, Short.MAX_VALUE)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(14, 14, 14)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.LEADING)
										.add(jPanel1Layout
												.createSequentialGroup()
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED)
												.add(jLabel2,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														96,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(jPanel1Layout
												.createSequentialGroup()
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(18, 18, 18)
																.add(jButton2,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		68,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(31, 31, 31)
																.add(jLabel7,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		34,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED)
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.BASELINE)
														.add(jTextField4,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																40,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(jLabel8))))
								.add(27, 27, 27)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jLabel3,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												65,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jTextField1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												52,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(25, 25, 25)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jLabel4,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												65,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jTextField2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												52,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(18, 18, 18)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jLabel5,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												65,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jTextField3,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												52,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(18, 18, 18)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jLabel6,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												65,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jLabel9,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												50,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jComboBox2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												38,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jComboBox1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												38,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										org.jdesktop.layout.LayoutStyle.RELATED,
										32, Short.MAX_VALUE)
								.add(jButton1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										51,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(55, 55, 55)));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	public class MyPrintStream extends PrintStream {

		private JTextComponent text;
		private StringBuffer sb = new StringBuffer();

		public MyPrintStream(OutputStream out, JTextComponent text) {
			super(out);
			this.text = text;
		}

		/**
		 * 在这里重截,所有的打印方法都要调用的方法
		 */
		public void write(byte[] buf, int off, int len) {
			final String message = new String(buf, off, len);
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					sb.append(message + "\n");
					text.setText(sb.toString());
				}
			});
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String aid = jTextField1.getText();
		String num = jTextField2.getText();
		String phone = jTextField3.getText();
		Object btime = jComboBox1.getSelectedItem();
		Object rtime = jComboBox2.getSelectedItem();
		String gn = jTextField4.getText();
		CRUD.add(gn, btime, rtime, num, aid, phone);
		JOptionPane.showMessageDialog(this, "租赁成功");

		new User().setVisible(true);
		this.dispose();
	}

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserLibraryUI().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UserRentUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}