package sumal; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;

public class Hotel {


String Str1,Str2,str4,str5,str6,str7;
float finaltotal;
int f=0;
private JFrame frame;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
private JTextField textField_8;
private JTextField textField_9;
private JTextField textField_10;
private JTextField textField_11;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Hotel window = new Hotel();
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
public Hotel() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.getContentPane().setBackground(SystemColor.activeCaption);
frame.setBounds(100, 100, 1077, 645);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel.setBounds(27, 92, 484, 278);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblChickenBurgger = new JLabel("Chicken Burger");
lblChickenBurgger.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblChickenBurgger.setBounds(64, 11, 118, 21);
panel.add(lblChickenBurgger);

JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
lblChickenBurgerMeal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblChickenBurgerMeal.setBounds(64, 43, 143, 21);
panel.add(lblChickenBurgerMeal);

JLabel lblChiBurger = new JLabel("Cheese Burger");
lblChiBurger.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblChiBurger.setBounds(64, 75, 106, 21);
panel.add(lblChiBurger);

JSeparator separator = new JSeparator();
separator.setBounds(10, 124, 439, 9);
panel.add(separator);

JLabel lblDrink = new JLabel("Drink");
lblDrink.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblDrink.setBounds(38, 133, 72, 21);
panel.add(lblDrink);

JLabel lblQuantity = new JLabel("Quantity");
lblQuantity.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblQuantity.setBounds(187, 133, 72, 21);
panel.add(lblQuantity);

textField = new JTextField();
textField.setBounds(217, 11, 127, 20);
panel.add(textField);
textField.setColumns(10);

textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(217, 43, 127, 20);
panel.add(textField_1);

textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(217, 75, 127, 20);
panel.add(textField_2);

textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(172, 165, 86, 20);
panel.add(textField_3);

JComboBox comboBox = new JComboBox();
comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
comboBox.setModel(new DefaultComboBoxModel(new String[] {"<-Select Drink->", "Tea", "Coffe", "Juice"}));
comboBox.setBounds(10, 165, 109, 20);
panel.add(comboBox);

JRadioButton rdbtnNewRadioButton = new JRadioButton("Home Delivary");
rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
rdbtnNewRadioButton.setBounds(10, 192, 109, 23);
panel.add(rdbtnNewRadioButton);

JRadioButton rdbtnTax = new JRadioButton("Tax");
rdbtnTax.setFont(new Font("Times New Roman", Font.PLAIN, 14));
rdbtnTax.setBounds(186, 192, 109, 23);
panel.add(rdbtnTax);

JPanel panel_1 = new JPanel();
panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_1.setBounds(27, 381, 484, 116);
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblCostOfDrinks = new JLabel("Cost of drinks");
lblCostOfDrinks.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblCostOfDrinks.setBounds(10, 11, 107, 21);
panel_1.add(lblCostOfDrinks);

JLabel lblCostOfMeal = new JLabel("Cost of meal");
lblCostOfMeal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblCostOfMeal.setBounds(10, 43, 107, 21);
panel_1.add(lblCostOfMeal);

JLabel lblCostOfDelivary = new JLabel("Cost of delivary");
lblCostOfDelivary.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblCostOfDelivary.setBounds(10, 75, 107, 21);
panel_1.add(lblCostOfDelivary);

textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(150, 11, 86, 20);
panel_1.add(textField_4);

textField_5 = new JTextField();
textField_5.setColumns(10);
textField_5.setBounds(150, 43, 86, 20);
panel_1.add(textField_5);

textField_6 = new JTextField();
textField_6.setColumns(10);
textField_6.setBounds(150, 75, 86, 20);
panel_1.add(textField_6);

JPanel panel_2 = new JPanel();
panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_2.setBounds(514, 92, 245, 278);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

JLabel lblCurrencyConverter = new JLabel("Currency converter");
lblCurrencyConverter.setBounds(10, 11, 225, 43);
panel_2.add(lblCurrencyConverter);
lblCurrencyConverter.setHorizontalAlignment(SwingConstants.CENTER);
lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 22));

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Indian Rupee", "Us Dollar", "British Pound"}));
comboBox_1.setBounds(47, 80, 146, 26);
panel_2.add(comboBox_1);

