import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CheckO extends JFrame {

	private JPanel contentPane;
	public CheckO() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 302, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC0AC\uC6A9\uAC00\uB2A5\uD569\uB2C8\uB2E4.");
		label.setFont(new Font("����", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(42, 23, 188, 36);
		contentPane.add(label);
		
		JButton check = new JButton("확인");
		check.setFont(new Font("굴림", Font.BOLD, 22));
		check.setBackground(Color.WHITE);
		check.setBounds(80, 50,100, 30);
		contentPane.add(check);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
				dispose();
			}
		});
		
		this.setVisible(true);
	}
	
}
