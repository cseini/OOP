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
		CellPhone cp=null; 
		IPhone ip=null;
		GalaxyPhone gp=null;
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
				cp = new CellPhone();
				cp.setName(JOptionPane.showInputDialog("이름"));
				cp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				cp.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, cp.toString());
			break;
			case IPHONE:
				ip = new IPhone();
				ip.setName(JOptionPane.showInputDialog("이름"));
				ip.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				ip.setData(JOptionPane.showInputDialog("문자내용"));
				JOptionPane.showMessageDialog(null, ip.toString());
				break;
			case GALAXYPHONE:
				gp=new GalaxyPhone();
				gp.setName(JOptionPane.showInputDialog("이름"));
				gp.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				gp.setData(JOptionPane.showInputDialog("카톡내용"));
				gp.setSize();
				JOptionPane.showMessageDialog(null, gp.toString());
			break;
			default:
			break;
			}
		}
	}
}
