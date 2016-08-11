package labs.set5.q1and2;

/*
 * Q1.  
 * a. An Interface
 * 
 * b. It extends extends Iterable<E>
 * 	   
 * c. Why are there no constructors listed for Collection?
 * 	  Doesn't need a constructor it is an interface so
 * 	  it cannot be instantiated.
 * 
 * d. The package it belongs to is java.util
 * 
 * e. there are 11 sub interfaces. List<E>, NavigableSet<E>, Set<E>
 * 
 * f. Collection methods that return information about the collection 
 *	  without making any changes are:-  10
 * 			eg. size() 
 * 
 * g. Collection methods that make changes are:-  5
 * 			eg. clear()
 * 
 * 2.
 * a. AbstractCollection is a Class
 * 
 * b. It is a sub class of java.lang.Object
 * 
 * c. Implemented Interfaces are Iterable<E>, Collection<E>
 * 
 * d. public abstract class AbstractCollection<E>
 * 	  extends Object
 * 	  implements Collection<E>
 * 
 * e. The two abstract methods are:-
 * 			abstract Iterator<E> 	iterator()
 * 			abstract int 	size()
 * 
 * f. An abstract method doesn't implement any code
 * 
 * g. AbstractCollection <String> c = new AbstractCollection<String>();
 * 	  Cannot instantiate the type AbstractCollection<String>
 * 	  Doesn't work because you can't instantiate an abstract method
*/