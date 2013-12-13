package ctte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClavierListener implements KeyListener{
	
	public void keyPressed(KeyEvent event) {
		System.out.println("Code touche press�e : " + event.getKeyCode() + " - caract�re touche press�e : " + event.getKeyChar());
	}

	public void keyReleased(KeyEvent event) {
		System.out.println("Code touche rel�ch�e : " + event.getKeyCode() + " - caract�re touche rel�ch�e : " + event.getKeyChar());         

	}
	public void keyTyped(KeyEvent event) {
		System.out.println("Code touche tap�e : " + event.getKeyCode() + " - caract�re touche tap�e : " + event.getKeyChar());
	}


}
