package Flyweight;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Cliente extends JApplet implements ActionListener
{
	private static final Color colores[] = { Color.red, Color.blue,
	                                       	 Color.yellow, Color.orange,
	                                         Color.black, Color.gray };
	private static final int NUMERO_FIGURAS = 100;
		
	JLabel etiqueta1 = new JLabel("Introduce tipo figura:");	
	JTextField texto1 = new JTextField("0");	
	JButton dibujar = new JButton("Dibujar");	
	JButton borrar = new JButton("Borrar");	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	FactoriaDeFiguras factoria = new FactoriaDeFiguras();
		
	public void init()
	{
		getContentPane().setLayout(new BorderLayout());
		panel1.setLayout(new GridLayout(3,2));
		panel1.add(etiqueta1);
		panel1.add(texto1);				
		panel1.add(dibujar);
		panel1.add(borrar);
		dibujar.addActionListener(this);		
		borrar.addActionListener(this);		
		getContentPane().add("North",panel1);
		getContentPane().add("Center",panel2);		
	}
	
	public void actionPerformed(ActionEvent e)
	{		
		if (e.getSource()==dibujar)
		{
			Graphics g = panel2.getGraphics();									
			int t = Integer.parseInt(texto1.getText()); //captura tipo figura
                
			for(int i=0; i < NUMERO_FIGURAS; ++i) 
			{
                Figura figura = factoria.getFigura(t, getRandomColor());
                figura.dibujar(g, getRandomX(), getRandomY(),getRandomLado());                
                //Como tenemos 6 colores, solo creamos 6 objetos.
            }				
		}
		
		if (e.getSource()==borrar)
		{
			repaint();
		}		
	}
	
	private int getRandomX() 
	{	
	  return (int)(Math.random()*this.getWidth() );
	}
	
	private int getRandomY() 
	{
	  return (int)(Math.random()*this.getHeight());
	}
	
	private int getRandomLado() 
	{
	  return (int)(Math.random()*(this.getHeight()/10));
	}
	
	private Color getRandomColor() 
	{
	  return colores[(int)(Math.random()*colores.length)];
	}

		
}
