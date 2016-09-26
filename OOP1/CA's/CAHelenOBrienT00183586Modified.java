//CAHelenOBrienT00183586Modified.java
/*This Program will read in the x and y co-ordinates of the centre of a circle,
 *it will then prompt for and read in the x and y co-ordinates of a second point.
 *It will then determine whether the location of the second point lays inside, on 
 *or outside the circle*/
 
 import javax.swing.JOptionPane;
 
 public class CAHelenOBrienT00183586Modified {
 	public static void main(String args[])
	 	{
	 		String xCircleAsString, yCircleAsString, radiusAsString, xPointAsString, yPointAsString, distance;
	 		float xCircle, yCircle, radius, xPoint, yPoint;
	 		
	 		xCircleAsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's centre");
	 		xCircle = Float.parseFloat(xCircleAsString);
	 		
	 		yCircleAsString = JOptionPane.showInputDialog("Please enter the y co-ordinate of the circle's centre");
	 		yCircle = Float.parseFloat(yCircleAsString);
	 		
	 		radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the circle");
	 		radius = Float.parseFloat(radiusAsString);
	 		
	 		xPointAsString = JOptionPane.showInputDialog("Please enter the x co-ordinate of the second point");
	 		xPoint = Float.parseFloat(xPointAsString);
	 		
	 		yPointAsString = JOptionPane.showInputDialog("Please enter the y co-ordinate of the second point");
	 		yPoint = Float.parseFloat(yPointAsString);
	 		
	 		distance = pointLocator(xCircle, yCircle, radius, xPoint, yPoint);
	 		
	 		if(distance.equals("outside"))
		 		JOptionPane.showMessageDialog(null,"The second point is located outside the circle",
		 										  "Point Locator",JOptionPane.INFORMATION_MESSAGE);
		 	else if(distance.equals("inside"))
			 	JOptionPane.showMessageDialog(null,"The second point is located inside the circle",
			 								      "Point Locator",JOptionPane.INFORMATION_MESSAGE);
			else if(distance.equals("on"))
				JOptionPane.showMessageDialog(null,"The second point is located on the circle",
												  "Point Locator",JOptionPane.INFORMATION_MESSAGE);
				
			System.exit(0);
	 	}
	public static String pointLocator(float xC, float yC, float radius, float xP, float yP)
		{
			String result;
			double distance;
			
			distance = Math.sqrt((Math.pow((xP-xC),2))+(Math.pow((yP-yC),2)));
			
			if(distance>radius)
				result = "outside";
			else if(distance<radius)
				result = "inside";
			else
				result = "on";
					
			return result;
		}
 }