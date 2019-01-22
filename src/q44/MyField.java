package q44;

public class MyField {

	int x;
	int y;
	public void doSTuff(int x,int y) {
		this.x=x;
		y=this.y;
	}
	public void display() {
		System.out.println(x+" "+y+":");
	}
	public static void main(String[] args) {
		MyField m = new MyField();
		m.x=100;
		m.y=200;
		MyField m1 = new MyField();
		m1.doSTuff(m.x, m.y);
		m.display();
		m1.display();
		
	}
}
