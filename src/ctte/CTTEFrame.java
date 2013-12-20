package ctte;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;

import javax.swing.JMenuItem;

import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.KeyStroke;

import java.awt.event.*;

import javax.swing.JSeparator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JTextPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.io.IOException;

import javax.swing.JTextField;
import java.awt.Color;



public class CTTEFrame extends JFrame implements ActionListener{

	private int count = 0;
	private int count2 = 0;
	
	private JPanel contentPane;
	private JTextField txtZoom;
	private JTextField txtRecherche;
	private JTextField txtTask;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmOpenCttAs;
	private JMenuItem mntmSave;
	private JMenuItem mntmSaveAs;
	private JMenuItem mntmSaveSubtreeAs;
	private JMenuItem mntmSaveCttAs;
	private JMenuItem mntmSaveTreeAs;
	private JMenuItem mntmSaveSubtreeAs_1;
	private JMenuItem mntmQuit;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmPrint;
	private JMenuItem mntmPrintInMultiple;
	private JMenuItem mntmUndo;
	private JMenuItem mntmRedo;
	private JMenuItem mntmCutSelection;
	private JMenuItem mntmCutSubtree;
	private JMenuItem mntmCopySelection;
	private JMenuItem mntmCopySubtree;
	private JMenuItem mntmPaste;
	private JMenuItem mntmDelete;
	private JMenuItem mntmFind;
	private JMenuItem mntmTaskProperties;
	private JMenuItem mntmIconRepresentation;
	private JMenuItem mntmPriorityTree;
	private JMenuItem chckbxmntmCooperativeMode;
	private JMenuItem mntmFoldunfoldSubtree;
	private JMenuItem mntmUnfoldAll;
	private JMenuItem mntmTaskModelStatistics;
	private JMenuItem mntmSubtreeFromFile;
	private JMenuItem mntmNewLevel;

	private JMenuItem mntmModelFilter;
	private JMenuItem mntmCheckModelStructure;
	private JMenuItem mntmStartTaskModel;
	private JMenuItem mntmReachablelityAnalysis;
	private JMenuItem mntmInformalToFormal;

	private JMenuItem mntmWelcome;
	private JMenuItem mntmHelpContent;
	private JMenuItem mntmSearch;

	private JRadioButtonMenuItem rdbtnmntmAllLevels;
	private JRadioButtonMenuItem radioButtonMenuItem;
	private JRadioButtonMenuItem rdbtnmntmBelowchild;
	private JRadioButtonMenuItem rdbtnmntmToTheLeft;
	
	
	private JButton btnNewButton_7;
	private JButton btnNewButton_10;
	private JButton btnNewButton_9;
	
	private JButton button_1;
	private JButton button_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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


		this.setTitle("IHM");
		//change l'icon de l'appli
		java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
		Image image = toolkit.getImage("./res/images/cnr.gif");
		setIconImage(image);


		this.setMinimumSize(new Dimension(650, 550));


		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		this.addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				JFrame frame = (JFrame)e.getSource();

