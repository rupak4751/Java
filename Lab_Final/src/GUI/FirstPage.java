package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstPage extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter a number: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 67, 266, 20);
		contentPane.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(241, 67, 121, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String num = tf1.getText();
				int number = Integer.parseInt(num);
				
			     int a = number%2;
			     
		
				
				if(null == num)
				{
						JOptionPane.showConfirmDialog(null, "NUmber is Empty");
				}
				else if(a == 0)
				{
					JOptionPane.showConfirmDialog(null, "Number is Even");
				}
				else if (a==1)
				{
					Odd.main(null);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(139, 139, 123, 36);
		contentPane.add(btnNewButton);
	}
}
