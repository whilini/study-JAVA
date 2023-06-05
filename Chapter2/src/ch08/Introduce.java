package ch08;

public class Introduce {
	
	public int height;
	public int weight;
	public String sex;
	public String name;
	public int age;
	
	public Introduce(int height, int weight, boolean sex, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.sex = sex ? "남성" : "여성";
		this.name = name;
		this.age = age;
	}
	
	public String IntroduceSelf() {
		return "키가 " + height + "cm이고 몸무게가 " + weight + "kg인 " + sex + "이 있습니다. 이름은 " + name + "이고 나이는 " + age + "세 입니다.";
	}
	
}
