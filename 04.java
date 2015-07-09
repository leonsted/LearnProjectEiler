import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int pal;
		int max = 0;
		int maxP;
		for(int znach1 = 100;znach1<1000;znach1++){
			for(int znach2 = 100; znach2<1000; znach2++){
				pal = znach1*znach2;
				String sPal = Integer.toString(pal);
				String str = new StringBuffer(sPal).reverse().toString();
				if(sPal.equals(str)){
					maxP = Integer.parseInt(str);
					if(max<maxP){
						max =maxP;
					}else System.out.println("Наибольший палиндром: "+max);
				}	
			}

		}
	}
}
