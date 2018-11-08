package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class JComponentMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn3;
	private JButton btn4;
	private JButton btn6;
	private JButton btn2;
	private JButton btn5;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponentMain frame = new JComponentMain();
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
	public JComponentMain() {
		initComponents();
	}

	private void initComponents() {
		setTitle("모든 JComponentFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));

		btn1 = new JButton("CheckBoxItemEventEx");
		btn1.addActionListener(this);
		contentPane.add(btn1);

		btn2 = new JButton("CheckBoxEx");
		btn2.addActionListener(this);
		contentPane.add(btn2);

		btn3 = new JButton("jButtonEx");
		btn3.addActionListener(this);
		contentPane.add(btn3);

		btn4 = new JButton("Jcomponent");
		btn4.addActionListener(this);
		contentPane.add(btn4);

		btn5 = new JButton("jLabelEx");
		btn5.addActionListener(this);
		contentPane.add(btn5);

		btn6 = new JButton("JListAndJComboEx");
		btn6.addActionListener(this);
		contentPane.add(btn6);

		btn7 = new JButton("JTextFieldOtherEx");
		btn7.addActionListener(this);
		contentPane.add(btn7);

		btn8 = new JButton("RadioBtnItemEventEx");
		btn8.addActionListener(this);
		contentPane.add(btn8);
		
		btn9 = new JButton("JSliderChangeEventEx");
		btn9.addActionListener(this);
		contentPane.add(btn9);
		
		btn10 = new JButton("JOptionPane");
		btn10.addActionListener(this);
		contentPane.add(btn10);
		
		btn11 = new JButton("TabbedPane");
		btn11.addActionListener(this);
		contentPane.add(btn11);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn11) {
			do_btn11_actionPerformed(e);
		}
		if (e.getSource() == btn10) {
			do_btn10_actionPerformed(e);
		}
		if (e.getSource() == btn9) {
			do_btn9_actionPerformed(e);
		}
		if (e.getSource() == btn8) {
			do_btn8_actionPerformed(e);
		}
		if (e.getSource() == btn7) {
			try {
				do_btn7_actionPerformed(e);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btn6) {
			do_btn6_actionPerformed(e);
		}
		if (e.getSource() == btn5) {
			do_btn5_actionPerformed(e);
		}
		if (e.getSource() == btn4) {
			do_btn4_actionPerformed(e);
		}
		if (e.getSource() == btn3) {
			do_btn3_actionPerformed(e);
		}
		if (e.getSource() == btn2) {
			do_btn2_actionPerformed(e);
		}
		if (e.getSource() == btn1) {
			do_btn1_actionPerformed(e);
		}
	}

	private void showFrame(JFrame frame) {
		frame.setVisible(true);

	}

	protected void do_btn1_actionPerformed(ActionEvent e) {
		showFrame(new CheckBoxItemEventEx());
		
	}

	protected void do_btn2_actionPerformed(ActionEvent e) {
		showFrame(new CheckBoxEx());
	}

	protected void do_btn3_actionPerformed(ActionEvent e) {
		showFrame(new jButtonEx());
	}

	protected void do_btn4_actionPerformed(ActionEvent e) {
		showFrame(new Jcomponent());
	}

	protected void do_btn5_actionPerformed(ActionEvent e) {
		showFrame(new jLabelEx());
	}

	protected void do_btn6_actionPerformed(ActionEvent e) {
		showFrame(new JListAndJComboEx());
	}

	protected void do_btn7_actionPerformed(ActionEvent e) throws ParseException {
		showFrame(new JTextFieldOtherEx());
	}

	protected void do_btn8_actionPerformed(ActionEvent e) {
		showFrame(new RadioBtnItemEventEx());
	}
	protected void do_btn9_actionPerformed(ActionEvent e) {
		showFrame (new JSliderChangeEventEx());
	}
	protected void do_btn10_actionPerformed(ActionEvent e) {
		showFrame(new JOptionPane());
	}
	protected void do_btn11_actionPerformed(ActionEvent e) {
		showFrame(new TabbedPaneEx());
	}
}
