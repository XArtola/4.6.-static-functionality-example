/**
*
*/
package com.zubiri.ariketak;

/**
 * @author ir013043zb
 *
 */
public class Counter {

	public static int countA = 0;
	private static int countB = 0;

	//As the counter was not as public i was not able to instance objects of this class
	
	public Counter() {
		countA++;
		countB++;
	}

	public int getCounterA() {
		return countA;
	}

	
	
	public int getCounterB() {
		return countB;
	}

	public static boolean isEvenA() {
		if (countA % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isEven(int _num) {
		if (_num % 2 == 0) {
			return true;
		}
		return false;
	}
}