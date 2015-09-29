import java.math.BigInteger;
import java.util.Scanner;


public class Main {   
	public static boolean is_prime(long number)
	{
		if (number % 2 == 0)
		{
			if (number == 2)
			{
				return true;
			}
			return false;
		}

		int max = (int)Math.sqrt(number);
		for (int i = 3; i <= max; i += 2)
		{
			if ((number % i) == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		/*
		 * Сумма простых чисел меньше 10 - это 2 + 3 + 5 + 7 = 17.
		 * Найдите сумму всех простых чисел меньше двух миллионов.
		 */
		long max = 2000000L;
		BigInteger sum = BigInteger.valueOf(2);
		long i = 3L;
		while(i<max){
			if( is_prime(i)){
				sum = sum.add(BigInteger.valueOf(i));

			}
			i = i+2;
		}

		System.out.println("Cумма простых чисел до 2000000 равна: "+ sum);
	}
}

