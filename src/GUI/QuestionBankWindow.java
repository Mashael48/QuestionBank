package GUI;

import Classes.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class QuestionBankWindow {

	private JFrame frmQuestionBank;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionBankWindow window = new QuestionBankWindow();
					window.frmQuestionBank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuestionBankWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuestionBank = new JFrame();
		frmQuestionBank.setTitle("getCourseName() Question Bank");
		frmQuestionBank.setBounds(100, 100, 1007, 724);
		frmQuestionBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuestionBank.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Add a New Question", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(28, 52, 427, 589);
		frmQuestionBank.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quetion Text");
		lblNewLabel.setBounds(17, 52, 142, 23);
		panel.add(lblNewLabel);
		
		JLabel lblQuetionId = new JLabel("Quetion ID");
		lblQuetionId.setBounds(17, 98, 142, 23);
		panel.add(lblQuetionId);
		
		JLabel lblPossibleGrades = new JLabel("Possible Grades");
		lblPossibleGrades.setBounds(17, 140, 142, 23);
		panel.add(lblPossibleGrades);
		
		textField = new JTextField();
		textField.setBounds(213, 49, 166, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 95, 166, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 137, 166, 29);
		panel.add(textField_2);
		
		JLabel lblChooseTheType = new JLabel("Choose The Type Of The Quetion:");
		lblChooseTheType.setBounds(17, 198, 332, 23);
		panel.add(lblChooseTheType);
		
		JRadioButton rdbtnMcq = new JRadioButton("MCQ");
			

		
		rdbtnMcq.setBounds(13, 236, 88, 31);
		panel.add(rdbtnMcq);
		
		JRadioButton rdbtnTruefalse = new JRadioButton("True/False");
		rdbtnTruefalse.setBounds(133, 236, 136, 31);
		panel.add(rdbtnTruefalse);
		
		JRadioButton rdbtnFillBlank = new JRadioButton("Fill Blank");
		rdbtnFillBlank.setBounds(291, 236, 88, 31);
		panel.add(rdbtnFillBlank);
		
		//nora added:
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnMcq);
		group1.add(rdbtnTruefalse);
		group1.add(rdbtnFillBlank);
		
		
		JLabel lblCorrectAnswer = new JLabel("Correct Answer");
		lblCorrectAnswer.setBounds(17, 285, 142, 23);
		panel.add(lblCorrectAnswer);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 282, 166, 29);
		panel.add(textField_3);
		
		JButton btnAddQuestion = new JButton("Add Question");
		btnAddQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddQuestion.setBounds(244, 539, 166, 31);
		panel.add(btnAddQuestion);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Answers For MCQ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(17, 327, 362, 193);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField_9 = new JTextField();
		textField_9.setText("1");
		textField_9.setColumns(10);
		textField_9.setBounds(17, 29, 302, 29);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("2");
		textField_10.setColumns(10);
		textField_10.setBounds(17, 65, 302, 29);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("3");
		textField_11.setColumns(10);
		textField_11.setBounds(17, 107, 302, 29);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("4");
		textField_12.setColumns(10);
		textField_12.setBounds(17, 152, 302, 29);
		panel_3.add(textField_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Generate Exam", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(472, 52, 494, 416);
		frmQuestionBank.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblExamHeader = new JLabel("Exam Header");
		lblExamHeader.setBounds(30, 38, 142, 23);
		panel_1.add(lblExamHeader);
		
		JLabel lblNumberOfQuestions = new JLabel("Number Of Questions");
		lblNumberOfQuestions.setBounds(30, 84, 219, 23);
		panel_1.add(lblNumberOfQuestions);
		
		JLabel lblChapterName = new JLabel("Chapter Name");
		lblChapterName.setBounds(30, 126, 142, 23);
		panel_1.add(lblChapterName);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(267, 35, 174, 29);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(266, 81, 175, 29);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(266, 123, 175, 29);
		panel_1.add(textField_6);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("With Answers");
		chckbxNewCheckBox.setBounds(30, 171, 159, 31);
		panel_1.add(chckbxNewCheckBox);
		
		JButton btnGenerateExam = new JButton("Generate Exam");
		btnGenerateExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerateExam.setBounds(267, 171, 174, 31);
		panel_1.add(btnGenerateExam);
		
		textField_7 = new JTextField();
		textField_7.setBackground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setBounds(30, 217, 411, 180);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Delete Chapter Quetions", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(472, 487, 494, 154);
		frmQuestionBank.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Chapter Name");
		label.setBounds(61, 57, 142, 23);
		panel_2.add(label);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(271, 54, 166, 29);
		panel_2.add(textField_8);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(145, 99, 174, 31);
		panel_2.add(btnRemove);
	}
}


