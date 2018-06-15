package domain;

public class Salary {
	public static final String DEPT= "인턴쉽";
	protected String dept, name;
	protected int sal;
	public Salary(String name, int sal) {
		this.name=name.substring(0,1)+"인턴";
		this.sal=sal;
		setDept(DEPT);
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public void setSal(int sal) {
		this.sal=sal;
	}
	public String getDept() {
		return dept;
	}
	public int getSal() {
		return sal;
	}
	public String toString() {
		return String.format("부서 : %s 이름 : %s 본봉 : %d만원 지급",dept,name,sal);
	}
}