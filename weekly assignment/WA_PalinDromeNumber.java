package WeeklyAssignment;

public class WA_PalinDromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=101;
		int num1=num;
        int reverseNum=0;
        
        for(;num>0;)
        {
        	int val=num%10;
        	reverseNum=reverseNum*10+val;
        	num=num/10;
        }
        System.out.println(reverseNum);
        if(reverseNum==num1)
        	System.out.println(num1+" is the palindrome number");
        else
        	System.out.println(num1+" is not the palindrome number");

	}

}
