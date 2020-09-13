
public class SportsMan extends People {
	
	private int rank;
	private int bestResult;
	

	public SportsMan(String name, 
			int height, int age, 
			int rank, int bestResult) {
		super(name, height, age);
		this.rank = rank;
		this.bestResult = bestResult;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getBestResult() {
		return bestResult;
	}

	public void setBestResult(int bestResult) {
		this.bestResult = bestResult;
	}

	@Override
	public String toString() {
		return "SportsMan [rank=" + rank + ", bestResult=" + bestResult + ", toString()=" + super.toString() + "]";
	}
}
