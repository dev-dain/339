package kimDaIn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class AddLecture extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLecture frame = new AddLecture();
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
	public AddLecture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		String[] comboBoxString1 = {"월", "화", "수", "목", "금"};
		
		JLabel titleLabel = new JLabel("강의 등록");
		titleLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 24));
		titleLabel.setBounds(319, 44, 119, 46);
		contentPane.add(titleLabel);
		
		JLabel lectureName = new JLabel("강의명");
		lectureName.setBounds(125, 117, 126, 33);
		contentPane.add(lectureName);
		
		JLabel lectureTime = new JLabel("\uC2DC\uAC04");
		lectureTime.setBounds(125, 165, 126, 33);
		contentPane.add(lectureTime);
		
		JLabel lectureRoom = new JLabel("\uAC15\uC758\uC2E4");
		lectureRoom.setBounds(125, 213, 126, 33);
		contentPane.add(lectureRoom);
		
		JLabel lectureProf = new JLabel("\uAD50\uC218");
		lectureProf.setBounds(125, 261, 126, 33);
		contentPane.add(lectureProf);
		
		JLabel lectureGrade = new JLabel("\uD559\uC810");
		lectureGrade.setBounds(125, 309, 126, 33);
		contentPane.add(lectureGrade);
		
		JButton addBtn = new JButton("등록");
		addBtn.setBounds(310, 394, 158, 33);
		addBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(addBtn);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(310, 124, 264, 24);
		contentPane.add(textArea);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(310, 220, 264, 24);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(310, 268, 264, 24);
		contentPane.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(310, 316, 264, 24);
		contentPane.add(textArea_4);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(310, 172, 264, 24);
		contentPane.add(textArea_1);
	}
}
