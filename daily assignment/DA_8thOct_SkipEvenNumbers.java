package Day8;

public class DA_8thOct_SkipEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int i = 1;

        do {
            if (i > 15) {
                break;
            }

            if (i % 2 == 0) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;

        } while (i <= 20);

	}

}
