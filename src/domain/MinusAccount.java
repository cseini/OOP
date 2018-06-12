package domain;

public class MinusAccount extends Account{
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금
	public void setDebt(int debt) {
		this.debt=debt*(-1);
	}
	public int getDebt(int dept) {
		return debt;
	}
	public void setMoney() {
		money = money-debt;
	}
	public String toString() {
		return String.format("%s \n%s \n계좌번호 %s \n이름 : %s \n생성일 : %s \n잔액 : %d원",BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,debt);
	}
}
