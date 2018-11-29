import java.awt.EventQueue;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class bus extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static String a;
	static StringTokenizer to;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bus frame = new bus();
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
	public bus()throws IOException {
		
Document doc = Jsoup.connect("http://www.duksung.ac.kr/about/about_06_06.jsp").get();
		
		Elements tags=doc.select(".table-space td");
		String a=tags.outerHtml();
		tags.text();
		to=new StringTokenizer(a,"우이<br> &nbsp ;신설경전철민주묘지(덕성여대)역번출구도보분<br>(m)<tdrowspan=\"\">호선</td><tdrowspan=\"\">수유역</td><td>번출구</td><td>마을버스번</td><tdrowspan=\"\"> &-분</td><td>덕성여대후문<br>정류장</td><tdrowspan=\"\">번출구</td><td>번</td><tdrowspan=\"\">덕성여대입구<br>하차후도보이동</td><td>번</td><tdrowspan=\"\">간선</td><td></td><td>청량리역환승센터-외대앞-월곡역-미아역-수유역-<strong>덕성여대입구</strong></td><td></td><td>서울교대-신사역-약수역-미아사거리역-<strong>덕성여대입구</strong></td><td></td><td>중앙대학교-신용산역-성신여대입구역-미아역-<strong>덕성여대입구</strong></td><td></td><td>경복궁-혜화역-성신여대입구역-<strong>덕성여대입구</strong></td><td></td><td>보라매병원-여의도역-국민대앞-미아사거리역-수유역-<strong>덕성여대입구</strong></td><tdrowspan=\"\">지선</td><td></td><td>대진여고-창동역-초당초등학교-<strong>덕성여대입구</strong></td><td></td><td>미아역-우이초등학교-인수동장미원-<strong>덕성여대입구</strong></td><td></td><td>국민대앞-SK아파트입구-삼양초등학교-<strong>덕성여대입구</strong></td><td>");
		
		
		int i=0;
		String n=null;
		while(i<62) {
			n=to.nextToken();
			i++;
			}
		i=0;
		while(i<39) {
		n=to.nextToken();
		if(n.equals(";")||n.equals("&nbsp")) {
			
		}
		else {
			System.out.println(n);
		
			}
	
		i++;
		}
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String col[]= {"수유","학교","수유","학교"};
		Object rowd[][]= {{"수유역 출발","학교 출발","수유역 출발","학교 출발"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null}};
		
		DefaultTableModel de= new DefaultTableModel(rowd,col);

		JTable table = new JTable(de);

		
		table.setRowHeight(40);
		table.setBounds(160, 79, 474, 246);
		contentPane.add(table);
	}
}
