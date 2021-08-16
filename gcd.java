import java.util.*;
public class Main {
	static int gcd(int x, int y)
    {
      if (y == 0)
        return x;
      return gcd(y, x % y);
    }
	public static void main(String[] args) {
	    int a=43, b=91, c=183;
	    int res = gcd(b-a,c-b);
	    System.out.println("The greatest number that will divide 43, 91 and 183 is: "+gcd(res,c-a));
	}
}
