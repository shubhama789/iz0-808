package q48;

public class KeyFound {

	public static void main(String[] args) {
		
		int[] data = {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for(int e: data) {
			if(e!=key) {
				//continue:			/// here cannot use as label and also is there is ; instead of :
									//  count++ becomes unreachable
					count++;
			}
		}
		System.out.println(count+" Found");
	}
}
