import java.util.TreeSet;

public class TreeSetExample {
    
    public static void main(String[] args) {
        
        TreeSet<String>  obj1= new TreeSet<String>();
        obj1.add("Alive");
        obj1.add("is");
        obj1.add("Awesome");
        
        //add duplicate object
        obj1.add("Awesome");
        
        System.out.println(obj1);
        
        //This code does not work, why?
        //TreeSet<Player>  team= new TreeSet<>();
        //team.add(new Player("Tom",18));
        //team.add(new Player("Dick",19));
        //team.add(new Player("Harry",20));
         //add duplicate object
        //team.add(new Player("Tom",18));
        //System.out.println(team); 
        
        
        
        
    }
    
}
