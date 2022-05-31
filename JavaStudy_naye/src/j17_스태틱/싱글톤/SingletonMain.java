package j17_스태틱.싱글톤;

import j07_메소드.Method02;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야한다.
		 */
		
		Method02.test1();

		Singleton singleton = Singleton.getInstance();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(10);
		singleton2.printInfo();

	}

}
