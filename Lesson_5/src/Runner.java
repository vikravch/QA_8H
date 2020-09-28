
public class Runner extends SportsMan implements Comparable<Runner> {
	
	private long finishResult;

	public Runner(String name, int height, 
			int age, int rank, int bestResult, 
			long finishResult) {
		super(name, height, age, rank, bestResult);
		this.finishResult = finishResult;
	}

	@Override
	public String toString() {
		return "Runner [finishResult=" + finishResult + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Runner that) {
		
		// Long.compare > 0 -> this.finishResult > that.finishResult
		// Long.compare < 0 -> this.finishResult < that.finishResult
		// Long.compare == 0 -> this.finishResult == that.finishResult
		
		int res = Long.compare(this.finishResult, that.finishResult);
		return res;
	}
}

/*
 * 1. Create class Student with fields:
 * 	- id:long 100'000 ... 300'000
 *  - mark:int 20 ... 200
 * 2. Create constructor Student(id,mark), getters/setters, toString()
 * 
 * 3*. in main function create ArrayList<Student>
 * 4*. fill arrayList with 50 random objects
 * 
 * 5**. in main function sort arrayList by mark (from min to max)
 * 
 * */
