//House.java
/*This is the Owning Instantiable Class for House*/

public class House {
	
	private String address;
	private String type;
	private double price;
	private Person owner;// Nested object
	
	//Constructors
	//Set attributes indirectly
	public House() {
		setAddress("No Address Specified");
		setType("No Type Specified");
		setPrice(0.0);
		owner = new Person();
	}
	public House(String address, String type, double price, String name,int age,char gender) {
		setAddress(address);
		setType(type);
		setPrice(price);
		owner = new Person(name, age, gender);
	}
	
	//Accessors
	public String getAddress() {
		return address;
	}
	public String getType() {
		return type;
	}
	public double getPrice() {
		return price;
	}
	public Person getOwner() {
		return owner;
		/* a more secure approach would be return owner.clone() this would 
		 *require the implementation of a clone() method in the Person class
   		 */
	}
	
	//Mutators
	public void setAddress(String add) {
		address = add;
	} 
	public void setType(String tp) {
		type = tp;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public void setOwner(String name, int age, char gender) {
		owner.setOwner(name, age, gender);
	}
	
	//toString - only accesses the attributes indirectly
	public String toString() {
		return "Address: " + getAddress() + "\nType: " + getType() + "\nPrice: " +
	            getPrice() + "\nOwner: " + owner.toString();
	}
}
 