package sample.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BMI {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 452, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 11, 414, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBodyMassIntex = new JLabel("BODY MASS INTEX");
		lblBodyMassIntex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBodyMassIntex.setBounds(126, 11, 229, 39);
		panel.add(lblBodyMassIntex);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(10, 75, 414, 213);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Height(m)");
		lblNewLabel.setBounds(67, 14, 72, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("weight(Kg)");
		lblNewLabel_1.setBounds(67, 60, 59, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BMI");
		lblNewLabel_2.setBounds(80, 100, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		tf1 = new JTextField();
		tf1.setBounds(161, 11, 86, 20);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(161, 57, 86, 20);
		panel_1.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(161, 97, 86, 20);
		panel_1.add(tf3);
		tf3.setColumns(10);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(271, 100, 89, 14);
		panel_1.add(l1);
		
		JButton btnNewButton = new JButton("calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=tf1.getText();
				float h=Float.parseFloat(a);
				String b=tf2.getText();
				float w=Float.parseFloat(b);
				float c=w/(h*h);
				String str=String.valueOf(c);
                tf3.setText(str);
                if(c<18.5f)
                {
                l1.setText("under weight");	
                }

                else if(c>=18.5f&& c<=24.9f)
                {
                l1.setText("normal weight");	
                }
				
                else if(c>=25f&&c<=29.9f)
                {
                l1.setText("over weight");	
                }
                else
                {
                	l1.setText("obese");
                }
			}
		});
		btnNewButton.setBounds(21, 145, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
			}
		});
		btnNewButton_1.setBounds(144, 145, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(271, 145, 89, 23);
		panel_1.add(btnNewButton_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Under Weight", "Normal weight", "Over weight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(22, 414, 414, 32);
		frame.getContentPane().add(table);
	}
}
