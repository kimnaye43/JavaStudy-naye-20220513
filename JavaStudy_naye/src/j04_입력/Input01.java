package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력: "); //실행 후 옆에 입력하기 위해 println 대신 print 씀
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 값 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("합한 값: " + (num1 + num2));
		
		scanner.next();				//문자열(String)
		scanner.nextLine();			//문자열(String)
		scanner.next().charAt(0);   //문자(char)
		scanner.nextInt();			//정수(int)
		scanner.nextDouble();		//실수(double)

	}

}
