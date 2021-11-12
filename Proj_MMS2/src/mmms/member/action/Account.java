
public class Account {
	
	String accountNo; //계좌번호
	String ownerName; //예금주
	int balance; //잔고
	
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public Account() {
		
	}

	//입금
	void deposit(int amount) {
		
		balance += amount;
	}
	
	//출금
//	void withdraw(int amount) {
//		balance -= amount;
//		System.out.println(balance);
//		System.out.println(amount);
//	}
//	int withdraw(int amount) {
//		if(balance <amount) {
//			System.out.println("잔고: " + balance);
//			System.out.println("잔고가 부족합니다.");
//		} else {
//			balance = balance-amount;
//			System.out.println("잔고: " + balance);
//			return amount;
//		}
//		return amount;
//		
//	}
	int withdraw(int amount) throws Exception { //2단계
		if(balance <amount) {
		//System.out.println("잔고가 부족합니다.");
			throw new Exception("강제적으로 예외발생:: 잔고가 부족합니다."); //1단계
		} else {
			balance = balance-amount;
			System.out.println("잔고: " + balance);
			
		}
		return amount;
		
	}
	

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
