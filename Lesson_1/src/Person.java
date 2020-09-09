// Java code convention 1996
// data class, POJO - plain old java object
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this.name = "NoName";
		this.age = 23;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override // Annotation
	public String toString() {
		return super.toString()+" name - "+name+" age - "+age;
	}
}

/* Принципы ООП:
 *  - Полиморфизм: переопределение (Override), перегрузка (Overload)
 *  - Наследование
 *  - Инкапсуляция 
 *  - Абстракция - ?
 * */
