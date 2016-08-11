//L12Ex1StudentHeights.java
/*This program makes use of an array of floats called heights of 
 *size 10. Apart from the main(), this program should have 5 user-defined 
 *methods that perform various tasks*/
 
import javax.swing.JOptionPane;
 
public class L12Ex1StudentHeights {
	public static void main(String args[])
		{
			float heights[] = new float[10];
			float average, smallest, tallest;
						
			readHeights(heights);
			
			average = calcAverage(heights);
			smallest = calcSmallest(heights);
			tallest = calcTallest(heights);
			
			JOptionPane.showMessageDialog(null,"Average Height: " + String.format("%.2f",average) +
										  "\nSmallest Height: " + String.format("%.2f",smallest) +
										  "\nTallest Height: " + String.format("%.2f",tallest),
										  "Height Stats",JOptionPane.INFORMATION_MESSAGE);
			
			displayHeights(heights);
			
			System.exit(0);	
		}
	public static void readHeights(float h[])
		{
			String heightAsString;
			
			for(int i=0; i<h.length; i++)
				{
					heightAsString = JOptionPane.showInputDialog("Please enter height for student " + (i+1));
					h[i] = Float.parseFloat(heightAsString);
				}	
		}
	public static float calcAverage(float h[])
		{
			float total=0, ave;
			
			for(int k=0; k<h.length; k++)
				{
					total += h[k];
				}
			
			ave = total/h.length;
			return ave;
		}
	public static float calcSmallest(float h[])
		{
			float small = h[0];
			
			for(int s=0; s<h.length; s++)
				{
					if(h[s]<small)
						small = h[s];
				}
			return small;
		}
	public static  float calcTallest(float h[])
		{
			float tall = h[0];
			
			for(int t=0; t<h.length; t++)
				{
					if(h[t]>tall)
						tall = h[t];
				}
			return tall;
		}
	public static void displayHeights(float h[])
		{
			String list="\n";
			
			for(int j=0; j<h.length; j++)
				{
					if(h[j]>1.7)
						list += h[j] + ", ";
				}
				
			JOptionPane.showMessageDialog(null,"The list of heights over 1.7m is: " + list,
										  "Heights over 1.7m",JOptionPane.INFORMATION_MESSAGE);
		}
}