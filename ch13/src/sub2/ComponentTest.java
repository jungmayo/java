package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField plus1;
	private JTextField plus2;
	private JTextField plusResult;
	private JTextField min1;
	private JTextField min2;
	private JTextField minResult;
	private JTextField multi1;
	private JTextField multi2;
	private JTextField multiResult;
	private JTextField div1;
	private JTextField div2;
	private JTextField divResult;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
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
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 76, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1버튼 클릭");
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Error");
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼 3 클릭","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭!");
				}else
					System.out.println("NO 클릭!");
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 104, 170, 15);
		contentPane.add(lblNewLabel_1_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(66, 126, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		JLabel txt = new JLabel("아이디");
		txt.setBounds(12, 129, 57, 15);
		contentPane.add(txt);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(260, 129, 57, 15);
		contentPane.add(lbResultUid);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : " + uid);
			}
		});
		btnUid.setBounds(191, 125, 64, 23);
		contentPane.add(btnUid);
		

		
		JLabel Name = new JLabel("이름");
		Name.setBounds(12, 158, 57, 15);
		contentPane.add(Name);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(66, 155, 116, 21);
		contentPane.add(txtName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(260, 158, 57, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name = txtName.getText();
				lbResultName.setText("결과 : " + Name);
			}
		});
		btnName.setBounds(191, 154, 64, 23);
		contentPane.add(btnName);
		

		
		JLabel Hp = new JLabel("휴대폰");
		Hp.setBounds(12, 187, 57, 15);
		contentPane.add(Hp);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(66, 184, 116, 21);
		contentPane.add(txtHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(260, 187, 57, 15);
		contentPane.add(lbResultHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hp = txtHp.getText();
				lbResultHp.setText("결과 : " + Hp);
			}
		});
		btnHp.setBounds(191, 183, 64, 23);
		contentPane.add(btnHp);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("덧셈");
		lblNewLabel_1_1_1.setBounds(12, 222, 57, 15);
		contentPane.add(lblNewLabel_1_1_1);
		
		plus1 = new JTextField();
		plus1.setColumns(10);
		plus1.setBounds(66, 219, 61, 21);
		contentPane.add(plus1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("+");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setBounds(113, 223, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		plus2 = new JTextField();
		plus2.setColumns(10);
		plus2.setBounds(152, 219, 57, 21);
		contentPane.add(plus2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setBounds(201, 222, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		plusResult = new JTextField();
		plusResult.setColumns(10);
		plusResult.setBounds(242, 220, 57, 21);
		contentPane.add(plusResult);
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int a = Integer.parseInt(plus1.getText());
				int b = Integer.parseInt(plus2.getText());
				
				plusResult.setText(""+(a+b));
				
				
			}
		});
		btnPlus.setBounds(311, 220, 64, 23);
		contentPane.add(btnPlus);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("뺄셈");
		lblNewLabel_1_1_1_2.setBounds(12, 250, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		min1 = new JTextField();
		min1.setColumns(10);
		min1.setBounds(66, 247, 61, 21);
		contentPane.add(min1);
		
		min2 = new JTextField();
		min2.setColumns(10);
		min2.setBounds(152, 247, 57, 21);
		contentPane.add(min2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("-");
		lblNewLabel_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_2.setBounds(113, 251, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("=");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setBounds(201, 250, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		minResult = new JTextField();
		minResult.setColumns(10);
		minResult.setBounds(242, 248, 57, 21);
		contentPane.add(minResult);
		
		JButton btnMin = new JButton("확인");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int a = Integer.parseInt(min1.getText());
				int b = Integer.parseInt(min2.getText());
				minResult.setText("" + (a-b));
			}
		});
		btnMin.setBounds(311, 248, 64, 23);
		contentPane.add(btnMin);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("곱셈");
		lblNewLabel_1_1_1_3.setBounds(12, 278, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		multi1 = new JTextField();
		multi1.setColumns(10);
		multi1.setBounds(66, 275, 61, 21);
		contentPane.add(multi1);
		
		multi2 = new JTextField();
		multi2.setColumns(10);
		multi2.setBounds(152, 275, 57, 21);
		contentPane.add(multi2);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("x");
		lblNewLabel_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_3.setBounds(113, 279, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("=");
		lblNewLabel_1_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_2.setBounds(201, 278, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1_2);
		
		multiResult = new JTextField();
		multiResult.setColumns(10);
		multiResult.setBounds(242, 276, 57, 21);
		contentPane.add(multiResult);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(multi1.getText());
				int b = Integer.parseInt(multi2.getText());
				multiResult.setText("" + (a*b));
			}
		});
		btnMulti.setBounds(311, 276, 64, 23);
		contentPane.add(btnMulti);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("나눗셈");
		lblNewLabel_1_1_1_4.setBounds(12, 306, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		div1 = new JTextField();
		div1.setColumns(10);
		div1.setBounds(66, 303, 61, 21);
		contentPane.add(div1);
		
		div2 = new JTextField();
		div2.setColumns(10);
		div2.setBounds(152, 303, 57, 21);
		contentPane.add(div2);
		
		JLabel lblNewLabel_1_1_1_1_4 = new JLabel("/");
		lblNewLabel_1_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_4.setBounds(113, 307, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("=");
		lblNewLabel_1_1_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_3.setBounds(201, 306, 57, 15);
		contentPane.add(lblNewLabel_1_1_1_1_1_3);
		
		divResult = new JTextField();
		divResult.setColumns(10);
		divResult.setBounds(242, 304, 57, 21);
		contentPane.add(divResult);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(div1.getText());
				int b = Integer.parseInt(div2.getText());
				divResult.setText("" + (a/b));
			}
		});
		btnDiv.setBounds(311, 304, 64, 23);
		contentPane.add(btnDiv);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("체크박스 실습");
		lblNewLabel_1_1_2.setBounds(12, 349, 170, 15);
		contentPane.add(lblNewLabel_1_1_2);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 369, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(66, 369, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(121, 370, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(175, 369, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(230, 369, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbResultCheck = new JLabel("결과 :");
		lbResultCheck.setBounds(12, 398, 382, 15);
		contentPane.add(lbResultCheck);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<String>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				lbResultCheck.setText("결과 : " + cities);
				
			}
			
		});
		btnCheck.setBounds(297, 369, 97, 23);
		contentPane.add(btnCheck);
		
		table = new JTable();
		table.setBounds(22, 447, 382, 104);
		contentPane.add(table);
		
		JLabel lblNewLabel_2 = new JLabel("테이블 실습");
		lblNewLabel_2.setBounds(12, 422, 97, 15);
		contentPane.add(lblNewLabel_2);
		
		//테이블 설정
		String[] columNames = {"아이디","이름","나이","휴대폰"};
		
		DefaultTableModel model = new DefaultTableModel(columNames, 0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<Person> persons = new ArrayList<Person>();
				persons.add(new Person("a101","김유신",20,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",21,"010-1234-1002"));
				persons.add(new Person("a103","장보고",22,"010-1234-1003"));
				persons.add(new Person("a104","강감찬",23,"010-1234-1004"));
				persons.add(new Person("a105","이순신",24,"010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
				}
				
				
			}
		});
		btnTable.setBounds(12, 561, 97, 23);
		contentPane.add(btnTable);
		

		
		

	}
}
