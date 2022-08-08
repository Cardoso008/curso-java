import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double b, B, h, area;
		System.out.println("Este aplicativo calcula o valor da área de um trapézio");
		System.out.printf("Digite o valor da base menor: ");
		b= sc.nextDouble();
		System.out.printf("Digite o valor da base maior: ");
		B= sc.nextDouble();
		System.out.printf("Digite o valor da altura: ");
		h= sc.nextDouble();
		area= (b+B)/2*h;
		System.out.printf("O valor da área é: %.2f", area);
		sc.close();
	}

}
