package jframe;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class Test implements ActionListener
{  
	private static JButton button;
	public Test()  {

		JFrame f = new JFrame("Quel livre est fait pour vous ? (2/6)"); 
		JLabel label = new JLabel("(2) Quel cadre convient le mieux à votre humeur ?", JLabel.CENTER);
		//Définition du frame
		f.setSize(800,775);  
//		f.getContentPane().setLayout(null);  
		f.setVisible(true);  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  


		// définir la disposition du flux pour le frame
		f.getContentPane().setLayout(new GridLayout(3, 1));
		f.getContentPane().add(label);


		Icon Ihome = new ImageIcon("C:\\Users\\fblos\\OneDrive\\Bureau\\Git\\Projet\\Photo\\home.png");
		Icon Ietranger = new ImageIcon("C:\\Users\\fblos\\OneDrive\\Bureau\\Git\\Projet\\Photo\\paysetranger.png");
		Icon Iplage = new ImageIcon("C:\\Users\\fblos\\OneDrive\\Bureau\\Git\\Projet\\Photo\\plage.png");
		Icon Inuit = new ImageIcon("C:\\Users\\fblos\\OneDrive\\Bureau\\Git\\Projet\\Photo\\nuit.png");
		JButton etranger = new JButton("à l'étranger", Ietranger);
		JButton plage = new JButton("à la plage", Iplage);
		JButton nuit = new JButton("chez vous", Inuit);
		etranger.setVerticalTextPosition(SwingConstants.BOTTOM);
		etranger.setHorizontalTextPosition(SwingConstants.CENTER);
		plage.setVerticalTextPosition(SwingConstants.BOTTOM);
		plage.setHorizontalTextPosition(SwingConstants.CENTER);
		nuit.setVerticalTextPosition(SwingConstants.BOTTOM);
		nuit.setHorizontalTextPosition(SwingConstants.CENTER);

		etranger.setBounds(350,50,150,200);
		plage.setBounds(600,50,150,200);
		nuit.setBounds(600,50,150,200);
		f.getContentPane().add(etranger);  
		f.getContentPane().add(plage);  

		// JButton avec image/texte
		JButton home = new JButton("chez vous", Ihome);

		// Texte sous l'image ++ Centré
		home.setVerticalTextPosition(SwingConstants.BOTTOM);
		home.setHorizontalTextPosition(SwingConstants.CENTER);

		// Taille des images
		home.setBounds(100,50,150,200);  

		//Ajout des images au frame
		f.getContentPane().add(home);  
		f.getContentPane().add(nuit);

		//Ajout du bouton Valider
		button = new JButton("Valider");
		button.setBounds(375, 275, 100, 50);
		f.getContentPane().add(button);




	}
	public static void main(String[] args) {  
		new Test();  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}