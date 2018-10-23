package kimDaIn;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class viewTimeTable extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewTimeTable frame = new viewTimeTable();
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
	public viewTimeTable() {
		String[] comboBoxString = {"2017-1학기", "2017-2학기", "2018-1학기", "2018-2학기"};
		
		String columnNames[] = {"", "월", "화", "수", "목", "금"};

		Object rowData[][]= {
				columnNames,
				{"9", "", "", "", "", ""},
				{"10", "", "", "", "", ""},
				{"11", "", "", "", "", ""},
				{"12", "", "", "", "", ""},
				{"1", "", "", "", "", ""},
				{"2", "", "", "", "", ""},
				{"3", "", "", "", "", ""},
				{"4", "", "", "", "", ""},
				{"5", "", "", "", "", ""}
		};

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 772);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox(comboBoxString);
		comboBox.setBounds(252, 51, 166, 40);
		contentPane.add(comboBox);
		
		table = new JTable(rowData, columnNames);
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBounds(79, 117, 509, 450);
		table.getColumn("").setPreferredWidth(20);
		table.setRowHeight(45);
		contentPane.add(table);
		
		JButton addLectureBtn = new JButton("수업 추가");
		//MouseClicked 등록해서 창 하나 띄우기 .. 
		addLectureBtn.setBounds(252, 596, 163, 40);
		addLectureBtn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AddLecture addLectureWindow = new AddLecture();
				addLectureWindow.setVisible(true);
			}
		});
		contentPane.add(addLectureBtn);
		
	}
}
