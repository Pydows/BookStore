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

public class GUIQuizz1 extends JFrame implements ActionListener	{

	private static ButtonGroup group;
	private static JFrame frame;
	private static void init() 
	{
		// Définissez le frame
		JPanel panel = new JPanel();
		frame = new JFrame("Quel livre est fait pour vous ? (1/6) ");
		frame.setBounds(50, 50, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);


		JLabel label = new JLabel("(1) Vous voulez une recommandations pour quel type de livre ?", JLabel.CENTER);
		frame.getContentPane().add(label);

		frame.setVisible(true);

		// définir la disposition du flux pour le frame
		frame.getContentPane().setLayout(new GridLayout(4, 1));
		frame.getContentPane().add(label);
		frame.getContentPane().add(panel);


		JRadioButton roman = new JRadioButton("roman");
		roman.setActionCommand("roman");

		JRadioButton manga = new JRadioButton("manga");
		manga.setActionCommand("manga");

		JRadioButton bd = new JRadioButton("bd");
		bd.setActionCommand("bd");

		JRadioButton recueil = new JRadioButton("recueil de poesie");
		recueil.setActionCommand("recueil de poesie");

		JRadioButton theatre = new JRadioButton("piece de theatre");
		theatre.setActionCommand("piece de theatre");

		roman.setSelected(true);

		JButton btn = new JButton("Valider");
		btn.addActionListener(new GUIQuizz1());


		group = new ButtonGroup();

		//ajouter des boutons radio
		group.add(roman);
		group.add(manga);
		group.add(bd);
		group.add(recueil);
		group.add(theatre);

		frame.add(roman);
		frame.add(manga);
		frame.add(bd);
		frame.add(recueil);
		frame.add(theatre);
		frame.add(btn);

	}

	public static void main(String[] args) {
		//créer et afficher l'interface graphique
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				init();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider")) {
			System.out.println("Le radio bouton sélectionné est : " + 
					group.getSelection().getActionCommand());
			frame.dispose();
			GUIQuizz2.main(null);
		}
	}
}