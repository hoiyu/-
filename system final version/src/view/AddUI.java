/*
 * AddUI.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import javax.swing.JOptionPane;

import Data.CRUD;

/**
 *
 * @author  __USER__
 */
public class AddUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1782846676821054483L;
	/** Creates new form AddUI */
	public AddUI() {
		initComponents();
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
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/bigui.png"))); // NOI18N

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/logo.png"))); // NOI18N

		jLabel3.setFont(new java.awt.Font("黑体", 1, 20));
		jLabel3.setForeground(new java.awt.Color(58, 98, 215));
		jLabel3.setText("\u7269\u54c1\u540d");

		jLabel4.setFont(new java.awt.Font("黑体", 1, 20));
		jLabel4.setForeground(new java.awt.Color(58, 98, 215));
		jLabel4.setText("\u7c7b  \u578b");

		jLabel5.setFont(new java.awt.Font("黑体", 1, 20));
		jLabel5.setForeground(new java.awt.Color(58, 98, 215));
		jLabel5.setText("\u8d39  \u7528");

		jLabel6.setFont(new java.awt.Font("黑体", 1, 20));
		jLabel6.setForeground(new java.awt.Color(58, 98, 215));
		jLabel6.setText("\u5e93  \u5b58");

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/add.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/exitlogo.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jTextField2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jTextField3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jTextField4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel7.setText("\u6dfb\u52a0\u7269\u54c1");

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/pluslogo.png"))); // NOI18N

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
																.addPreferredGap(
																		org.jdesktop.layout.LayoutStyle.RELATED)
																.add(jLabel7,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		115,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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
																				org.jdesktop.layout.GroupLayout.LEADING,
																				false)
																		.add(jTextField4)
																		.add(jTextField3)
																		.add(jTextField2)
																		.add(jTextField1,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				527,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED,
														org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.add(jButton2,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														86,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
										.add(org.jdesktop.layout.GroupLayout.TRAILING,
												jPanel1Layout
														.createSequentialGroup()
														.add(362, 362, 362)
														.add(jLabel8)
														.addPreferredGap(
																org.jdesktop.layout.LayoutStyle.RELATED)
														.add(jButton1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																90,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(321, 321, 321)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.LEADING)
										.add(jLabel1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												601, Short.MAX_VALUE)
										.add(jPanel1Layout
												.createSequentialGroup()
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(52, 52, 52)
																.add(jLabel7,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		34,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(jPanel1Layout
																.createSequentialGroup()
																.addContainerGap()
																.add(jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.LEADING)
																		.add(jButton2,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				68,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(jLabel2,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				96,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
												.add(48, 48, 48)
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
														.add(jTextField4,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																52,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
												.add(28, 28, 28)
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.TRAILING,
																false)
														.add(jLabel8, 0, 0,
																Short.MAX_VALUE)
														.add(jButton1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																53,
																Short.MAX_VALUE))))
								.addContainerGap()));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 581,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String gname = jTextField1.getText();
		String gType = jTextField2.getText();
		String gamount = jTextField3.getText();
		String gstock = jTextField4.getText();
		CRUD.addGood(gname, gType, gamount, gstock);
		JOptionPane.showMessageDialog(this, "添加成功");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new AdminUI().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AddUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}