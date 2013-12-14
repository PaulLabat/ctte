
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

/**
 *
 * @author augustin
 */

public class ClavierListener implements KeyListener{
	
	public void keyPressed(KeyEvent ke) {
		if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_X)) {
			JOptionPane.showMessageDialog(null,"CTRL + X presse");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_V)) {
			JOptionPane.showMessageDialog(null,"CTRL + V presse");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_C)) {
			JOptionPane.showMessageDialog(null,"CTRL + C presse");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_Z)) {
			JOptionPane.showMessageDialog(null,"CTRL + Z presse");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_I)) {
			JOptionPane.showMessageDialog(null,"CTRL + I presse");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_O)) {
			JOptionPane.showMessageDialog(null,"CTRL + O presse");
		}
	}

	public void keyReleased(KeyEvent event) {
		System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());         

	}
	public void keyTyped(KeyEvent event) {
		System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	}


}
