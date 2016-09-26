package Q1;

import java.util.*;

import javax.swing.JOptionPane;
/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
  public static void main (String args[]){
  	Set<String> names = new HashSet<String>();
  	String strNamesPrint = "";
  	String strName = "";
  	String longestName = "";
  	int numLetters = 0, longestNum = 0;
  	
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	System.out.println(names);
  	// transfer all the names to a (sorted) TreeSet
  	TreeSet<String> sortedNames = new TreeSet<String>(names);
  	System.out.println(sortedNames);
  	System.out.println("First person is " +sortedNames.first());
  	
  	for(Iterator<String> it = names.iterator(); it.hasNext(); )
  	{
  		strName = it.next();
  		
  		for( int i = 0; i < strName.length(); i++)
  		{
  			numLetters ++;  			
  		}
  		strName += numLetters;
  		numLetters = 0;  		
  		strNamesPrint += "\n" + strName;
  	}
  
  	JOptionPane.showMessageDialog(null, strNamesPrint);
  	
  	Iterator<String> it = names.iterator();
  	while(it.hasNext())
  	{
  		strName = it.next();
  		if(strName.length() > longestNum)
  		{
  			longestName = strName;
  			longestNum = strName.length();
  		}
  	}
  	
  	JOptionPane.showMessageDialog(null, "Longest name: " + longestName);
  }
}