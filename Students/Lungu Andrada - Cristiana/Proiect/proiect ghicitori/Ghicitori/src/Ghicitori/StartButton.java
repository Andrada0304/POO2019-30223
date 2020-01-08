package Ghicitori;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartButton implements ActionListener{

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		GhicitoriView.p.setVisible(false);
		GhicitoriView.frame.setVisible(true);
		GhicitoriView.nb=0;
		GhicitoriView.ab=0;
		String c;
		GhicitoriView.p1=new JPanel();
		GhicitoriView.p1.setBackground(Color.LIGHT_GRAY);
		c=CitesteGhicitori.itRid.next();
		JLabel gh=new JLabel(c);
		
		GhicitoriView.p1.add(gh);

		GhicitoriView.jlb=new JLabel("Introduceti raspunsul:");
		GhicitoriView.p1.add(GhicitoriView.jlb);
		GhicitoriView.jTf=new JTextField(20);
		GhicitoriView.p1.add(GhicitoriView.jTf);
		
		
		JButton okButton=new JButton("Ok");	
		okButton.addActionListener((new OkButton()));
		GhicitoriView.p1.add(okButton);
		
		JButton hintsButton=new JButton("Hints");
		ImageIcon keyIcon = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\key2.png");
		hintsButton.setSize(50,00);
		hintsButton.setIcon(keyIcon);
		hintsButton.addActionListener(new HintsButton());
		
		GhicitoriView.p1.add(hintsButton);
		GhicitoriView.nextButton=new JButton("Next");
		GhicitoriView.nextButton.addActionListener(new NextButton()); 
		GhicitoriView.p1.add(GhicitoriView.nextButton);
		GhicitoriView.frame.add(GhicitoriView.p1);
		GhicitoriView.frame.setVisible(true);
	
	}

}
