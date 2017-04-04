package systemprj;

public class Account {

	private String owner;
	private long balance;
	
	public Account(String owner,long balance) {
		super();
		this.owner=owner;
		this.balance=balance;
	}
	
	public String getOWN() {	//get
		return owner;
	}
	
	public long getBAL() {		//get
		return balance;
	}
	
	public void setOWN(String owner) {	//set
		this.owner=owner;
	}
	
	public void setBAL(long balance) {	//set
		this.balance=balance;
	}
}
