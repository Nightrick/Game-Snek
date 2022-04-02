import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
		GameWindow window = new GameWindow();
		this.add(new GameWindow());
		//Can be shortened to this.add(new GamePanel());
		this.setTitle("Snek");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
