class Account {  
	String Name;
	double Bal;
	double rate = 3.0;
	double get_balance(int a){
		if (a==1) {
		       	System.out.println("In class Account");
		}
		return this.Bal;
	}
	double Cal_int(double rate)
	{
		return (this.Bal)*rate;
	}
	double credit(){
		return (this.Bal += this.Cal_int(rate));
	}
	void debit(double amount)
	{
		if (amount > this.Bal)
			System.out.println("Not enough balance");
		else {
			this.Bal -= amount;
		}
	}
}

class Saving_account extends Account {
	void create(String N,double B){
		System.out.println("Inside Saving Account");
		Name = N;
		Bal = B;
	}
	double get_balance(){
		return this.Bal;
	}
	double Cal_int()
	{
		return (this.Bal)*rate;
	}
	double credit(){
		return (this.Bal += this.Cal_int());
	}
	void debit(double amount)
	{
		if( amount > this.Bal)
			System.out.println("Not enough balance");
		else{
			this.Bal -= amount;
		}
	}
}
class Current_account extends Account{
	void create(String N,double B){
		System.out.println("Inside current Account");
		Name = N;
		Bal = B;
	}
	double get_balance(){
		return this.Bal;
	}
	double Cal_int()
	{
		return (this.Bal)*rate;
	}
	double credit(){
		return (this.Bal += this.Cal_int());
	}
	void debit(double amount)
	{
		if( amount > this.Bal)
			System.out.println("Not enough balance");
		else{
			this.Bal -= amount;
		}
	}
}

public class q4 {
	public static void main(String[] args){
		Saving_account s;
		Current_account c;			;
		s = new Saving_account();
		s.create("save", 100.0);
		System.out.println(s.get_balance()); 
		System.out.println(s.get_balance(1)); 

		c = new Current_account();
		c.create("check", 100.0);
		System.out.println(c.get_balance()); 

	}
}
