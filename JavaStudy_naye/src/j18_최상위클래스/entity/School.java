package j18_최상위클래스.entity;

import java.util.Objects;

public class School {
	private String schoolName;
	private int numberStudents;
	private int numberTeachers;
	private String schoolAddress;
	
	public School(String schoolName, int numberStudents, int numberTeachers, String schoolAddress) {
		this.schoolName = schoolName;
		this.numberStudents = numberStudents;
		this.numberTeachers = numberTeachers;
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getNumberStudents() {
		return numberStudents;
	}

	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}

	public int getNumberTeachers() {
		return numberTeachers;
	}

	public void setNumberTeachers(int numberTeachers) {
		this.numberTeachers = numberTeachers;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numberStudents, numberTeachers, schoolAddress, schoolName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return numberStudents == other.numberStudents && numberTeachers == other.numberTeachers
				&& Objects.equals(schoolAddress, other.schoolAddress) && Objects.equals(schoolName, other.schoolName);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", numberStudents=" + numberStudents + ", numberTeachers="
				+ numberTeachers + ", schoolAddress=" + schoolAddress + "]";
	}
	

}
