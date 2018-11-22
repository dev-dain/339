//package from L
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Join extends JFrame {
	private JPanel contentPane;
	private JTextField nametext;
	private JTextField idtext;
	private JTextField pwtext;
	private JTextField rpwtext; 
	private JTextField e_mailtext;
	private JTextField numbertext;
	private JTextField answertext;

	
	public Join() {
		this.setBounds(680,100,540,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Join");
		contentPane= new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel picture = new JPanel();
		picture.setBounds(12, 35, 129, 170);
		contentPane.add(picture);
		
		JLabel IDtext = new JLabel();
		IDtext.setFont(new Font("����", Font.PLAIN, 20));
		IDtext.setText("ID");
		IDtext.setBounds(158, 90, 77, 27);
		contentPane.add(IDtext);
		
		JLabel Pw = new JLabel();
		Pw.setFont(new Font("����", Font.PLAIN, 20));
		Pw.setText("Pw");
		Pw.setBounds(158, 130, 77, 27);
		contentPane.add(Pw);
		
		JLabel rePw = new JLabel();
		rePw.setFont(new Font("����", Font.PLAIN, 20));
		rePw.setText("Pw\uD655\uC778");
		rePw.setBounds(158, 170, 77, 27);
		contentPane.add(rePw);
		
		JLabel e_mail = new JLabel();
		e_mail.setFont(new Font("����", Font.PLAIN, 20));
		e_mail.setText("e_mail");
		e_mail.setBounds(158, 210, 77, 27);
		contentPane.add(e_mail);
		
		JLabel major = new JLabel();
		major.setFont(new Font("����", Font.PLAIN, 20));
		major.setText("\uD559\uACFC");
		major.setBounds(158, 250, 77, 27);
		contentPane.add(major);
		
		JLabel number = new JLabel();
		number.setFont(new Font("����", Font.PLAIN, 20));
		number.setText("\uD559\uBC88");
		number.setBounds(158, 290, 56, 27);
		contentPane.add(number);
		
		JLabel question = new JLabel();
		question.setFont(new Font("����", Font.PLAIN, 20));
		question.setText("\uC9C8\uBB38");
		question.setBounds(158, 330, 77, 27);
		contentPane.add(question);
		
		JLabel name = new JLabel();
		name.setFont(new Font("����", Font.PLAIN, 20));
		name.setText("\uC774\uB984");
		name.setBounds(158, 50, 77, 27);
		contentPane.add(name);
		
		JLabel answer = new JLabel();
		answer.setFont(new Font("����", Font.PLAIN, 20));
		answer.setText("\uB300\uB2F5");
		answer.setBounds(158, 370, 77, 27);
		contentPane.add(answer);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 36));
		btnNewButton.setBounds(104, 454, 314, 65);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn login= new LogIn();
				dispose();
			}
		});

		nametext = new JTextField();
		nametext.setFont(new Font("����", Font.PLAIN, 22));
		nametext.setBounds(230, 50, 156, 27);
		contentPane.add(nametext);
		nametext.setColumns(10);
		
		idtext = new JTextField();
		idtext.setFont(new Font("����", Font.PLAIN, 22));
		idtext.setColumns(10);
		idtext.setBounds(230, 92, 156, 27);
		contentPane.add(idtext);
		
		pwtext = new JTextField();
		pwtext.setFont(new Font("����", Font.PLAIN, 22));
		pwtext.setColumns(10);
		pwtext.setBounds(230, 130, 156, 27);
		contentPane.add(pwtext);
		
		rpwtext = new JTextField();
		rpwtext.setFont(new Font("����", Font.PLAIN, 22));
		rpwtext.setColumns(10);
		rpwtext.setBounds(230, 170, 156, 27);
		contentPane.add(rpwtext);
		
		e_mailtext = new JTextField();
		e_mailtext.setFont(new Font("����", Font.PLAIN, 22));
		e_mailtext.setColumns(10);
		e_mailtext.setBounds(230, 210, 156, 27);
		contentPane.add(e_mailtext);
		
		numbertext = new JTextField();
		numbertext.setFont(new Font("����", Font.PLAIN, 22));
		numbertext.setColumns(10);
		numbertext.setBounds(230, 290, 156, 27);
		contentPane.add(numbertext);
		
		answertext = new JTextField();
		answertext.setFont(new Font("����", Font.PLAIN, 22));
		answertext.setColumns(10);
		answertext.setBounds(230, 370, 156, 27);
		contentPane.add(answertext);
		
		JComboBox majorsel = new JComboBox();
		majorsel.setFont(new Font("����", Font.PLAIN, 20));
		majorsel.setMaximumRowCount(5);
		majorsel.setModel(new DefaultComboBoxModel(new String[] {"\uD559\uACFC\uC120\uD0DD", "\uAD6D\uC5B4\uAD6D\uBB38\uD559\uACFC", "\uC77C\uC5B4\uC77C\uBB38\uD559\uACFC", "\uC911\uC5B4\uC911\uBB38\uD559\uACFC", "\uC601\uC5B4\uC601\uBB38\uD559\uACFC", "\uBD88\uC5B4\uBD88\uBB38\uD559\uACFC", "\uB3C5\uC5B4\uB3C5\uBB38\uD559\uACFC", "\uC2A4\uD398\uC778\uC5B4\uACFC", "\uC0AC\uD559\uACFC", "\uCCA0\uD559\uACFC", "\uBBF8\uC220\uC0AC\uD559\uACFC", "\uACBD\uC601\uD559\uACFC", "\uD68C\uACC4\uD559\uACFC", "\uAD6D\uC81C\uD1B5\uC0C1\uD559\uACFC", "\uBC95\uD559\uACFC", "\uC0AC\uD68C\uD559\uACFC", "\uBB38\uD5CC\uC815\uBCF4\uD559\uACFC", "\uC2EC\uB9AC\uD559\uACFC", "\uC544\uB3D9\uAC00\uC871\uD559\uACFC", "\uBB38\uD654\uC778\uB958\uD559\uACFC", "\uC0AC\uD68C\uBCF5\uC9C0\uD559\uACFC", "\uC815\uCE58\uC678\uAD50\uD559\uACFC", "\uC720\uC544\uAD50\uC721\uACFC", "\uC218\uD559\uACFC", "\uC815\uBCF4\uD1B5\uACC4\uD559\uACFC", "\uD654\uD559\uACFC", "\uC2DD\uD488\uC601\uC591\uD559\uACFC", "\uC0DD\uD65C\uCCB4\uC721\uD559\uACFC", "Pre-Pharm \u00B7 Med\uD559\uACFC", "\uCEF4\uD4E8\uD130\uD559\uACFC", "IT\uBBF8\uB514\uC5B4\uACF5\uD559\uACFC", "\uBC14\uC774\uC624\uACF5\uD559\uACFC", "\uC57D\uD559\uACFC", "\uB3D9\uC591\uD559\uACFC", "\uC11C\uC591\uD559\uACFC", "\uC2E4\uB0B4\uB514\uC790\uC778\uD559\uACFC", "\uC2DC\uAC01\uB514\uC790\uC778\uD559\uACFC", "\uD14D\uC2A4\uD0C0\uC77C\uB514\uC790\uC778\uD559\uACFC", "\uC758\uC0C1\uB514\uC790\uC778\uD559\uACFC"}));
		majorsel.setSelectedIndex(0);
		majorsel.setBounds(230, 250, 156, 27);
		contentPane.add(majorsel);
		
		JComboBox questionsel = new JComboBox();
		questionsel.setFont(new Font("����", Font.PLAIN, 20));
		questionsel.setBounds(230, 332, 156, 27);
		contentPane.add(questionsel);
		
		JButton idcheckb = new JButton("\uC911\uBCF5\uD655\uC778");
		idcheckb.setBounds(393, 91, 108, 29);
		contentPane.add(idcheckb);
		
		JButton e_mailcheckb = new JButton("\uC911\uBCF5\uD655\uC778");
		e_mailcheckb.setBounds(393, 210, 108, 29);
		contentPane.add(e_mailcheckb);
		
		JButton numbercheckb = new JButton("\uC911\uBCF5\uD655\uC778");
		numbercheckb.setBounds(393, 290, 108, 29);
		contentPane.add(numbercheckb);
			
		
		
		this.setVisible(true);

	}
	
	
	
	
}
