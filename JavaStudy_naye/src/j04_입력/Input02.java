package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 문자열1 입력: nextLine()			hi
		 * 문자열2 입력: next() 			안녕
		 * 문자 입력: next().charAt(0)		A
		 * 정수 입력: nextInt()				10
		 * 실수 입력:nextDouble()			3.14
		 */
		
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("문자열1 입력: ");
//		String a = scanner.nextLine();
//		System.out.println(a);
//		
//		System.out.print("문자열2 입력: ");
//		String b = scanner.next();
//		System.out.println(b);
//		
//		System.out.print("문자 입력: ");
//		char c = scanner.next().charAt(0);
//		System.out.println(c);
//		
//		System.out.print("정수 입력: ");
//		int d = scanner.nextInt();
//		System.out.println(d);
//		
//		System.out.print("실수 입력: ");
//		double e = scanner.nextDouble();
//		System.out.println(e);
		
		String a = null;
		String b = null;
		char c = ' ';
		int d = 0;
		double e = 0;
		
		System.out.println("문자열1 입력: ");
		a = scanner.nextLine();
		System.out.println("문자열2 입력: ");
		b = scanner.next();
		System.out.println("문자 입력: ");
		c = scanner.next().charAt(0);
		System.out.println("정수 입력: ");
		d = scanner.nextInt();
		System.out.println("실수 입력: ");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		

	}

}
