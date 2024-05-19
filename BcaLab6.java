package assign;
import java.util.Scanner;
public class circumference {
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the radius of the circle ");
		double radius = Sc.nextDouble();
		double area = Math.PI * (radius + radius);
		System.out.println("The area of the circle is :"+area);
		double circumference = Math.PI*2*radius;
		System.out.println("the circumference of the circle is :"+circumference);
		

	}

}