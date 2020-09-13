
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
		int res = Long.compare(this.finishResult, that.finishResult);
		return res;
	}
	
	
}
