package ui;
import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;
/*
 * 로또 결과화면
 * 얼마치를 구입하십니까?
 * 5200
 * 5	7	14	25	29	43
 * 5	7	14	25	29	43
 * 5	7	14	25	29	43
 * 5	7	14	25	29	43
 * 5	7	14	25	29	43
 * */
enum Butt{
	EXIT,
	INPUT_BMI,
	OUTPUT_BMI,
	INPUT_GRADE,
	OUTPUT_GRADE,
	INPUT_SALARY,
	OUTPUT_SALARY,
	INPUT_LOTTO,
	OUTPUT_LOTTO
	;}
public class Main {
	public static void main(String[] args) {
		Butt[] buttons = {
				Butt.EXIT,
				Butt.INPUT_BMI,
				Butt.OUTPUT_BMI,
				Butt.INPUT_GRADE,
				Butt.OUTPUT_GRADE,
				Butt.INPUT_SALARY,
				Butt.OUTPUT_SALARY,
				Butt.INPUT_LOTTO,
				Butt.OUTPUT_LOTTO
				};
		BMI[] arr = new BMI[10];
		BMI bmi = null;
		Grade[] gradeArr = new Grade[10];
		Grade grade = null;
		Salary[] salaryArr = new Salary[10];
		Salary salary = null;
		Lotto lotto=new Lotto();
		int count = 0, gradeCount = 0, salCount=0;;
		while(true) {
			switch((Butt)JOptionPane.showInputDialog(
					null,
					"MAIN PAGE",
					"SELECT MENU",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					null)) {
			case EXIT: return;
			case INPUT_BMI:
				bmi = new BMI();
				bmi.setName(JOptionPane.showInputDialog("이름을 입력해주세요. "));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키를 입력해주세요. ")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력해주세요. ")));
				bmi.setResult();
				String res = String.format("| %s | %f mm | %f kg | %s |", bmi.getName(), bmi.getHeight(), bmi.getWeight(), bmi.getResult());
				JOptionPane.showMessageDialog(null,res);
				arr[count]=bmi;
				count++;
			break;
			case OUTPUT_BMI:
				String output="";
				for(int i = 0;i<count;i++) {
					if(arr[i]!=null) {
					output+=arr[i].toString()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null,output);
			break;
			case INPUT_GRADE:
				grade = new Grade();
				grade.setName(JOptionPane.showInputDialog("이름 입력"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				String gradeRes = String.format("| %s | %d | %d | %d | %d | %d | %s |", grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), grade.getTotal(), grade.getAvg(), grade.getGrade());
				JOptionPane.showMessageDialog(null, "| 이름 | 국어 | 영어 | 수학 | 총점 | 평균 | 등급 |\n"+gradeRes);
				gradeArr[gradeCount]=grade;
				gradeCount++;
			break;
			case OUTPUT_GRADE:
				String gradeOutput ="";
				for(int i=0;i<gradeCount;i++) {
					gradeOutput+=gradeArr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, gradeOutput);
			break;
			case INPUT_SALARY:
				salary = new Salary();
				salary.setDept(JOptionPane.showInputDialog("부서"));
				salary.setName(JOptionPane.showInputDialog("성명"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당")));
				salary.setTotal();
				String salResult=String.format("| %s | %s | %d | %d | %d | \n",salary.getDept(),salary.getName(),salary.getSal(),salary.getBonus(),salary.getTotal());
				JOptionPane.showMessageDialog(null, salResult);
				salaryArr[salCount]=salary;
				salCount++;
				break;
			case OUTPUT_SALARY:
				String salOutput ="";
				for(int i =0;i<salCount;i++) {
					salOutput += salaryArr[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,salOutput);
				break;
			case INPUT_LOTTO:
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마치를 구입하십니까?")));
				lotto.setMany();
				lotto.setBall();
			break;
			case OUTPUT_LOTTO:
				lotto.setResult();
				JOptionPane.showMessageDialog(null, lotto.getMoney() + "\n" + lotto.getResult());
			break;
			default: break;
			}
		}
	}
}