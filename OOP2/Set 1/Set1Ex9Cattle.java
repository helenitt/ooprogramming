//Set1Ex9Cattle.java
/*This program declares an array of 20 doubles and initializes it 
 *to the weight in kilos of 10 animals. It processes those weights 
 *and outputs the results. 
 *Array algorithms total, average, biggest, selective count. */

public class Set1Ex9Cattle {
	public static void main(String[] args) {
		
		double cattle[] = {234.2,123.0,344.8,455.4,150.6};
		double under=0, over = cattle[0], light = cattle[0], avg=0;
		
		for(int i=0;i<4;i++){
			if(cattle[i]<250){
				under++;
			}
		}
		
		for(int i=0;i<4;i++){
			if(cattle[i]>400){
				over++;
			}
		}
		over = 5*over/100;	
			
		for(int i=0;i<4;i++) {
			if(light > cattle[i]) {
				light = cattle[i];
			}
		}
		
		for(int i=0;i<4;i++){
			avg += cattle[i]; 
		}
		avg = avg/5; 
		
		System.out.println("Weights: "+cattle[0]+", "+cattle[1]+", "+cattle[2]+", "+
						   cattle[3]+", "+cattle[4] +
					       "\nNumber under 250kg: " + (int)under +
					       "\nPercentage over 400kg: " + String.format("%.2f",over) +
					       "\nLightest animal: " + light +
					       "\nAverage weight: " + String.format("%.2f",avg));	
	}
}