package skillenza.solum.primegrid;

import java.util.Scanner;

public class PrimeGrid {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		Integer testcase = Integer.valueOf(in.nextLine());
		
		while(testcase > 0)
		{
			Integer rows = in.nextInt();
			Integer cols = in.nextInt();
			
			Integer[][] grid = new Integer[rows][cols];
			
			for(int row =0; row< rows; row++)
			{
				for(int col = 0; col<cols; col++)
				{
					grid[row][col] = in.nextInt();
				}
			}
			
			int countHori = 0;
			boolean isPrevPrime = false;
			for(int row =0; row< rows; row++)
			{
				for(int col = 0; col <cols; col++)
				{
					if(isPrime(grid[row][col]))
					{
						if(!isPrevPrime)
						{
							countHori++;
							isPrevPrime = true;
						}
					}
					else
					{
						isPrevPrime = false;
					}
				}
			}
			System.out.println(countHori);
		}
	}
	
	private static boolean isPrime(int n) {
		if(n == 1)
		{
			return false;
		}
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
