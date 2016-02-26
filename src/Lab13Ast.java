// Lab13Ast2.java
// The Graphics Sorter
// This is the student, starting file for the 100 Point Version of Lab 13A.


import java.awt.*;
import java.applet.*;


public class Lab13Ast extends Applet
{
	private int numBars;     	// number of bars to be sorted
	private int barHeight[]; 	// array of bar heights
	private int sortDelay;	 	// delay between comparison iteration
		

	public void init()
	{
		numBars = 47;
		sortDelay = 10;
		barHeight = new int[numBars];
		getBarValues();		
	}
	
	public void getBarValues()
	{
		Expo.startSeed(3333);
		for (int k = 0; k < numBars; k++)
			barHeight[k] = Expo.seedRandom(10,600);
	}

	
	public void paint(Graphics g) 	
	{
		showFrame(g);
		displayRandomBars(g);
		sortBars(g);			
	}

	public void showFrame(Graphics g)
	{
		Expo.setColor(g,Expo.black);
		Expo.fillRectangle(g,0,0,1000,20);
		Expo.fillRectangle(g,0,630,1000,650);
		Expo.fillRectangle(g,0,20,20,630);
		Expo.fillRectangle(g,980,20,1000,650);		
	} 
	




	public void drawBar(Graphics g, int k)
	{
		int y2 = 630;
		int x1 = 35 + k * 20;
		int y1 = y2 - barHeight[k];
		int x2 = x1 + 10;
		Expo.setColor(g,Expo.red);
		Expo.fillRectangle(g,x1,y1,x2,y2); 			
	}	
		

	public void eraseBar(Graphics g, int k)
	{


			
	}	

		
	public void displayRandomBars(Graphics g)
	{ 
		for (int k = 0; k < numBars; k++)
		 	drawBar(g,k);
	} 

		
	public void swap(Graphics g, int m, int n)					
	{


		
	}

	
	public void sortBars(Graphics g)
	{



	}

}



    

