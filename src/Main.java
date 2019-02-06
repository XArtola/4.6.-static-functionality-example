
/**
* @author ir013043zb
*
*/

//Changed fromk package to import
import com.zubiri.ariketak.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Counter a = new Counter();
		Counter b = new Counter();
		Counter c = new Counter();

		System.out.println("public static int countA: " + Counter.countA);
		System.out.println("public int getCounterA: " + a.getCounterA());
		//As the method get counterA is public we need to "call" it with an object of counter class
		System.out.println("public int getCounterA: " + a.getCounterA());

		//As countB is a private variable the only way to get its value is with a get method used by an object
		System.out.println("private static int countB: " + a.getCounterB());
		System.out.println("public int getCounterB: " + b.getCounterB());
		//As the method get counterA is public we need to 22call" it with an object of counter class
		System.out.println("public int getCounterB: " + a.getCounterB());

		System.out.println("Bikoitia al da A? " + Counter.isEvenA());
		System.out.println("Bikoitia al da (_num=3)? " + Counter.isEven(3));
		System.out.println("Bikoitia al da (_num=4)? " + Counter.isEven(4));
	}

}