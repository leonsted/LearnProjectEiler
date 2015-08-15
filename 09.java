
public class Main {   
	public static void main(String[] args) {

		/*
		 * Тройка Пифагора - три натуральных числа a < b < c, для которых выполняется равенство
		 * a2 + b2 = c2
		 * Например, 32 + 42 = 9 + 16 = 25 = 52.
		 * Существует только одна тройка Пифагора, для которой a + b + c = 1000.
		 * Найдите произведение abc.
		 */


		double a = 0;
		double b = 0;
		double c = 0;
		double d =0;
		int e =1;
		int f =1;

		double quad = 2;

		for(e = 1;e<1000;e++)
			for(f =1;f<1000;f++)
			{
				a = 2*e*f;
				b = Math.pow(e, 2) - Math.pow(f, 2);
				c = Math.pow(e, 2) + Math.pow(f, 2);
				d = a+b+c;

				if(d == 1000 && a >0 && b >0 && c > 0){ 
					System.out.printf("A:" + a);
					System.out.printf("B:"+b);
					System.out.printf("C:"+c);
					System.out.printf("ABC:" + a*b*c);
				}
			}
	}
}

