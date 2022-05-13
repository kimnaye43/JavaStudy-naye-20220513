package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 김준일
		 * 나이: 29
		 * 연락처: 010-9988-1916
		 * 주소: 부산 동래구 사직동
		 */
		
		char name1 = '김';
		char name2 = '나';
		char name3 = '예';
		int age = 15;
		String phone = "010-8865-2565"; //문자열
		String address = "부산 진구 개금동";
		
		System.out.print("이름: "+name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println("나이: " +age);
		System.out.println("연락처:" +phone);
		System.out.println("주소:"+ address);
		
		System.out.println("세수의 합: " + (10 + 20 + 30));
		
		
		

	}

}
