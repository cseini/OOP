package ui;
import javax.swing.JOptionPane;
import domain.*;
enum SalaryButt{
	EXIT,
	INTERN, // 영어로
	STAFF,
	OWNER
;}
public class SalaryMain {
	public static void main(String[] args) {
		SalaryButt[] buttons= {
				SalaryButt.EXIT,
				SalaryButt.INTERN,
				SalaryButt.STAFF,
				SalaryButt.OWNER
		};
		while(true) {
			switch((SalaryButt)JOptionPane.showInputDialog(
					null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT:				
			return;
			case INTERN:
				JOptionPane.showMessageDialog(null, new Salary(JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("본봉"))
						).toString());
			break;
			case STAFF:
				JOptionPane.showMessageDialog(null, new StaffSalary(JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("본봉"))
						).toString());
			break;
			case OWNER:
				JOptionPane.showMessageDialog(null, new OwnerSalary(JOptionPane.showInputDialog("이름"),
						Integer.parseInt(JOptionPane.showInputDialog("본봉"))
						).toString());
			break;
			default:
				
			break;
					
			}
		}
	}
}
