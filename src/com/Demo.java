package com;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;


/**
 * @author liang
 * @date 2012/4/13
 * @version 1.0
 * @describe ʹ��substance����Java Swing����
 * 
 * */
public class Demo extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jButton1;
	private JMenuItem jMenuItem2;
	private JMenu jMenu2;
	private JMenuItem jMenuItem1;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JButton jButton7;
	private JButton jButton6;
	private JButton jButton5;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
		//����Ƥ��
		/**********************************************/
		JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        Skins.setThemeOfficeSilver2007();
        /**********************************************/
        
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Demo inst = new Demo();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Demo() {
		super();
		initGUI();
		setResizable(false);
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("SubstanceDemo");
			this.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("picture/favicon.png")).getImage());
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("��  ��");
					{
						jMenuItem1 = new JMenuItem();
						jMenu1.add(jMenuItem1);
						jMenuItem1.setText("�� ��    (Exit)");
						jMenuItem1.addActionListener(new ActionListener(){
							public void actionPerformed(java.awt.event.ActionEvent evt){
								System.exit(0);
							}
						});
					}
				}
				{
					jMenu2 = new JMenu();
					jMenuBar1.add(jMenu2);
					jMenu2.setText("��  �� ");
					{
						jMenuItem2 = new JMenuItem();
						jMenu2.add(jMenuItem2);
						jMenuItem2.setText("��  ��    (About)");
						jMenuItem2.addActionListener(new ActionListener(){
							public void actionPerformed(java.awt.event.ActionEvent evt){
								new About(Demo.this,"����",true);
							}
						});
					}
				}
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("����һ");
				jButton1.setBounds(12, 505, 96, 25);
				jButton1.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeOfficeBlue2007();
					}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("�����");
				jButton2.setBounds(119, 505, 96, 25);
				jButton2.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeBusiness();
					}
				});
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("������");
				jButton3.setBounds(226, 507, 96, 25);
				jButton3.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeBusinessBlackSteel();
					}
				});
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("������");
				jButton4.setBounds(333, 507, 96, 25);
				jButton4.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeCreme();
					}
				});
			}
			{
				jButton5 = new JButton();
				getContentPane().add(jButton5);
				jButton5.setText("������");
				jButton5.setBounds(440, 507, 96, 25);
				jButton5.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeEmeraldDusk();
					}
				});
			}
			{
				jButton6 = new JButton();
				getContentPane().add(jButton6);
				jButton6.setText("������");
				jButton6.setBounds(547, 507, 96, 25);
				jButton6.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeSahara();
					}
				});
			}
			{
				jButton7 = new JButton();
				getContentPane().add(jButton7);
				jButton7.setText("������");
				jButton7.setBounds(654, 507, 96, 25);
				jButton7.addActionListener(new ActionListener(){
					public void actionPerformed(java.awt.event.ActionEvent evt){
						Skins.setThemeRaven();
					}
				});
			}
			pack();
			setSize(800, 600);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
