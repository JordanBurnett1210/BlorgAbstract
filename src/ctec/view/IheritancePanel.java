package ctec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import ctec.controller.InheritanceController;
import ctec.model.Ninja;

public class IheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				textArea.setText(baseController.showSillyLevels());
				
				String temp = "The sorted contents are: \n";
				for(Ninja current: baseController.getShurikenNums())
			}
		});
	}
}
