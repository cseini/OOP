package ui;
import javax.swing.JOptionPane;
import domain.*;
// 0. 통화종료
// 1. 집전화기
enum TelButt{
	EXIT,
	TELEPHONE,
	CELLPHONE,
	IPHONE,
	GALAXYPHONE
	;}
public class PhoneMain {
	public static void main(String[] args) {
		TelButt[] buttons = {
				TelButt.EXIT,
				TelButt.TELEPHONE,
				TelButt.CELLPHONE,
				TelButt.IPHONE,
				TelButt.GALAXYPHONE
				};
		Phone phone=null;
		while(true) {
			switch((TelButt)JOptionPane.showInputDialog(
					null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT: 
			return;
			case TELEPHONE:
				phone = new Phone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
			break;
			case CELLPHONE:
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
			break;
			case IPHONE:
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("문자내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case GALAXYPHONE:
				phone=new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("카톡내용"));
				((GalaxyPhone) phone).setSize();
				JOptionPane.showMessageDialog(null, phone.toString());
			break;
			default:
			break;
			}
		}
	}
}
