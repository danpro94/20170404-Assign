package systemprj;

public class AccountPlus {

	private String owner;
	private long balance;
	
	public AccountPlus() {
		super();
	}
	
	public AccountPlus(String owner,long balance) {
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
	
	public long deposit(long amount) {	//저축
		long save=this.balance+amount;
		this.balance=save;
		System.out.println(amount+"원이 입금 되었습니다.(잔액= "+save+")");
		return save;
	}
	
	public long withdraw(long amount) {	//인출
		long draw=this.balance-amount;
		this.balance=draw;
		System.out.println(amount+"원이 출금 되었습니다.(잔액= "+draw
				+")");
		return draw;
	}
	
	public static void main(String[] args) {
		AccountPlus Aplus=new AccountPlus();
		Aplus.deposit(100000);
		Aplus.withdraw(60000);
		System.out.println("처리후 잔액은 "+Aplus.getBAL()+"원 입니다.");
	}
}
