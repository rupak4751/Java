package Set_Pass;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Log_In.Login;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SetPass extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetPass frame = new SetPass();
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
	public SetPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Set Password", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(82, 47, 372, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 140, 25);
		panel.add(lblNewLabel);
		
		JLabel lblRetypePassword = new JLabel("Re-Type Password");
		lblRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRetypePassword.setBounds(10, 94, 164, 25);
		panel.add(lblRetypePassword);
		
		txt1 = new JTextField();
		txt1.setBounds(51, 47, 222, 20);
		panel.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(51, 130, 222, 20);
		panel.add(txt2);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pass1,pass2;
				
				pass1= txt1.getText();
				pass2= txt2.getText();
				
				
				int f = pass1.compareTo(pass2);
				if(f==0)
				{
					String passm = pass1;
				}
				
				else 
				{
					JOptionPane.showMessageDialog(null, "Passwords does not match", null, JOptionPane.ERROR_MESSAGE);
				}
				
				
				Login.main(null);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(209, 267, 115, 23);
		contentPane.add(btnNewButton);
	}

}
