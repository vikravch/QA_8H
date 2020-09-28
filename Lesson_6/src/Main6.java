import java.util.ArrayList;
import java.util.Collections;

public class Main6 {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(2, 2);
		System.out.println(triangle.calculateSquare());

		Square square = new Square(5, 5);
		System.out.println(square.calculateSquare());

		Circle circle = new Circle(10);
		System.out.printf("Circle square: %.2f\n", circle.calculateSquare());
//             or we can write	
		System.out.println(new Circle(10).calculateSquare());

//		SOZDAYOM KOLLEKZIYU FIGUR
		ArrayList<CanCalculateSquare> figures = new ArrayList<>();
		figures.add(new Triangle(5, 4));
		figures.add(new Triangle(3, 2));
		figures.add(new Square(6, 6));
		figures.add(new Square(8, 9));
		figures.add(new Circle(5));
		figures.add(new Circle(9));
		System.out.println(figures);

		for (CanCalculateSquare figure : figures) {
			System.out.println(figure.calculateSquare());
		}

		Collections.sort(figures);
		System.out.println(figures);
	}

}
