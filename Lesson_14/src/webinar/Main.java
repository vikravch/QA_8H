package webinar;

public class Main {

	public static void main(String[] args) {
		RankTable table = new RankTable();
		//table.addSportsman();
		//table.display();
		
		table.addSportsman(20);
		table.display();
		table.display("rank.txt");
	}

}
