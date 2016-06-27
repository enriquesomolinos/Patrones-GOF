package Flyweight;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PruebaFWJava extends JFrame
{
	public static void main(String args[])
	{
		PruebaFWJava p = new PruebaFWJava();
	}

	public PruebaFWJava()
	{	   	 
		super("Prueba Patrón Flyweight Java");             
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setup();
	}

	public void setup()
	{
		JPanel panel1 = new JPanel(), panel2 = new JPanel();
		Border border1 = BorderFactory.createRaisedBevelBorder();
		Border border2 = BorderFactory.createRaisedBevelBorder();
		panel1.setBorder(border1);
		panel1.setLayout( new BorderLayout() );
		panel1.add("Center",new JLabel("BevelBorder 1",JLabel.CENTER));
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setBorder(border2);
		panel2.setLayout( new BorderLayout() );
		panel2.add("Center",new JLabel("BevelBorder 2",JLabel.CENTER));
		panel2.setPreferredSize(new Dimension(100,100));		
		  
    	//Configuramos el frame    
		Container contenedor = getContentPane();
		contenedor.setLayout(new GridLayout(2,1,15,15));	    		          
		contenedor.add(panel1);		contenedor.add(panel2);
		
		this.setSize( 400,500 );
		this.setVisible( true );		
    	
    	//comprobamos que estamos utilizando el mismo objeto de la factoría
		System.out.println(border1==border2);
	}
}


     
