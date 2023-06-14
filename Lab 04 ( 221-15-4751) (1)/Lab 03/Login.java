package Log_In;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import Home_Page.copy.Hompage;
import Set_Pass.SetPass;
import Sign_Up.SignUp;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField fldPass;
	private JTextField txtUname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 30));
		lblNewLabel.setBounds(217, 11, 139, 75);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Log In", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(151, 97, 251, 196);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 38, 79, 28);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(10, 84, 66, 28);
		panel.add(lblNewLabel_1_2);
		
		txtUname = new JTextField();
		txtUname.setBounds(99, 44, 121, 20);
		panel.add(txtUname);
		txtUname.setColumns(10);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = fldPass.getText();
				String username = txtUname.getText();
				
				
				
				int g = password.compareTo("1234");
				int f= username.compareTo("rupok");
				
				if(g==0 && f==0)
				{
			     
					Hompage.main(null);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Login Error!", JOptionPane.ERROR_MESSAGE);
					fldPass.setText(null);
					txtUname.setText(null);
				}
			}
		});
		btnNewButton.setBounds(78, 139, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		fldPass = new JPasswordField();
		fldPass.setBounds(99, 90, 121, 20);
		panel.add(fldPass);
		
		JLabel lblNewLabel_2 = new JLabel("New User?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(179, 327, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				SignUp.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(267, 323, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
