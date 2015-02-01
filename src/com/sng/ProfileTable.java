package com.sng;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import org.apache.log4j.Logger;

public class ProfileTable extends JPanel implements ActionListener {
	/**Okno pracownicy będzie podzielone na 2 części horyzontalnie*/
	JSplitPane splitPane;
	/**Górna część okna pracowników*/
	JPanel topPanel;
	/**Dolna część panelu pracowników*/
	JPanel bottomPanel;
	/**Tablica wyswietlająca dane pobrane z bazy danych (jeszcze nie ma z nią połączenia)*/
	public JTable table;
	/**Przycisk "Dodaj Pracownika"*/
	JButton Button1;
	/**Przycisk "Usuń Pracownika"*/
	JButton Button2;
	MainWindow mw;
	JPanel panel;
	DecimalFormat df = new DecimalFormat();
	protected final Logger log = Logger.getLogger(getClass());
	
	public ProfileTable(MainWindow mainw){
		mw = mainw;
		topPanel = TopPanel();
		bottomPanel = BottomPanel();
		splitPane= new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setTopComponent(topPanel);
		splitPane.setBottomComponent(bottomPanel);
		panel=new JPanel(new GridLayout(1,0));
		panel.add(splitPane);
		this.add(panel,BorderLayout.CENTER);
		setVisible(true);
		this.mw.pack();
		this.mw.revalidate();
		df.setMaximumFractionDigits(2);
	    df.setMinimumFractionDigits(2);
	}
	
	/**Tworzenie panelu z klawiszami na dole okienka Pracownicy*/
	private JPanel BottomPanel() {
		JPanel panel = new JPanel(new FlowLayout());
		
		Button1 = new JButton("Odśwież");
		panel.add(Button1);
		Button1.setActionCommand("Odśwież");
		Button1.addActionListener(this);
		
		Button2 = new JButton("Zamknij");
		panel.add(Button2);
		Button2.setActionCommand("Zamknij");
		Button2.addActionListener(this);	
		return panel;
	}
	
	/**Tworzenie górnego panelu wyświetlającego dane*/
	private JPanel TopPanel() {
		JPanel panel = new JPanel(new GridLayout(1,0));
        table = new JTable(new Table());
        table.setPreferredScrollableViewportSize(new Dimension(250, 80));
        //table.setSize(100, 65);
        table.setFillsViewportHeight(true);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        panel.setOpaque(true);
        table.setOpaque(false);
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        //Add the scroll pane to this panel.
        panel.add(scrollPane);
		return panel;
	}
	
	public void fill()
	{
		String[][] data = new String[5][2];
		data[0][0] = ((Table) table.getModel()).data[0][0].toString();
		if (this.mw.policy.clientProfile == 0)
			data[0][1] = "Abonament";
		else if (this.mw.policy.clientProfile == 1)
			data[0][1] = "Prepaid";
		data[1][0] = ((Table) table.getModel()).data[1][0].toString();
		data[1][1] = this.mw.policy.freeOfChargeNumber;
		data[2][0] = ((Table) table.getModel()).data[2][0].toString();
		data[2][1] = df.format(this.mw.policy.remainingMinutes);
		data[3][0] = ((Table) table.getModel()).data[3][0].toString();
		data[3][1] = df.format(this.mw.policy.moneyToSpend);
		data[4][0] = ((Table) table.getModel()).data[4][0].toString();
		data[4][1] = df.format(this.mw.policy.moneySpent);
		((Table) table.getModel()).setData((Object[][])data);
		((Table) table.getModel()).fireTableDataChanged();
		((Table) table.getModel()).fireTableStructureChanged();
	}
	

	public void actionPerformed(ActionEvent e) {
		if ("Odśwież".equals(e.getActionCommand()))
		{
			fill();
		}
		else if ("Zamknij".equals(e.getActionCommand()))
		{
			this.log.info("\t\t\t->Policy table closed");
			this.mw.getPane().setRightComponent(null);
			this.mw.revalidate();
			this.mw.pack();
		}
	}
	
	
	/**Model wyświetlanej tablicy. Najważniejsze są dane {@link data}} oraz {@link columnNames}*/
	class Table extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		public String[] columnNames = {"Pole",
                                        "Wartość",};
        public Object[][] data = 
        {
        		{"Profil", "Smith"},
        		{"Numer darmowy", "Doe"},
        		{"Pozostała ilość minut", "Black"},
        		{"Limit środków", "White"},
        		{"Wykorzystane środki", "Brown"}
        };
        
        /**Funkcja służąca do uaktualnia nazwa kolumn tabeli*/
        public void setcolumnNames(String[] data)
        {
        	columnNames = data;
        }
        
        /**Funkcja służąca do uaktualniania zawartości tabeli*/
        public void setData(Object[][] data2)
        {
        	data = data2;
        }
 
        public int getColumnCount() {
            return columnNames.length;
        }
 
        public int getRowCount() {
            return data.length;
        }
 
        public String getColumnName(int col) {
            return columnNames[col];
        }
 
        public Object getValueAt(int row, int col) {
            return data[row][col];
        }
 
        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
 
        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
        	return false;
//            if (col < 2) {
//                return false;
//            } else {
//                return true;
//            }
        }
 
        private void printDebugData() {
            int numRows = getRowCount();
            int numCols = getColumnCount();
 
            for (int i=0; i < numRows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < numCols; j++) {
                    System.out.print("  " + data[i][j]);
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    
    }
}
