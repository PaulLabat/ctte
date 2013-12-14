
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
        if (ke.getKeyCode() == KeyEvent.VK_CONTROL) {
            ctrl = true;
        } else if (ke.getKeyCode() == KeyEvent.VK_SHIFT) {
            shift = true;
        } else if (ke.getKeyCode() == KeyEvent.VK_ALT) {
            alt = true;
        }
        System.out.println(ctrl + " " + shift);

        if (ctrl) {
            if (shift) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_C:
                        JOptionPane.showMessageDialog(null, "CTRL + shift + C presse : Fonction Copy SubTree");
                        break;
                    case KeyEvent.VK_F:
                        JOptionPane.showMessageDialog(null, "CTRL+ shift + F presse : Function Model Filter");
                        break;
                    case KeyEvent.VK_O:
                        JOptionPane.showMessageDialog(null, "CTRL+ shift + O presse : Fonction Open CTT As XML");
                        break;
                    case KeyEvent.VK_P:
                        JOptionPane.showMessageDialog(null, "CTRL+ shift + P presse : Fonction print multiple pages");
                        break;
                    case KeyEvent.VK_S:
                        JOptionPane.showMessageDialog(null, "CTRL+ shift + S presse : Fonction save as");
                        break;
                    case KeyEvent.VK_X:
                        JOptionPane.showMessageDialog(null, "CTRL + X presse : Fonction Cut SubTree");
                        break;
                }
            } else {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_A:
                        JOptionPane.showMessageDialog(null, "CTRL + A presse : Reachablety Analysis");
                        break;
                    case KeyEvent.VK_C:
                        JOptionPane.showMessageDialog(null, "CTRL + C presse : Fonction Copy Selection");
                        break;
                    case KeyEvent.VK_D:
                        JOptionPane.showMessageDialog(null, "CTRL+ D presse : Fonction Informal to Formal description");
                        break;
                    case KeyEvent.VK_F:
                        JOptionPane.showMessageDialog(null, "CTRL+ F presse : Fonction Find");
                        break;
                    case KeyEvent.VK_H:
                        JOptionPane.showMessageDialog(null, "CTRL+ H presse : Fonction Fold/unfold");
                        break;
                    case KeyEvent.VK_I:
                        JOptionPane.showMessageDialog(null, "CTRL + I presse : Fonction ");
                        break;
                    case KeyEvent.VK_J:
                        JOptionPane.showMessageDialog(null, "CTRL+ J presse : Fonction save tree as jpg");
                        break;
                    case KeyEvent.VK_L:
                        JOptionPane.showMessageDialog(null, "CTRL+ L presse : Fonction new Level");
                        break;
                    case KeyEvent.VK_N:
                        JOptionPane.showMessageDialog(null, "CTRL+ N presse : Fonction new");
                        break;
                    case KeyEvent.VK_O:
                        JOptionPane.showMessageDialog(null, "CTRL + O presse : Fonction Open");
                        break;
                    case KeyEvent.VK_P:
                        JOptionPane.showMessageDialog(null, "CTRL+ P presse : Fonction print");
                        break;
                    case KeyEvent.VK_Q:
                        JOptionPane.showMessageDialog(null, "CTRL+ Q presse : Fonction quit");
                        break;
                    case KeyEvent.VK_S:
                        JOptionPane.showMessageDialog(null, "CTRL+ S presse : Fonction save");
                        break;
                    case KeyEvent.VK_T:
                        JOptionPane.showMessageDialog(null, "CTRL+ T presse : Fonction Priority Tree");
                        break;
                    case KeyEvent.VK_U:
                        JOptionPane.showMessageDialog(null, "CTRL+ U presse : Fonction Unfold All");
                        break;
                    case KeyEvent.VK_V:
                        JOptionPane.showMessageDialog(null, "CTRL + V presse : Fonction Paste Selection");
                        break;
                    case KeyEvent.VK_X:
                        JOptionPane.showMessageDialog(null, "CTRL + X presse : Fonction Cut Selection");
                        break;
                    case KeyEvent.VK_Y:
                        JOptionPane.showMessageDialog(null, "CTRL+ Y presse : Fonction Redo");
                        break;
                    case KeyEvent.VK_Z:
                        JOptionPane.showMessageDialog(null, "CTRL + Z presse : Fonction Undo");
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
        System.out.println("Code touche relâchée : " + event.getKeyCode() + " - caractère touche relâchée : " + event.getKeyChar());
        ctrl = false;
        alt = false;
        shift = false;
        System.out.println(ctrl + " " + shift);
    }

    @Override
    public void keyTyped(KeyEvent event) {
        System.out.println("Code touche tapée : " + event.getKeyCode() + " - caractère touche tapée : " + event.getKeyChar());
    }

}
