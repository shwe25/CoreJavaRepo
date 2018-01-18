package edu.jsp.exception;

public class CustomException{

	public static void main(String[] args) {
		Account ac = new Account();
		try {
			ac.withDraw(11000);
		} catch (NoMoneyException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
	}
}
class NoMoneyException extends Exception{
	
	private String msg;
	public NoMoneyException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}

class Account{
	
	int balance = 10000;
	
	void withDraw(int amt) throws NoMoneyException{
		
		if(balance >= amt){
			System.out.println("Withdraw Success...");
		}
		else{
			throw new NoMoneyException("Low Balance");
		}
		
	}
	
}