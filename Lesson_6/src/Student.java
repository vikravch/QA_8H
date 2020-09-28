/*
 * 1. Create class Student with fields:
 * 	- id:long 100'000 ... 300'000
 *  - mark:int 20 ... 200
 * 2. Create constructor Student(id,mark), getters/setters, toString()
 * 
 * 3*. in main function create ArrayList<Student>
 * 4*. fill arrayList with 50 random objects
 * Student [id=198264, mark=38]

 * 5**. in main function sort arrayList by mark (from min to max)
 * 
 * */
/*
 * 2. Use class Student with fields:
 * 		 - id:long 100'000 ... 300'000
 * 		 - mark:int 20 ... 200
 * 	  A) Создать класс WrongIdException и WrongMarkException
 * 	  B) Выполнять проверку на допустимость данных в setId и setMark
 * 
 * */
public class Student implements Comparable<Student> {
	private long id;
	private int mark;

	public Student(long id, int mark) {
		super();
		this.id = id;
		this.mark = mark;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student that) {
		int res = Integer.compare(this.mark, that.mark);
		return res;
	}
}
