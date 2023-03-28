/**
 * 실행클래스
 * 필드의 다형성
 */

package com.javalab.polymorphism.pkg02;

public class CarMain {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();

		// HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();

		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}