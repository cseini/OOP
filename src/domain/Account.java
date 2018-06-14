package domain;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, createDate, accountNo,randomNum;
	Date date;
	SimpleDateFormat sdf;
	// 통장 123-345-678 의 형태가 되도록 코딩
	// createDate는 블로그에서 오늘 날짜 뽑는 로직 가져다 쓰세요.
	public void setMoney(int money) {
		this.money=money;
	}
	public void setName(String name) {
		setAccountNo();
		setCreateDate();
		this.name=name;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public void setPass(String pass) {
		this.pass=pass;
	}
	public void setCreateDate() {
		date = new Date();
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		createDate=sdf.format(date);

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
	public String toString() {
		return String.format("%s \n%s \n계좌번호 %s \n이름 : %s \n생성일 : %s \n잔액 : %d원",BANK_NAME,ACCOUNT_TYPE,accountNo,name,createDate,money);
	}
}
