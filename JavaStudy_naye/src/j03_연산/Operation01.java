package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		
		System.out.println(num++); // 선증가, 후증가
		System.out.println(num);
		
		System.out.println(--num);// 선감소, 후감소
		System.out.println(num--);
		System.out.println(num);
		
	}

}
