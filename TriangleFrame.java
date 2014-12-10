import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TriangleFrame extends JFrame{
	
	public TriangleFrame(){
	
		setTitle("Sierpinski's Triangle");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(screenSize.width/2,screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new TrianglePanel());
		setVisible(true);
	}
}