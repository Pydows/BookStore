package jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIQuizz9 {

	private JFrame frameQ9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuizz9 window = new GUIQuizz9();
					window.frameQ9.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIQuizz9() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameQ9 = new JFrame();
		frameQ9.setBounds(100, 100, 450, 300);
		frameQ9.setTitle("Quel livre est fait pour vous ? (9/10)");
		frameQ9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ9.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quelle image se rapproche le plus de tes vacances de r\u00EAve ?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 416, 15);
		frameQ9.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/Montagne.jpg")));
		btnNewButton.setBounds(10, 35, 329, 181);
		frameQ9.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/plage-de-reve-maldives.jpg")));
		btnNewButton_1.setBounds(389, 177, 252, 170);
		frameQ9.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/detail_ibiza-02.jpg")));
		btnNewButton_2.setBounds(358, 42, 306, 125);
		frameQ9.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/papiers-peints-chalet-montagne.jpg.jpg")));
		btnNewButton_3.setBounds(10, 226, 342, 189);
		frameQ9.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Valider");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameQ9.dispose();
				GUIQuizz10.main(null);
			}
		});
		btnNewButton_4.setBounds(485, 381, 85, 21);
		frameQ9.getContentPane().add(btnNewButton_4);
	}

}
