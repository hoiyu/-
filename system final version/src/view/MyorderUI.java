/*
 * MyorderUI.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Data.CRUD;
import Data.agoods;

/**
 *
 * @author  __USER__
 */
public class MyorderUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5582745345157405606L;

	/** Creates new form MyorderUI */
	public MyorderUI() {
		initComponents();
		init();
		setLocationRelativeTo(null);
	}

	
	private void init() {
		ArrayList<agoods> leaves = CRUD.getOrder();
		String[] columnNames = {"物品名称","起租日期","归还日期"};
		Object[][] detail = new Object[leaves.size()][3];
		for (int i = 0; i < leaves.size(); i++) {
			
			detail[i][0] = leaves.get(i).getGn();
			detail[i][1] = leaves.get(i).getBtime();
			detail[i][2] = leaves.get(i).getRtime();
		}
			this.jTable1.setModel(new DefaultTableModel(detail,columnNames));		
			
		
	}
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/bigui.png"))); // NOI18N

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/logo.png"))); // NOI18N

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/exitlogo.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel3.setText("\u6211\u7684\u8ba2\u5355");

		jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "物品名称", "起租日期", "归还日期" }));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/commentbutton.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(1, 1, 1)
								.add(jLabel1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										446,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
																.add(509, 509,
																		509)
																.add(jButton1,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		142,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(12, 12, 12)
																.add(jLabel2,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		84,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																.add(18, 18, 18)
																.add(jLabel3)
																.add(901, 901,
																		901)
																.add(jButton5,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		60,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
												.add(12, 12, 12))
										.add(org.jdesktop.layout.GroupLayout.TRAILING,
												jPanel1Layout
														.createSequentialGroup()
														.addPreferredGap(
																org.jdesktop.layout.LayoutStyle.RELATED,
																93,
																Short.MAX_VALUE)
														.add(jScrollPane1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																1000,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(74, 74, 74)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jLabel1)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.LEADING)
										.add(jLabel2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												93,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jPanel1Layout
												.createSequentialGroup()
												.addContainerGap()
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.TRAILING)
														.add(jLabel3)
														.add(jButton5,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																59,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(
										org.jdesktop.layout.LayoutStyle.RELATED)
								.add(jScrollPane1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										555,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
								.add(14, 14, 14)
								.add(jButton1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										40,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 722,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserCommentUI().setVisible(true);
		 int row = jTable1.getSelectedRow();
		    int column = jTable1.getSelectedColumn();
		 
		      System.out.println(jTable1.getValueAt(row, column));
		this.dispose();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new User().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MyorderUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}