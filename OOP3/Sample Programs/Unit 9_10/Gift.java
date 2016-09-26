/** models a Christmas gift
 *@version 2 the smallest class that will work with the ChristmasList app
 */
 public class Gift{
 	private String name;  // person getting the gift
 	private String item;  // item to be given
 	private double price; // estimated price
 	
 	public void setName(String name){
 		this.name = name;
 	}
 	public void setItem(String item){
 		this.item = item;
 	}
 	public void setPrice (double price){
 		this.price = price;
 	}
 	
 	/** 
 	 *@return a line of text containing the details of the gift, person and price
 	 */
 	public String toString() {
 		return "\n"+ item + " for " + name + " costing " + price + " euro";
 	}
 	
 	/** added later to allow generation of a shopping list
 	 */
 	public String getItem() {
 		 return item;
 	}
 	
 	/** no-args constructor, added so that Version 5 of Christmas List doesn't give
 	 *  null objects
 	 */
 	 public Gift() {
 	 	setName("Unknown");
 	 	setItem("Item not decided");
 	 	setPrice(0);
  	 }
 }