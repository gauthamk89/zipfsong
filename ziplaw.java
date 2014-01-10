
/** Name:- Gautham Karkala
    email:- gauthamk@andrew.cmu.edu*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class ziplaw {

	
	public static void main(String[] args) {
		
		Scanner keyword = new Scanner(System.in);
		System.out.println("Enter the values");
		
		int num_songs = keyword.nextInt();
		int selection = keyword.nextInt();
		
		int q[] = new int[num_songs];
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<num_songs;i++)
		{
			int value = keyword.nextInt();
			String name = keyword.next();
			int quality = value*(i+1);
			map.put(name, quality);
			q[i] = quality;
		}
		
		Arrays.sort(q);
		
				
		for(int i=num_songs-1;i>=(num_songs-selection);i--)
		{
			for (Entry<String, Integer> entry : map.entrySet()) {
	            if (entry.getValue().equals(q[i])) {
	                System.out.println(entry.getKey());
	                break;
	            }
	        }
		}
		keyword.close();
	}
	

}
