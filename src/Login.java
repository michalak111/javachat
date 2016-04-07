import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textIP;
	private JLabel lblIpAdress;
	private JTextField textPort;
	private JLabel lblPort;

	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,250);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setBounds(100, 42, 160, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(45, 45, 46, 14);
		contentPane.add(lblName);
		
		textIP = new JTextField();
		textIP.setColumns(10);
		textIP.setBounds(100, 82, 160, 20);
		contentPane.add(textIP);
		
		lblIpAdress = new JLabel("IP Adress:");
		lblIpAdress.setBounds(29, 85, 62, 14);
		contentPane.add(lblIpAdress);
		
		textPort = new JTextField();
		textPort.setColumns(10);
		textPort.setBounds(100, 119, 160, 20);
		contentPane.add(textPort);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(55, 122, 36, 14);
		contentPane.add(lblPort);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(102, 166, 89, 23);
		contentPane.add(btnLogIn);
	}

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
}
