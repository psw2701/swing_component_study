package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class jLabelEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jLabelEx frame = new jLabelEx();
					frame.setVisible(true);
					
					String dir = System.getProperty("user.dir")+"\\images";
					
					System.out.println(dir);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jLabelEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("사랑합니다.");
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		String imagesPath = System.getProperty("user.dir")+"\\images";
		
		lblNewLabel.setIcon(new ImageIcon(imagesPath + "\\beauty.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("보고싶으면 카톡하세요");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(imagesPath + "\\normalIcon.gif"));
		contentPane.add(lblNewLabel_1);
	}

}
