package Ghicitori;

import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class GhicitoriView extends JFrame {
	static JFrame frame;
	static JPanel p;
	static JPanel p1;
	static JTextField jTf;
	static JLabel jlb;
	static int nb;
	static int ab;
	static int corecte;
	static int totale;
	static JButton nextButton;

	
	public static String citesteRaspunsuri() {
		String a=CitesteGhicitori.itAns.next();
		return a;
	}
	public static String citesteIndicii() {
		String a=CitesteGhicitori.itHin.next();
		return a;
	}

	@SuppressWarnings("null")
	
	GhicitoriView() throws FileNotFoundException	{
		corecte=0;
		totale=0;
		frame=new JFrame("Riddle Game");
		//frame.setSize(200,500);
		frame.setBounds(500,100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		CitesteGhicitori.citesteGhicitori();
		CitesteGhicitori.citesteRaspunsuri();
		CitesteGhicitori.citesteIndicii();
		
		p=new JPanel();
		p.setBackground(Color.darkGray);
		JButton startButton=new JButton("");
		ImageIcon pressIcon = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\pressstart.png");
		startButton.setSize(700, 700);
		startButton.setIcon(pressIcon);
		//startButton.setBackground(Color.red);
		startButton.addActionListener(new StartButton());
	
		p.add(startButton);
		
		
		frame.add(p);
		frame.setVisible(true);
	}
		
		
	}

