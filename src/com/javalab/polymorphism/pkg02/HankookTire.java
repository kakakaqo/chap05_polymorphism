/**
 * 자식 클래스(한국타이어)
 */

package com.javalab.polymorphism.pkg02;

public class HankookTire extends Tire{

	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}