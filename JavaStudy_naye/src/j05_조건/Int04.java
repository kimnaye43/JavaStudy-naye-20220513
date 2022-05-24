package j05_조건;

import java.util.Scanner;

public class Int04 {

	public static void main(String[] args) {
		/*
		 * x == 0 || y == 0 "계산할 수 없습니다." 출력
		 * x == 0 && y == 0 "원점입니다." 출력
		 * x or y
		 * -1000 ~ 1000 사이가 아니면 계산 불가
		 */
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.print("x: ");
		x = scanner.nextInt();
		System.out.print("y: ");
		y = scanner.nextInt();
		
		if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0)) {
			System.out.println("계산 불가");
		}else if(x > 0 && y > 0) {
			System.out.println("1사분면");
		}else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		}else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		}else if(x > 0 && y < 0) {
			System.out.println("4사분면");
		}else {
			System.out.println("원점");
		}
		
		String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0) ? "계산 불가"
						: x > 0 && y > 0 ? "1사분면"
								: x < 0 && y > 0 ? "2사분면"
										: x < 0 && y < 0 ? "3사분면"
												: x > 0 && y < 0 ? "4사분면" : "원점";
		System.out.println(result);						
	}
}

