package swingsample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class convrt {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					convrt window = new convrt();
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
	public convrt() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(253, 27, 100, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(253, 80, 100, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblInputCurrency = new JLabel("input currency");
		lblInputCurrency.setBounds(90, 27, 100, 20);
		frame.getContentPane().add(lblInputCurrency);
		
		JLabel lblOutPutCurrency = new JLabel("out put currency");
		lblOutPutCurrency.setBounds(90, 80, 100, 20);
		frame.getContentPane().add(lblOutPutCurrency);
	}
}
