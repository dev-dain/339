import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Settings extends JFrame {
	private JPanel contentPane;
	private JTextField e_mails;
	private JPasswordField newpws;
	private JPasswordField pwchecks;
	private JTextField numbers;
	private JTextField names;
	private JTextField ids;
	private JTextField majors;

	public Settings() {
		
		this.setBounds(680,100,540,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Settings");
		contentPane= new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel picture = new JPanel();
		picture.setBounds(12, 35, 129, 170);
		contentPane.add(picture);
		
		JLabel IDtext = new JLabel();
		IDtext.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		IDtext.setText("ID");
		IDtext.setBounds(158, 100, 77, 27);
		contentPane.add(IDtext);
		
		JLabel Pw = new JLabel();
		Pw.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		Pw.setText("NewPw");
		Pw.setBounds(158, 300, 77, 27);
		contentPane.add(Pw);
		
		JLabel rePw = new JLabel();
		rePw.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		rePw.setText("Pw\uD655\uC778");
		rePw.setBounds(158, 350, 77, 27);
		contentPane.add(rePw);
		
		JLabel e_mail = new JLabel();
		e_mail.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		e_mail.setText("e_mail");
		e_mail.setBounds(158, 250, 77, 27);
		contentPane.add(e_mail);
		
		JLabel major = new JLabel();
		major.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		major.setText("\uD559\uACFC");
		major.setBounds(158, 150, 77, 27);
		contentPane.add(major);
		
		JLabel number = new JLabel();;
		number.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		number.setText("\uD559\uBC88");
		number.setBounds(158, 200, 56, 27);
		contentPane.add(number);
		
		JLabel name = new JLabel();
		name.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		name.setText("\uC774\uB984");
		name.setBounds(158, 50, 77, 27);
		contentPane.add(name);
		
		JButton okb = new JButton("OK");
		okb.setFont(new Font("Calibri", Font.PLAIN, 36));
		okb.setBounds(104, 454, 314, 65);
		contentPane.add(okb);
		
		okb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				dispose();
			}
		});

		
		
		e_mails = new JTextField();
		e_mails.setBounds(230, 250, 156, 27);
		contentPane.add(e_mails);
		e_mails.setColumns(10);
		
		newpws = new JPasswordField();
		newpws.setBounds(230, 300, 156, 27);
		contentPane.add(newpws);
		
		pwchecks = new JPasswordField();
		pwchecks.setBounds(230, 350, 156, 27);
		contentPane.add(pwchecks);
		
		numbers = new JTextField();
		numbers.setText("\u3147\u3147");
		numbers.setEnabled(false);
		numbers.setEditable(false);
		numbers.setBounds(230, 200, 156, 27);
		contentPane.add(numbers);
		numbers.setColumns(10);
		
		names = new JTextField();
		names.setText("\u3147\u3147");
		names.setEnabled(false);
		names.setEditable(false);
		names.setColumns(10);
		names.setBounds(230, 50, 156, 27);
		contentPane.add(names);
		
		ids = new JTextField();
		ids.setText("\u3147\u3147");
		ids.setEnabled(false);
		ids.setEditable(false);
		ids.setColumns(10);
		ids.setBounds(230, 100, 156, 27);
		contentPane.add(ids);
		
		majors = new JTextField();
		majors.setText("\u3147\u3147");
		majors.setEnabled(false);
		majors.setEditable(false);
		majors.setColumns(10);
		majors.setBounds(230, 150, 156, 27);
		contentPane.add(majors);
		
		JButton e_mailsb = new JButton("\uC911\uBCF5\uD655\uC778");
		e_mailsb.setBounds(403, 249, 108, 29);
		contentPane.add(e_mailsb);
		

		this.setVisible(true);
		
		
		
	}
}
