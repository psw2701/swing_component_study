package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RadioBtnItemEventEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbApple;

	private JRadioButton rdbPear;
	private JRadioButton rdbCherry;
	private JLabel lblimg;
	private AbstractButton lblImg;
	private ImageIcon cherryIcon;
	private ImageIcon pearIcon;
	private ImageIcon appleIcon;
	private String imgPath;
	private String iconPath;

	/**
	 * Create the frame.
	 */
	public RadioBtnItemEventEx() {
		iconPath = System.getProperty("user.dir") + "\\images\\fruits\\";
		appleIcon = new ImageIcon(iconPath + "apple.jpg");
		pearIcon = new ImageIcon(iconPath + "pear.jpg");
		cherryIcon = new ImageIcon(iconPath + "cherry.jpg");
		initComponents();
	}

	private void initComponents() {
		setTitle("ItemEvent 활용한 라디오 버튼");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 252, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		lblimg = new JLabel("");

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		rdbApple = new JRadioButton("사과");

		rdbApple.addItemListener(this);
		buttonGroup.add(rdbApple);
		panel.add(rdbApple);

		rdbPear = new JRadioButton("배");
		rdbPear.addItemListener(this);
		buttonGroup.add(rdbPear);
		panel.add(rdbPear);

		rdbCherry = new JRadioButton("체리");
		rdbCherry.addItemListener(this);
		buttonGroup.add(rdbCherry);
		panel.add(rdbCherry);

		lblimg.setHorizontalAlignment(SwingConstants.CENTER);

		contentPane.add(lblimg, BorderLayout.CENTER);
		rdbApple.setSelected(true);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbCherry) {
			do_rdbCherry_itemStateChanged(e);
		}
		if (e.getSource() == rdbPear) {
			do_rdbPear_itemStateChanged(e);
		}
		if (e.getSource() == rdbApple) {
			do_rdbApple_itemStateChanged(e);
		}

	}

	protected void do_rdbApple_itemStateChanged(ItemEvent e) {
		lblimg.setIcon(appleIcon);
	}

	protected void do_rdbPear_itemStateChanged(ItemEvent e) {
		lblimg.setIcon(pearIcon);
	}

	protected void do_rdbCherry_itemStateChanged(ItemEvent e) {
		lblimg.setIcon(cherryIcon);
	}
}