textField_7 = new JTextField();
textField_7.setColumns(10);
textField_7.setBounds(10, 137, 225, 26);
panel_2.add(textField_7);

JButton btnConvert = new JButton("Convert");
btnConvert.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnConvert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
if(comboBox_1.getSelectedIndex()==0)
{
String a=textField_7.getText();

textField_7.setText("INR"+a);
}
else if(comboBox_1.getSelectedIndex()==1)
{
String a=textField_11.getText();
Float num=Float.valueOf(a);
double n2=num/71.82;
String b=String.valueOf(n2);
textField_7.setText("US$"+b);
}
else if(comboBox_1.getSelectedIndex()==2)
{
String a=textField_11.getText();
Float num=Float.valueOf(a);
double n2=num/48.8017;
String b=String.valueOf(n2);
textField_7.setText("AS$"+b);
}
else
{
String a=textField_11.getText();
Float num=Float.valueOf(a);
double n2=num/92.8058;
String b=String.valueOf(n2);
textField_7.setText("BP"+b);
}
}
});


btnConvert.setBounds(47, 188, 119, 23);
panel_2.add(btnConvert);

JButton btnClose = new JButton("Close");
btnClose.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnClose.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
textField_7.setText(" ");
}
});
btnClose.setBounds(47, 244, 119, 23);
panel_2.add(btnClose);

JPanel panel_3 = new JPanel();
panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_3.setBounds(514, 381, 245, 116);
frame.getContentPane().add(panel_3);
panel_3.setLayout(null);

JLabel lblTax = new JLabel("Tax");
lblTax.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblTax.setBounds(10, 11, 72, 21);
panel_3.add(lblTax);

JLabel lblSubTotal = new JLabel("Sub total");
lblSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblSubTotal.setBounds(10, 43, 72, 21);
panel_3.add(lblSubTotal);

JLabel lblTotal = new JLabel("Total");
lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
lblTotal.setBounds(10, 80, 72, 21);
panel_3.add(lblTotal);

textField_9 = new JTextField();
textField_9.setColumns(10);
textField_9.setBounds(105, 11, 86, 20);
panel_3.add(textField_9);

textField_10 = new JTextField();
textField_10.setColumns(10);
textField_10.setBounds(105, 43, 86, 20);
panel_3.add(textField_10);

textField_11 = new JTextField();
textField_11.setColumns(10);
textField_11.setBounds(105, 80, 86, 20);
panel_3.add(textField_11);

JPanel panel_4 = new JPanel();
panel_4.setBackground(SystemColor.textHighlight);
panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
panel_4.setBounds(761, 92, 290, 405);
frame.getContentPane().add(panel_4);
panel_4.setLayout(null);

JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
tabbedPane.setBounds(20, 46, 260, 281);
panel_4.add(tabbedPane);

JLayeredPane layeredPane = new JLayeredPane();
layeredPane.setBackground(SystemColor.activeCaption);
tabbedPane.addTab("Calculator", null, layeredPane, null);
layeredPane.setLayout(null);

JButton b0 = new JButton("0");
b0.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textField_8.setText(textField_8.getText().concat(b0.getText()));

	}
});
b0.setBounds(10, 206, 43, 23);
layeredPane.add(b0);

JButton button = new JButton(".");
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textField_8.setText(textField_8.getText().concat(button.getText()));

	}
});
button.setBounds(63, 206, 43, 23);
layeredPane.add(button);

JButton button_1 = new JButton("New button");
button_1.setBounds(127, 206, 43, 23);
layeredPane.add(button_1);

JButton button_2 = new JButton("=");
button_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
float res1,res;
float res2=Float.parseFloat(textField_8.getText());
f=1;
if(Str2.equals("+"))
{
res1=Float.parseFloat(Str1);
res=res1+res2;
String str=String.valueOf(res);
textField_8.setText(str);

}
else if(Str2.equals("-"))
{
res1=Float.parseFloat(Str1);
res=res1-res2;
String str=String.valueOf(res);
textField_8.setText(str);

}
else if(Str2.equals("*"))
{
res1=Float.parseFloat(Str1);
res=res1*res2;
String str=String.valueOf(res);
textField_8.setText(str);

}
else if(Str2.equals("/"))
{
res1=Float.parseFloat(Str1);
res=res1/res2;
String str=String.valueOf(res);
textField_8.setText(str);

}
else
{

}
}
});
button_2.setBounds(180, 206, 43, 23);
layeredPane.add(button_2);

