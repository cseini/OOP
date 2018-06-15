package ui;

import javax.swing.JOptionPane;
import domain.*;
import Service.*;
import ServiceImpl.*;

/**
 * 비트뱅크 기본통장 계좌번호 213-456-789 이름 : 홍길동 생성일 : 2018년 6월 12일 잔액 : 10000원 입금하시겠습니까?
 * ---------------------- 비트뱅크 마이너스통장 계좌번호 213-456-789 이름 : 홍길동 생성일 : 2018년 6월
 * 12일 잔액 : 10000원 대출받으시겠습니까?
 */
enum AccButt {
	EXIT, ACCOUNT, MINUS_ACCOUNT, DEPOSIT, WITHDRAW, LIST;
}

public class AccountMain {
	public static void main(String[] args) {
		Account ac = null;
		AccountService service = new AccountServiceImpl();
		AccButt[] buttons = { AccButt.EXIT,
							AccButt.ACCOUNT,
							AccButt.MINUS_ACCOUNT,
							AccButt.DEPOSIT,
							AccButt.WITHDRAW,
							AccButt.LIST };
		while (true) {
			switch ((AccButt) JOptionPane.showInputDialog(null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT:
				return;
			case ACCOUNT:
				service.addList(service.createAccount(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("사용 ID"),
						JOptionPane.showInputDialog("password")
						));
				break;
			case LIST:
				JOptionPane.showMessageDialog(null, service.showResult());
				break;
			case MINUS_ACCOUNT:
				service.addList(service.createAccount(
						JOptionPane.showInputDialog("이름"),
						JOptionPane.showInputDialog("사용 ID"),
						JOptionPane.showInputDialog("password")
						));
				break;
			case DEPOSIT:
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마를 입금 하시겠습니까?")));
				JOptionPane.showMessageDialog(null, Account.DEPOSIT_SUCCESS + "\n잔액 :" + ac.getMoney());
				break;
			case WITHDRAW:
				int money = 0;
				if (((MinusAccount) ac).getLimit() != 0) {
					money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
					if (money < ((MinusAccount) ac).getLimit()) {
						ac.setWithDraw(money);
						JOptionPane.showMessageDialog(null, MinusAccount.WITHDRAW_SUCCESS + "\n" + ac.getMoney());
					} else {
						JOptionPane.showMessageDialog(null, MinusAccount.WITHDRAW_FAIL);
					}
				} else {
					money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
					if (money < ac.getMoney()) {
						ac.setWithDraw(money);
						JOptionPane.showMessageDialog(null, Account.WITHDRAW_SUCCESS + "\n" + ac.getMoney());
					} else {
						JOptionPane.showMessageDialog(null, Account.WITHDRAW_FAIL);
					}
				}
				break;
			default:
				break;
			}
		}
	}
}
