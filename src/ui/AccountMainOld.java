package ui;
import javax.swing.JOptionPane;
import domain.*;
/**
 * 비트뱅크
 * 기본통장
 * 계좌번호 213-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 12일
 * 잔액 : 10000원
 * 입금하시겠습니까?
 * ----------------------
 * 비트뱅크
 * 마이너스통장
 * 계좌번호 213-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 12일
 * 잔액 : 10000원
 * 대출받으시겠습니까?
 * */
enum AccButtOld{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT,
	DEPOSIT,
	WITHDRAW
;}
public class AccountMainOld {
	public static void main(String[] args) {
		AccButtOld[] buttons= {
				AccButtOld.EXIT,
				AccButtOld.ACCOUNT,
				AccButtOld.MINUS_ACCOUNT,
				AccButtOld.DEPOSIT,
				AccButtOld.WITHDRAW
				};
		Account account = null;
		while(true) {
			switch((AccButtOld)JOptionPane.showInputDialog(
					null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT: return;
			case ACCOUNT:
				account = new Account(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("사용 ID"),
						JOptionPane.showInputDialog("password")
						);
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case MINUS_ACCOUNT:
				account = new MinusAccount(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("사용 ID"),
						JOptionPane.showInputDialog("password")
						);
				((MinusAccount) account).setLimit(Integer.parseInt(JOptionPane.showInputDialog("대출한도?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case DEPOSIT:
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 입금 하시겠습니까?")));
				JOptionPane.showMessageDialog(null, Account.DEPOSIT_SUCCESS+"\n잔액 :"+account.getMoney());
				break;
			case WITHDRAW:
				int money=0;
				if(((MinusAccount) account).getLimit()!=0) {
					money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
					if(money<((MinusAccount) account).getLimit()) {
						account.setWithDraw(money);					
						JOptionPane.showMessageDialog(null, MinusAccount.WITHDRAW_SUCCESS+"\n"+account.getMoney());
					}else {
						JOptionPane.showMessageDialog(null, MinusAccount.WITHDRAW_FAIL);
					}
				} else {
					money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
					if(money<account.getMoney()) {
						account.setWithDraw(money);
						JOptionPane.showMessageDialog(null, Account.WITHDRAW_SUCCESS+"\n"+account.getMoney());
					}else {
						JOptionPane.showMessageDialog(null, Account.WITHDRAW_FAIL);
					}
				}
				break;
			default: break;
			}
		}
	}
}
