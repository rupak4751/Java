package BookShop;

import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookShop extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookShop frame = new BookShop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	 Connection conn ;
	PreparedStatement ps =null;
	ResultSet rs =null;

	public static Connection ConnecrDb() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop", "root", "");
			System.out.println("Connected");
			// JOptionPane.showMessageDialog(null, "Connected");
			return conn;
		} catch (Exception e) {
			// JOptionPane.showMessageDialog(null, "Database Connection Failed");
			return null;
		}
	}
	
	
	
	
	
	
	public void table_load()
	{
	{
	try
    {
   ps = conn.prepareStatement("select * from newbook");
   rs = ps.executeQuery();
   table.setModel(DbUtils.resultSetToTableModel(rs));
}
    catch (SQLException e)
    {
    e.printStackTrace();
 }
   }
} 
	
	
	
	
	

	/**
	 * Create the frame.
	 */
	public BookShop() {
		ConnecrDb();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(27, 44, 269, 172);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 26, 73, 20);
		panel.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setBounds(93, 26, 155, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(93, 73, 155, 20);
		panel.add(tf2);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(10, 73, 73, 20);
		panel.add(lblQuantity);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(93, 121, 155, 20);
		panel.add(tf3);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrice.setBounds(10, 121, 73, 20);
		panel.add(lblPrice);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				String bname = tf1.getText();
				String bquan = tf2.getText();
				String bprice = tf3.getText();
				
				try {
					
					ps = conn.prepareStatement("insert into newbook(NAME,QUANTITY,PRICE)values(?,?,?)");
					ps.setString(1, bname);
					ps.setString(2, bquan);
					ps.setString(3, bprice);
					ps.executeUpdate();
					table_load();
					
					JOptionPane.showMessageDialog(null, "Record Addedddd");
					
					          
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					tf1.requestFocus();
					
				} catch (Exception e2) {
					// TODO: handle exception
					
					System.out.println(e2);
				}
				
			}
		});
			
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(27, 253, 101, 25);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(168, 253, 101, 25);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(287, 343, 89, 23);
		contentPane.add(btnExit);
		
		table = new JTable();
		
		table.setBounds(348, 11, 325, 225);
		contentPane.add(table);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(398, 253, 269, 101);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(93, 11, 155, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 11, 73, 20);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(20, 48, 101, 25);
		panel_1.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(147, 48, 101, 25);
		panel_1.add(btnDelete);
	}
}
