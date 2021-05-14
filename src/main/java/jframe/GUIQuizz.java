package jframe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUIQuizz implements ActionListener	{

	private static JLabel label;
	private static JFrame frame;
	private static JPanel panel;
	private static JRadioButton btn1;
	private static JRadioButton btn2;
	private static JRadioButton btn3;
	private static JRadioButton btn4;
	private static JRadioButton btn5;
	private static JButton btnValider;
	private static String choix;
	public static void main(String[] args) {
		// Définissez le frame
		panel = new JPanel();
		frame = new JFrame("Quel livre est fait pour vous ? ");
		frame.setBounds(400, 200, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(true);


		label = new JLabel("(1) Vous voulez une recommandations pour quel type de livre ?", JLabel.CENTER);
		frame.getContentPane().add(label);

		// Définir les boutons
		btn1 = new JRadioButton("Roman");
		btn2 = new JRadioButton("Manga"); 
		btn3 = new JRadioButton("BD");
		btn4 = new JRadioButton("Recueil de Poesie");
		btn5 = new JRadioButton("Piece de Theatre");
		// Etablir une action en fonction des boutons
//		btn1.addActionListener(new GUIQuizz());
//		btn2.addActionListener(new GUIQuizz());
//		btn3.addActionListener(new GUIQuizz());
//		btn4.addActionListener(new GUIQuizz());
//		btn5.addActionListener(new GUIQuizz());
		// Ajouter les boutons au frame
		panel.add(btn1); 
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);

		// Ajouter label et panel au frame
		frame.getContentPane().setLayout(new GridLayout(2, 1));
		frame.getContentPane().add(label);
		frame.getContentPane().add(panel);
		
		// Le bouton pour valider
		btnValider = new JButton("Valider");
		btnValider.setBounds(300, 190, 25, 25);
		btnValider.addActionListener(new GUIQuizz());
		panel.add(btnValider);

		frame.pack();
		frame.setSize(487, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
            
			choix.add(btn1.getText());
            System.out.println(choix);
        }
	}

}
