/**
 * 인터페이스 : 자손들이 반드시 구현해야할 빈 껍데기 메소드를 정의해놓은 클래스
 * - 인터페이스에 상수 필드 선언       
 * 인터페이스는 상수를 가질수 있다 (대문자면 상수)
 */

package com.javalab.polymorphism.pkg12;

public interface RemoteControl {

	// 상수 필드(상수 앞에는 public static이 생략됨)
	// 인터페이스 상수는 public static 이기 때문에 인터페이스 이름.상수로 접근
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드(반드시 자식이 구현해야함)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}