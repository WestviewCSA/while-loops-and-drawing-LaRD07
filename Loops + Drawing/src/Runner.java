import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Polygon;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		//g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		//g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		//g2.drawLine(765/2, 10, 765/2,550 );
		
		
		/*int val = 0;
		int count = 0;
		int num = 0;
		
		while(val <= 100)
		{
			int x1 = (int)(Math.random()*(373) + 10);
			int x2 = (int)(Math.random()*(373) + 10);
			int y1 = (int)(Math.random()*(261) + 10);
			int y2 = (int)(Math.random()*(261) + 10);
			
			int red = (int)(Math.random()*255);
			int gre = (int)(Math.random()*255);
			int blu = (int)(Math.random()*255);
			
			Color newColor = new Color(red, gre, blu);
			g2.setColor(newColor);
			
			g2.drawLine(x1, y1, x2, y2);
			val++;
		}
		while(count <= 100)
		{
			int xs = (int)(Math.random()*(725 - 385 + 1) + 385);
			int ys = (int)(Math.random()*(200) + 10);
			
			int red = (int)(Math.random()*255);
			int gre = (int)(Math.random()*255);
			int blu = (int)(Math.random()*255);
			
			Color newColor = new Color(red, gre, blu);
			g2.setColor(newColor);
			
			g2.fillRect(xs, ys, 50, 50);
			
			count++;
		}
		while(num <= 100)
		{
			int xov = (int)(Math.random()*(500 - 0 + 1) + 0);
			int yov = (int)(Math.random()*(500 - 270 + 1) + 270);
			int dov = (int)(Math.random()*(200 - 0 + 1) + 0);
			
			int red = (int)(Math.random()*255);
			int gre = (int)(Math.random()*255);
			int blu = (int)(Math.random()*255);
			
			Color newColor = new Color(red, gre, blu);
			g2.setColor(newColor);
			
			if(xov + dov >= 380 || yov + dov >= 550|| yov <= 261||xov <=10)
			{
				g2.drawOval(0, 0, 0, 0);
			}
			else
			{
				g2.drawOval(xov, yov, dov, dov);
				num++;
			}
		}
		g2.draw3DRect(500, 400, 100, 100, true);
		g2.fill3DRect(500, 400, 100, 100, false);
		
		
		Color newColor2 = new Color(251, 255, 0);
		g2.setColor(newColor2);
		g2.fillRect(535, 335, 100, 100);
		
		Color newColor = new Color(252, 19, 0);
		g2.setColor(newColor);
		g2.fillRect(575, 375, 100, 100);
		
		int xpoints[] = {535, 575};
		int ypoints[] = {335, 375};
		int npoints = 4;
		*/
        
        int x = 0;
        int y = 650;
        
        for(int i = 0; i<=55; i++)
        {
        	g2.drawLine(x, 0, 0, y);
        	x+=15;
        	y-=14;
        }
		int x2 = 0;
		int y2 = 0;
		
		for(int w = 0; w<=43; w++)
		{
			g2.drawLine(x2, 0, 785, y2);
			x2+=18;
			y2+=12;
		}
		
		int z = 0;
		int x3= 785;
		int y3= 0;
		
		while(z<57)
		{
			g2.drawLine(x3, 565, 785, y3);
			x3-=15;
			y3+=10;
			z++;
		}
		int h = 0;
		int x4 = 0;
		int y4 = 0;
		
		while(h<57)
		{
			g2.drawLine(x4, 565, 0, y4);
			x4+=14;
			y4+=10;
			h++;
		}
		
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 

	
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
