package TH_Bai1_Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPass;
	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(21, 29, 137, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMtKhu.setBounds(21, 106, 137, 39);
		contentPane.add(lblMtKhu);
		
		txtName = new JTextField();
		txtName.setBounds(157, 29, 269, 39);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(157, 106, 269, 39);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        login();
		    }
		});

		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogin.setBounds(157, 177, 147, 39);
		contentPane.add(btnLogin);

	}
	public void login() {
		if(txtName.getText().equals("63CNTT") && txtPass.getText().equals("123")) {
			new HomeFrame().setVisible(true);
			this.setVisible(false);
		}else {
			JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
		}
		
	}
}
