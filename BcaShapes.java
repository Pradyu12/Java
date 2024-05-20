package assign;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
public class shapes extends Canvas
{
	@Override
	public void paint(Graphics g)
	{
		g.drawString("Welcome",50,50);
		setBackground(Color.gray);
		g.fillRect(130,130,80,60);
		g.drawOval(50,100,50,60);
		setForeground(Color.red);
		g.fillOval(130,130,50,60);
		g.drawArc(30,130,40,100,180,40);
	}

	public static void main(String[] args)
	{
       shapes m=new shapes();
       JFrame frame=new JFrame("Main frame");
       frame.add(m);
       frame.setSize(500,500);
       frame.setVisible(true);
	}

}
