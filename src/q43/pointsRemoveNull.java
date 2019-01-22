package q43;

import java.util.ArrayList;

public class pointsRemoveNull {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(null);
		a.remove(2);
		a.remove(null);
		System.out.println(a);
		
	}
}
