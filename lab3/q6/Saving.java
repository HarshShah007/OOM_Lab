public class Saving extends BankSystem{
	//String name, address, phoneno;
	public Saving(double a, double i, String n, String add, String p){
		super(a, i, n ,add, p);
	}
		/*name = n;
		address = add;
		phoneno = p;
	}*/
	public void info(){
		System.out.println("Name: "+name+"\n"+"Address:"+address);
		System.out.println("PhoneNumber: "+phoneno);
		calculation();
	}
	public void display(){
		super.display();
	}
}
