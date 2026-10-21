package WeeklyAssignment;

public class WA_ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int org = num ;
		int sum = 0;
		int i = 1;
		for (; num >0;)
		{
			i = num %10;
			sum = sum + i * i* i;
			num=num/10;
		}
		if (org == sum)
			System.out.println(sum + " is an Amstrong number");
		else
			System.out.println(sum +" not an amstrong number");

	}

}
