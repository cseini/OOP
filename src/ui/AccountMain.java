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
enum AccButt{
	EXIT,
	ACCOUNT,
	MINUS_ACCOUNT
;}
public class AccountMain {
	public static void main(String[] args) {
		AccButt[] buttons= {
				AccButt.EXIT,
				AccButt.ACCOUNT,
				AccButt.MINUS_ACCOUNT
				};
		Account account = null;
		MinusAccount mAccount = null;
		while(true) {
			switch((AccButt)JOptionPane.showInputDialog(
					null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT: return;
			case ACCOUNT:
				account = new Account();
				account.setName(JOptionPane.showInputDialog("이름"));
				account.setUid(JOptionPane.showInputDialog("사용 ID"));
				account.setPass(JOptionPane.showInputDialog("password"));
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금하시겠습니까?")));
				account.setAccountNo();
				account.setCreateDate();
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case MINUS_ACCOUNT:
				mAccount = new MinusAccount();
				mAccount.setName(JOptionPane.showInputDialog("이름"));
				mAccount.setUid(JOptionPane.showInputDialog("사용 ID"));
				mAccount.setPass(JOptionPane.showInputDialog("password"));
				mAccount.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출받으겠습니까?")));
				mAccount.setAccountNo();
				mAccount.setCreateDate();
				JOptionPane.showMessageDialog(null, mAccount.toString());
				break;
			default: break;
			}
		}
	}
}
