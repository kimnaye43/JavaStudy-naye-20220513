package j19_제네릭;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.UpdateUser());
		System.out.println(controller.getUser()); // Object return
		controller.getAnimal().getData().move();
		
		

	}

}
