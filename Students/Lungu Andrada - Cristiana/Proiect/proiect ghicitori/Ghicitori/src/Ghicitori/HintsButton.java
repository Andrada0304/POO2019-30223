package Ghicitori;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class HintsButton implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		GhicitoriView.nb++;
		JOptionPane.showMessageDialog(null,GhicitoriView.citesteIndicii());

	}
}
