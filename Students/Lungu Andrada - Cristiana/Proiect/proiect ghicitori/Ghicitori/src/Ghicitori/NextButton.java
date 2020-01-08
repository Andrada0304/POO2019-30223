package Ghicitori;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class NextButton implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
			if(CitesteGhicitori.itRid.hasNext()) {
				String c;
				GhicitoriView.ab++;
				if(GhicitoriView.nb<GhicitoriView.ab) {
					GhicitoriView.nb++;
					GhicitoriView.citesteIndicii();
				}
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
				hintsButton.addActionListener(new HintsButton());
				ImageIcon keyIcon = new ImageIcon("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Ghicitori\\\\src\\\\Ghicitori\\\\key2.png");
				hintsButton.setSize(100,00);
				hintsButton.setIcon(keyIcon);
				GhicitoriView.p1.add(hintsButton);
				
				GhicitoriView.p1.add(GhicitoriView.nextButton);
				
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Sfarsitul jocului! Ati raspuns corect la "+ GhicitoriView.corecte+
				" ghicitori ,din " +GhicitoriView.totale+" totale!");
			}
			GhicitoriView.frame.add(GhicitoriView.p1);
			GhicitoriView.frame.setVisible(true);
			
		
		
	}
	
}
