package j05_조건;

public class If02 {

	public static void main(String[] args) {
		int score = 85;
		
		 //중괄호 생략하기
		if(score == 100) {
			System.out.println("만점입니다.");
		}else if(score > 89) {
			System.out.println("90점 이상입니다.");
		}else if(score > 79) {
			System.out.println("80점 이상입니다.");
		}else { // 이 중괄호는 생략해도 되지만 안하는 게 가독성이 좋음
			System.out.println("...");
		}
	}

}
