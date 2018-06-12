package domain;
// 홍길동에게 010 번호로 삼성 제품 6인치 갤럭시폰을 사용해서 
// 이동가능한 상태로 안녕이라고 카톡을 전송했다.
public class GalaxyPhone extends IPhone{
	private String size;
	public static final String BRAND = "삼성",	KIND = "갤럭시폰";
	public void setSize() {
		this.size="6";
	}
	public String getSize() {
		System.out.println(size);
		return size;
	}
	/*public void setKaTalk() {
		this.kaTalk="카톡";
	}
	public String getKaTalk() {
		return kaTalk;
	}*/
	public void setData(String data) {
		this.data = data + "라고 카톡했다.";
	}
	public String toString() {
		setPortable(true);
		// 홍길동에게 010 번호로 애플 제품 아이폰을 사용해서 
		// 이동가능한 상태로 안녕이라고 문자를 전송했다.
		return String.format("%s에게 %s번호로 %s 제품 %s인치 %s을 사용해서 %s한 상태로 %s ",super.getName(),super.getPhoneNum(),BRAND,size,KIND,super.getMove(),data);
	}
}
