package domain;

public class BMI {
	String name, result;
	double height, weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		double bmi = weight/((height*height)/10000);
		if(bmi<18.5){
			result = "저체중";
		} else if(18.5<=bmi&&bmi<23){
			result = "정상";
		} else if(23<=bmi&&bmi<25){
			result = "비만 전단계";
		} else if(25<=bmi&&bmi<30){
			result = "1단계 비만";
		} else if(30<=bmi&&bmi<35){
			result = "2단계 비만";
		} else{
			result = "3단계 비만";
		}
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight)	{
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("| %s | %f | %f | %s |", name,height,weight,result);
	}
}