				int result = JOptionPane.showConfirmDialog(
						null,
						"Are you sure you want to exit without saving ?",
						"Exit Application",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION){
					//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					System.exit(0);
				}else{
					JFileChooser jfc = new JFileChooser();
					int returnValue = jfc.showDialog(null,"Sauvegarder");
					if(returnValue == JFileChooser.CANCEL_OPTION){
						//System.out.println("test");
					}else{
						System.exit(0);
					}
				}
			}
		});

		setBounds(100, 100, 650, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		contentPane.addKeyListener(new ClavierListener());

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

		mntmNewMenuItem_1 = new JMenuItem("New ");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.addActionListener(this);
		mnFile.add(mntmNewMenuItem_1);

		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);

		mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(this);

		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnFile.add(mntmNewMenuItem);

		mntmOpenCttAs = new JMenuItem("Open CTT As XML");
		mntmOpenCttAs.addActionListener(this);
		mntmOpenCttAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFile.add(mntmOpenCttAs);

		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);

		mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(this);
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);

		JMenu mnSaveAs = new JMenu("Save As");
		mnFile.add(mnSaveAs);

		mntmSaveAs = new JMenuItem("Save as");
		mntmSaveAs.addActionListener(this);
		mnSaveAs.add(mntmSaveAs);
		mntmSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));

		mntmSaveSubtreeAs = new JMenuItem("Save SubTree As");
		mntmSaveSubtreeAs.addActionListener(this);
		mnSaveAs.add(mntmSaveSubtreeAs);

		mntmSaveCttAs = new JMenuItem("Save CTT As XML");
		mntmSaveCttAs.addActionListener(this);
		mnSaveAs.add(mntmSaveCttAs);

		JSeparator separator_3 = new JSeparator();
		mnSaveAs.add(separator_3);

		mntmSaveTreeAs = new JMenuItem("Save Tree As JPG");
		mntmSaveTreeAs.addActionListener(this);
		mntmSaveTreeAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_MASK));
		mnSaveAs.add(mntmSaveTreeAs);

		mntmSaveSubtreeAs_1 = new JMenuItem("Save SubTree As JPG");
		mntmSaveSubtreeAs_1.addActionListener(this);
		mnSaveAs.add(mntmSaveSubtreeAs_1);

		JSeparator separator_4 = new JSeparator();
		mnFile.add(separator_4);

		mntmPrint = new JMenuItem("Print");
		mntmPrint.addActionListener(this);
		mntmPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		mnFile.add(mntmPrint);

		mntmPrintInMultiple = new JMenuItem("Print in Multiple Pages");
		mntmPrintInMultiple.addActionListener(this);
		mntmPrintInMultiple.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnFile.add(mntmPrintInMultiple);

		JSeparator separator_5 = new JSeparator();
		mnFile.add(separator_5);

		mntmQuit = new JMenuItem("Quit");
		mntmQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mntmQuit.addActionListener(this);
		mnFile.add(mntmQuit);

		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setMnemonic('E');
		mnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnEdit);

		mntmUndo = new JMenuItem("Undo");
		mntmUndo.addActionListener(this);
		mntmUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_MASK));
		mnEdit.add(mntmUndo);

		mntmRedo = new JMenuItem("Redo");
		mntmRedo.addActionListener(this);
		mntmRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mnEdit.add(mntmRedo);

		JSeparator separator = new JSeparator();
		mnEdit.add(separator);

		mntmCutSelection = new JMenuItem("Cut Selection");
		mntmCutSelection.addActionListener(this);
		mntmCutSelection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCutSelection);

		mntmCutSubtree = new JMenuItem("Cut SubTree");
		mntmCutSubtree.addActionListener(this);
		mntmCutSubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEdit.add(mntmCutSubtree);

		mntmCopySelection = new JMenuItem("Copy Selection");
		mntmCopySelection.addActionListener(this);
		mntmCopySelection.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnEdit.add(mntmCopySelection);

		mntmCopySubtree = new JMenuItem("Copy SubTree");
		mntmCopySubtree.addActionListener(this);
		mntmCopySubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnEdit.add(mntmCopySubtree);

		mntmPaste = new JMenuItem("Paste");
		mntmPaste.addActionListener(this);
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		mnEdit.add(mntmPaste);

		mntmDelete = new JMenuItem("Delete");
		mntmDelete.addActionListener(this);
		mntmDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnEdit.add(mntmDelete);

		JSeparator separator_6 = new JSeparator();
		mnEdit.add(separator_6);

		mntmFind = new JMenuItem("Find...");
		mntmFind.addActionListener(this);
		mntmFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		mnEdit.add(mntmFind);

		JMenu mnView = new JMenu("View");
		mnView.setMnemonic('V');
		mnView.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnView);

		mntmTaskProperties = new JMenuItem("Task Properties...");
		mntmTaskProperties.addActionListener(this);
		mnView.add(mntmTaskProperties);

		mntmIconRepresentation = new JMenuItem("Icon Representation");
		mntmIconRepresentation.addActionListener(this);
		mnView.add(mntmIconRepresentation);

		JSeparator separator_7 = new JSeparator();
		mnView.add(separator_7);

		mntmPriorityTree = new JMenuItem("Priority Tree");
		mntmPriorityTree.addActionListener(this);
		mntmPriorityTree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mnView.add(mntmPriorityTree);
		JSeparator separator_8 = new JSeparator();
		mnView.add(separator_8);

		JMenu mnTaskModelBy = new JMenu("Task Model by levels");
		mnView.add(mnTaskModelBy);

		rdbtnmntmAllLevels = new JRadioButtonMenuItem("All levels");
		rdbtnmntmAllLevels.addActionListener(this);
		rdbtnmntmAllLevels.setSelected(true);
		mnTaskModelBy.add(rdbtnmntmAllLevels);

		radioButtonMenuItem = new JRadioButtonMenuItem("0");
		radioButtonMenuItem.addActionListener(this);
		mnTaskModelBy.add(radioButtonMenuItem);

		JSeparator separator_10 = new JSeparator();
		mnView.add(separator_10);

		chckbxmntmCooperativeMode = new JCheckBoxMenuItem("Cooperative mode");
		mnView.add(chckbxmntmCooperativeMode);

		JSeparator separator_9 = new JSeparator();
		mnView.add(separator_9);

		mntmFoldunfoldSubtree = new JMenuItem("Fold/Unfold SubTree");
		mntmFoldunfoldSubtree.addActionListener(this);
		mntmFoldunfoldSubtree.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mnView.add(mntmFoldunfoldSubtree);

		mntmUnfoldAll = new JMenuItem("Unfold All");
		mntmUnfoldAll.addActionListener(this);
		mntmUnfoldAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		mnView.add(mntmUnfoldAll);

		JMenu mnInfo = new JMenu("Info");
		mnInfo.setMnemonic('I');
		mnInfo.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnInfo);

		mntmTaskModelStatistics = new JMenuItem("Task Model Statistics");
		mntmTaskModelStatistics.addActionListener(this);
		mnInfo.add(mntmTaskModelStatistics);

		JMenu mnInsert = new JMenu("Insert");
		mnInsert.setMnemonic('N');
		mnInsert.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnInsert);

		rdbtnmntmBelowchild = new JRadioButtonMenuItem("Below (child)");
		rdbtnmntmBelowchild.setSelected(true);
		rdbtnmntmBelowchild.addActionListener(this);
		mnInsert.add(rdbtnmntmBelowchild);

		rdbtnmntmToTheLeft = new JRadioButtonMenuItem("To the left (sibling)");
		rdbtnmntmToTheLeft.addActionListener(this);
		mnInsert.add(rdbtnmntmToTheLeft);

		JSeparator separator_11 = new JSeparator();
		mnInsert.add(separator_11);

		mntmSubtreeFromFile = new JMenuItem("SubTree From File");
		mntmSubtreeFromFile.addActionListener(this);
		mntmSubtreeFromFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_INSERT, 0));
		mnInsert.add(mntmSubtreeFromFile);

		mntmNewLevel = new JMenuItem("New Level");
		mntmNewLevel.addActionListener(this);
		mntmNewLevel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mnInsert.add(mntmNewLevel);

		JMenu mnTools = new JMenu("Tools");
		mnTools.setMnemonic('T');
		mnTools.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnTools);

		mntmModelFilter = new JMenuItem("Model Filter");
		mntmModelFilter.addActionListener(this);
		mntmModelFilter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mnTools.add(mntmModelFilter);

		JSeparator separator_12 = new JSeparator();
		mnTools.add(separator_12);

		mntmInformalToFormal = new JMenuItem("Informal to formal description");
		mntmInformalToFormal.addActionListener(this);
		mntmInformalToFormal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnTools.add(mntmInformalToFormal);

		JSeparator separator_13 = new JSeparator();
		mnTools.add(separator_13);

		mntmCheckModelStructure = new JMenuItem("Check Model Structure");
		mntmCheckModelStructure.addActionListener(this);
		mntmCheckModelStructure.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		mnTools.add(mntmCheckModelStructure);

		JSeparator separator_14 = new JSeparator();
		mnTools.add(separator_14);

		mntmStartTaskModel = new JMenuItem("Start Task Model Simulator");
		mntmStartTaskModel.addActionListener(this);
		mntmStartTaskModel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mnTools.add(mntmStartTaskModel);

		JSeparator separator_15 = new JSeparator();
		mnTools.add(separator_15);

		mntmReachablelityAnalysis = new JMenuItem("Reachablelity Analysis");
		mntmReachablelityAnalysis.addActionListener(this);
		mntmReachablelityAnalysis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnTools.add(mntmReachablelityAnalysis);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setMnemonic('H');
		mnHelp.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnHelp);

		mntmWelcome = new JMenuItem("Welcome");
		mntmWelcome.addActionListener(this);

		mnHelp.add(mntmWelcome);
		JSeparator separator_16 = new JSeparator();
		mnHelp.add(separator_16);

		mntmHelpContent = new JMenuItem("Help Content");
		mntmHelpContent.addActionListener(this);
		mnHelp.add(mntmHelpContent);

		mntmSearch = new JMenuItem("Search");
		mntmSearch.addActionListener(this);
		mnHelp.add(mntmSearch);


		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 4, 0, 0));

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setToolTipText("New");
		btnNewButton_4.setIcon(new ImageIcon("./res/images/new2.png"));
		btnNewButton_4.setSize(35, 35);
		btnNewButton_4.setPreferredSize(new Dimension(35,35));
		btnNewButton_4.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ouverture d'un nouveau document");
				contentPane.requestFocus();
			}});
		panel_7.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setToolTipText("Open");
		btnNewButton_5.setIcon(new ImageIcon("./res/images/ouvrir2.png"));
		btnNewButton_5.setSize(35, 35);
		btnNewButton_5.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JFileChooser jfc = new JFileChooser();
				int returnValue = jfc.showDialog(null,"Ouvrir");
				contentPane.requestFocus();
			}

		});
		btnNewButton_5.setPreferredSize(new Dimension(35,35));

		panel_7.add(btnNewButton_5);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setToolTipText("Save");
		btnNewButton_8.setIcon(new ImageIcon("./res/images/save2.png"));
		btnNewButton_8.setSize(35, 35);
		btnNewButton_8.setPreferredSize(new Dimension(35,35));
		btnNewButton_8.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JFileChooser jfc = new JFileChooser();
				int returnValue = jfc.showDialog(null,"Sauvegarder");
				contentPane.requestFocus();
			}});
		panel_7.add(btnNewButton_8);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setToolTipText("Print");
		btnNewButton_6.setIcon(new ImageIcon("./res/images/print2.png"));
		btnNewButton_6.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ouverture du menu d'impression");
				contentPane.requestFocus();
			}});
		btnNewButton_6.setSize(35, 35);
		btnNewButton_6.setPreferredSize(new Dimension(35,35));
		panel_7.add(btnNewButton_6);

		JSeparator separator_17 = new JSeparator();
		panel_3.add(separator_17);

		JPanel panel_8 = new JPanel();
		panel_3.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 6, 0, 0));

		btnNewButton_7 = new JButton("");
		btnNewButton_7.setToolTipText("Cut SubTree");
		btnNewButton_7.setIcon(new ImageIcon("./res/images/couper2.png"));
		btnNewButton_7.setSize(35, 35);
		btnNewButton_7.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Cut SubTree");
				btnNewButton_10.setEnabled(true);
				contentPane.requestFocus();
			}});
		btnNewButton_7.setPreferredSize(new Dimension(35,35));
		panel_8.add(btnNewButton_7);

		btnNewButton_9 = new JButton("");
		btnNewButton_9.setToolTipText("Copy SubTree");
		btnNewButton_9.setIcon(new ImageIcon("./res/images/copier2.png"));
		btnNewButton_9.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Copy");
				contentPane.requestFocus();
				btnNewButton_10.setEnabled(true);
			}});
		btnNewButton_9.setSize(35, 35);
		btnNewButton_9.setPreferredSize(new Dimension(25,25));
		panel_8.add(btnNewButton_9);

		btnNewButton_10 = new JButton("");
		btnNewButton_10.setEnabled(false);
		btnNewButton_10.setToolTipText("Paste");
		btnNewButton_10.setIcon(new ImageIcon("./res/images/coller2.png"));
		btnNewButton_10.setSize(35, 35);
		btnNewButton_10.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Paste");
				contentPane.requestFocus();
				button_1.setEnabled(true);
				count++;
			}});
		btnNewButton_10.setPreferredSize(new Dimension(35,35));
		panel_8.add(btnNewButton_10);

		JButton button = new JButton("");
		button.setToolTipText("Delete");
		button.setIcon(new ImageIcon("./res/images/delete.png"));
		button.setSize(35, 35);
		button.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Delete");
				contentPane.requestFocus();
				button_1.setEnabled(true);
				count++;
			}});
		button.setPreferredSize(new Dimension(35,35));
		panel_8.add(button);

		button_1 = new JButton("");
		button_1.setEnabled(false);
		button_1.setToolTipText("Undo");
		button_1.setIcon(new ImageIcon("./res/images/undo2.png"));
		button_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Undo");
				contentPane.requestFocus();
				button_2.setEnabled(true);
				count--;
				count2++;
				if(count == 0){
					button_1.setEnabled(false);
				}
			}});
		button_1.setSize(35, 35);
		button_1.setPreferredSize(new Dimension(35,35));
		panel_8.add(button_1);

		button_2 = new JButton("");
		button_2.setEnabled(false);
		button_2.setToolTipText("Redo");
		button_2.setIcon(new ImageIcon("./res/images/redo2.png"));
		button_2.setSize(35, 35);
		button_2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité Redo");
				contentPane.requestFocus();
				count2--;
				count++;
				button_1.setEnabled(true);
				if(count2 == 0){
					button_2.setEnabled(false);
				}
			}});
		button_2.setPreferredSize(new Dimension(35,35));
		panel_8.add(button_2);

		JSeparator separator_18 = new JSeparator();
		panel_3.add(separator_18);

		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.setToolTipText("Properties");
		btnNewButton_11.setIcon(new ImageIcon("./res/images/properties2.png"));
		btnNewButton_11.setSize(35, 35);
		btnNewButton_11.setPreferredSize(new Dimension(35,35));
		btnNewButton_11.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Affiche les propiétés");
				contentPane.requestFocus();
			}});
		panel_9.add(btnNewButton_11);
		Border cadre = BorderFactory.createTitledBorder("Current Task" );

		JSeparator separator_19 = new JSeparator();
		separator_19.setOrientation(SwingConstants.VERTICAL);
		panel_3.add(separator_19);


		JPanel panel_11 = new JPanel();
		panel.add(panel_11, BorderLayout.SOUTH);
		panel_11.setBorder(cadre);
		panel_11.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		JTextPane txtpnIdentifier = new JTextPane();
		txtpnIdentifier.setToolTipText("");
		txtpnIdentifier.setText("Identifier : ");
		txtpnIdentifier.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtpnIdentifier.setEditable(false);
		txtpnIdentifier.setBackground(SystemColor.control);
		panel_11.add(txtpnIdentifier);



		txtTask = new JTextField();
		txtTask.setBackground(SystemColor.window);
		txtTask.setText("Task_0");
		panel_11.add(txtTask);
		txtTask.setColumns(10);

		JTextPane txtpnCategori = new JTextPane();
		txtpnCategori.setToolTipText("");
		txtpnCategori.setText("Category : ");
		txtpnCategori.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtpnCategori.setEditable(false);
		txtpnCategori.setBackground(SystemColor.control);
		panel_11.add(txtpnCategori);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"abstraction", "application", "interaction", "user"}));
		panel_11.add(comboBox);

		JTextPane txtpnType = new JTextPane();
		txtpnType.setToolTipText("");
		txtpnType.setText("Type: ");
		txtpnType.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtpnType.setEditable(false);
		txtpnType.setBackground(SystemColor.control);
		panel_11.add(txtpnType);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		panel_11.add(comboBox_1);

		JTextPane txtpnFrequency = new JTextPane();
		txtpnFrequency.setToolTipText("");
		txtpnFrequency.setText("Frequency : ");
		txtpnFrequency.setFont(new Font("Dialog", Font.PLAIN, 11));
		txtpnFrequency.setEditable(false);
		txtpnFrequency.setBackground(SystemColor.control);
		panel_11.add(txtpnFrequency);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Low", "Medium", "Hight"}));
		panel_11.add(comboBox_2);




		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		panel_1.setPreferredSize(new Dimension(90,200));

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(2, 2, 0, 0));

		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Add User Task to SubTree");
		btnNewButton.setIcon(new ImageIcon("./res/images/usertask2.png"));
		btnNewButton.setSize(35,35);
		btnNewButton.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ajout d'une User Task");
				contentPane.requestFocus();
			}});
		btnNewButton.setPreferredSize(new Dimension(35,35));
		panel_4.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setToolTipText("Add Abstraction Task to SubTree");
		btnNewButton_2.setIcon(new ImageIcon("./res/images/abstractiontask2.png"));
		btnNewButton_2.setSize(35,35);
		btnNewButton_2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ajout d'une Abstraction Task");
				contentPane.requestFocus();
			}});
		btnNewButton_2.setPreferredSize(new Dimension(35,35));
		panel_4.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setToolTipText("Add Application Task to SubTree");
		btnNewButton_1.setIcon(new ImageIcon("./res/images/applicationtask2.png"));
		btnNewButton_1.setSize(35,35);
		btnNewButton_1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ajout d'une Applciation Task");
				contentPane.requestFocus();
			}});
		btnNewButton_1.setPreferredSize(new Dimension(35,35));
		panel_4.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setToolTipText("Add Interaction Task to SubTree");
		btnNewButton_3.setIcon(new ImageIcon("./res/images/interactiontask2.png"));
		btnNewButton_3.setSize(35,35);
		btnNewButton_3.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Ajout d'une Interaction Task");
				contentPane.requestFocus();
			}});
		btnNewButton_3.setPreferredSize(new Dimension(35,35));
		panel_4.add(btnNewButton_3);

		JTextPane txtpnHighPriority = new JTextPane();
		txtpnHighPriority.setBackground(SystemColor.control);
		txtpnHighPriority.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnHighPriority.setEditable(false);
		txtpnHighPriority.setText("High Priority");
		txtpnHighPriority.setToolTipText("");
		txtpnHighPriority.setPreferredSize(new Dimension(90,20));
		panel_1.add(txtpnHighPriority);

		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		panel_5.setLayout(new GridLayout(4, 2, 0, 0));

		JButton button_3 = new JButton("");
		button_3.setEnabled(false);
		button_3.setToolTipText("Choice + Explications");
		button_3.setIcon(new ImageIcon("./res/images/choice.gif"));
		button_3.setSize(35, 35);
		button_3.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_3.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_3);

		JButton button_4 = new JButton("");
		button_4.setEnabled(false);
		button_4.setToolTipText("OrderIndependence + Explications");
		button_4.setIcon(new ImageIcon("./res/images/order.gif"));
		button_4.setSize(35, 35);
		button_4.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_4.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_4);

		JButton button_5 = new JButton("");
		button_5.setEnabled(false);
		button_5.setToolTipText("InterLeaving + Explications");
		button_5.setIcon(new ImageIcon("./res/images/interleave.gif"));
		button_5.setSize(35, 35);
		button_5.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_5.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_5);

		JButton button_6 = new JButton("");
		button_6.setEnabled(false);
		button_6.setToolTipText("Synchronization + Explications");
		button_6.setIcon(new ImageIcon("./res/images/sincro.gif"));
		button_6.setSize(35, 35);
		button_6.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_6.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_6);

		JButton button_7 = new JButton("");
		button_7.setEnabled(false);
		button_7.setToolTipText("Disabling + Explications");
		button_7.setIcon(new ImageIcon("./res/images/disabling.gif"));
		button_7.setSize(35, 35);
		button_7.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_7.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_7);

		JButton button_8 = new JButton("");
		button_8.setEnabled(false);
		button_8.setToolTipText("SuspendResume + Explications");
		button_8.setIcon(new ImageIcon("./res/images/suspend.gif"));
		button_8.setSize(35, 35);
		button_8.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_8.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_8);

		JButton button_9 = new JButton("");
		button_9.setEnabled(false);
		button_9.setToolTipText("SequentialEnabling + Explications");
		button_9.setIcon(new ImageIcon("./res/images/enabling.gif"));
		button_9.setSize(35, 35);
		button_9.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_9.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_9);

		JButton button_10 = new JButton("");
		button_10.setEnabled(false);
		button_10.setToolTipText("SequentialEnablingInfo + Explications");
		button_10.setIcon(new ImageIcon("./res/images/enablinginfo.gif"));
		button_10.setSize(35, 35);
		button_10.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_10.setPreferredSize(new Dimension(35, 35));
		panel_5.add(button_10);

		JTextPane txtpnLowPriority = new JTextPane();
		txtpnLowPriority.setBackground(SystemColor.control);
		txtpnLowPriority.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnLowPriority.setEnabled(true);
		txtpnLowPriority.setEditable(false);
		txtpnLowPriority.setText("Low Priority");
		txtpnLowPriority.setPreferredSize(new Dimension(90,20));
		panel_1.add(txtpnLowPriority);

		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		panel_6.setSize(new Dimension(70, 70));
		panel_6.setPreferredSize(new Dimension(70,70));
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

		JButton button_11 = new JButton("");
		button_11.setEnabled(false);
		button_11.setToolTipText("Set/Unset Iterative Task + Explications");
		button_11.setIcon(new ImageIcon("./res/images/iterative.gif"));
		button_11.setSize(35, 35);
		button_11.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_11.setPreferredSize(new Dimension(35, 35));
		panel_6.add(button_11);

		JButton button_12 = new JButton("");
		button_12.setEnabled(false);
		button_12.setToolTipText("Set/Unset Optional Task + Explications");
		button_12.setIcon(new ImageIcon("./res/images/optional.gif"));
		button_12.setSize(35, 35);
		button_12.setPreferredSize(new Dimension(35, 35));
		button_12.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		panel_6.add(button_12);

		JButton button_13 = new JButton("");
		button_13.setEnabled(false);
		button_13.setToolTipText("Set/Unset Connection Task + Explications");
		button_13.setIcon(new ImageIcon("./res/images/arrow.gif"));
		button_13.setSize(35, 35);
		button_13.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "Fonctionnalité à venir");
				contentPane.requestFocus();
			}});
		button_13.setPreferredSize(new Dimension(35, 35));
		panel_6.add(button_13);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_10 = new JPanel();
		panel_2.add(panel_10, BorderLayout.EAST);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 0));


		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setPreferredSize(new Dimension(25, 25));
		btnNewButton_12.setIcon(new ImageIcon("./res/images/zoomin.gif"));
		btnNewButton_12.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "On effectue un zoom avant");
				contentPane.requestFocus();
			}});
		button_12.setPreferredSize(new Dimension(35, 35));
		panel_10.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.setPreferredSize(new Dimension(25, 25));
		btnNewButton_13.setIcon(new ImageIcon("./res/images/zoomout.gif"));
		btnNewButton_13.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				JOptionPane.showMessageDialog(null, "On effectue un zoom arrière");
				contentPane.requestFocus();
			}});
		button_13.setPreferredSize(new Dimension(35, 35));
		panel_10.add(btnNewButton_13);

		txtZoom = new JTextField();
		txtZoom.setBackground(SystemColor.text);
		txtZoom.setText("Zoom");
		panel_10.add(txtZoom);
		txtZoom.setSize(10, 30);
		txtZoom.setPreferredSize(new Dimension(30, 25));
		txtZoom.setColumns(10);

		txtRecherche = new JTextField();
		panel_2.add(txtRecherche, BorderLayout.WEST);
		txtRecherche.setText("Find...");
		txtRecherche.setColumns(10);
		txtRecherche.setSize(10, 30);
		txtRecherche.setPreferredSize(new Dimension(30, 25));
		txtRecherche.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				txtRecherche.setText("");
				contentPane.requestFocus();
			}});
		txtZoom.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e){
				txtZoom.setText("");
				contentPane.requestFocus();
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		scrollPane.getViewport().setBackground(Color.white);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==mntmNewMenuItem){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Ouvrir");
		}

		if(e.getSource()==mntmOpenCttAs){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Ouvrir XML");
		}

		if(e.getSource()==mntmSave){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde");
		}

		if(e.getSource()==mntmSaveAs){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde As...");
		}

		if(e.getSource()==mntmSaveSubtreeAs){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde du sous arbre");
		}

		if(e.getSource()==mntmSaveCttAs){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde XML");
		}

		if(e.getSource()==mntmSaveTreeAs){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde JPG");
		}

		if(e.getSource()==mntmSaveSubtreeAs_1){
			JFileChooser jfc = new JFileChooser();
			int returnValue = jfc.showDialog(null,"Sauvegarde du sous arbre JPG");
		}

		if(e.getSource()==mntmQuit ){
			int result = JOptionPane.showConfirmDialog(null,
					"Are you sure you want to exit without saving ?",
					"Exit Application",
					JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.YES_OPTION){
				System.exit(0);
			}else{
				JFileChooser jfc = new JFileChooser();
				int returnValue = jfc.showDialog(null,"Sauvegarde");
				if(returnValue == JFileChooser.CANCEL_OPTION){
					
				}else{
					System.exit(0);
				}
			}
		}



		if(e.getSource() == rdbtnmntmAllLevels){
			rdbtnmntmAllLevels.setSelected(true);
			radioButtonMenuItem.setSelected(false);
		}
		if(e.getSource() == radioButtonMenuItem){
			radioButtonMenuItem.setSelected(true);
			rdbtnmntmAllLevels.setSelected(false);
		}

		if(e.getSource() == rdbtnmntmBelowchild){
			rdbtnmntmBelowchild.setSelected(true);
			rdbtnmntmToTheLeft.setSelected(false);
		}    
		if(e.getSource() == rdbtnmntmToTheLeft){
			rdbtnmntmToTheLeft.setSelected(true);
			rdbtnmntmBelowchild.setSelected(false);
		}

		if(e.getSource() == mntmNewMenuItem_1){
			JOptionPane.showMessageDialog(null, "Ouverture d'un nouveau document");                                
			contentPane.requestFocus();
		}

		if(e.getSource() == mntmPrint){
			JOptionPane.showMessageDialog(null, "Ouverture de la fenetre d'impression");                                
			contentPane.requestFocus();
		}

		if(e.getSource() == mntmPrintInMultiple){
			JOptionPane.showMessageDialog(null, "Ouverture de la fenetre d'impression multiple");                                
			contentPane.requestFocus();
		}

		if(e.getSource() == mntmUndo){
			JOptionPane.showMessageDialog(null, "Fonction de retour en arrière");                                
			contentPane.requestFocus();
			button_2.setEnabled(true);
			count--;
			count2++;
			if(count == 0){
				button_1.setEnabled(false);
			}
		}

		if(e.getSource() == mntmRedo){
			JOptionPane.showMessageDialog(null, "Fonction de retour en avant");                                
			contentPane.requestFocus();
			count2--;
			button_2.setEnabled(true);
			count++;
			if(count2 == 0){
				button_2.setEnabled(false);
			}
		}

		if(e.getSource() == mntmCutSelection){
			JOptionPane.showMessageDialog(null, "Fonction de 'couper' de l'élement sélectionné");                                
			contentPane.requestFocus();
			btnNewButton_10.setEnabled(true);
			
		}

		if(e.getSource() == mntmCutSubtree){
			JOptionPane.showMessageDialog(null, "Fonction de 'couper' de l'élement sélectionné ainsi que son sous arbre");                                
			contentPane.requestFocus();
			btnNewButton_10.setEnabled(true);
		}

		if(e.getSource() == mntmCopySelection){
			JOptionPane.showMessageDialog (null, "Fonction de copier de l'élement sélectionné");                                
			contentPane.requestFocus();
			btnNewButton_10.setEnabled(true);
		}

		if(e.getSource() == mntmCopySubtree){
			JOptionPane.showMessageDialog(null, "Fonction de copier de l'élement sélectionné ainsi que son sous arbre");                                
			contentPane.requestFocus();
			btnNewButton_10.setEnabled(true);
		}

		if(e.getSource() == mntmPaste){
			JOptionPane.showMessageDialog(null, "Fonction de coller de l'élement sélectionné");                                
			contentPane.requestFocus();
			button_1.setEnabled(true);
			count++;
		}

		if(e.getSource() == mntmDelete){
			JOptionPane.showMessageDialog(null, "Fonction de suppression de l'élement sélectionné");                                
			contentPane.requestFocus();
			button_1.setEnabled(true);
			count++;
		}

		if(e.getSource() == mntmFind){
			JOptionPane.showMessageDialog(null, "Fonction de recherche d'un élement de l'arbre");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmTaskProperties){
			JOptionPane.showMessageDialog(null, "affiche les propriétés de la tache");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmIconRepresentation){
			JOptionPane.showMessageDialog(null, "affiche la représentation d'icon");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmPriorityTree){
			JOptionPane.showMessageDialog(null, "affiche la priorité de l'arbre");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmFoldunfoldSubtree){
			JOptionPane.showMessageDialog(null, "plie/deplie l'arbe courant");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmUnfoldAll){
			JOptionPane.showMessageDialog(null, "deplie tout l'arbre ");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmTaskModelStatistics){
			JOptionPane.showMessageDialog(null, "Affiche les statistiques");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmSubtreeFromFile){
			JOptionPane.showMessageDialog(null, "Insere un arbre enregistré dans l'arbre courant");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmNewLevel){
			JOptionPane.showMessageDialog(null, "nouveau niveau");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmModelFilter){
			JOptionPane.showMessageDialog(null, "Model filter");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmCheckModelStructure){
			JOptionPane.showMessageDialog(null, "Vérification de la structure du model");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmStartTaskModel){
			JOptionPane.showMessageDialog(null, "démarre le simulateur");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmReachablelityAnalysis){
			JOptionPane.showMessageDialog(null, "analyse d'accessibilité");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmInformalToFormal){
			JOptionPane.showMessageDialog(null, "Informal --> Formal");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmWelcome){
			JOptionPane.showMessageDialog(null, "Ouvre un tutoriel");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmHelpContent){
			JOptionPane.showMessageDialog(null, "Section aide");                                
			contentPane.requestFocus();
		}

		if(e.getSource() ==mntmSearch){
			JOptionPane.showMessageDialog(null, "Recherche dans l'aide");                                
			contentPane.requestFocus();
		}



	}
	

}
