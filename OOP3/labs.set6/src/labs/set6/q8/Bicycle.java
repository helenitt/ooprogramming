package labs.set6.q8;

/** models a bicycle
 */
public class Bicycle {
	
	private String owner;
	private double value;
	private String make;
	
	/** owner and value known
	 *@param s The owner's name
	 *@param v the bicycle's value
	 */
	public  Bicycle(String s, String m, double v){
		owner = s;
		make = m;
		value = v;
	}
	
	/** owner and value known
	 *@param s The owner's name
	 *@param v the bicycle's value
	 */
	public  Bicycle( String s, double v ){
		owner = s;
		make = "unknown make";
		value = v;
	}
	
	/** Owner known, but not the make or value
	 *@param s the owner's full name
	 */
	public  Bicycle( String s ){
		owner = s;
		make = "unknown make";
	}
	
	public  Bicycle( ){
		owner = "unassigned";
		make = "unknown make";
	}
	
	public void setOwner(String s){
		owner = s;
	}
	
	public void setMake(String m){
		make = m;
	}
	
	public void setValue(double v){
		value = v;
	}
	
	public String getOwner(){
	  return owner;	
	}
	
	public String getMake(){
	  return make;	
	}
	
	public double getValue(){
	  return value;	
	}
	
	/**
	 *@return owner's name, make and value separatred by one space */
	public String toString() {
		return owner + " " + make + " " + value;
	}
}