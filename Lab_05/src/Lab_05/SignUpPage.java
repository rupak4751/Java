package Lab_05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JButton btnNext;
	private JLabel lblPassword;
	private JPasswordField pf1;
	private JPasswordField pf2;
	private JLabel lblRetypePassword;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 28, 44, 14);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(107, 28, 141, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(107, 71, 141, 20);
		contentPane.add(tf2);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(28, 71, 44, 14);
		contentPane.add(lblMobile);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdress.setBounds(28, 115, 44, 14);
		contentPane.add(lblAdress);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(107, 115, 141, 20);
		contentPane.add(tf3);
		
		JLabel lblMeterNo = new JLabel("Meter no.");
		lblMeterNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMeterNo.setBounds(28, 157, 62, 14);
		contentPane.add(lblMeterNo);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(107, 156, 141, 20);
		contentPane.add(tf4);
		
		JLabel lblMeterType = new JLabel("Meter Type");
		lblMeterType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMeterType.setBounds(28, 201, 69, 19);
		contentPane.add(lblMeterType);
		
		tf5 = new JTextField();
		tf5.setColumns(10);
		tf5.setBounds(107, 200, 141, 20);
		contentPane.add(tf5);
		
		btnNext = new JButton("Sign UP");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pass = pf1.getText();
				String repass = pf2.getText();
				
				String name = tf1.getText();
				String mobile = tf2.getText();
				String adress = tf3.getText();
				String meterno = tf4.getText();
				String meterty = tf5.getText();
				
				int a = pass.compareTo(repass);
				
				if(a==0)
				{
				  LoginPage.main(null);
				  System.out.println("User Data");
				  System.out.println(" ");
				  System.out.println(name);
				  System.out.println(mobile);
				  System.out.println(adress);
				  System.out.println(meterno);
				  System.out.println(meterty);
				  System.out.println(pf2);
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Passwords Does not Match!", null, JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBounds(312, 153, 89, 23);
		contentPane.add(btnNext);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(296, 28, 116, 14);
		contentPane.add(lblPassword);
		
		pf1 = new JPasswordField();
		pf1.setBounds(296, 53, 128, 20);
		contentPane.add(pf1);
		
		pf2 = new JPasswordField();
		pf2.setBounds(296, 109, 128, 20);
		contentPane.add(pf2);
		
		lblRetypePassword = new JLabel("Re-type Password");
		lblRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRetypePassword.setBounds(296, 84, 116, 20);
		contentPane.add(lblRetypePassword);
		
		btnReset = new JButton("Main");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstPage.main(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(312, 201, 89, 23);
		contentPane.add(btnReset);
	}

}
