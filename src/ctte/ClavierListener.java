
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
	
        @Override
	public void keyPressed(KeyEvent ke) {
		if (/*(ke.getModifiers()==KeyEvent.CTRL_MASK) && */(ke.getKeyCode()==KeyEvent.VK_C) && (ke.getKeyCode()==KeyEvent.VK_SHIFT)) {
			JOptionPane.showMessageDialog(null,"CTRL + O presse : Fonction Copy SubTree");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_X) && (ke.getKeyCode()==KeyEvent.VK_SHIFT)) {
			JOptionPane.showMessageDialog(null,"CTRL + O presse : Fonction Cut SubTree");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_O)) {
			JOptionPane.showMessageDialog(null,"CTRL + O presse : Fonction Open");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_X)) {
			JOptionPane.showMessageDialog(null,"CTRL + X presse : Fonction Cut Selection");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_V)) {
			JOptionPane.showMessageDialog(null,"CTRL + V presse : Fonction Paste Selection");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_C)) {
			JOptionPane.showMessageDialog(null,"CTRL + C presse : Fonction Copy Selection");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_Z)) {
			JOptionPane.showMessageDialog(null,"CTRL + Z presse : Fonction Undo");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_I)) {
			JOptionPane.showMessageDialog(null,"CTRL + I presse : Fonction ");
		}
		else if ((ke.getModifiers()==KeyEvent.CTRL_MASK) && (ke.getKeyCode()==KeyEvent.VK_O)) {
			JOptionPane.showMessageDialog(null,"CTRL + O presse : Fonction Open");
		}
		
	}

        @Override
	public void keyReleased(KeyEvent event) {
		System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());         

	}
        @Override
	public void keyTyped(KeyEvent event) {
		System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	}


}
