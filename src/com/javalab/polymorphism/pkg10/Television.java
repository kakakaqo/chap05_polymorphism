/**
 * 구현클래스
 * - 인터페이스의 추상 메소드를 구현한(코드를 작성한) 클래스
 */

package com.javalab.polymorphism.pkg10;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다."); // 인터페이스의 내용 구현
		
	}


}
