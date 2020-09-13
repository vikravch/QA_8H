
public class People {
	private String name;
	private int height;
	private int age;
	
	public People() {
		super();
	}

	public People(String name, int height, int age) {
		super();
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", height=" + height + ", age=" + age + "]";
	}
}
