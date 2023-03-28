/**
 * 구현 클래스
 * - InterfaceC를 구현한 구현클래스(자식클래스)
 * - InterfaceC는 InterfaceCImpl 클래스에 마우스를 갖다 대면 자동으로 구현해줌.
 * (메소드)의 시그너처는 InterfaceCImpl 클래스에 마우스를 갖다 대면 자동으로 구현해줌.
 */

package com.javalab.polymorphism.pkg17;

public class InterfaceCImpl implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");

	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");

	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");

	}

}