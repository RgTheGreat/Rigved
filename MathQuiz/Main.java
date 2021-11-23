package math_quiz;
import java.lang.NumberFormatException;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.ArithmeticException;
public class MathQuiz {

	private JFrame frame;
	private JTextField question;
	private JTextField ans;
	private int correct = 0;
	private int wrong = 0;
	private int chances = 1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathQuiz window = new MathQuiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MathQuiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String[] operators = {"+", "-", "*", "/"};

		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MATH QUIZ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(65, 10, 292, 61);
		frame.getContentPane().add(lblNewLabel);
		
		question = new JTextField();
		question.setFont(new Font("Tahoma", Font.PLAIN, 18));
		question.setEditable(false);
		question.setBounds(117, 81, 261, 38);
		frame.getContentPane().add(question);
		question.setColumns(10);
		Random random = new Random();
		
		int randint = random.nextInt(operators.length);
		int num1 = random.nextInt(10);
		int num2 = random.nextInt(10);
		
		question.setText(num1 + operators[randint] + num2);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 81, 87, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Answer");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(10, 143, 109, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		ans = new JTextField();
		ans.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ans.setColumns(10);
		ans.setBounds(117, 143, 261, 38);
		frame.getContentPane().add(ans);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.PLAIN, 19));
		result.setBounds(304, 197, 132, 56);
		frame.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("Submit");

		
		JLabel lblNewLabel_3 = new JLabel("Round 1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(10, 10, 87, 51);
		frame.getContentPane().add(lblNewLabel_3);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chances++;
				lblNewLabel_3.setText("Round " + chances);
				try {
				String get_question = question.getText();
				String get_answer = ans.getText();
				int get2 = Integer.parseInt(get_answer);
				if (get_question.contains("+")) {
				String[] get = get_question.split("\\+");
				int num1 = Integer.parseInt(get[0]);
				int num2 = Integer.parseInt(get[1]);

				if (num1 + num2 == get2) {
					result.setText("Correct!");
					correct++;
				}else {
					result.setText("Wrong!");
					wrong++;
				}
				}else if (get_question.contains("-")) {
					String[] min_num = get_question.split("-");
					int m_num1 = Integer.parseInt(min_num[0]);
					int m_num2 = Integer.parseInt(min_num[1]);
					if (m_num1 - m_num2 == get2) {
						result.setText("Correct!");
						correct++;
					}else {
						result.setText("Wrong!");
						wrong++;
					}
				}else if (get_question.contains("*")) {
					String[] mul_num = get_question.split("\\*");
					int mu_num1 = Integer.parseInt(mul_num[0]);
					int mu_num2 = Integer.parseInt(mul_num[1]);
					if (mu_num1 * mu_num2 == get2) {
						result.setText("Correct!");
						correct++;
					}else {
						result.setText("Wrong!");
						wrong++;
					}
				}else if (get_question.contains("/")) {
					String[] d_num = get_question.split("/");
					int d_num1 = Integer.parseInt(d_num[0]);
					int d_num2 = Integer.parseInt(d_num[1]);
					if (d_num1 / d_num2 == get2) {
						result.setText("Correct!");
						correct++;
					}else {
						result.setText("Wrong!");
						wrong++;
					}
				}else {
					;
				}
				
				}catch (ArithmeticException n) {
					n.printStackTrace();
				}
				
				int randint = random.nextInt(operators.length);
				int num12 = random.nextInt(10);
				int num22 = random.nextInt(10);
				
				question.setText(num12 + operators[randint] + num22);
				
			}
		});
		

		if (chances == 10) {
			JFrame result1 = new JFrame("Your results");
			JPanel result_panel = new JPanel();
			JLabel correct_label = new JLabel("Correct - " + Integer.toString(correct));
			JLabel wrong_label = new JLabel("Wrong - " + Integer.toString(wrong));
		result_panel.add(correct_label, wrong_label);
		result1.add(result_panel);
		result1.setVisible(true);
		result1.setSize(500, 500);
			
		}
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 191, 139, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("revalidate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int randint = random.nextInt(operators.length);
				int num12 = random.nextInt(10);
				int num22 = random.nextInt(10);
				
				question.setText(num12 + operators[randint] + num22);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(164, 196, 118, 31);
		frame.getContentPane().add(btnNewButton_1);
		

		

	}
}
