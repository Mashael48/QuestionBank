package GUI;

import Classes.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ExamManagerWindow {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamManagerWindow window = new ExamManagerWindow();
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
	public ExamManagerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Previous Courses");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(44, 70, 168, 23);
		panel.add(label);
		
		
		JLabel label_1 = new JLabel("New Course");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(44, 166, 168, 23);
		panel.add(label_1);
		
	
		textField = new JTextField();
		
		
		//ExamManager examManager;
		
		//Nora added
		String cName =textField.getText();
		textField.setColumns(10);
		textField.setBounds(63, 199, 166, 29);
		panel.add(textField);
		
	
		
		
		String fileSelected="";
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
			   // fileSelected = (String)cb.getSelectedItem();
			    	
			}
		});
		comboBox.setBounds(63, 112, 124, 23);
		panel.add(comboBox);
		
		DefaultComboBoxModel m = new DefaultComboBoxModel();
		//m.addElement(getFileNames());
		
		
	
		JButton button = new JButton("Open Question Bank");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				
			}
		});
		button.setBounds(35, 257, 229, 38);
		panel.add(button);
	}


}
