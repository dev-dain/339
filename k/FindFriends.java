package k;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FindFriends extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private String[][] studentArr = {
			{"김땡땡", "20170163"},
			{"박아무개", "20160364"},
			{"이무기", "20091023"}
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindFriends frame = new FindFriends();
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
	public FindFriends() {
		String[] comboBoxStr = {"이름", "학번"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 505);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFindFriends = new JLabel("Find Friends");
		lblFindFriends.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 24));
		lblFindFriends.setBounds(285, 50, 191, 36);
		contentPane.add(lblFindFriends);
		
		JTextField friendField = new JTextField();
		friendField.setBounds(182, 128, 378, 49);
		contentPane.add(friendField);
		friendField.setColumns(10);
		
		JComboBox comboBox = new JComboBox(comboBoxStr);
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(52, 128, 130, 49);
		contentPane.add(comboBox);
		
		JLabel ptLabel = new JLabel("검색 결과");
		ptLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 22));
		ptLabel.setBounds(52, 240, 107, 49);
		contentPane.add(ptLabel);
		
		JLabel resultLabel = new JLabel("");
		resultLabel.setBackground(Color.WHITE);
		resultLabel.setBounds(52, 304, 614, 49);
		contentPane.add(resultLabel);
		
		JButton searchBtn = new JButton("search");
		searchBtn.setBounds(559, 128, 107, 49);
		searchBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (comboBox.getSelectedIndex() == 0) {
					for (int i=0; i<studentArr.length; i++) {
						if (studentArr[i][0].equals(friendField.getText())) {
							resultLabel.setText(studentArr[i][0]);
							break;
						}
						else
							resultLabel.setText("검색 결과가 없습니다.");
					}
				}
				else {
					for (int i=0; i<studentArr.length; i++) {
						if (studentArr[i][1].equals(friendField.getText())) {
							resultLabel.setText(studentArr[i][0]);
							break;
						}
						else
							resultLabel.setText("검색 결과가 없습니다.");
					}
				}
			}
		});
		contentPane.add(searchBtn);
	}
}
