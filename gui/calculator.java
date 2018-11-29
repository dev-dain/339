import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	public calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uCDE8\uB4DD \uD559\uC810");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label.setBounds(97, 34, 61, 15);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uD559\uB144 / \uD559\uAE30", "1\uD559\uB144 1\uD559\uAE30", "1\uD559\uB144 2\uD559\uAE30", "2\uD559\uB144 1\uD559\uAE30", "2\uD559\uB144 2\uD559\uAE30", "3\uD559\uB144 1\uD559\uAE30", "3\uD559\uB144 2\uD559\uAE30", "4\uD559\uB144 1\uD559\uAE30", "4\uD559\uB144 2\uD559\uAE30"}));
		comboBox.setBounds(97, 68, 90, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("\uCE78 \uCD94\uAC00");
		btnNewButton.setBounds(213, 67, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCE78 \uC0AD\uC81C");
		btnNewButton_1.setBounds(335, 67, 97, 23);
		contentPane.add(btnNewButton_1);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setRowHeight(30); 
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC131\uC801", "\uD559\uC810", "\uACFC\uBAA9\uBA85"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"\uC131\uC801", "\uD559\uC810", "\uACFC\uBAA9\uBA85"
			}
		));
		
		String[] Grades = { "¼ºÀû", "A+", "A0", "B+", "B0", "C+", "C0", "D0", "F"};
		JComboBox comboBox1 = new JComboBox(Grades);
		table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(comboBox1));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(95, 111, 337, 150);
		contentPane.add(table);
		
		JLabel label_1 = new JLabel("\uC804\uCCB4 \uD3C9\uADE0");
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		label_1.setBounds(97, 295, 61, 15);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setIcon((Icon) new ImageIcon(new ImageIcon("C:\\Users\\DS\\eclipse-workspace\\339\\PieChart.jpeg").getImage().getScaledInstance(446, 334, Image.SCALE_DEFAULT)));
		
		lblNewLabel.setBounds(49, 320, 446, 334);
		contentPane.add(lblNewLabel);
	}
}
	

class EditableTableModel extends AbstractTableModel {
		String[] columnTitles;

		Object[][] dataEntries;

		int rowCount;

		public EditableTableModel(String[] columnTitles, Object[][] dataEntries) {
			this.columnTitles = columnTitles;
			this.dataEntries = dataEntries;
		}

		public int getRowCount() {
			return dataEntries.length;
		}

		public int getColumnCount() {
			return columnTitles.length;
		}

		public Object getValueAt(int row, int column) {
			return dataEntries[row][column];
		}

		public String getColumnName(int column) {
			return columnTitles[column];
		}

		public Class getColumnClass(int column) {
			return getValueAt(0, column).getClass();
		}

		public boolean isCellEditable(int row, int column) {
			return true;
		}

		public void setValueAt(Object value, int row, int column) {
			dataEntries[row][column] = value;
		}
	}

