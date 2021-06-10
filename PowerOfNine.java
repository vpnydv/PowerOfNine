import java.util.*;

public class PowerOfNine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		while((n > 1) && (n % 9) == 0)
		{
			n = n/9;
		}

		System.out.println((n == 1));
	}
}
