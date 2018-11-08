package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxItemEventEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JCheckBox chkApple;
	private JCheckBox chkPear;
	private JCheckBox chkCherry;
	private JLabel lblSum;
	private int sum;



	/**
	 * Create the frame.
	 */
	public CheckBoxItemEventEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblTitle = new JLabel("사과100원, 배500원, 체리2000원");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setVerticalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		chkApple = new JCheckBox("사과");
		chkApple.addItemListener(this);
		panel.add(chkApple);
		
		chkPear = new JCheckBox("배");
		chkPear.addItemListener(this);
		panel.add(chkPear);
		
		chkCherry = new JCheckBox("체리");
		chkCherry.addItemListener(this);
		panel.add(chkCherry);
		
		lblSum = new JLabel("현재 0원 입니다.");
		lblSum.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblSum);
	}

	public void itemStateChanged(ItemEvent arg0) {
		if (arg0.getSource() == chkCherry) {
			do_chkCherry_itemStateChanged(arg0);
		}
		if (arg0.getSource() == chkPear) {
			do_chkPear_itemStateChanged(arg0);
		}
		if (arg0.getSource() == chkApple) {
			do_chkApple_itemStateChanged(arg0);
		}
		lblSum.setText("현재" + sum + "원 입니다.");
	}


	protected void do_chkApple_itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange()== ItemEvent.SELECTED) {
			sum += 1000;
		}else {
			sum -= 1000;
		}
	}
	protected void do_chkPear_itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange()== ItemEvent.SELECTED) {
			sum += 500;
		}else {
			sum -= 500;
		}
	}
	protected void do_chkCherry_itemStateChanged(ItemEvent arg0) {
		if(arg0.getStateChange()== ItemEvent.SELECTED) {
			sum += 2000;
		}else {
			sum -= 2000;
		}
	}
}
