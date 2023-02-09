package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.println("What number 'n' do you want to choose?");

		int userN = in.nextInt();

		boolean[] keepPrime = new boolean[userN +1];  
		
		
		for (int j = 0; j < userN; j++) 
			keepPrime[j] = true;

		for (int newPrime = 2; newPrime <= userN/2; newPrime++)
		{
			for (int number = 2; number * newPrime <= userN; number++) {
				
				keepPrime[newPrime * number] = false;
		}
		}
		for (int i = 2; i< userN; i++) {
			
			if (keepPrime[i] == true)
				System.out.println(i);
		}
			
		
		
	
	
	}

}
