package week1.day1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 13;
		boolean isPrime = true;
		
		
		for(int i=2; i<input/2; i++) {
			if(input % i == 0)
			{
				isPrime = false;
			}
			
		}
		if(isPrime==false)
			System.out.println("not Prime");
		else
			System.out.println("prime");

	}

}
