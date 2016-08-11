package q67and8;

/*
 *Q6 
 * a.
 *"Cannot instantiate the type Employee". 
 *It makes sense that the Employee class should be abstract because the 
 *different types of employees are paid in different ways.
 *
 * b.
 * It throws an error.
 * The Employee class must be an abstract class because it has an abstract method.
 * 
 * c.
 * I think the multi-argument constructor should be called from the sub classes.
 * ???
 * 
 * d.
 * I made the earnings method concrete and it seemed to work fine.
 * 
 * e.
 * No.
 * "Abstract methods do not specify a body"
 * If you remove the word abstract you get "This method requires a body instead of a 
 * semicolon"
 * 
 * 
 * Q7
 * f.
 * The Manager class is concrete because it does not have abstract in the method header
 * and all it's methods have bodies. Therefore it can be instantiated.
 * 
 * g.
 * Defining it as final means it cannot be extended any further.
 * 
 * h.
 * The Manager class inherits the attributes from the Employee class, it doesn't 
 * declare them in the Manager class, it creates them via the constructor - super(fn,ln);
 * and displays them via super.toString(); in the toString method.
 * 
 * i.
 * super(fn,ln); takes the parameters String fn, String ln, and supplies them to the
 * constructor in the Employee class to create an employee object.
 * 
 * j.
 * If 1000 was input for the managers salary, the managers salary would be set at 1000
 * euro and the 20 added after a decimal place.
 * 
 * k.
 * The Manager class must contain an earnings() method  because it is an abstract class 
 * in the Employee class, it is therefore inherited and the code must be implemented in
 * the sub class.
 * 
 * l.
 * The ‘super’ reference is not essential but it can only be omitted if you use the
 * get methods.
 * 
 * m.
 * Example of over riding:-
 * toStiring method which overrides the toSring method in the Manager class and then 
 * calls it using the super reference.
 * 
 *  Q8. a.
 *  The polymorphic behaviour occurs when emp.toString() and emp.earnings() are 
 *  used once they have been dynamically bound to the object, emp=m1;
 *  
 *   b.
 *   Method binding is being used with emp=m1;
 *   
 *   c.
 *   It's not possible, "Type mismatch: cannot convert from Employee to Manager"
 *   doesn't make sense, a Manager 'is an' Employee but an Employee is not necessarily 
 *   a Manager.
 *   
 * */
