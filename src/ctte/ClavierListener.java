
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author augustin
 */

public class ClavierListener implements KeyListener{
	
	public void keyPressed(KeyEvent event) {
		System.out.println("Code touche pressée : " + event.getKeyCode() + " - caractère touche pressée : " + event.getKeyChar());
	}

	public void keyReleased(KeyEvent event) {
		System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());         

	}
	public void keyTyped(KeyEvent event) {
		System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	}


}
