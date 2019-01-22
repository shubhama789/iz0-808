package q40;

public class Account {

	public static void main(String[] args) {
		CheckingAccount a = new CheckingAccount((int)(Math.random()*1000));
		//a.amount=0;
		//a.changeAmount(-a.amount);
		//a.changeAmount(-a.getAmount());
		System.out.println(a.getAmount());
	}
}
class CheckingAccount{
	public int amount;
	public CheckingAccount(int amount) {
		this.amount=amount;
	}
	public int getAmount() {
		return amount;
	}
	public void changeAmount(int x) {
		amount+=x;
	}
	
}