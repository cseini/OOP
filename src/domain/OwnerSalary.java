package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT= "이사회";
	protected int share; // (sal + bonus)*10
	public OwnerSalary(String name, int sal) {
		super(name,sal);
		setDept(DEPT);
		this.name=name.substring(0,1)+"이사";
		setShare();
		this.sal=sal+bonus+share;
	}
	public void setShare() {
		this.share=(sal+bonus)*10;
	}
	public int getShare() {
		return share;
	}
}
