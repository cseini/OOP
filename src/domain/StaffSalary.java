package domain;

public class StaffSalary extends Salary{
	public static final String DEPT= "정직원";
	protected int bonus; // 기본급의 10%
	public StaffSalary(String name, int sal) {
		super(name,sal);
		setDept(DEPT);
		this.name=name.substring(0,1)+"직원";
		setBonus();
		this.sal=sal+bonus;
	}
	public void setBonus() {
		this.bonus=sal/10;
	}
	public int getBonus() {
		return bonus;
	}
}
