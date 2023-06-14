package Lab_05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	
	Connection cn = null;

	public LoginPage() {
		cn= SqlConnection.Connector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log in to SHERPUR PBS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(64, 33, 297, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mobile");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(111, 92, 52, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mobile = tf1.getText();
				String password = pf1.getText();
				
				if(mobile.contains("789") && password.contains("1234") )
				{
					JOptionPane.showConfirmDialog(null, "Hurray");
				}
				else
				{
					JOptionPane.showConfirmDialog(null,"Wrong Mobile and Password", null, JOptionPane.ERROR_MESSAGE);
					
					tf1.setText(null);
					pf1.setText(null);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(186, 222, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(111, 156, 75, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnCreateAAcoount = new JButton("Forgot password?");
		btnCreateAAcoount.setBounds(213, 159, 126, 23);
		contentPane.add(btnCreateAAcoount);
		
		tf1 = new JTextField();
		tf1.setBounds(145, 126, 194, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		pf1 = new JPasswordField();
		pf1.setBounds(145, 191, 194, 20);
		contentPane.add(pf1);
		
		
	}
}
