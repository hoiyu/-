/*
 * AdminLibraryUI.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Data.CRUD;
import Data.goods;
/**
 *
 * @author  __USER__
 */
public class AdminLibraryUI extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2846955202247874584L;
	String gname;
	goods s = new goods(gname, gname, gname, gname);

	/** Creates new form AdminLibraryUI */
	public AdminLibraryUI() {
		initComponents();
		init();
		setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void init() {
		ArrayList<goods> leaves = CRUD.getGoods();
		String[] columnNames = {"名称", "类型", "费用", "库存"};
		Object[][] detail = new Object[leaves.size()][4];
		for (int i = 0; i < leaves.size(); i++) {
			detail[i][0] = leaves.get(i).getGname();
			detail[i][1] = leaves.get(i).getgType();
			detail[i][2] = leaves.get(i).getGamount();
			detail[i][3] = leaves.get(i).getGstock();
		}
	
		this.jTable1.setModel(new DefaultTableModel(detail,columnNames));
	}
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/bigui.png"))); // NOI18N

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/logo.png"))); // NOI18N

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel3.setText("\u7269\u54c1\u5e93");

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/exitlogo.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"名称", "类型", "费用", "库存", "评价" }));
		jTable1.setEnabled(false);
		jScrollPane1.setViewportView(jTable1);

		org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(
												jLabel1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												446,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				1,
																				1,
																				1)
																		.add(
																				jLabel2)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jLabel3)
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED,
																				891,
																				Short.MAX_VALUE)
																		.add(
																				jButton5,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				60,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.addContainerGap())
														.add(
																org.jdesktop.layout.GroupLayout.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jScrollPane1,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				989,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(
																				66,
																				66,
																				66)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(
								jPanel1Layout
										.createSequentialGroup()
										.add(
												jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING)
														.add(jLabel1)
														.add(
																jPanel1Layout
																		.createSequentialGroup()
																		.add(
																				jPanel1Layout
																						.createParallelGroup(
																								org.jdesktop.layout.GroupLayout.LEADING)
																						.add(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addContainerGap()
																										.add(
																												jPanel1Layout
																														.createParallelGroup(
																																org.jdesktop.layout.GroupLayout.TRAILING)
																														.add(
																																jLabel3)
																														.add(
																																jButton5,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																																59,
																																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
																						.add(
																								jLabel2))
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED)
																		.add(
																				jScrollPane1,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				553,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
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
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 722,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Admin().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminLibraryUI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}