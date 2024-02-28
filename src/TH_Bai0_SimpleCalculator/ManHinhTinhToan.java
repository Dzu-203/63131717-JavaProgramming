package TH_Bai0_SimpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtResult;
	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_A = new JLabel("Nhập số thứ nhất (a)");
		label_A.setBounds(24, 27, 150, 20);
		label_A.setHorizontalAlignment(SwingConstants.RIGHT);
		label_A.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label_A);
		
		JLabel label_B = new JLabel("Nhập số thứ hai (b)");
		label_B.setBounds(24, 87, 139, 20);
		label_B.setHorizontalAlignment(SwingConstants.RIGHT);
		label_B.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(label_B);
		
		txtA = new JTextField();
		txtA.setBounds(201, 29, 350, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(201, 90, 350, 19);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleTong();
			}
		});
		btnCong.setBounds(24, 146, 85, 42);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(174, 146, 85, 42);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(316, 146, 85, 42);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(466, 146, 85, 42);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(24, 226, 85, 42);
		contentPane.add(lblNewLabel_2);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(149, 233, 402, 33);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
	}
	void handleTong() {
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		txtResult.setText(String.valueOf(soA + soB));
	}
	void handleTru() {
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		txtResult.setText(String.valueOf(soA - soB));
	}
	void handleNhan() {
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		txtResult.setText(String.valueOf(soA * soB));
	}
	void handleChia() {
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		if(soB != 0) txtResult.setText(String.valueOf(soA / soB));
		else txtResult.setText("Không chia được cho 0");
	}
}
