import java.util.Scanner;

public class PhuongTrinhBacHai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Nhap gia tri cua a, b, c vao ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a == 0) {
			System.out.println("PT có nghiệm là : " + (-c / b));
		} else {
			double delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("PT vô nghiệm");
			} else if (delta == 0) {
				double x = -b / 2 * a;
				System.out.println("PT có nghiệm kép " + x);
			} else {
				double x1 = (-b - Math.sqrt(delta)) / 2 * a;
				double x2 = (-b + Math.sqrt(delta)) / 2 * a;

				System.out.println("PT có 2 nghiệm là ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);

			}

		}
	}

}