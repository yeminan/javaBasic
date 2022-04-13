package Bank;

public class Loan {
	int id;
	String Type;
	int Accountid;
	int Customerld;
	
	Loan(int id, String Type, int Accountid, int Customerld){
		this.id=id;
		this.Type=Type;
		this.Accountid=Accountid;
		this.Customerld=Customerld;
	}
}
