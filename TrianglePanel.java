import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TrianglePanel extends JPanel{

	public void paintComponent(Graphics g){
		int w = getWidth();
		int h = getHeight();
		int side = 0;
		
		//Gets the shortest side to make a perfect square that fits in the window
		if (h>w){
			side = w;
		} else{
			side = h;
		}
		triangleRecur(g, 0, 0, side);
	}
	public void triangleRecur(Graphics g, int xCoord, int yCoord, int side){
		
		if (side == 1){
			g.drawRect(xCoord, yCoord, 1, 1);
		}else{

			//Above center
			triangleRecur(g, xCoord+side/4, yCoord, side/2);

			//Right
			triangleRecur(g, xCoord, yCoord+side/2, side/2);

			//Left
			triangleRecur(g, xCoord+side/2, yCoord+side/2, side/2);
		}
	}	
}