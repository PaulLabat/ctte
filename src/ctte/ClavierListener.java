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

    ClavierListener() {
        
    }
    
    @Override
	public void keyPressed(KeyEvent event) {
        System.out.println("Code touche pressée : " + event.getKeyCode() + " - caractère touche pressée : " + event.getKeyChar());
    }

    @Override
        public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
        public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }
}