JButton button_3 = new JButton("1");
button_3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_3.getText()));
}
});
button_3.setBounds(10, 172, 43, 23);
layeredPane.add(button_3);

JButton button_4 = new JButton("4");
button_4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_4.getText()));
}
});
button_4.setBounds(10, 138, 43, 23);
layeredPane.add(button_4);

JButton button_5 = new JButton("7");
button_5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_5.getText()));
}
});



button_5.setBounds(10, 104, 43, 23);
layeredPane.add(button_5);

JButton btnB = new JButton("B");
btnB.setBounds(10, 70, 43, 23);
layeredPane.add(btnB);

JButton btnC = new JButton("C");
btnC.setBounds(63, 70, 43, 23);
layeredPane.add(btnC);

JButton button_8 = new JButton("8");
button_8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_8.getText()));
}
});
button_8.setBounds(63, 104, 43, 23);
layeredPane.add(button_8);

JButton button_9 = new JButton("5");
button_9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_9.getText()));
}
});
button_9.setBounds(63, 138, 43, 23);
layeredPane.add(button_9);

JButton button_10 = new JButton("2");
button_10.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_10.getText()));
}
});
button_10.setBounds(63, 172, 43, 23);
layeredPane.add(button_10);

JButton button_11 = new JButton("3");
button_11.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_11.getText()));

}
});
button_11.setBounds(127, 172, 43, 23);
layeredPane.add(button_11);

JButton button_12 = new JButton("6");
button_12.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_12.getText()));
}
});
button_12.setBounds(127, 138, 43, 23);
layeredPane.add(button_12);

JButton button_13 = new JButton("9");
button_13.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(f==1)
{
textField_8.setText("");
f=0;
}
textField_8.setText(textField_8.getText().concat(button_5.getText()));
}
});
button_13.setBounds(127, 104, 43, 23);
layeredPane.add(button_13);

JButton button_14 = new JButton("New button");
button_14.setBounds(127, 70, 43, 23);
layeredPane.add(button_14);

JButton button_15 = new JButton("/");
button_15.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=textField_8.getText();
textField_8.setText("");
Str2=button_15.getText();
}
});
button_15.setBounds(180, 172, 43, 23);
layeredPane.add(button_15);

JButton button_16 = new JButton("*");
button_16.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=textField_8.getText();
textField_8.setText("");
Str2=button_16.getText();

}
});
button_16.setBounds(180, 138, 43, 23);
layeredPane.add(button_16);

JButton button_17 = new JButton("-");
button_17.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=textField_8.getText();
textField_8.setText("");
Str2=button_17.getText();
}
});
button_17.setBounds(180, 104, 43, 23);
layeredPane.add(button_17);

JButton button_18 = new JButton("+");
button_18.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
Str1=textField_8.getText();
textField_8.setText("");
Str2=button_18.getText();
}
});
button_18.setBounds(180, 70, 43, 23);
layeredPane.add(button_18);

textField_8 = new JTextField();
textField_8.setColumns(10);
textField_8.setBounds(10, 11, 213, 48);
layeredPane.add(textField_8);
JPanel panel_7 = new JPanel();
tabbedPane.addTab("Reciept", null, panel_7, null);
panel_7.setLayout(null);
JTextArea textArea = new JTextArea();
textArea.setBounds(10, 11, 235, 231);
panel_7.add(textArea);

JPanel panel_5 = new JPanel();
panel_5.setBounds(30, 522, 1021, 65);
frame.getContentPane().add(panel_5);
panel_5.setLayout(null);

JButton btnNewButton = new JButton("Total");
btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnNewButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
float total=0;

//Text box empty or not

