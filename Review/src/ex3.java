import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double lado1 = sc.nextDouble(), lado2 = sc.nextDouble();
		double perimetro, area;

		perimetro = (lado1 * 2) + (lado2 * 2);
		area = lado1 * lado2;

		System.out.printf("O valor do perimetro é %.1f\n" , perimetro);
		System.out.printf("O valor da area é %.1f " , area);

		sc.close();
	}

}
