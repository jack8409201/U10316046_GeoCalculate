import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GeoCalculate extends JFrame implements ActionListener{
	
	//Declare global variables 
	private JPanel circlePanel = new JPanel();
	private JPanel squarePanel = new JPanel();
	private JPanel rectanglePanel = new JPanel();
	private JLabel jlbCircle = new JLabel("Circle : ");
	private JLabel jlbSquare = new JLabel("Square : ");
	private JLabel jlbRectangle = new JLabel("Rectangle : ");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JPanel p4 = new JPanel();
	private JPanel p5 = new JPanel();
	private JPanel p6 = new JPanel();
	private JPanel p7 = new JPanel();
	private JPanel p8 = new JPanel();
	private JPanel p9 = new JPanel();
	private JTextField jtfRadius = new JTextField();
	private JTextField jtfSide = new JTextField();
	private JTextField jtfLength = new JTextField();
	private JTextField jtfWidth = new JTextField();
	private JTextArea jtaArea1 = new JTextArea();
	private JTextArea jtaArea2 = new JTextArea();
	private JTextArea jtaArea3 = new JTextArea();
	private JTextArea jtaPerimeter1 = new JTextArea();
	private JTextArea jtaPerimeter2 = new JTextArea();
	private JTextArea jtaPerimeter3 = new JTextArea();
	private JButton jbtCalculate1 = new JButton("Calculate");
	private JButton jbtCalculate2 = new JButton("Calculate");
	private JButton jbtCalculate3 = new JButton("Calculate");
	private JButton jbtClean1 = new JButton("Clean");
	private JButton jbtClean2 = new JButton("Clean");
	private JButton jbtClean3 = new JButton("Clean");
	
	//Constructor 
	public GeoCalculate(){
		//Circle panel
		setLayout(new BorderLayout(10,10));
		circlePanel.setLayout(new BorderLayout(10,10));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(jlbCircle);
		//The font and size of the Circle label 
		jlbCircle.setFont(new Font("TimesRoman",Font.BOLD,15));
		circlePanel.add(p1,BorderLayout.NORTH);
		p2.setLayout(new GridLayout(3,2,5,5));
		p2.add(new JLabel("Radius : "));
		p2.add(jtfRadius);
		p2.add(new JLabel("The area is : "));
		p2.add(jtaArea1);
		//JTextArea can not edit
		jtaArea1.setEditable(false);
		jtaArea1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); 
		p2.add(new JLabel("The perimeter is : "));
		p2.add(jtaPerimeter1);
		jtaPerimeter1.setEditable(false);
		jtaPerimeter1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		circlePanel.add(p2,BorderLayout.CENTER);
		p3.setLayout(new GridLayout(2,1,10,10));
		p3.add(jbtCalculate1);
		p3.add(jbtClean1);
		circlePanel.add(p3,BorderLayout.EAST);
		add(circlePanel,BorderLayout.NORTH);
		circlePanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
	
		//Square panel
		squarePanel.setLayout(new BorderLayout(10,10));
		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		p4.add(jlbSquare);
		//The font and size of the Square label 
		jlbSquare.setFont(new Font("TimesRoman",Font.BOLD,15));
		squarePanel.add(p4,BorderLayout.NORTH);
		p5.setLayout(new GridLayout(3,2,5,5));
		p5.add(new JLabel("Side : "));
		p5.add(jtfSide);
		p5.add(new JLabel("The area is : "));
		p5.add(jtaArea2);
		//JTextArea can not edit
		jtaArea2.setEditable(false);
		jtaArea2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); 
		p5.add(new JLabel("The perimeter is : "));
		p5.add(jtaPerimeter2);
		jtaPerimeter2.setEditable(false);
		jtaPerimeter2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		squarePanel.add(p5,BorderLayout.CENTER);
		p6.setLayout(new GridLayout(2,1,10,10));
		p6.add(jbtCalculate2);
		p6.add(jbtClean2);
		squarePanel.add(p6,BorderLayout.EAST);
		add(squarePanel,BorderLayout.CENTER);
		squarePanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
		//Rectangle panel
		rectanglePanel.setLayout(new BorderLayout(10,10));
		p7.setLayout(new FlowLayout(FlowLayout.LEFT));
		p7.add(jlbRectangle);
		//The font and size of the Rectangle label 
		jlbRectangle.setFont(new Font("TimesRoman",Font.BOLD,15));
		rectanglePanel.add(p7,BorderLayout.NORTH);
		p8.setLayout(new GridLayout(4,2,5,5));
		p8.add(new JLabel("Length : "));
		p8.add(jtfLength);
		p8.add(new JLabel("Width : "));
		p8.add(jtfWidth);
		p8.add(new JLabel("The area is : "));
		p8.add(jtaArea3);
		//JTextArea can not edit
		jtaArea3.setEditable(false);
		jtaArea3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY)); 
		p8.add(new JLabel("The perimeter is : "));
		p8.add(jtaPerimeter3);
		jtaPerimeter3.setEditable(false);
		jtaPerimeter3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		rectanglePanel.add(p8,BorderLayout.CENTER);
		p9.setLayout(new GridLayout(2,1,30,30));
		p9.add(jbtCalculate3);
		p9.add(jbtClean3);
		rectanglePanel.add(p9,BorderLayout.EAST);
		add(rectanglePanel,BorderLayout.SOUTH);
		rectanglePanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
		jbtCalculate1.addActionListener(this);
		jbtClean1.addActionListener(this);
		jbtCalculate2.addActionListener(this);
		jbtClean2.addActionListener(this);
		jbtCalculate3.addActionListener(this);
		jbtClean3.addActionListener(this);
	}
	
	@Override //Implement actionPerformed
	public void actionPerformed(ActionEvent e) {
		try{
		
			//Calculate circle area and perimeter
			if(e.getSource() == jbtCalculate1){
				double Radius = Double.parseDouble(jtfRadius.getText());
				Circle circle = new Circle(Radius);
			
				jtaArea1.setText(String.format("%.8f", circle.getArea()));
				jtaPerimeter1.setText(String.format("%.8f", circle.getPerimeter()));
			}
			//Clean circle
			else if(e.getSource() == jbtClean1){
				jtfRadius.setText("");
				jtaArea1.setText("");
				jtaPerimeter1.setText("");
			}
			//Calculate square area and perimeter
			else if(e.getSource() == jbtCalculate2){
				double Side = Double.parseDouble(jtfSide.getText());
				Square square = new Square(Side);
			
				jtaArea2.setText(String.format("%.8f", square.getArea()));
				jtaPerimeter2.setText(String.format("%.8f", square.getPerimeter()));
			}
			//Clean square
			else if(e.getSource() == jbtClean2){
				jtfSide.setText("");
				jtaArea2.setText("");
				jtaPerimeter2.setText("");
			}
			//Calculate rectangle area and perimeter
			else if(e.getSource() == jbtCalculate3){
				double length = Double.parseDouble(jtfLength.getText());
				double width = Double.parseDouble(jtfWidth.getText());
				Rectangle rectangle = new Rectangle(length,width);
			
				jtaArea3.setText(String.format("%.8f", rectangle.getArea()));
				jtaPerimeter3.setText(String.format("%.8f", rectangle.getPerimeter()));
			}
			//Clean rectangle
			else if(e.getSource() == jbtClean3){
				jtfLength.setText("");
				jtfWidth.setText("");
				jtaArea3.setText("");
				jtaPerimeter3.setText("");
			}
		}
		catch(RuntimeException q){
			JOptionPane.showMessageDialog(null,"格式錯囉~白癡!!","WARNING",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	//Main method
	public static void main(String[] args) {
		JFrame frame = new GeoCalculate();
		frame.setTitle("U10316046_GeoCalculate");
		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
