package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
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
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setText("0");
		txtResult.setEditable(false);
		txtResult.setBounds(12, 10, 212, 54);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 7);
				}else
					txtResult.setText(currentText + 7);
			}
		});
		btn7.setBounds(12, 74, 49, 41);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 8);
				}else
					txtResult.setText(currentText + 8);
			}
		});
		btn8.setBounds(67, 74, 49, 41);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 9);
				}else
					txtResult.setText(currentText + 9);
			}
		});
		btn9.setBounds(121, 74, 49, 41);
		contentPane.add(btn9);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndiv.setBounds(175, 74, 49, 41);
		contentPane.add(btndiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 4);
				}else
					txtResult.setText(currentText + 4);
			}
		});
		btn4.setBounds(12, 125, 49, 41);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 5);
				}else
					txtResult.setText(currentText + 5);
			}
		});
		btn5.setBounds(67, 125, 49, 41);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 6);
				}else
					txtResult.setText(currentText + 6);
			}
		});
		btn6.setBounds(121, 125, 49, 41);
		contentPane.add(btn6);
		
		JButton btnmulti = new JButton("x");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmulti.setBounds(175, 125, 49, 41);
		contentPane.add(btnmulti);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 1);
				}else
					txtResult.setText(currentText + 1);
				
				
				
				
				
				
				
			}
		});
		btn1.setBounds(12, 176, 49, 41);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 2);
				}else
					txtResult.setText(currentText + 2);
			}
		});
		btn2.setBounds(67, 176, 49, 41);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				if (currentText.equals("0")) {
					txtResult.setText("" + 3);
				}else
					txtResult.setText(currentText + 3);
			}
		});
		btn3.setBounds(121, 176, 49, 41);
		contentPane.add(btn3);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMin.setBounds(175, 176, 49, 41);
		contentPane.add(btnMin);
		
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("0");
			
				
			 
			}
		});
		btnReset.setBounds(12, 223, 49, 41);
		contentPane.add(btnReset);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				txtResult.setText(currentText+0);
			}
		});
		btn0.setBounds(67, 223, 49, 41);
		contentPane.add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.add(Integer.parseInt(txtResult.getText()));
				total+=num.get(0);
				for(int i = 1; i<num.size(); i++) {
					if(cal.get(i-1).equals("+")){
						total += num.get(i);
					}
					else if(cal.get(i-1).equals("-")){
						total -= num.get(i);
					}
					else if(cal.get(i-1).equals("x")){
						total *= num.get(i);
					}
					else if(cal.get(i-1).equals("/")){
						total /= num.get(i);
					}
				}
				txtResult.setText(Integer.toString(total));
			}
		});
		btnEqual.setBounds(121, 223, 49, 41);
		contentPane.add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = txtResult.getText();
				num.add(Integer.parseInt(currentText));
				cal.add("+");
				txtResult.setText("");
			}
		});
		btnPlus.setBounds(175, 223, 49, 41);
		contentPane.add(btnPlus);
	}
	List<Integer> num = new ArrayList<>();
	List<String> cal = new ArrayList<>();
	int total=0;

}
