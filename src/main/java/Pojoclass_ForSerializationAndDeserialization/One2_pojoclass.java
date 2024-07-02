package Pojoclass_ForSerializationAndDeserialization;

public class One2_pojoclass 
{
	private String name;
	private int age;
	private String[] score_in_subjects;
	
	
		public String getName() {
		return name;
	}
	public String[] getScore_in_subjects() {
			return score_in_subjects;
		}
		public void setScore_in_subjects(String[] score_in_subjects) {
			this.score_in_subjects = score_in_subjects;
		}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
