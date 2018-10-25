import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField idtext;
	private JTextField pwtext;

	public LogIn() {
		this.setBounds(680,100,540,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Log In â");
		contentPane= new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idtext = new JTextField();
		idtext.setBounds(153, 235, 186, 27);
		contentPane.add(idtext);
		idtext.setColumns(10);
		
		JLabel txtpnId = new JLabel();
		txtpnId.setFont(new Font("����", Font.BOLD, 28));
		txtpnId.setText("ID");
		txtpnId.setBounds(91, 222, 38, 44);
		contentPane.add(txtpnId);
		
		JLabel textPane = new JLabel();
		textPane.setFont(new Font("Eras Bold ITC", Font.BOLD, 68));
		textPane.setText("339");
		textPane.setBounds(183, 75, 156, 85);
		contentPane.add(textPane);
		
		JLabel txtpnPw = new JLabel();
		txtpnPw.setText("Pw");
		txtpnPw.setFont(new Font("����", Font.BOLD, 28));
		txtpnPw.setBounds(91, 281, 49, 39);
		contentPane.add(txtpnPw);
		
		pwtext = new JTextField();
		pwtext.setColumns(10);
		pwtext.setBounds(153, 293, 186, 27);
		contentPane.add(pwtext);
		

		JButton blogin = new JButton("\uB85C\uADF8\uC778");
		blogin.setBounds(375, 242, 99, 63);
		contentPane.add(blogin);
		blogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		JButton bjoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		bjoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				Join join= new Join();
				dispose();
			}
		});
		bjoin.setBounds(23, 442, 117, 85);
		contentPane.add(bjoin);
		
		JButton bidsearch = new JButton("ID\uCC3E\uAE30");
	
		bidsearch.setBounds(196, 442, 117, 85);
		contentPane.add(bidsearch);
		
		JButton bpwsearch = new JButton("Pw\uCC3E\uAE30");
		bpwsearch.setBounds(375, 442, 117, 85);
		contentPane.add(bpwsearch);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		separator.setBounds(42, 399, 432, 2);
		contentPane.add(separator);
		
		this.setVisible(true);
	}
}