import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 2520 is the smallest number that can be divided by
		 *  each of the numbers from 1 to 10 without any remainder.
		 * What is the smallest positive number that is evenly divisible by all 
		 * of the numbers from 1 to 20?
		 */

		int answer = 0;
		int number;
		boolean isFound = false;

		for(number = 20;isFound == false;number+=20){

			for(int count= 1;count <21;count++){

				if(number%count == 0 && count !=20){
					continue;
				}
				else if(number%count != 0)
					break;

				else if(number % count == 0 && count == 20){
					answer = number;
					isFound = true;
				}
			}
		}
		System.out.println("Наименьшее число которое делится на цифры от 1 до 20: " + answer);
	}

}

