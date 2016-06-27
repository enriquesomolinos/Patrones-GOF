package FactoryMethod;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class PruebaFactoria extends JApplet implements ActionListener
{
	JLabel etiqueta1 = new JLabel("Introduce tipo figura:");	
	JTextField texto1 = new JTextField("0");
	JLabel etiqueta2 = new JLabel("Introduce lado figura:");	
	JTextField texto2 = new JTextField("50");	
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
		panel1.add(etiqueta2);
		panel1.add(texto2);		
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
			int l = Integer.parseInt(texto2.getText()); //captura lado figura		
			Figura figura = factoria.getFigura(t,l);		
			figura.dibujar(g, 175, 20);		
		}
		if (e.getSource()==borrar)
		{
			repaint();
		}		
	}
		
}
