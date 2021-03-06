public class DemoLogika{
	public static void main(String[] args) {
		// beberapa nilai
		int i = 37 , j = 42 , k = 42;

		System.out.println("Nilai Variabel...");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);

		// lebih besar dari
		System.out.println("Lebih Besar Dari...");
		System.out.println("i > j = " + (i>j)); //false
		System.out.println("j > i = " + (j>i)); //true
		System.out.println("k > j = " + (k>j)); //false

		// lebih besar sama dengan
		System.out.println("Lebih Besar Sama Dengan...");
		System.out.println("i >= j = " + (i>=j)); //false
		System.out.println("j >= i = " + (j>=i)); //true
		System.out.println("k >= j = " + (k>=j)); //true

		//kurang dari
		System.out.println("Kurang dari...");
		System.out.println("i < j = " + (i<j)); //true
		System.out.println("j < i = " + (j<i)); //false
		System.out.println("k < j = " + (k<j)); //false

		//kurang dari sama dengan
		System.out.println("Kurang dari sama dengan...");
		System.out.println("i <= j = " + (i<=j)); //true
		System.out.println("j <= i = " + (j<=i)); //false
		System.out.println("k <= j = " + (k<=j)); //true

		// sama dengan
		System.out.println("Sama dengan..");
		System.out.println("i == j = " + (i==j)); //false
		System.out.println("k == j = " + (j==i)); //true

		// tidak sama dengan
		System.out.println("Tidak Sama dengan..");
		System.out.println("i != j = " + (i!=j)); //true
		System.out.println("k != j = " + (j!=i)); //false
	}
}