/*
 * User.java
 *
 * Created on __DATE__, __TIME__
 */

package view;

/**
 *
 * @author  __USER__
 */
public class User extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3167894855862580203L;

	/** Creates new form User */
	public User() {
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
		jLabel2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/logo.png"))); // NOI18N

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/adminbutton3.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/myoder.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/exitlogo.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20));
		jLabel3.setText("\u7528\u6237");

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/librarylogo.png"))); // NOI18N

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/orderlogo.png"))); // NOI18N

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/bigui.png"))); // NOI18N

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/commentcenter.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/commentcenterlogo.png"))); // NOI18N

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
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED)
												.add(jLabel2,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														103,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED)
												.add(jLabel3)
												.addPreferredGap(
														org.jdesktop.layout.LayoutStyle.RELATED,
														525, Short.MAX_VALUE)
												.add(jButton3,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
														63,
														org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
										.add(jPanel1Layout
												.createSequentialGroup()
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.LEADING,
																false)
														.add(org.jdesktop.layout.GroupLayout.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				org.jdesktop.layout.LayoutStyle.RELATED,
																				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.add(jLabel4,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																				57,
																				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																		.add(33,
																				33,
																				33))
														.add(jPanel1Layout
																.createSequentialGroup()
																.add(120, 120,
																		120)
																.add(jPanel1Layout
																		.createParallelGroup(
																				org.jdesktop.layout.GroupLayout.TRAILING)
																		.add(jLabel6)
																		.add(jLabel5))
																.add(18, 18, 18)))
												.add(jPanel1Layout
														.createParallelGroup(
																org.jdesktop.layout.GroupLayout.TRAILING,
																false)
														.add(org.jdesktop.layout.GroupLayout.LEADING,
																jButton2,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																388,
																Short.MAX_VALUE)
														.add(org.jdesktop.layout.GroupLayout.LEADING,
																jButton1,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																387,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
														.add(org.jdesktop.layout.GroupLayout.LEADING,
																jButton4, 0, 0,
																Short.MAX_VALUE))
												.addContainerGap(151,
														Short.MAX_VALUE)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								org.jdesktop.layout.GroupLayout.LEADING)
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(jLabel1,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										643, Short.MAX_VALUE).addContainerGap())
						.add(jPanel1Layout
								.createSequentialGroup()
								.addContainerGap()
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.TRAILING)
										.add(org.jdesktop.layout.GroupLayout.LEADING,
												jPanel1Layout
														.createSequentialGroup()
														.add(jPanel1Layout
																.createParallelGroup(
																		org.jdesktop.layout.GroupLayout.LEADING)
																.add(jLabel2,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																		97,
																		org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
																.add(jPanel1Layout
																		.createSequentialGroup()
																		.add(39,
																				39,
																				39)
																		.add(jLabel3)))
														.add(98, 98, 98)
														.add(jLabel4,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
																63,
																org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
										.add(jButton1,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												51,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(37, 37, 37)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.TRAILING)
										.add(jLabel5,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												65,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jButton2,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												49,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(52, 52, 52)
								.add(jPanel1Layout
										.createParallelGroup(
												org.jdesktop.layout.GroupLayout.LEADING)
										.add(jButton4,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												49,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jLabel6)).add(168, 168, 168))
						.add(jPanel1Layout
								.createSequentialGroup()
								.add(30, 30, 30)
								.add(jButton3,
										org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
										58, Short.MAX_VALUE).add(569, 569, 569)));

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				org.jdesktop.layout.GroupLayout.LEADING).add(jPanel1,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 635,
				org.jdesktop.layout.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new CommentCenter().setVisible(true);
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new UserLibraryUI().setVisible(true);
		this.dispose();
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		new Login().setVisible(true);
		this.dispose();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new MyorderUI().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new User().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;

	// End of variables declaration//GEN-END:variables

	public void Register(String a, String b, String c) {
		// TODO Auto-generated method stub

	}

}