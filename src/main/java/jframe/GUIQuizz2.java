package jframe;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 

public class GUIQuizz2 implements ActionListener
{  

	private static ButtonGroup group2;

	public GUIQuizz2()  {

		JFrame f = new JFrame("Quel livre est fait pour vous ? (2/6)"); 
		JLabel label = new JLabel("(2) Quel cadre convient le mieux à votre humeur ?", JLabel.CENTER);
		f.setSize(800,775);  
		f.getContentPane().setLayout(null);  
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  


		f.getContentPane().setLayout(new GridLayout(3, 1));
		f.getContentPane().add(label);


		Icon Ihome = new ImageIcon("file:///C:/Users/fblos/OneDrive/Bureau/Git/Projet/BookStore/src/main/java/image/home.png");
		Icon Ietranger = new ImageIcon("file:///C:/Users/fblos/OneDrive/Bureau/Git/Projet/BookStore/src/main/java/image/paysetranger.png");
		Icon Iplage = new ImageIcon("file:///C:/Users/fblos/OneDrive/Bureau/Git/Projet/BookStore/src/main/java/image/plage.png");
		Icon Inuit = new ImageIcon("file:///C:/Users/fblos/OneDrive/Bureau/Git/Projet/BookStore/src/main/java/image/nuit.png");
		
		JButton home = new JButton("chez vous", Ihome);
		home.setActionCommand("maison");
		JButton etranger = new JButton("à l'étranger", Ietranger);
		etranger.setActionCommand("étranger");
		JButton plage = new JButton("à la plage", Iplage);
		plage.setActionCommand("plage");
		JButton nuit = new JButton("la nuit", Inuit);
		nuit.setActionCommand("nuit");
		
		f.getContentPane().add(etranger);  
		f.getContentPane().add(plage);  
		f.getContentPane().add(home);  
		f.getContentPane().add(nuit);
		
		home.setVerticalTextPosition(SwingConstants.BOTTOM);
		home.setHorizontalTextPosition(SwingConstants.CENTER);
		etranger.setVerticalTextPosition(SwingConstants.BOTTOM);
		etranger.setHorizontalTextPosition(SwingConstants.CENTER);
		plage.setVerticalTextPosition(SwingConstants.BOTTOM);
		plage.setHorizontalTextPosition(SwingConstants.CENTER);
		nuit.setVerticalTextPosition(SwingConstants.BOTTOM);
		nuit.setHorizontalTextPosition(SwingConstants.CENTER);

		home.setBounds(100,50,150,200);  
		etranger.setBounds(350,50,150,200);
		plage.setBounds(600,50,150,200);
		nuit.setBounds(600,50,150,200);

		f.setVisible(true);  

		JButton button = new JButton("Valider");
		button.setBounds(375, 275, 100, 50);
		f.getContentPane().add(button);
		button.addActionListener(this);
		
		group2 = new ButtonGroup();
		
		group2.add(home);
		group2.add(etranger);
		group2.add(plage);
		group2.add(nuit);
		
		f.add(home);
		f.add(etranger);
		f.add(plage);
		f.add(nuit);
		f.add(button);
		




	}
	public static void main(String[] args) {  
		new Test();  
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Valider")) {
			System.out.println("Le radio bouton sélectionné est : " + 
					group2.getSelection().getActionCommand());
//			frame.dispose();
//			GUIQuizz2.main(null);
		}

	}
}
