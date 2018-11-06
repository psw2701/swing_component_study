package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jcomponent extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton JButtonb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jcomponent frame = new Jcomponent();
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
	public Jcomponent() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton JButtonb1 = new JButton("Magenta/Yellow Button");
		JButtonb1.setForeground(Color.MAGENTA);
		JButtonb1.setBackground(Color.YELLOW);
		JButtonb1.setFont(new Font("Arial", Font.ITALIC, 20));
		contentPane.add(JButtonb1);
		
		JButton JButtonb2 = new JButton("Disabled Button");
		JButtonb2.setEnabled(false);
		contentPane.add(JButtonb2);
		
		JButtonb3 = new JButton("getX(), getY()");
		JButtonb3.addActionListener(this);
		contentPane.add(JButtonb3);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == JButtonb3) {
			do_JButtonb3_actionPerformed(arg0);
		}
	}
	protected void do_JButtonb3_actionPerformed(ActionEvent arg0) {
		
	}
}
