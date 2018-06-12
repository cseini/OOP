package domain;
/*
 * 로또볼 추첨
 * 1~45 까지 랜덤숫자
 * 볼갯수는 총 6개
 * 중복 불허
 * 출력은[5,23,23,40,19,22]
 * */
public class Lotto {
	int money, many;
	String result;
	int[][] ball = new int[5][6];
	public void setMoney(int money) {
		this.money=money;
	}
	public void setMany() {
		this.many=money/1000;
	}
	public void setBall() {
		for(int i=0;i<many;i++) {
			for(int j=0;j<6;j++) {
				ball[i][j]=(((int)(Math.random()*45))+1);
			}
		}
	}
	public void setResult() {
		result = "";
		for(int i=0;i<many;i++) {
			for(int j=0;j<6;j++) {
				result += String.format("%d  ",ball[i][j]);
			}
			result += "\n";
		}
	}
	public int getMoney() {
		return money;
	}
	public int getMany() {
		return many;
	}
	public int[][] getBall() {
		return ball;
	}
	public String getResult() {
		return result;
	}
}
