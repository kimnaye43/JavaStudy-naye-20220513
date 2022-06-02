package j19_제네릭;
 

public class Controller {
	public Object createUser() {
		return new CMRespDto<String>(1, "회원추가 성공", "aaaa. 1234");
	}
	
	public Object UpdateUser() {
		return new CMRespDto<Integer>(1, "회원정보(나이)수정 성공", 29);
	}
	
	//제네릭의 와일드카드
	public CMRespDto<?> getUser() {
		User user = new User();
		user.setUsercode("2");
		user.setUsername("junil");
		user.setPassword("1234");
		user.setName("김준일");
		user.setEmail("skjil1218@kakao.com");
		if(user.getUsercode().equals("1")) {
		return new CMRespDto<User>(1, "회원정보 가져오기 성공", new User());
		}else {
			return new CMRespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
	}
	
	public CMRespDto<? extends Animal> getAnimal() {
		Animal animal = new Human();

		if(animal instanceof Human) {
			return new CMRespDto<Human>(1, "사람입니다.", (Human) animal);
		}else if(animal instanceof Tiger) {
			return new CMRespDto<Human>(1, "호랑이입니다.", (Tiger) animal);
		}else {
			return new CMRespDto<>(-1, "찾을 수 없는 동물", animal);
		}
	}
}
