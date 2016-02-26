

// Lab13Ast1.java
// The Graphics Sorter
// This is the student, starting file for the 80 Point Version of Lab 13A.


import java.util.*;
import java.awt.*;
import java.applet.*;


public class Lab13A extends Applet
{
	
	private int numBars;	// number of bars to be sorted
	int barHeight[];			// array of bar heights
	int sortDelay;
	int count;					// delay between comparison iteration
	

	public void init()
	{
		numBars = 47;
		sortDelay = 3000;
		barHeight = new int[numBars];
		getBarValues();	
		count = 1;	
	}


	public void getBarValues()
	{
		Random rand = new Random(3333);
		for (int k = 0; k < numBars; k++)
			barHeight[k] = rand.nextInt(591) + 10;  // range of 10..600
	}
	
	public void paint(Graphics g) 	
	{
		showFrame(g);
		displayBars(g);
		sortBars(g);
		Expo.delay(sortDelay);
		showFrame(g);
		displayBars(g);			
	}
	
	public void showFrame(Graphics g)
	{
		Expo.setColor(g,Expo.white);
		Expo.fillRectangle(g,0,0,1000,650);
		Expo.setColor(g,Expo.black);	
		Expo.fillRectangle(g,0,0,1000,15);
		Expo.fillRectangle(g,0,0,15,650);
		Expo.fillRectangle(g,0,635,1000,650);
		Expo.fillRectangle(g,985,0,1000,650);			
	} 
		
	public void displayBars(Graphics g)
	{ 	
		if (count == 1)
			Expo.setColor(g,Expo.red);
		else 
			Expo.setColor(g,Expo.blue);
		int x = 25;
		int x2 = 35;
		int y = 635;
		
		for (int k=0; k<numBars; k++)
		{
			int y2 = 635 - barHeight[k];
			Expo.fillRectangle(g,x,y,x2,y2);
			x+=20;
			x2+=20;			
		}
		count = 2;
	} 
	
	public void sortBars(Graphics g)
	{
		int temp;
	       for (int p = 1; p < numBars; p++)
		for (int q = 0; q < numBars-1; q++)
		       if (barHeight[q] > barHeight[q+1])
		       {
			temp = barHeight[q];
			barHeight[q] = barHeight[q+1];
			barHeight  [q+1] = temp;
		       }

	}


  	private void swap(int x, int y)
  	{
  	
	
	}
  	
  	

}

