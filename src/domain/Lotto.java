package domain;
/*
 * 로또볼 추첨
 * 1~45 까지 랜덤숫자
 * 볼갯수는 총 6개
 * 중복 불허
 * 출력은[5,23,23,40,19,22]
 * */
public class Lotto {
	int money;
	String result,ballSelect;
	int[] ballNum;
	public void setMoney(int money) {
		this.money=money;
	}
	public void setBall() {
		ballNum = new int[6];
		ballSelect="";
		for(int i=0;i<6;i++) {
			ballNum[i]=(((int)(Math.random()*45))+1);
			for(int j=0;j<6;j++) {
				if(ballNum[i]==ballNum[j]) {
					ballNum[i]=(((int)(Math.random()*45))+1);
				}
			}
			ballSelect+=ballNum[i]+" ";
		}
	}
	public void setResult() {
		result="";
		for(int i=0;i<money/1000;i++) {
			setBall();
			result+= ballSelect+"\n";
			}
	}
	public int getMoney() {
		return money;
	}

	public int[] getBall() {
		return ballNum;
	}
	public String getResult() {
		return result;
	}
}