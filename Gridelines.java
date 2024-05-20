package applet;
import java.awt.Graphics;
import javax.swing.Jcomponent;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyCanvasGride1 extends JComponent
{
	@Override
	public void paint(Graphics g)
	{
		int rows=20;
		int cols=20;
		int width=getSize().width;
		int height=getSize().height;
		int rowHT=height/(rows);
		for(int i=0;i<rows;i++)
			g.drawLine(0,i*rowHT,width,i*rowHT);
		int rowWid=width/cols;
		for(int i=0;i<cols;i++)
			g.drawLine(i*rowWid,0,i*rowWid,height);
	}

}
public class assign{

	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(30,30,300,300);
		frame.getContentPane().add(new MyCanvasGride1());
		frame.setVisible(true);
	}

}
