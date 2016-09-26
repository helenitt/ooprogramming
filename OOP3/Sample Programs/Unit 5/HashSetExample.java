import java.util.HashSet;

public class HashSetExample {
    
    public static void main(String[] args) {
        
        HashSet<String>  obj1 = new HashSet<String>();
        obj1.add("Alive");
        obj1.add("is");
        obj1.add("Awesome");
         //add duplicate object
        obj1.add("Awesome");
        System.out.println(obj1);  
        	
        	
        HashSet<Player> team = new HashSet<>();
        Player p;
        team.add(p = new Player("Tom",18));
        team.add(new Player("Dick",19));
        team.add(new Player("Harry",20));
        System.out.println(team);   
        	
        //add duplicate object???
        team.add(p);
        System.out.println("After dup 1 " + team);   
        	 
        //but..add duplicate object
        Player p2 = p;
        team.add(p2);
        System.out.println("After dup 2 " + team);   
        	       
        //but..add duplicate object
        team.add(new Player("Tom",18));
        System.out.println("After dup 3 " + team);   
        	
        Player p1 = new Player("Tom",18);
        team.add(p1);
        System.out.println("After dup 4 " + team);   
        	
        //but..add duplicate object
        p = new Player("Tom",18);
        team.add(p);               
        System.out.println("After dup 5 " + team);               
    }    
} 
