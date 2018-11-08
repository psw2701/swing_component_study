package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class JSliderChangeEventEx extends JFrame implements ActionListener, ChangeListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JSlider slider;
	private JLabel label;
	private JSlider slider_R;
	private JSlider slider_G;
	private JSlider slider_B;
	private JLabel lblNewLabel_1;
	private JPanel pSpinner;
	private JSpinner spNumber;
	private JSpinner spList;
	private JSpinner spDate;
	private JButton btnSpinner;
	private JPanel panel_2;


	/**
	 * Create the frame.
	 */
	public JSliderChangeEventEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\uC2AC\uB77C\uC774\uB354 \uCEF4\uD3EC\uB10C\uD2B8", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		
		slider = new JSlider();
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(this);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(slider);
		
		btnOk = new JButton("슬라이더 확인");
		btnOk.addActionListener(this);
		panel.add(btnOk);
		
		label = new JLabel("");
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\uC774\uBCA4\uD2B8\uB97C \uC801\uC6A9\uD55C \uC2AC\uB77C\uC774\uB354", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		slider_R = new JSlider();
		slider_R.setMinorTickSpacing(10);
		slider_R.setMajorTickSpacing(50);
		slider_R.setMaximum(250);
		slider_R.setPaintTicks(true);
		slider_R.setPaintLabels(true);
		slider_R.setForeground(Color.RED);
		panel_1.add(slider_R);
		
		slider_G = new JSlider();
		slider_G.setMaximum(250);
		slider_G.setPaintTicks(true);
		slider_G.setPaintLabels(true);
		slider_G.setMinorTickSpacing(10);
		slider_G.setMajorTickSpacing(50);
		slider_G.setForeground(Color.GREEN);
		panel_1.add(slider_G);
		
		slider_B = new JSlider();
		slider_B.setMinorTickSpacing(10);
		slider_B.setPaintTicks(true);
		slider_B.setPaintLabels(true);
		slider_B.setMajorTickSpacing(50);
		slider_B.setMaximum(250);
		slider_B.setForeground(Color.BLUE);
		panel_1.add(slider_B);
		
		lblNewLabel_1 = new JLabel("SLIDER EXAMPLE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		pSpinner = new JPanel();
		contentPane.add(pSpinner);
		pSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_2 = new JPanel();
		pSpinner.add(panel_2);
		
		spList = new JSpinner();
		spList.setModel(new SpinnerListModel(new String[] {"\uC18C\uC124", "\uC7A1\uC9C0", "\uC804\uACF5\uC11C\uC801", "\uCDE8\uBBF8"}));
		panel_2.add(spList);
		
		spNumber = new JSpinner();
		spNumber.setModel(new SpinnerNumberModel(0, 0, 9, 1));
		panel_2.add(spNumber);
		
		spDate = new JSpinner();
		Calendar cal = Calendar.getInstance();
		Date value = cal. getTime();
		
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();
		
		cal.add(Calendar.YEAR, 100);
		Date end = cal.getTime();
		
		spDate.setModel(new SpinnerDateModel(value, start, end, Calendar.YEAR));
		spDate.setEditor(new JSpinner.DateEditor(spDate, "yyyy/MM/dd"));
		
		panel_2.add(spDate);
		
		btnSpinner = new JButton("스피너 값 확인");
		btnSpinner.addActionListener(this);
		pSpinner.add(btnSpinner);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSpinner) {
			do_btnSpinner_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnOk) {
			do_btnOk_actionPerformed(arg0);
		}
	}
	protected void do_btnOk_actionPerformed(ActionEvent arg0) {
		int value = slider.getValue();
		
	}
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == slider) {
			do_slider_stateChanged(e);
		}
	}
	protected void do_slider_stateChanged(ChangeEvent e) {
		int vlaue = slider.getValue();
	
	}
	protected void do_btnSpinner_actionPerformed(ActionEvent arg0) {
	 String strVal = (String) spList.getValue();
	 int intVal = (int) spNumber.getValue();
	 Date dateVal = (Date) spDate.getValue();
	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	 JOptionPane.showMessageDialog(null, strVal + "\n" + intVal + "\n" + sdf.format(dateVal));
	}
}
