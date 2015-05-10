import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GeoCalculate extends JFrame implements ActionListener{
	private JPanel circlePanel = new JPanel();
	private JLabel jlbCircle = new JLabel("Circle : ");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JTextField jtfRadius = new JTextField();
	private JTextArea jtaArea1 = new JTextArea();
	private JTextArea jtaPerimeter1 = new JTextArea();
	private JButton jbtCalculate1 = new JButton("Calculate");
	private JButton jbtClean1 = new JButton("Clean");
	
	public GeoCalculate(){
		setLayout(new BorderLayout(10,10));
		circlePanel.setLayout(new BorderLayout(10,10));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(jlbCircle);
		jlbCircle.setFont(new Font("TimesRoman",Font.BOLD,15));
		circlePanel.add(p1,BorderLayout.NORTH);
		p2.setLayout(new GridLayout(3,2,5,5));
		p2.add(new JLabel("Radius : "));
		p2.add(jtfRadius);
		p2.add(new JLabel("The area is : "));
		p2.add(jtaArea1);
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
	
	}
	
	public static void main(String[] args) {
		JFrame frame = new GeoCalculate();
		frame.setTitle("U10316046_GeoCalculate");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
