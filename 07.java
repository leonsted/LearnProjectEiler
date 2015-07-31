
public class Main { 

	public static boolean is_prime(long number){
        //check for evenness
        if (number % 2 == 0)
        {
            if (number == 2)
            {
                return true;
            }
            return false;
        }
        //don't need to check past the square root
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
		 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
		 *  we can see that the 6th prime is 13.
		 *  What is the 10001st prime number?
		 */

		long Count = 0;
		long i;
		for (i = 0; Count < 10002; i++)
		{

			if (is_prime(i) == true)
				Count++;

		}
		System.out.println("Простое находящееся на 10001 позиции:");
		System.out.println((i-1));
	}
}

