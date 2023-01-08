import java.util.Scanner;
public class armstrong
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n \"Check Armstrong Number\"");
		Scanner input = new Scanner (System.in);
		int num, sum = 0, temp;
		System.out.print("\n\nEnter Numbers :");
		num = input.nextInt();

		temp = num;

		while(temp != 0)
		{
			int r = temp % 10;
			
			sum = sum + r*r*r;
			
			temp = temp/10;
		}
		System.out.println("\n\n After calculation the sum of the numbers is :  "+sum);
		System.out.print("\n\nAn Armstrong number is one whose sum of digits raised to the power three equals the number itself. 371, for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371.");
		if(num == sum)
		{
			System.out.println("\n\nSo " +sum+ " is an Armstrong Number");
		}
		else
		{
			System.out.println("\n\nSo " +sum+ " is not an Armstrong Number");
		}
	}
}