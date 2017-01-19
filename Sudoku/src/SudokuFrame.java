import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SudokuFrame extends JFrame {

	private SudokuPanel sPanel;

	public SudokuFrame() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Sudoku");
		this.setMinimumSize(new Dimension(800, 600));

		this.setLocationRelativeTo(null);

		sPanel = new SudokuPanel();
		JPanel windowPanel = new JPanel();
		windowPanel.setLayout(new FlowLayout());
		windowPanel.setPreferredSize(new Dimension(800, 600));
		windowPanel.add(sPanel);

		this.add(windowPanel);
<<<<<<< HEAD
		
		
		
=======
>>>>>>> branch 'master' of git@github.com:petercrowed/Sudoku.git
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				SudokuFrame frame = new SudokuFrame();
				frame.setVisible(true);
			}
		});
	}

}
