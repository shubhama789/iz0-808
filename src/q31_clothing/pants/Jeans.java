package q31_clothing.pants;

import q31_clothing.*;

public class Jeans {
public void matchShirt() {
	String color =Shirts.getColor();
	if(color.equals("Green")) {
		System.out.println("Fit");
	}
}
public static void main(String[] args) {
	Jeans t = new Jeans();
	t.matchShirt();
}
}
