package domain;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account{
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money, withDraw;
	protected String name, uid, pass,accountType, accountNo,createDate,randomNum;
	// 통장 123-345-678 의 형태가 되도록 코딩
	// createDate는 블로그에서 오늘 날짜 뽑는 로직 가져다 쓰세요.
	public Account(String name, String uid, String pass) {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
		this.name=name;
		this.uid=uid;
		this.pass=pass;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setCreateDate() {
		this.createDate=new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	public void setRandomNum() {
		this.randomNum=String.format("%03d",(int)(Math.random()*999)+1);
	}
	public void setAccountNo() {
		String accountNo="";
		for(int i=0;i<3;i++) {
			setRandomNum();
			accountNo += (i!=2)?randomNum+"-":randomNum;
		}
		this.accountNo=accountNo;
	}
	public void setWithDraw(int withDraw) {
		money=money-withDraw;
	}
	public String getAccountType() {
		return ACCOUNT_TYPE;
	}
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getUid()	{
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getCreateDate(){
		return createDate;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getRandomNum() {
		return randomNum;
	}
	public int getWithDraw() {
		return withDraw;
	}
	public String toString() {
		return String.format("%s \n%s \n계좌번호 %s \n이름 : %s \n생성일 : %s \n잔액 : %d원",BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,money);
	}
}
