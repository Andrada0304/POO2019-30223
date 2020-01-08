package Ghicitori;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class OkButton implements ActionListener {
	public void actionPerformed(ActionEvent e)

	{

		try {
			String t=GhicitoriView.citesteRaspunsuri();
			if((t.equals(GhicitoriView.jTf.getText()))) {
		
				GhicitoriView.corecte++;
				GhicitoriView.totale++;
				ImageIcon happyIcon = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\smiley2.jpg");
				JLabel happyLabel = new JLabel("Corect");
				
				Object[] obj = {happyLabel,happyIcon};
				JOptionPane.showMessageDialog(null, obj);
				}
				
			
			else {
				GhicitoriView.totale++;
				ImageIcon sadIcon = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\Ghicitori\\src\\Ghicitori\\sad2.jpg");
				JLabel sadLabel = new JLabel("Gresit!Raspuns corect: "+t);
				
				Object[] obj = {sadLabel,sadIcon};
				JOptionPane.showMessageDialog(null, obj);
			
			}
		} catch (HeadlessException e1) {
			
			e1.printStackTrace();
		
		}
	}	
}
