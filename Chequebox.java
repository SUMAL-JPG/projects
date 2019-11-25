package sampleswing;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Chequebox {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chequebox window = new Chequebox();
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
	public Chequebox() {
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
		JLabel label = new JLabel("");
		label.setBounds(83, 189, 126, 29);
		frame.getContentPane().add(label);
		JCheckBox c1 = new JCheckBox("c++");
		c1.setBounds(94, 67, 97, 37);
		frame.getContentPane().add(c1);
		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("c++"+(e.getStateChange()==1?" checked":"unchecked"));
				
			}
			
		});
				
		
		JCheckBox c2 = new JCheckBox("java");
		c2.setBounds(94, 126, 97, 37);
		frame.getContentPane().add(c2);
		c2.addItemListener(new ItemListener()
				{
			public void itemStateChanged(ItemEvent e)
			{
				label.setText("java"+(e.getStateChange()==1?" checked":" unchecked"));
			}
				});
		
		
	}
}
