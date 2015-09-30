import java.applet.*;
import java.awt.*;
/*
<applet code="exp10b" width=400 height=400>
</applet>
*/ 
public class exp10b extends Applet
{

	public void init()
	{
		
		setBackground(Color.darkGray);
	}
	public void paint(Graphics g)
	{
		int i,k=0,l=0,x=40;
		for (i=0;i<62;i++,k+=x) 
		{
			if(k>x*7)
				{
					k=0;
					l+=x;
					i++;
				}
			if(i%2==0)
				{
					g.fillRect(k,l,x,x);
				}
			else
				{
					g.drawRect(k,l,x,x);
				}
		}
	}
	
}
