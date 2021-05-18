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
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.JRadioButton;

public class GUIQuizz9 {

	private JFrame frameQ9;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		frameQ9.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIQuizz9.class.getResource("/image/livre.png")));
		frameQ9.setBounds(100, 100, 718, 560);
		frameQ9.setTitle("Quel livre est fait pour vous ? (9/10)");
		frameQ9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameQ9.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quelle image se rapproche le plus de tes vacances de r\u00EAve ?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 416, 15);
		frameQ9.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("Suivant");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Q9 = buttonGroup.getSelection().getActionCommand();
				//System.out.println(Q9);
				GUIAffichageLivres.setRequete(GUIAffichageLivres.getRequete()+Q9);
				
				frameQ9.dispose();
				GUIQuizz10.main(null);
			}
		});
		btnNewButton_4.setBounds(609, 492, 85, 21);
		frameQ9.getContentPane().add(btnNewButton_4);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		buttonGroup.add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/Montagne.jpg")));
		tglbtnNewToggleButton.setBounds(20, 36, 280, 175);
		frameQ9.getContentPane().add(tglbtnNewToggleButton);
		tglbtnNewToggleButton.setActionCommand("montagne+");
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		buttonGroup.add(tglbtnNewToggleButton_1);
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/detail_ibiza-02.jpg")));
		tglbtnNewToggleButton_1.setBounds(411, 14, 239, 131);
		frameQ9.getContentPane().add(tglbtnNewToggleButton_1);
		tglbtnNewToggleButton_1.setActionCommand("soleil+");
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("");
		buttonGroup.add(tglbtnNewToggleButton_2);
		tglbtnNewToggleButton_2.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/papiers-peints-chalet-montagne.jpg.jpg")));
		tglbtnNewToggleButton_2.setBounds(10, 236, 280, 137);
		frameQ9.getContentPane().add(tglbtnNewToggleButton_2);
		tglbtnNewToggleButton_2.setActionCommand("chalet+");
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("");
		buttonGroup.add(tglbtnNewToggleButton_3);
		tglbtnNewToggleButton_3.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/plage-de-reve-maldives.jpg")));
		tglbtnNewToggleButton_3.setBounds(322, 340, 250, 175);
		frameQ9.getContentPane().add(tglbtnNewToggleButton_3);
		tglbtnNewToggleButton_3.setActionCommand("paradisiaque+");
		
		JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("");
		buttonGroup.add(tglbtnNewToggleButton_4);
		tglbtnNewToggleButton_4.setIcon(new ImageIcon(GUIQuizz9.class.getResource("/image/photoImposee.jpg")));
		tglbtnNewToggleButton_4.setBounds(400, 155, 250, 175);
		frameQ9.getContentPane().add(tglbtnNewToggleButton_4);
		tglbtnNewToggleButton_4.setActionCommand("j+");
	}
}
