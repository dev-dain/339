//package from L
package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CheckX extends JFrame  {
	private JPanel contentPane;

	public CheckX() {
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setBounds(100, 100, 302, 132);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			this.setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel label = new JLabel("X");
			label.setFont(new Font("����", Font.PLAIN, 20));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBounds(42, 23, 188, 36);
			contentPane.add(label);
			this.setVisible(true);
	}
}
