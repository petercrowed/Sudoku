<<<<<<< HEAD
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputAdapter;
import javax.swing.text.MaskFormatter;
import javax.swing.text.html.HTMLDocument.Iterator;

public class SudokuPanel extends JPanel {

	private static final long serialVersionUID = 0;
	private JTextField f[][] = new JTextField[9][9];
	private JPanel p[][] = new JPanel[3][3];
	private String c;
	
	public String returnNumbersAsStrings() {
		SudokuGenerator sg = new SudokuGenerator();
		sg.nextBoard(35);
		for (Integer temp : sg.print()) {
			c = String.valueOf(temp);
			return c;
		}
		return null;

	}
	public SudokuPanel() {
		super();
		Font font1 = new Font("SansSerif", Font.BOLD, 28);
		
		//Regex :D
		
	
	

		 
		for (int x = 0; x <= 8; x++) {
			for (int y = 0; y <= 8; y++) {

				MaskFormatter formatter = null;
				try {
					formatter = new MaskFormatter("#");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JFormattedTextField tf = new JFormattedTextField(formatter);
				f[x][y] = tf;
				
				f[x][y].setHorizontalAlignment(JTextField.CENTER);
				f[x][y].setFont(font1);
				
				
			

		
				
				final Integer x1= new Integer(x);
				final Integer y1 = new Integer(y);
				f[x1][y1].addKeyListener(new KeyAdapter(){
				    public void keyTyped(KeyEvent evt){
				         String tempEmail = ((JTextField)evt.getSource()).getText() + String.valueOf(evt.getKeyChar());
				        
				    
				    }
				});
			}
		}
		int numberCheck = 0;
		for (int x = 0; x <= 8; x++)
			for (int y = 0; y <= 8; y++)

			{
				System.out.println("lol: " + numberCheck);
				System.out.println(returnNumbersAsStrings());
				//f[x][y].setText(returnNumbersAsStrings());
				numberCheck++;
			}
		
		
		for (int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 2; y++) {
				p[x][y] = new JPanel(new GridLayout(3, 3));
			}
		}

		setLayout(new GridLayout(3, 3, 5, 5));

		
		for (int u = 0; u <= 2; u++) {
			for (int i = 0; i <= 2; i++) {
				for (int x = 0; x <= 2; x++) {
					for (int y = 0; y <= 2; y++) {
						p[u][i].add(f[y + u * 3][x + i * 3]);
						
					
					}
				}
				p[u][i].setPreferredSize(new Dimension(180, 180));
			
			
				add(p[u][i]);
				
			}
		}
		
	
	}
	

   

	
=======
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.ParseException;
import java.util.regex.Pattern;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class SudokuPanel extends JPanel {

	private static final long serialVersionUID = 0;
	private JTextField f[][] = new JTextField[9][9];
	private JPanel p[][] = new JPanel[3][3];

	public SudokuPanel() {
		super();
		Font font1 = new Font("SansSerif", Font.BOLD, 28);
		
		//Regex :D
		
		 
		 
		for (int x = 0; x <= 8; x++) {
			for (int y = 0; y <= 8; y++) {
				
		
			
					
				MaskFormatter formatter = null;
				try {
					formatter = new MaskFormatter("#");
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JFormattedTextField tf = new JFormattedTextField(formatter);
				f[x][y] = tf;
				
				f[x][y].setHorizontalAlignment(JTextField.CENTER);
				f[x][y].setFont(font1);
				f[x][y].setName("xd");

			}
		}

		for (int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 2; y++) {
				p[x][y] = new JPanel(new GridLayout(3, 3));
			}
		}

		setLayout(new GridLayout(3, 3, 5, 5));

		for (int u = 0; u <= 2; u++) {
			for (int i = 0; i <= 2; i++) {
				for (int x = 0; x <= 2; x++) {
					for (int y = 0; y <= 2; y++) {
						p[u][i].add(f[y + u * 3][x + i * 3]);
					}
				}
				p[u][i].setPreferredSize(new Dimension(180, 180));

				add(p[u][i]);
			}
		}
	}
>>>>>>> branch 'master' of git@github.com:petercrowed/Sudoku.git

}
