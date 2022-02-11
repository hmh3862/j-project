package kr.green.maven.vo;


public class Person implements Comparable<Person>{
	private String name;
	private int age;
	private boolean gender;
	
	public Person() {
		
	}
	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
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
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + ", " + (gender?"남":"여") + ")";
	}
	
	// 사용자가 만든 클래스를 Set에 넣어 중복을 허용하지 않으려면 반드시  qeuals메서드를 만들어 주어야 한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (gender ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	// 사용자가 만든 객체를 TreeSet에 저장하려면 반드시 정렬을 지원하는 방법을 기술해 주어야 한다.
	// 정렬을 지원하는 방법은 Comparable인터페이스를 구현해 주면 된다.
	@Override
	public int compareTo(Person o) {
		// 내가크면 양수(1) 같으면(0) 인수가크면(-1)을 리턴하도록 만들어 준다.
		// return this.name.compareTo(o.name); // 이름 오름차순
		// return o.name.compareTo(name); // 이름 내림차순
		// return age - o.age; // 나이 오름 차순
		// return o.age - age; // 나이 내림 차순
		
		// 이름 내림차순 나이 오름차순
		if(o.name.compareTo(name)==0)
			return age - o.age; 
		else
			return o.name.compareTo(name);
	}

	
	
}
