package domain;
// 홍길동, 010-1234-5678,삼성,집전화기,2시에만나
public class Phone {
	private String name, phoneNum, call;
	public static final String BRAND = "삼성", KIND = "집전화기";
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}
	public void setCall(String call) {
		this.call=call;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getCall(){
		return call;
	}
	public String toString() {
		return String.format("%s 에게 %s 번호로  %s 제품  %s를 사용해서 %s 라고 통화했다 ",name, phoneNum, BRAND, KIND, call);
	}
}
