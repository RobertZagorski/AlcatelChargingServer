package com.sng;
import com.alcatel.xmlapi.phone.Call;
import com.sng.ApplicationLogicPanel; 
import com.sng.ApplicationLogicPanel.maxCallTime;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.util.concurrent.locks.Lock;

import org.apache.log4j.Logger;
/**
 * 
 * @author Robert Zagórski
 *
 */
public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	public Dimension dims;
	JSplitPane splitPane;
	ApplicationLogicPanel window;
	Log logWindow;
	Policy policy;
	ProfileTable policyTable;
	Properties properties;
	protected final static Logger log = Logger.getLogger("MainWindow");

	
	public MainWindow (String name)	{
		super(name);
		//Tworzenie nowego okna i dodanie funkcjonalnoďż˝ci zamykania
		addWindowListener(new WindowAdapter() {
            /**
             * Handles window closing events.
             * @param evt window event
             */
            public void windowClosing(WindowEvent evt) {
                /** terminate the program */
            	logWindow.wyloguj();
                System.exit(0);
            }
        	public void windowActivated(WindowEvent e)	{
        		repaint();
        	}
            
        });
		
		//Pobranie rozdzielczoďż˝ci ekranu
		dims = new Dimension();
		dims = getResolution(dims);
		
		/*Ustawienie rozmiarów ramki na odpowiednie i w odpowiednim
		miejscu na ekranie*/
		//setPreferredSize(dims);
		setLocation(0, 0);
		
		/**Tworzenie i dodawanie panelu główwnego menu przy pomocy klasy {@link Menu}*/
		window = new ApplicationLogicPanel(this);
        logWindow = new Log(this);
        policyTable = new ProfileTable(this);
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setLeftComponent(window);
		this.add(splitPane);
		this.pack();
		this.setFocusable(true);
	}
	
	private Dimension getResolution (Dimension dims)	{
		dims.width = (Toolkit.getDefaultToolkit().getScreenSize().width);
		dims.width /= 2;
		dims.width -=14;
		dims.height = (Toolkit.getDefaultToolkit().getScreenSize().height)*5;
		dims.height /= 6;
		dims.height -= 10;
		return dims;
	}
	
	public JSplitPane getPane(){
		return splitPane;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
				new MainWindow("Serwer opłat").setVisible(true);

            }
         });

	}
}