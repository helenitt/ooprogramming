import java.util.*;
public class  KingForADay
{
private static ArrayList<Student> entries= new ArrayList<Student>();;// holds Student references

     public static void main(String[] args)
     {
			addStudents();
     }


	public static void addStudents()
     {
          // prompts for student names and ID numbers
          // adds students to entries list
          // does not allow duplicate entries
          Scanner input = new Scanner(System.in);
          System.out.println("Press Enter to end input");
          System.out.print("Name: ");
          String name = input.nextLine();
			do
	          {
	               System.out.print("ID: ");
	               String id = input.nextLine();
	               Student student = new Student(name, id);
	               if (!entries.contains(student)) //only one entry per student
	               {
	                    entries.add(student);
	                    System.out.println(name + " entered in the lottery.");
	               }
	               else
	                    System.out.println(name + " not entered.");
	               System.out.print("\nName: ");
	               name = input.nextLine();
	          } while (! name.equals(""));// signals end of data
          pickWinner();
     }
	public static void pickWinner()
     {
          // chooses a random entry and displays winners name and ID
          int numEntries = entries.size();// size of ArrayList
          Random random = new Random();
          Student winner = entries.get(random.nextInt(numEntries));
          System.out.print("The winner and King for a Day is ");
          System.out.println (winner.getName());
          System.out.println (winner.getID());
     }

}
