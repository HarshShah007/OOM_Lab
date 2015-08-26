public abstract class BankSystem{
	double amount, interest, totalamount;
      	String name, address, phoneno;
	public BankSystem(double a, double i, String n, String add, String p){
		amount = a;
		interest = i;
		name = n;
		address = add;
		phoneno = p;
	}
	public double calculation(){
		totalamount = amount + ((interest/100.0)*amount);
		return totalamount;
	}
	public void display(){
		System.out.println("Amount Deposited: "+amount+"\n"+"Interest Rate: "+interest);
		System.out.println("Total Amount: "+totalamount);
	}
}
