/**
 * @(#)Student.java
 *
 *
 * @author
 * @version 1.00 2012/3/5
 */


public class Student
{
     private String name;
     private String id;
     public Student()
     {
          name = "";
          id = "";
     }
     public Student (String n, String idNum)
     {
          name = n;
          id = idNum;
     }
     public String getName()
     {
          return name;
     }
     public String getID()
     {
          return id;
     }
	public void setName(String n)
     {
          name = n;
     }
     public void setID( String idNum)
     {
          id = idNum;
     }
     public boolean equals(Object o) // name and id are the same
     {
          return (  (((Student)o).name).equals(name)  &&
           (((Student)o).id).equals(id)   );
     }
}
