package j04_입력;

import java.util.Scanner;

public class Input03 {

	public static void main(String[] args) {
		/*
		 * [개인정보 입력]
		 * 이름: 김준일				문자열 name
		 * 나이: 29					정수   age
		 * 연락처: 010-9988-1916	문자열 phone
		 * 주소: 부산 동래구 사직동 문자열 address
		 * 성별: 남					문자   gender
		 * 
		 * 출력은 중간에 => 나오게
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[개인정보 입력]");
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.print("연락처: ");
		String phone = scanner.next();
		scanner.nextLine();
		System.out.print("주소: ");
		String address1 = scanner.next();
		String address2 = scanner.next();
		String address3 = scanner.next();
		System.out.print("성별: ");
		char gender = scanner.next().charAt(0);
		System.out.println();
		
		System.out.println("[개인정보 출력]");
		System.out.println("이름 => "+name);
		System.out.println("나이 => "+age);
		System.out.println("연락처 => "+phone);
		System.out.println("주소 => " + address1 + address2 + address3);
		System.out.println("성별 => "+gender);




		
		

	}

}
