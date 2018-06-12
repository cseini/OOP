package domain;

public class IPhone extends CellPhone{
	public static final String BRAND = "애플",	KIND = "아이폰";
	protected String data;
	public void setData(String data) {
		this.data=data+" 라고 문자했다.";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		setPortable(true);
		// 홍길동에게 010 번호로 애플 제품 아이폰을 사용해서 
		// 이동가능한 상태로 안녕이라고 문자를 전송했다.
		return String.format("%s에게 %s번호로 %s 제품 %s을 사용해서 %s한 상태로 %s ",super.getName(),super.getPhoneNum(),BRAND,KIND,super.getMove(),data);
	}
}
