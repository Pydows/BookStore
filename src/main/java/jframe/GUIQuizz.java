package jframe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUIQuizz extends JFrame implements ActionListener	{

	private static final long serialVersionUID = 1L;
	private static JLabel label;
	private static JFrame frame;
	private static JPanel panel;
	private static JRadioButton roman;
	private static JRadioButton manga;
	private static JRadioButton bd;
	private static JRadioButton recueil;
	private static JRadioButton theatre;
	private static JButton valider;
	private static ButtonGroup group;
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
		roman = new JRadioButton("Roman");
		roman.addActionListener(new GUIQuizz());

		manga = new JRadioButton("Manga"); 
		manga.addActionListener(new GUIQuizz());

		bd = new JRadioButton("BD");
		bd.addActionListener(new GUIQuizz());

		recueil = new JRadioButton("Recueil de Poesie");
		recueil.addActionListener(new GUIQuizz());

		theatre = new JRadioButton("Piece de Theatre");
		theatre.addActionListener(new GUIQuizz());

		group = new ButtonGroup();
		group.add(manga);
		group.add(bd);
		group.add(recueil);
		group.add(roman);
		group.add(theatre);

		// Ajouter les boutons au frame
		panel.add(roman); 
		panel.add(manga);
		panel.add(bd);
		panel.add(recueil);
		panel.add(theatre);

		// Ajouter label et panel au frame
		frame.getContentPane().setLayout(new GridLayout(2, 1));
		frame.getContentPane().add(label);
		frame.getContentPane().add(panel);

		// Le bouton pour valider
		valider = new JButton("Valider");
		valider.setBounds(300, 190, 25, 25);
		valider.addActionListener(new GUIQuizz());
		panel.add(valider);

		frame.pack();
		frame.setSize(487, 151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider")) {
			System.out.println("La valeur sélectionnée est: " + group.getSelection().getActionCommand());
		}
//		else if (e.getActionCommand().equals("Valider") && group.getSelection().getActionCommand()== null )
//		{
//			System.out.println("Vous devez selectionner une réponse");
//		}
	}
}
