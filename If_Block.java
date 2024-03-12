package conditional_stmts;

//Assignment-8
public class If_Block {

	public static void main(String[] args) {
		// Example 1
		int a = 100;
		int b = 200;
		if (b > a) // true
		{
			int sum = a + b;
			System.out.println(sum);
		}

		/*
		 * //Example2 int a=100; int b=200; if(a>b)//false { System.out.println("MKT");
		 * } System.out.println("Optional"); //because it is out of the if block
		 * statement
		 */

		// Example 3
		/*
		 * int a=100; int b=200; System.out.println("Shiva"); if(a>b) {
		 * System.out.println("MKT"); } System.out.println("Optional");
		 */
	}
}