if(!textField.getText().equals(""))
{
  int bur=Integer.parseInt(textField.getText());
  str4=String.valueOf(50*bur);
  total=total+(50*bur);
}
if(!textField_1.getText().equals(""))
{
  int meal=Integer.parseInt(textField_1.getText());
  str5=String.valueOf(60*meal);
  total=total+(60*meal);
}
if(!textField_2.getText().equals(""))
{
  int chees=Integer.parseInt(textField_2.getText());
  str6=String.valueOf(40*chees);
  total=total+(40*chees);
}
textField_5.setText(String.valueOf(total));

//combo box selection

int q;
float totaldri=0f;
if(!textField_3.getText().equals(""))
{
if(comboBox.getSelectedIndex()==1)
{
 q=Integer.parseInt(textField_3.getText());
 str7=String.valueOf(10*q);
 totaldri=10*q;
}
else if(comboBox.getSelectedIndex()==2)
{
q=Integer.parseInt(textField_3.getText());
totaldri=15*q;
}
else if(comboBox.getSelectedIndex()==3)
{
q=Integer.parseInt(textField_3.getText());
totaldri=20*q;
}
}
textField_4.setText(String.valueOf(totaldri));

//Home delivery

float h=0f;
if(rdbtnNewRadioButton.isSelected())
{
h=25f;
textField_6.setText("25");
}

//tax total
float subtotal=total+totaldri+h;
float tax=0f;
if(rdbtnTax.isSelected())
{
tax=subtotal*10/100;

}
textField_9.setText(String.valueOf(tax));
textField_10.setText(String.valueOf(subtotal));
float finaltotal=total+tax;
textField_11.setText(String.valueOf(finaltotal));
textField_7.setText(textField_11.getText());

}
});
btnNewButton.setBounds(80, 11, 89, 43);
panel_5.add(btnNewButton);

JButton btnReceive = new JButton("Reciept");
btnReceive.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnReceive.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
textArea.append("Item \t Qty \t Sub Total\n"
+lblChickenBurgger.getText()+"\t "+textField.getText()+"\t "+str4+ "\n"
+"BurgerMeal"+"\t "+textField_1.getText()+"\t "+str5+ "\n"
+lblChiBurger.getText()+"\t "+textField_2.getText()+"\t "+str6+ "\n"
+(String)comboBox.getSelectedItem()+"\t "+textField_3.getText()+"\t "+str6+ "\n"
+ "======================================\n"
+" "+"\t "+" Delivery"+"\t "+textField_6.getText()+ "\n"
+" "+"\t "+" Tax"+"\t "+textField_9.getText()+ "\n"
+" "+"\t "+"Total "+"\t "+String.valueOf(finaltotal)+ "\n"


);
}
});
btnReceive.setBounds(277, 11, 89, 43);
panel_5.add(btnReceive);

JButton btnReset = new JButton("Reset");
btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {

textField.setText("");
textField_1.setText("");
textField_2.setText("");
textField_3.setText("");
textField_4.setText("");
textField_5.setText("");
textField_6.setText("");
textField_7.setText("");
textField_8.setText("");
textField_9.setText("");
textField_10.setText("");
textField_11.setText("");

textArea.setText("");
str4="";str5="";str6="";str7="";
}
});
btnReset.setBounds(601, 11, 89, 43);
panel_5.add(btnReset);

JButton btnExit = new JButton("Exit");
btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 14));
btnExit.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
frame =new JFrame("Exit");
if(JOptionPane.showConfirmDialog(frame,"Comfirm","Ticket Booking",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
System.exit(0);

}
}
});
btnExit.setBounds(823, 11, 89, 43);
panel_5.add(btnExit);

JPanel panel_6 = new JPanel();
panel_6.setBackground(new Color(0, 0, 51));
panel_6.setBounds(30, 11, 1021, 65);
frame.getContentPane().add(panel_6);
panel_6.setLayout(null);

JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
lblHotelManagementSystem.setBackground(new Color(0, 0, 51));
lblHotelManagementSystem.setForeground(new Color(255, 255, 255));
lblHotelManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 22));
lblHotelManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
lblHotelManagementSystem.setBounds(0, 11, 1021, 54);
panel_6.add(lblHotelManagementSystem);

}
}

