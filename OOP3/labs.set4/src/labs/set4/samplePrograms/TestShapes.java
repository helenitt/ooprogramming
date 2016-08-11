package labs.set4.samplePrograms;

/** Driver class to test out the Shape interface as well as the Point,
and Circle classes that implement it and form an inheritance hierarchy*/
public class TestShapes {
      public static void main(String[] args){
           Point point = new Point(5,1);
           Circle circle = new Circle(2.5,10,5);
           
           // declare an array of shapes, which will accept points or circles
           Shape[] arrayOfShapes = new Shape[2];
           // adding one point and one circle
           arrayOfShapes[0] = point;
           arrayOfShapes[1] = circle;
           
           //Use the array reference object to display the correct information via polymorphism
           for (Shape s : arrayOfShapes)	{
           			System.out.println(s.getName() + ": " +
           			s.toString() + "\nArea is " + 
           			s.area() );
           	}                           
         }
}