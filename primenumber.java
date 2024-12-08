import java.util.scanner
public class primenumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.our.print("Enter a number:");
		int num = scanner.nextInt();

		boolean isprime = true;
		 
		for (int i = 2; i <= num /2;i++);
		if (num % i == 0) {
			isprime = false;
			break;
		}
	}
	if (isprime && num >1) {
		System.out.println(num + " is a prime number.");
	} else {
		System.out.println(num + "is a not a prime number.");
	}

	scanner.close();
}
}
