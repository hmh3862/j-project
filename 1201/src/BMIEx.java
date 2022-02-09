import java.util.Scanner;

/*
체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
체질량지수는 근육량, 유전적 원인, 다른 개인적 차이를 반영하지 못하는 단점이 있음에도 불구하고
조사자들이나 의료인들이 가장 많이 쓰는 방법 중 하나입니다.
저체중 : 18.5
정상   : 23
과체중 : 25.00
비만   : 25이상
 */
class BMI{
	private double weight;
	private double height;
	
	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getBMI() {
		double bmi = weight/((height/100)*(height/100));
		return bmi;
	}
	public String getResult() {
		String result = "";
		double bmi = getBMI();
		if(bmi<18.5)
			result = "저체중";
		else if(bmi<23)
			result = "정상";
		else if(bmi<25)
			result = "과체중";
		else
			result = "비만";
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("%.2f(%s)", getBMI(), getResult());
	}
}
public class BMIEx {
	public static void main(String[] args) {
		
		BMI bmi2 = new BMI(68,175);
		System.out.println(bmi2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("신장 : ");
		double height = sc.nextDouble();
		
		double bmi = weight/((height/100)*(height/100));
		System.out.println("당신의 bmi 지수 : " + bmi);
		String result = "";
		if(bmi<18.5)
			result = "저체중";
		else if(bmi<23)
			result = "정상";
		else if(bmi<25)
			result = "과체중";
		else
			result = "비만";
		System.out.println(result);
		sc.close();
	}
}
