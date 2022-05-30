package j14_추상;

public class FactoryMain2 {

	public static void main(String[] args) {
		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop(); 
		
//		Factory factory = new Factory(); 추상 클래스는 생성 안됨
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();

	}

}
