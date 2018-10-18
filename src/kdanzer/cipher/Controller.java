package kdanzer.cipher;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller implements ActionListener, ChangeListener, ComponentListener {
	/**This is the Controller which has an ActionListener implemented so the View can use Buttons
	 * 
	 * @author Kalian Danzer
	 */
	//Attribute
	private View v1;
	
	//Konstruktor
	public Controller() {
		v1 = new View(this);
	}
		
	//Methoden
	
	
	
	//Listener
	@Override
	public void actionPerformed(ActionEvent arg0) {
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
	}


	@Override
	public void componentResized(ComponentEvent e) { //Repaint Frame so the Components in the Pane updates
		try {
			this.v1.sizeAll();
		} catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	@Override public void componentMoved(ComponentEvent e) {}
	@Override public void componentShown(ComponentEvent e) {}
	@Override public void componentHidden(ComponentEvent e) {}
	
}
