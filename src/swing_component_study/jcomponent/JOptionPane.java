package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPane extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btnNewButton;



	/**
	 * Create the frame.
	 */
	public JOptionPane() {
		initComponents();
	}

	private void initComponents() {
		setTitle("JOptionPane");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
				JPanel panel = new JPanel();
				contentPane.add(panel);
				
						btn01 = new JButton("input");
						btn01.addActionListener(this);
						panel.setLayout(new GridLayout(1, 0, 0, 0));
						panel.add(btn01);
						
						btnNewButton = new JButton("New button");
						btnNewButton.addActionListener(this);
						panel.add(btnNewButton);
						
						JButton btnNewButton_1 = new JButton("New button");
						panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btn01) {
			do_btn01_actionPerformed(e);
		}
	}

	protected void do_btn01_actionPerformed(ActionEvent e) {
		String[] selectionValues = { "가", "나", "다"};
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
}
