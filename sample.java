import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class sample {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(26, 24, 73, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(26, 65, 73, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(103, 21, 109, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel label = new JLabel("");
		label.setBounds(103, 176, 89, 14);
		frame.getContentPane().add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 62, 102, 20);
		frame.getContentPane().add(passwordField);
		
		
		JButton btnClickHere = new JButton("click here");
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {label.setText("success");
			String str=""+new String(passwordField.getPassword());
			if(textField.getText().equals("sumal")&&str.equals("123"))
				label.setText("success");
			else
				label.setText("oops");
			}
			
		});
		btnClickHere.setBounds(103, 112, 89, 23);
		frame.getContentPane().add(btnClickHere);
		
		
		
		
	}
}
