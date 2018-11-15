import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
 public class PieChart extends JFrame {
	 Container c;
	 double[] data = {0.0, 0.0, 0.0, 0.0};
	 int arc;
	 Color[] col = {Color.RED, Color.WHITE};
	 
	 JTextField[] textFields = new JTextField[4];

	 MyActionListener lis = new MyActionListener();
	 
	 PieChart(){
		 setTitle("학점 계산기");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 c = getContentPane();
		 
		 ChartPanel chartPanel = new ChartPanel();
		 c.add(chartPanel, BorderLayout.CENTER);
		 setVisible(true);
	 }
	 
	 class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double sum = 0;
			double aver = 0;
			double percent = 0;
			for(int i=0 ; i <data.length ; i++) {
				String text = textFields[i].getText();
				try {
					data[i] = Double.parseDouble(text);
				} catch(NumberFormatException nfe) {
					textFields[i].setText("0.0");
					return;
				}
				sum += data[i];
				System.out.println(data[i]);
			}
			aver = sum/data.length;
			percent = (int)aver / 4.5 * 100;
			arc = (int)(360 * percent / 100);
			System.out.println(arc);
		repaint();		
		}
	 }


 class ChartPanel extends JPanel{
	 ChartPanel(){ }
	 
	 protected void paintComponet(Graphics g) {
		 super.paintComponent(g);
		 int startAngle = 0;
		 int drawAngle = 90;
		 g.setFont(new Font("malgun", Font.BOLD,15));
		 for (int i=0 ; i<data.length; i++) {
			 g.setColor(col[0]);
			 g.fillArc(150,150,200,200,startAngle,arc);
			 startAngle += arc;
		 }
	 }
 }

 public static void main(String[] args) {
	 new PieChart();
 }
 }