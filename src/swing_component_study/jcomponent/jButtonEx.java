package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class jButtonEx extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public jButtonEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		String imgesPath = System.getProperty("user.dir") + "\\images\\";
		ImageIcon normalIcon = new ImageIcon( imgesPath + "normalIcon.gif");
		ImageIcon rolloverlIcon = new ImageIcon( imgesPath + "rolloverlIcon.gif");
		ImageIcon pressdIcon = new ImageIcon( imgesPath + "pressdIcon.gif");
		JButton btnNewButton = new JButton("New button");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
	}

}
