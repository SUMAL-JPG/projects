import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class celsius {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celsius window = new celsius();
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
	public celsius() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 499, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("degrees");
		lblDegrees.setBounds(85, 131, 64, 14);
		frame.getContentPane().add(lblDegrees);
		
		
		
		
		textField = new JTextField();
		textField.setBounds(169, 128, 99, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel label = new JLabel("");
		label.setBounds(116, 188, 99, 14);
		frame.getContentPane().add(label);
		JButton btnToCelcius = new JButton("To celcius");
		btnToCelcius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=textField.getText();
	               float number=Float.valueOf(a);
	               float c=(number-32)*5/9;
	               String b=String.valueOf(c);
	               label.setText("Result="+b);
	
				
			}
		});
		btnToCelcius.setBounds(56, 231, 93, 23);
		frame.getContentPane().add(btnToCelcius);
		
		JButton btnToFahrenheit = new JButton("To fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=textField.getText();
	               float number=Float.valueOf(a);
	               float c=(number*1.8f)+32;
	               String b=String.valueOf(c);
	               label.setText("Result="+b);
	 
			}
		});
		btnToFahrenheit.setBounds(169, 231, 117, 23);
		frame.getContentPane().add(btnToFahrenheit);
		
	}

}
