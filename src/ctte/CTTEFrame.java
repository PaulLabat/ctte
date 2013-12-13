package ctte;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CTTEFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CTTEFrame frame = new CTTEFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CTTEFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 475);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		panel.add(menuBar, BorderLayout.NORTH);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		mnFile.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New ");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(mntmNewMenuItem_1);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmOpenCttAs = new JMenuItem("Open CTT As XML");
		mntmOpenCttAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFile.add(mntmOpenCttAs);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenu mnSaveAs = new JMenu("Save As");
		mnFile.add(mnSaveAs);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save as");
		mnSaveAs.add(mntmSaveAs);
		mntmSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		
		JMenuItem mntmSaveSubtreeAs = new JMenuItem("Save SubTree As");
		mnSaveAs.add(mntmSaveSubtreeAs);
		
		JMenuItem mntmSaveCttAs = new JMenuItem("Save CTT As XML");
		mnSaveAs.add(mntmSaveCttAs);
		
		JSeparator separator_3 = new JSeparator();
		mnSaveAs.add(separator_3);
		
		JMenuItem mntmSaveTreeAs = new JMenuItem("Save Tree As JPG");
		mntmSaveTreeAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_MASK));
		mnSaveAs.add(mntmSaveTreeAs);
		
		JMenuItem mntmSaveSubtreeAs_1 = new JMenuItem("Save SubTree As JPG");
		mnSaveAs.add(mntmSaveSubtreeAs_1);
		
		JSeparator separator_4 = new JSeparator();
		mnFile.add(separator_4);
		
		JMenuItem mntmPrint = new JMenuItem("Print");
		mntmPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnFile.add(mntmPrint);
		
		JMenuItem mntmPrintInMultiple = new JMenuItem("Print in Multiple Pages");
		mntmPrintInMultiple.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFile.add(mntmPrintInMultiple);
		
		JSeparator separator_5 = new JSeparator();
		mnFile.add(separator_5);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnFile.add(mntmQuit);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setMnemonic('E');
		mnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mnEdit.add(mntmRedo);
		
		JSeparator separator = new JSeparator();
		mnEdit.add(separator);
		
		JMenuItem mntmCutSelection = new JMenuItem("Cut Selection");
		mntmCutSelection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCutSelection);
		
		JMenuItem mntmCutSubtree = new JMenuItem("Cut SubTree");
		mntmCutSubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEdit.add(mntmCutSubtree);
		
		JMenuItem mntmCopySelection = new JMenuItem("Copy Selection");
		mntmCopySelection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopySelection);
		
		JMenuItem mntmCopySubtree = new JMenuItem("Copy SubTree");
		mntmCopySubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEdit.add(mntmCopySubtree);
		
		JMenuItem mntmPaste = new JMenuItem("Paste");
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mntmDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnEdit.add(mntmDelete);
		
		JSeparator separator_6 = new JSeparator();
		mnEdit.add(separator_6);
		
		JMenuItem mntmFind = new JMenuItem("Find...");
		mntmFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnEdit.add(mntmFind);
		
		JMenu mnView = new JMenu("View");
		mnView.setMnemonic('V');
		mnView.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnView);
		
		JMenuItem mntmTaskProperties = new JMenuItem("Task Properties...");
		mnView.add(mntmTaskProperties);
		
		JMenuItem mntmIconRepresentation = new JMenuItem("Icon Representation");
		mnView.add(mntmIconRepresentation);
		
		JSeparator separator_7 = new JSeparator();
		mnView.add(separator_7);
		
		JMenuItem mntmPriorityTree = new JMenuItem("Priority Tree");
		mntmPriorityTree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnView.add(mntmPriorityTree);
		
		JSeparator separator_8 = new JSeparator();
		mnView.add(separator_8);
		
		JMenu mnTaskModelBy = new JMenu("Task Model by levels");
		mnView.add(mnTaskModelBy);
		
		JRadioButtonMenuItem rdbtnmntmAllLevels = new JRadioButtonMenuItem("All levels");
		rdbtnmntmAllLevels.setSelected(true);
		mnTaskModelBy.add(rdbtnmntmAllLevels);
		
		JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("0");
		mnTaskModelBy.add(radioButtonMenuItem);
		
		JSeparator separator_10 = new JSeparator();
		mnView.add(separator_10);
		
		JCheckBoxMenuItem chckbxmntmCooperativeMode = new JCheckBoxMenuItem("Cooperative mode");
		mnView.add(chckbxmntmCooperativeMode);
		
		JSeparator separator_9 = new JSeparator();
		mnView.add(separator_9);
		
		JMenuItem mntmFoldunfoldSubtree = new JMenuItem("Fold/Unfold SubTree");
		mntmFoldunfoldSubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnView.add(mntmFoldunfoldSubtree);
		
		JMenuItem mntmUnfoldAll = new JMenuItem("Unfold All");
		mntmUnfoldAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnView.add(mntmUnfoldAll);
		
		JMenu mnInfo = new JMenu("Info");
		mnInfo.setMnemonic('I');
		mnInfo.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnInfo);
		
		JMenuItem mntmTaskModelStatistics = new JMenuItem("Task Model Statistics");
		mnInfo.add(mntmTaskModelStatistics);
		
		JMenu mnInsert = new JMenu("Insert");
		mnInsert.setMnemonic('N');
		mnInsert.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnInsert);
		
		JRadioButtonMenuItem rdbtnmntmBelowchild = new JRadioButtonMenuItem("Below (child)");
		rdbtnmntmBelowchild.setSelected(true);
		mnInsert.add(rdbtnmntmBelowchild);
		
		JRadioButtonMenuItem rdbtnmntmToTheLeft = new JRadioButtonMenuItem("To the left (sibling)");
		mnInsert.add(rdbtnmntmToTheLeft);
		
		JSeparator separator_11 = new JSeparator();
		mnInsert.add(separator_11);
		
		JMenuItem mntmSubtreeFromFile = new JMenuItem("SubTree From File");
		mntmSubtreeFromFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, 0));
		mnInsert.add(mntmSubtreeFromFile);
		
		JMenuItem mntmNewLevel = new JMenuItem("New Level");
		mntmNewLevel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mnInsert.add(mntmNewLevel);
		
		JMenu mnTools = new JMenu("Tools");
		mnTools.setMnemonic('T');
		mnTools.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnTools);
		
		JMenuItem mntmModelFilter = new JMenuItem("Model Filter");
		mntmModelFilter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnTools.add(mntmModelFilter);
		
		JSeparator separator_12 = new JSeparator();
		mnTools.add(separator_12);
		
		JMenuItem mntmInformalToFormal = new JMenuItem("Informal to formal description");
		mntmInformalToFormal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnTools.add(mntmInformalToFormal);
		
		JSeparator separator_13 = new JSeparator();
		mnTools.add(separator_13);
		
		JMenuItem mntmCheckModelStructure = new JMenuItem("Check Model Structure");
		mntmCheckModelStructure.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		mnTools.add(mntmCheckModelStructure);
		
		JSeparator separator_14 = new JSeparator();
		mnTools.add(separator_14);
		
		JMenuItem mntmStartTaskModel = new JMenuItem("Start Task Model Simulator");
		mntmStartTaskModel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mnTools.add(mntmStartTaskModel);
		
		JSeparator separator_15 = new JSeparator();
		mnTools.add(separator_15);
		
		JMenuItem mntmReachablelityAnalysis = new JMenuItem("Reachablelity Analysis");
		mntmReachablelityAnalysis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
		mnTools.add(mntmReachablelityAnalysis);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		mnHelp.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnHelp);
		
		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mnHelp.add(mntmWelcome);
		
		JSeparator separator_16 = new JSeparator();
		mnHelp.add(separator_16);
		
		JMenuItem mntmHelpContent = new JMenuItem("Help Content");
		mnHelp.add(mntmHelpContent);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnHelp.add(mntmSearch);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setToolTipText("New");
		panel_7.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setToolTipText("Open");
		panel_7.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setToolTipText("Save");
		panel_7.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setToolTipText("Print");
		panel_7.add(btnNewButton_6);
		
		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 6, 0, 0));
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setToolTipText("Cut SubTree");
		panel_8.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setToolTipText("Copy SubTree");
		panel_8.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setToolTipText("Paste");
		panel_8.add(btnNewButton_10);
		
		JButton button = new JButton("New button");
		button.setToolTipText("Delete");
		panel_8.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setToolTipText("Undo");
		panel_8.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setToolTipText("Redo");
		panel_8.add(button_2);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setToolTipText("Properties");
		panel_9.add(btnNewButton_11);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setToolTipText("Add User Task to SubTree");
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setToolTipText("Add Abstraction Task to SubTree");
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setToolTipText("Add Application Task to SubTree");
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setToolTipText("Add Interaction Task to SubTree");
		panel_4.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 2, 0, 0));
		
		JButton button_3 = new JButton("New button");
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("New button");
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("New button");
		panel_5.add(button_5);
		
		JButton button_6 = new JButton("New button");
		panel_5.add(button_6);
		
		JButton button_7 = new JButton("New button");
		panel_5.add(button_7);
		
		JButton button_8 = new JButton("New button");
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("New button");
		panel_5.add(button_9);
		
		JButton button_10 = new JButton("New button");
		panel_5.add(button_10);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton button_11 = new JButton("New button");
		panel_6.add(button_11);
		
		JButton button_12 = new JButton("New button");
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("New button");
		panel_6.add(button_13);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

}
