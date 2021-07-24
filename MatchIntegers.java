package hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MatchIntegers extends MatchIntegerTest{
	
	public Map<Integer, Integer> IntegerMap = new HashMap<>();
	//hashmap being used to efficiently search for existing integer values
	
	public void findPair() {
		
		System.out.println("Looking for sum: " + target + "\n");
		int possibletarget = -1;
		boolean found = false;
		
		for(int i = 0; i < values.length; i++)
		{
			IntegerMap.put(values[i], values[i]);
			//trying to find target-value in hashmap
			
			possibletarget = target - values[i];
			//value that is being searched for in loop
			
			if(IntegerMap.containsValue(possibletarget) && possibletarget != 0) {
				this.toString(values[i], possibletarget);
				found = true;
				//if pair is found with value existing in hashmap
				}
			else 
				IntegerMap.put(values[i], values[i]);
				//if pair not found in hashmap, adds value and continues
		}
		
		if(!found) //for if no pair is found in hashmap by end of array
			System.out.println("no pair found for target:" + target);
	}
	
	public void toString(int target, int possibletarget) {
			//output method for when pairs of integers are found
			System.out.println("Pair Found: " + possibletarget + " & " + target);
	}
}

