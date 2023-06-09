/**
 * 중첩클래스 예제
 */

package com.javalab.polymorphism.pkg19;

public class A { // 바깥쪽

	// A 인스턴스 필드
	String field = "A-field";

	// A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}

	// 인스턴스 멤버 클래스
	class B { // 안쪽
		// B 인스턴스 필드
		String field = "B-field";

		// B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}

		// B 인스턴스 메소드
		void print() {
			// B 객체의 필드와 메소드 사용
			System.out.println(this.field); // 안쪽 필드
			this.method();
			
			// A 객체의 필드와 메소드 사용
			System.out.println(A.this.field); // 바깥쪽 필드
			A.this.method();
		}
	}
	
	/**
	 * 바깥클래스(A)의 인스턴스 메소드 : 일반적으로 바깥 클래스(A) 내부에서 B클래스 사용
	 * 일반적으로 바깥 클래스에서 내부 클래스 객체 생성해서 사용한다.
	 * (외부)에서 내부 클래스를 생성하는 일은 거의 없다.
	 */
	
	void useB() {
		B b = new B(); // 내부클래스 객체 생성
		b.print(); // 내부클래스 객체의 print()메소드 호출
	}
}