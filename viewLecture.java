package kimDaIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class viewLecture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLecture frame = new viewLecture();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewLecture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("강의명");
		label.setBounds(86, 102, 126, 33);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("상세 정보");
		label_1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 24));
		label_1.setBounds(296, 29, 119, 46);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("시간");
		label_2.setBounds(86, 150, 126, 33);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("강의실");
		label_3.setBounds(86, 198, 126, 33);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("교수");
		label_4.setBounds(86, 246, 126, 33);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("학점");
		label_5.setBounds(86, 294, 126, 33);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("으아");
		label_6.setForeground(Color.BLACK);
		label_6.setBackground(Color.PINK);
		label_6.setBounds(288, 108, 319, 21);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("화F 목D");
		label_7.setForeground(Color.BLACK);
		label_7.setBackground(Color.PINK);
		label_7.setBounds(288, 156, 319, 21);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("차136");
		label_8.setForeground(Color.BLACK);
		label_8.setBackground(Color.PINK);
		label_8.setBounds(288, 204, 319, 21);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("김아무개");
		label_9.setForeground(Color.BLACK);
		label_9.setBackground(Color.PINK);
		label_9.setBounds(288, 252, 319, 21);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("3학점");
		label_10.setForeground(Color.BLACK);
		label_10.setBackground(Color.PINK);
		label_10.setBounds(288, 300, 319, 21);
		contentPane.add(label_10);
		
		JButton deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(256, 385, 188, 33);
		deleteBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				rUDeleteIt deleteWin = new rUDeleteIt();
				deleteWin.setVisible(true);
			}
		});
		contentPane.add(deleteBtn);
	}
}
