package com;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

/**
 * @author liang
 * @date 2012/4/13
 * @version 1.0
 * @describe ���ڳ���
 * 
 * */

public class About extends javax.swing.JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel3;
	private JTextPane jTextPane1;
	private JLabel jLabel6;
	private JLabel jLabel2;

	/**
	* Auto-generated main method to display this JDialog
	*/
	
	public About(JFrame frame, String s, Boolean bool) {
		super(frame, s, bool);
		initGUI();
		this.setVisible(true);
		this.setResizable(false);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				getContentPane().setLayout(null);
				{
					jLabel1 = new JLabel();
					getContentPane().add(jLabel1);
					jLabel1.setBounds(-20, 58, 162, 151);
					jLabel1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("picture/favicon.png")));
					jLabel1.setDisabledIcon(new ImageIcon(getClass().getClassLoader().getResource("picture/favicon.png")));
				}
				{
					jLabel2 = new JLabel();
					getContentPane().add(jLabel2);
					jLabel2.setText("��������");
					jLabel2.setBounds(148, 12, 103, 23);
					jLabel2.setFont(new java.awt.Font("����",0,12));
				}
				{
					jLabel4 = new JLabel();
					getContentPane().add(jLabel4);
					jLabel4.setText("����:liang");
					jLabel4.setBounds(148, 180, 228, 24);
					jLabel4.setFont(new java.awt.Font("����",0,12));
				}
				{
					jLabel5 = new JLabel();
					getContentPane().add(jLabel5);
					jLabel5.setText("��ҳ:http://comflag.com");
					jLabel5.setBounds(148, 152, 228, 25);
					jLabel5.setFont(new java.awt.Font("����",0,12));
				}
				{
					jLabel6 = new JLabel();
					getContentPane().add(jLabel6);
					jLabel6.setText("ʱ��:2012/4/13");
					jLabel6.setBounds(148, 233, 143, 23);
					jLabel6.setFont(new java.awt.Font("����",0,12));
				}
				{
					jTextPane1 = new JTextPane();
					getContentPane().add(jTextPane1);
					jTextPane1.setText("̽��ʹ��Substance����Java Swing���棬�ó����ṩ11������Ƥ����ʹ���߿�����Skins.java���ҵ����ǡ�");
					jTextPane1.setBounds(148, 47, 228, 93);
					jTextPane1.setEditable(false);
				}
				{
					jLabel3 = new JLabel();
					getContentPane().add(jLabel3);
					jLabel3.setText("����:zhangliang605@gmail.com");
					jLabel3.setBounds(148, 209, 228, 21);
				}
			}
			this.setSize(400, 300);
			setLocationRelativeTo(null);
			this.setTitle("����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
