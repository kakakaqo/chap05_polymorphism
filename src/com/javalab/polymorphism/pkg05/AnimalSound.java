/**
 * 동물 객체의 울음 소리를 구현해주는 클래스
 */

package com.javalab.polymorphism.pkg05;

public class AnimalSound {

	// 매개변수의 다형성 : 파라미터로 지정된 타입의 자식들은 누구라도 받을 수 있음.
	public void makeAnimalSound(Animal animal) { // 자동 타입 변환(tiger -> Animal type)
		
		// 파라미터로 전달된 객체의 오버라이딩된 메소드 자동 호출
		animal.makeSound();
	}
}