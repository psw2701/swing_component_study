package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;

import com.sun.javafx.font.freetype.FTFactory;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JTextFieldOtherEx extends JFrame implements ActionListener {


	private JPanel contentPane;
	private JTextField tfId;
	private JTextField ftfDate;
	private JPasswordField pfPwd2;
	private JPasswordField pfPwd;
	private JButton btnOk;
	private JTextArea textArea;
	private JFormattedTextField ftfDate1;
	private JLabel lblConfirm;
	private JButton btnCancel;




	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public JTextFieldOtherEx() throws ParseException {
		initComponents();
	}
	private void initComponents() throws ParseException {
		setTitle("사용");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 540, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TextField\uC0AC\uC6A9\uC608", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblId = new JLabel("ID");
		panel.add(lblId);
		
		tfId = new JTextField();
		panel.add(tfId);
		tfId.setColumns(10);
		
		JLabel lblPwd = new JLabel("PASSWORD");
		panel.add(lblPwd);
		
		pfPwd = new JPasswordField();
		panel.add(pfPwd);
		
		JLabel lblPassword = new JLabel("PASSWORD 확인");
		panel.add(lblPassword);
		
		pfPwd2 = new JPasswordField();
		panel.add(pfPwd2);
		
		JPanel pBlank = new JPanel();
		panel.add(pBlank);
		
		lblConfirm = new JLabel("");
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		panel.add(lblConfirm);
		
		JLabel lblDate = new JLabel("DATE:");
		panel.add(lblDate);
		
		MaskFormatter mf = new MaskFormatter("####-##-##");
		mf.setPlaceholderCharacter('_');
		ftfDate1 = new JFormattedTextField(mf);
		ftfDate1.setValue(LocalDate.now());
		panel.add(ftfDate1);		
		
		panel.add(ftfDate1);
		ftfDate1.setColumns(10);
		
		btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		panel.add(btnOk);
		
		btnCancel = new JButton("초기화");
		btnCancel.addActionListener(this);
		panel.add(btnCancel);
	
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancel) {
			do_btnCancel_actionPerformed(e);
		}
		if (e.getSource() == btnOk) {
			do_btnOk_actionPerformed(e);
		}
	}
	protected void do_btnOk_actionPerformed(ActionEvent e) {
		try {
			validCheck();
			String pwd1 = new String(pfPwd.getPassword());
			String pwd2 = new String(pfPwd2.getPassword());
			
			if (pwd1.equals(pwd2)) {
				lblConfirm.setText("일치");
			}else {
				lblConfirm.setText("불일치");
			}
			

			
			String message = String.format(
					"id = %s%n"
					+ "passwd1 = %s%n"
					+ "passwd2 = %s%n" 
					+ "date = %s%n",
					tfId.getText().trim(),pwd1, pwd2, ftfDate1.getText());
			JOptionPane.showMessageDialog(null, message);
			
			textArea.append(message);
			
			tfId.requestFocus();
			tfId.selectAll();
			
//			tfId.setText("");
//			pfPwd.requestFocus();
//			pfPwd.selectAll();
//			pfPwd.setText("");
//			pfPwd2.requestFocus();
//			pfPwd2.selectAll();
//			pfPwd2.setText("");
			
			textArea.setCaretPosition(textArea.getDocument().getLength());
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
		
			
	}
	protected void do_btnCancel_actionPerformed(ActionEvent e) {
		tfId.setText("");
		pfPwd.setText("");
		pfPwd2.setText("");
		
		ftfDate1.setValue(LocalDate.now());
		tfId.requestFocus();
	}
	
	private void validCheck() throws Exception{
		if(tfId.getText().equals("")) {
			throw new Exception("아이디가 비어있음");
		}
		
		String pwd1 = new String(pfPwd.getPassword());
		String pwd2 = new String(pfPwd2.getPassword());
		
		if(pwd1.equals("")) {
			throw new Exception("Password가 비어 있음");
			
		}
		
		if(pwd2.equals("")) {
			throw new Exception("Password2가 비어 있음");
		}
		
		
	}
}
