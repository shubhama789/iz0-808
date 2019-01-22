package q8;

public class q8 {

	public static void main(String[] args) {
		String shirts[][] = new String[2][2];
		shirts[0][0]="red";
		shirts[0][1]="blue";
		shirts[1][0]="small";
		shirts[1][1]="medium";
		
		
		for(int index=0;index<2;) {
			for(int i=0;i<2;) {
				System.out.println(shirts[index][i]+":");
				++i;
			}
			++index;
		}
		
	}
	
}
