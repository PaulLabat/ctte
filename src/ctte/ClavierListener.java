
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
public class ClavierListener implements KeyListener {

	boolean ctrl = false;
	boolean shift = false;
	boolean alt = false;

	@Override
	public void keyPressed(KeyEvent ke) {
		if (ke.getKeyCode() == KeyEvent.VK_META) {
			ctrl = true;
		} else if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
			shift = true;
		} else if (ke.getKeyCode() == KeyEvent.VK_ALT) {
			alt = true;
		}
		//System.out.println(ctrl + " " + shift);

		if (ctrl) {
			if (shift) {
				switch (ke.getKeyCode()) {
				case KeyEvent.VK_C:
					JOptionPane.showMessageDialog(null, "command + shift + C presse : Fonction Copy SubTree");
					shift = false;
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_F:
					JOptionPane.showMessageDialog(null, "command + shift + F presse : Function Model Filter");
					shift = false;
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_O:
					JOptionPane.showMessageDialog(null, "command + shift + O presse : Fonction Open CTT As XML");
					shift = false;
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_P:
					JOptionPane.showMessageDialog(null, "command + shift + P presse : Fonction print multiple pages");
					shift = false;
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_S:
					JOptionPane.showMessageDialog(null, "command + shift + S presse : Fonction save as");
					shift = false;
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_X:
					JOptionPane.showMessageDialog(null, "command + shift + X presse : Fonction Cut SubTree");
					shift = false;
					alt = false;
					ctrl = false;
					break;
				}
			} else {
				switch (ke.getKeyCode()) {
				case KeyEvent.VK_A:
					JOptionPane.showMessageDialog(null, "command + A presse : Reachablety Analysis");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_C:
					JOptionPane.showMessageDialog(null, "command + C presse : Fonction Copy Selection");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_D:
					JOptionPane.showMessageDialog(null, "command + D presse : Fonction Informal to Formal description");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_F:
					JOptionPane.showMessageDialog(null, "command + F presse : Fonction Find");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_H:
					JOptionPane.showMessageDialog(null, "command + H presse : Fonction Fold/unfold");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_I:
					JOptionPane.showMessageDialog(null, "commandL + I presse : Fonction ");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_J:
					JOptionPane.showMessageDialog(null, "command + J presse : Fonction save tree as jpg");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_L:
					JOptionPane.showMessageDialog(null, "command + L presse : Fonction new Level");
					ctrl = false;
					break;
				case KeyEvent.VK_N:
					JOptionPane.showMessageDialog(null, "command + N presse : Fonction new");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_O:
					JOptionPane.showMessageDialog(null, "command + O presse : Fonction Open");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_P:
					JOptionPane.showMessageDialog(null, "command + P presse : Fonction print");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_Q:
					JOptionPane.showMessageDialog(null, "command + Q presse : Fonction quit");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_S:
					JOptionPane.showMessageDialog(null, "command + S presse : Fonction save");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_T:
					JOptionPane.showMessageDialog(null, "command + T presse : Fonction Priority Tree");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_U:
					JOptionPane.showMessageDialog(null, "command + U presse : Fonction Unfold All");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_V:
					JOptionPane.showMessageDialog(null, "command + V presse : Fonction Paste Selection");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_X:
					JOptionPane.showMessageDialog(null, "CTRL + X presse : Fonction Cut Selection");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_Y:
					JOptionPane.showMessageDialog(null, "CTRL+ Y presse : Fonction Redo");
					ctrl = false;
					alt = false;
					break;
				case KeyEvent.VK_Z:
					JOptionPane.showMessageDialog(null, "CTRL + Z presse : Fonction Undo");
					ctrl = false;
					alt = false;
					break;
				}
			}
		} else if (ke.getKeyCode() == KeyEvent.VK_DELETE) {
			JOptionPane.showMessageDialog(null, "Delete presse : Fonction Supprimer la selection");
		} else if (ke.getKeyCode() == KeyEvent.VK_INSERT) {
			JOptionPane.showMessageDialog(null, "Insert presse : Fonction Inserer");
		} else if (ke.getKeyCode() == KeyEvent.VK_F4) {
			JOptionPane.showMessageDialog(null, "F4 presse : Fonction start task model simulator");
		} else if (ke.getKeyCode() == KeyEvent.VK_F7) {
			JOptionPane.showMessageDialog(null, "F7 presse : Fonction check model structure");
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		//System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());
		ctrl = false;
		alt = false;
		shift = false;
		//System.out.println(ctrl + " " + shift);
	}

	@Override
	public void keyTyped(KeyEvent event) {
		//System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
	}

}
