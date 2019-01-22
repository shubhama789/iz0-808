package q12;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List ps = new ArrayList<>();
		Patient patient = new Patient("Mike");
		ps.add(patient);
	
		int l=ps.indexOf(patient);	
		
		if(l>=0) {
			System.out.println("MIke Fpund");
		}
		
	}
	
}


class Patient{
	String name;
	public Patient(String name) {
		this.name=name;
	}
}