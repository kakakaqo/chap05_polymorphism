/**
 * 추상클래스의 구현클래스
 */

package com.javalab.polymorphism.pkg16;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 거리에서 손님을 태우고 운행중입니다."); // 메소드 구현부
	}

}