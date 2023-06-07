package ch04;

import java.util.ArrayList;

class Animal {
	
	String species;
	String food;
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	
	public void eat(String species, String food) {
		this.species = species;
		this.food = food;
	}
	
	public void eating() {
		System.out.println(species + "은/는 주로 " + food + "을/를 먹고 삽니다");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		hAnimal.eat("사람", "밥");
		tAnimal.eat("호랑이", "고기");
		eAnimal.eat("독수리", "물고기");
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
			animal.eating();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
