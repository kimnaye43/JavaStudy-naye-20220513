package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		System.out.print("Hello, Java");
		System.out.println("Hello, Java"); //println 줄바꿈 일어남
		System.out.print(10 + 5); //큰 따옴표 붙이면 문자 그대로
		System.out.println();
		
		int age = 29;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age); //숫자 따옴표 ㄴㄴ
		
		age = 30;
		
		System.out.print("이름: ");
		System.out.println("김준일");
		System.out.print("직업: ");
		System.out.println("강사");
		System.out.print("나이: ");
		System.out.println(age);
		
		age = age + 1;
		
		System.out.println(age);
		
	}

}
