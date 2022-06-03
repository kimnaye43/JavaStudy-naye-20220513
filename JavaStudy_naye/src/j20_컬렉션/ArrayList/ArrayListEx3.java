package j20_컬렉션.ArrayList;

import java.util.ArrayList;

import j20_컬렉션.entity.Student;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		/*
		 * 1. Student 자료형을 담을 수 있는  ArrayList를 생성.
		 * 
		 * 2. 학생정보 추가
		 * studentCode  name  	scoolName
		 * 2022001		김준일  부산교육대학원
		 * 2022002		곽나경	부산대학교
		 * 2022003		정현경	부경대학교
		 * 2022004		한재안  부산대학교
		 * 2022005		전주홍  동아대학교
		 * 
		 * 3. 전체 학생 정보 출력
		 * 
		 * 4. 인덱스 3의 위치에 삽입
		 * 20220006		한대경	서울대학교
		 * 
		 * 5. 인덱스 2의 위치에 있는 학생의 학교명을 고려대학교로 바꾸기
		 * 
		 * 6. 인덱스 5의 위치에 있는 학생의 정보를 수정
		 * 2022007		김나예	부산여자중학교
		 * 
		 * 7. 인덱스 0의 위치에 있는 학생의 정보를 삭제
		 */
			
		studentList.add(new Student(2022001, "김준일", "부산교육대학원"));
		studentList.add(new Student(2022002, "곽나경", "부산대학교"));
		studentList.add(new Student(2022003, "정현경", "부경대학교"));
		studentList.add(new Student(2022004, "한재안", "부산대학교"));
		studentList.add(new Student(2022005, "전주홍", "동아대학교"));
		
		System.out.println(studentList);
		
		studentList.add(3, new Student(2022006, "한대경", "서울대학교"));
		
		studentList.get(2).setShoolName("고려대학교");
		
		studentList.set(5, new Student(2022007, "김나예", "부산여자중학교"));
		
		studentList.remove(0);
		
		System.out.println(studentList);
		
		
	}

}
