package webinar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class RankTable {

	private TreeSet<Sportsman> table = new TreeSet<>();

	// with parameters
	public void addSportsman(String name, long res) {
		Sportsman newSportsman = new Sportsman(name, res);
		table.add(newSportsman);
	}

	// from console
	public void addSportsman() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input name:");
		String name = scanner.nextLine();
		System.out.println("Input result:");
		long res = scanner.nextLong();
		addSportsman(name, res);
	}

	// random generation
	public void addSportsman(int n) {
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			String name = "Name " + i;
			long res = random.nextInt(1000);
			addSportsman(name, res);
		}
	}

	public void display() {
		System.out.println("------------------------------");
		for (Sportsman sportsman : table) {
			System.out.println(sportsman);
		}
		System.out.println("==============================");
	}

	public void display(String fileName) {
		File fileDest = new File(fileName);
		
		try {
			FileWriter fw = new FileWriter(fileDest);
			fw.append("");
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(fileDest, true);
			fw.append("------------------------------\n");
			for (Sportsman sportsman : table) {
				fw.append(sportsman+"\n");
			}
			fw.append("==============================\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
