import java.applet.Applet;
import java.awt.Graphics;
 
 
public class DrawLineExample extends Applet{
 
	public void paint(Graphics g){
		
		
		//this will draw a line between (10,10) and (50,50) coordinates. 
		g.drawLine(10,10,50,50);
		
		//draw vertical line
		g.drawLine(10,50,10,100);
		
		//draw horizontal line
		g.drawLine(10,10,50,10);
	}
}
