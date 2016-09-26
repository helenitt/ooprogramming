import java.util.Comparator;
public class VehicleComparator implements Comparator<Vehicle>{
	
	public int compare(Vehicle v1,Vehicle v2){
		
		return v1.toString().compareTo(v2.toString());
	}
		 
}