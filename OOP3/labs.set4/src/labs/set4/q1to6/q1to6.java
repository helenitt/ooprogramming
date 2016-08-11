package labs.set4.q1to6;



/*
 * Q1. a.
 * An interface is a list of unimplemented methods, representing a set of 
 * behaviours. An interface can be used at the upper levels of an 
 * inheritance hierarchy to indicate behaviours that will be implemented 
 * by abstract or concrete classes further down.
 * 
 *  b.
 *  A sub class can only inherit from one super class but a class can inherit
 *  behaviours from multiple interfaces. For example the class Dog could 
 *  inherit from the interfaces Barking and Wagging
 *  
 *  c.
 *  A Java interface is implicitly abstract and cannot have implementations. 
 *  A Java abstract class can have instance methods that implements a 
 *  default behavior. 
 *  Variables declared in a Java interface is by default final. 
 *  An abstract class may contain non-final variables.
 *  
 *  2. i.
 *  No you can't "Illegal modifier for the interface field Shape.dummy; only 
 *  		      public, static & final are permitted"
 *  Interfaces do not have private attributes.
 *  
 *  ii.
 *  "The blank final field dummy may not have been initialized"
 *  When it is initialized it is fine.
 *  
 *  iii.
 *  No "Illegal modifier for the interface Shape; only public & abstract 
 *  are permitted"
 *  
 *  iv.
 *  "Illegal modifier for the interface method area; only public, abstract, 
 *  default, static and strictfp are permitted"
 *  
 *  v.
 *  "Abstract methods do not specify a body"
 *  
 *  
 *  4. i.
 *  When a class implements an interface it inherits all the interfaces 
 *  abstract methods which must be implemented. All the methods must be 
 *  implemented.
 *  
 *  ii.
 *  No
 *  Private - Cannot reduce the visibility of the inherited method from Shape
 *  Protected - Protected cannot be resolved to a type.
 *   
 *  
 *  5. i.
 *  Circle is a derived class.
 *  
 *  ii.
 *  The call to the setPoint method achieves the same result as 
 *  using the super key word as it sets x and y to a and b. It 
 *  is not possible to use x=a; and y=b; because x and y are not 
 *  visible.
 *  
 *  iii.
 *  The call to super must be on the first line
 *  Can't be call from a method other than the constructor
 *  Constructor call must be the first statement in a constructor.
 *  
 *  
 *  Q6. i.
 *  Declares and creates an array of 2 shapes with the reference shapes
 *  You are not instantiating an object, you are creating an array
 *  from the interface. The objects are instantiated from the concrete 
 *  classes.
 *  
 *  ii.
 *  The toString method uses Polymorphism, it uses the array reference 
 *  object to display the correct information via polymorphism, this 
 *  block only uses methods defined for all shapes, so it will work for 
 *  any shape that happens to be in the array.
 *  
 *  iii.
 *  Example of dynamic method binding
 *  for (Shape s : shapes)	{
           			System.out.println(s.getName() + ": " +
           			s.toString() + "\nArea is " + 
           			s.area() );
 * 
 */
