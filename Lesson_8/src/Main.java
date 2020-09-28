
public class Main {

	public static void main(String[] args) {
		String[] values = {null, "12", "0", "-", "23"};
		printDivide(values);
	}

	private static void printDivide(String[] values){
		
		for(int i=0; i<values.length; i++) {
			int temp = 1;
			try {
				System.out.println("length - "+values[i+2].length());
				temp = Integer.parseInt(values[i]);
				System.out.println("res - "+100/temp);
			} catch(NumberFormatException ex) {
				System.out.println("Trouble with value - "+values[i]);
			} catch(ArithmeticException ex) {
				System.out.println("Division by zero!");
			} catch(NullPointerException ex) {
				System.out.println("Try to work with null :(");
			} catch(Exception ex) {
				System.out.println("The reason is - "+ex.getMessage());
				System.out.println("Class of exception - "+ex.getClass().toString());
			} 
			//System.out.println(values[i]);
		}
		/*
		 * Распечатать результат деления 100 на каждый элемент массива values
		 * 
		 * */
		
		Circle circle;
		try {
			circle = new Circle(0);
			System.out.println("Square of circle - "+
					circle.calculateSquare());
		} catch (NegativeValueException e) {
			e.printStackTrace();
		} catch (ZeroValueException e) {
			e.printStackTrace();
		}
		
	}

}
