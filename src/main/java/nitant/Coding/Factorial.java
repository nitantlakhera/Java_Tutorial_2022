package nitant.Coding;

public class Factorial {
	
public static void main (String args []) {
	Factorial f = new Factorial();
	System.out.println(f.factorial(5));
}

public int factorial (int number) 
{
	if (number == 0) {
		return 1;
	} else {
		return number * factorial(number - 1);
		}
	}
}
