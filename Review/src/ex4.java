import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double N1=sc.nextDouble();
		double N2=sc.nextDouble();
		double N3=sc.nextDouble();
		double N4=sc.nextDouble();
		double media;
		
		media=(N1+N2+N3+N4)/4;
		System.out.printf("%.1f",media);
		
		
		sc.close();
	}

}
