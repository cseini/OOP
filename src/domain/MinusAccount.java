package domain;

public class MinusAccount extends Account{
	public final static String ACCOUNT_TYPE="마이너스통장";
	int limit; //대출한도
	public MinusAccount(String name, String uid, String pass) {
		super(name, uid, pass);
		setAccountType(ACCOUNT_TYPE);//이게 없으면 Account()에서 기본통장을 찍고 마이너스를 찍으니까....아예 메소드를 불러서 마이너스만 찍게끔.. 
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {
		return String.format("%s \n%s \n계좌번호 %s \n이름 : %s \n생성일 : %s \n대출한도 : %d원",BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,limit);
	}
}
