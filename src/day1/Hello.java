package day1;

/*
 * Date : 2022.12.28
 * Source : Hello.java
 * Author : soyun.kwon
 */
public class Hello {
	public static void main(String[] args) {	// main메서드의 선언부
		System.out.println("Hello World!!!");
		
		// 한줄 주석
		/* 범위 주석 */
		
		System.out.println("Hello,/* 이것은 주석으로 취급되지 않음 */ World!!!");
		System.out.println("Hello, World!!! //이것도 주석으로 취급되지 않음");
	}
}



//실행 결과
//Hello World!!!
//Hello,/* 이것은 주석으로 취급되지 않음 */ World!!!
//Hello, World!!! //이것도 주석으로 취급되지 않음
