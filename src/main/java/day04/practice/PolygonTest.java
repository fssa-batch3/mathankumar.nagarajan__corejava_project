package day04.practice;

public class PolygonTest {
	public static void main(String[] args) {
		PolygonPractice rec;
		try {

			rec = new RectangleTest(10, 5);
			System.out.println("Area of rectangle : " + rec.calculateArea());
			System.out.println( "Circumference of rectangle : " + rec.circumference());

			RightAngledTriangle ratt = new RightAngledTriangle(20.0, 10.0);
			System.out.println("Area of Rightangledtriangle : "+ratt.calculateArea());
			System.out.println( "Circumference of Rightangledtriangle : " + ratt.circumference());


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}