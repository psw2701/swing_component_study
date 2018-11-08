package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import javafx.scene.image.Image;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JListAndJComboEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ImageIcon[] icons;
	private JTextField tfName;
	private List<String> listNames;
	private JList listName;

	/**
	 * Create the frame.
	 */
	public JListAndJComboEx() {
		listNames = new ArrayList<>();
		/*
		 * listNames.add("김보민"); listNames.add("우선미"); listNames.add("황경수");
		 */

		initComponents();
	}

	private void initComponents() {
		setTitle("JList And JCombo Ex");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 930, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 0));

		JPanel pJList = new JPanel();
		pJList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJList);
		pJList.setLayout(new GridLayout(0, 3, 10, 0));

		/*
		 * String[] fruits = new String[] {"apple", "banana", "kiwi", "mango", "pear",
		 * "peach", "berry", "strawberry", "blackberry"};
		 */
		JList<String> list = new JList<>(/* fruits */);

		list.setListData(getStringData());
		pJList.add(list);

		JList<ImageIcon> listImg = new JList();
		listImg.setListData(getImgIcons());
		pJList.add(listImg);

		JPanel plnputList = new JPanel();
		pJList.add(plnputList);
		plnputList.setLayout(new BorderLayout(0, 0));

		JPanel plnputName = new JPanel();
		plnputList.add(plnputName, BorderLayout.NORTH);
		plnputName.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("이름 입력 후<Enter>");
		lblNewLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String name = (String) listName.getSelectedValue();
				int selectIndex = listName.getSelectedIndex();
				JOptionPane.showMessageDialog(null, "선택한 이름은" + name + "\n선택한 이름의 위치 : " + selectIndex);
			}

		});
		plnputName.add(lblNewLabel);

		tfName = new JTextField();
		tfName.addActionListener(this);
		plnputName.add(tfName);
		tfName.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		plnputList.add(scrollPane, BorderLayout.CENTER);

		listName = new JList<>();
		listName.setVisibleRowCount(5);
		listName.setFixedCellWidth(100);
		scrollPane.setViewportView(listName);

		JPanel pJCombo = new JPanel();
		pJCombo.setBorder(new TitledBorder(null, "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJCombo);
		pJCombo.setLayout(new GridLayout(0, 3, 10, 0));

		JPanel subPjcombo1 = new JPanel();
		pJCombo.add(subPjcombo1);
		subPjcombo1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		String[] strArr1 = { "apple", "banana", "charry" };
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(strArr1);
		JComboBox<String> cmb1 = new JComboBox<>(model);
		subPjcombo1.add(cmb1);

		String[] strArr2 = { "김보민", "우선미", "황경수", "이준민" };
		JComboBox<String> cmb2 = new JComboBox<>();
		
		
		for (int i = 0; i < strArr2.length; i++) {
			cmb2.addItem(strArr2[i]);
		}

		cmb2.setSelectedIndex(-1);
		
		cmb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String) cmb2.getSelectedItem();
				int index = cmb2.getSelectedIndex();
				JOptionPane.showMessageDialog(null, index + "번째 선택된 이름" + name);

			}
		});

		subPjcombo1.add(cmb2);

		JPanel subPjcombo2 = new JPanel();
		pJCombo.add(subPjcombo2);
		
		
		String[] strArr3 = {"apple", "banana", "kiwi", "mango"};
		DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(strArr3);
		JComboBox<String> comboBox = new JComboBox<>(model2);
		subPjcombo2.add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				  
				   
				
			}
		});
		
		JLabel lblImg = new JLabel("");
		pJCombo.add(lblImg);
	}

	private String[] getStringData() {
		return new String[] { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
				"blackberry" };
	}

	private ImageIcon[] getImgIcons() {
		String imgPath = System.getProperty("user.dir") + "\\images\\";
		icons = new ImageIcon[] { new ImageIcon(imgPath + "icon1.png"),
				new ImageIcon(imgPath + "icon2.png"),
				new ImageIcon(imgPath + "icon3.png"),
				new ImageIcon(imgPath + "icon4.png") };
		return icons;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfName) {
			do_tfName_actionPerformed(e);
		}
	}

	protected void do_tfName_actionPerformed(ActionEvent e) {
		listNames.add(tfName.getText().trim());
		listName.setListData(new Vector<>(listNames));
		tfName.setText("");
		tfName.requestFocus();
	}
}
