import java.util.Scanner;


public class Main {   
	public static void main(String[] args) {
		/*
		 * решение квадратного уровнения
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		double a = sc.nextDouble();
		System.out.println("Введите второе число: ");
		double b = sc.nextDouble();
		System.out.println("Введите третие число: ");
		double c = sc.nextDouble();
		double x;
		if(a == 0){
			System.out.println("a не может быть раван нулю");
		}
		//находим дискриминант
		
		double D = Math.pow(b,2) - 4*a*c;
		
		if(D<0){
			System.out.println("квадратное уравнение не имеет корней");
		}else if(D==0)
		{
			System.out.println("квадратное уравнение не имеет корней");
			x = -b/2*a;
			System.out.println("Квадрат уровнения:" + x);
		}else if(D>0){
			System.out.println("квадратное уравнение имеет два корня");
			x=-b + Math.sqrt(D)/2*a;
			System.out.println("Первый корень: "+x);
			x=-b - Math.sqrt(D)/2*a;
			System.out.println("Второй корень: "+x);
		}
		
	}
}

