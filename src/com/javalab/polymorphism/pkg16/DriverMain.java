package com.javalab.polymorphism.pkg16;

public class DriverMain {

	public static void main(String[] args) {

		// [1]
		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용 ==========");
		Taxi taxi = new Taxi();
		taxi.run();
		Bus bus = new Bus();
		bus.run();
		System.out.println();

		// [2]
		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현 ==========");
		Driver driver = new Driver(); // 인터페이스를 사용한 Drive 객체 생성
		driver.drive(taxi);
		driver.drive(bus);
		System.out.println();

		// [3]
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴 ==========");
		// 부모 타입 배열 변수 준비
		Vehicle[] vehicles = new Vehicle[2];
		// 배열에 자식 객체 저장(두 개)
		vehicles[0] = new Bus();
		vehicles[1] = new Taxi();
		// 반복문으로 기사를 통해서 운행시키기
		for (Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
		}
	}
}