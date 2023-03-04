package actionItems;

public class AddingNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i<=15; i++) {
			sum = sum + i;
		}
		
		System.out.println("The result is "+ sum);
		
		//while loop
		
		int sum1 = 0;
		int k = 0;
		while(k<=15)
		{
			sum1 = sum1 + k;
			k++;
		}
		 System.out.println("While loop result "+ sum1);

	}

}
