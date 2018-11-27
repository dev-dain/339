import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class riceC extends JFrame {

	
	private JPanel contentPane;
	private JTable table;
	static String a;
	static StringTokenizer to;

	
	
	public riceC() throws IOException {
		
		Document doc = Jsoup.connect("http://www.duksung.ac.kr/life/foodmenu/index.jsp").get();
		
		Elements tags=doc.select(".menu-table td");
		String a=tags.outerHtml();
		to=new StringTokenizer(a,"/m; <br><p><td height=\"50\" align=\"center\" class=\"first-child\">");
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(90, 100, 1600,800);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	;
	String col[]= {"구분","학생식단","교직원식단"};
	Object rowd[][]= {{"구분","","교직원식단"},{"월","",""},{"화","",""},{"수","",""},{"목","",""},{"금","",""}};
	
	int r=0;
	int c=1;
	String tmp="";
	while(r<5) {
		tmp=to.nextToken();
		if(tmp.equals("*든든하게")) {
			c=1;
			r+=1;

			rowd[r][c]+=tmp;
			rowd[r][c]+=":  ";
		}
	else if(tmp.equals("*교직원식단")) {
		c=2;
		
	}
	else if(r==5) {
		break;
	}
	else {
		rowd[r][c]+=" ";
		rowd[r][c]+=tmp;
	}
	}
	while(true) {
		tmp=to.nextToken();
		if(tmp.equals("비고")) {
			break;
		}
		else if(tmp.equals("*교직원식단")) {
			
			c=2;
		
		}

		else {
			rowd[r][c]+=" ";
			rowd[r][c]+=tmp;
			
		}
	}

	DefaultTableModel de= new DefaultTableModel(rowd,col);

	JTable table = new JTable(de);

	table.setRowHeight(80);
	table.setBounds(0, 78, 1600, 500);

	table.getColumnModel().getColumn(0).setPreferredWidth(10);
	contentPane.add(table);
	
	JButton back = new JButton("닫기");
	back.setBounds(700,650,100, 60);
	contentPane.add(back);
	back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) { 
		
			dispose();
		}
	});
	
	
	
	
	this.setVisible(true);
	
	}
	
}