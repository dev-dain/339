import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.management.relation.Role;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {
	private JPanel contentPane;
	private JTextField e_mails;
	private JPasswordField newpws;
	private JPasswordField pwchecks;
	private JTextField numbers;
	private JTextField names;
	private JTextField ids;
	private JTextField majors;
	
	
	

public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(140, 70, 1642, 904);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel schedulet = new JLabel();
		schedulet.setBackground(Color.WHITE);
		schedulet.setForeground(new Color(0, 0, 0));
		schedulet.setFont(new Font("굴림", Font.BOLD, 35));
		schedulet.setText("시간표");
		schedulet.setBounds(462, 143, 111, 53);
		contentPane.add(schedulet);
		
		JLabel gradet = new JLabel();
		gradet.setText("학점 계산기");
		gradet.setForeground(Color.BLACK);
		gradet.setFont(new Font("굴림", Font.BOLD, 35));
		gradet.setBackground(Color.WHITE);
		gradet.setBounds(852, 143, 199, 53);
		contentPane.add(gradet);
		
		JLabel attendancet = new JLabel();
		attendancet.setText("출결 현황");
		attendancet.setForeground(Color.BLACK);
		attendancet.setFont(new Font("굴림", Font.BOLD, 35));
		attendancet.setBackground(Color.WHITE);
		attendancet.setBounds(1301, 143, 162, 53);
		contentPane.add(attendancet);
		
		Button grade = new Button();
		grade.setBackground(Color.WHITE);
		grade.setBounds(787, 103, 328, 463);
		contentPane.add(grade);
		

		
		
		Button schedule = new Button();
		schedule.setBackground(Color.WHITE);
		schedule.setBounds(358, 103, 328, 463);
		contentPane.add(schedule);
		
		Button attendance = new Button();
		attendance.setBackground(Color.WHITE);
		attendance.setBounds(1216, 103, 328, 463);
		contentPane.add(attendance);
		
		JButton graduate = new JButton("졸업 요건");
		graduate.setFont(new Font("굴림", Font.BOLD, 22));
		graduate.setBackground(Color.WHITE);
		graduate.setBounds(428, 650, 151, 109);
		contentPane.add(graduate);
		
		JButton food = new JButton("학식");
		food.setFont(new Font("굴림", Font.BOLD, 22));
		food.setBackground(Color.WHITE);
		food.setBounds(728, 650, 151, 109);
		contentPane.add(food);
		food.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				riceC  rice=null;
				try {
					rice = new riceC();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
				
				
				
				
			}
		});
		
		
		JButton bus = new JButton("셔틀");
		bus.setFont(new Font("굴림", Font.BOLD, 22));
		bus.setBackground(Color.WHITE);
		bus.setBounds(1028, 650, 151, 109);
		contentPane.add(bus);
		
		JButton library = new JButton("열람실");
		library.setFont(new Font("굴림", Font.BOLD, 22));
		library.setBackground(Color.WHITE);
		library.setBounds(1328, 650, 151, 109);
		 library.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				web w = new web("http://mcard.duksung.ac.kr:8080/PW/pw20.php/");	
				
			}
		});
		
		contentPane.add(library);
		
		JPanel mypanel = new JPanel();
		mypanel.setBackground(Color.PINK);
		mypanel.setBounds(0, 0, 285, 848);
		contentPane.add(mypanel);
		mypanel.setLayout(null);
		
		JButton chatting = new JButton("채팅하기");
		chatting.setFont(new Font("굴림", Font.PLAIN, 30));
		chatting.setBackground(Color.WHITE);
		chatting.setBounds(0, 739, 285, 109);
		mypanel.add(chatting);
		this.setVisible(true);
		
	}}
