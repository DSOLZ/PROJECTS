import java.text.*;

/* Question 1 - Class Design - ExpDecay
1. What are the instance attributes, their data types and valid ranges?
	a. lambda, double, >= 0
	b. initialQty, double, all real numbers

2. What are instance methods needed, their arguments and return types?
	a. toString(), no args, String
	b. futureQuantity(), no args, double
	c. getTable(String times), times, String
	d. getInitial(), no args, double
	e. setInitial(double initialQty), initialQty, void
	f. getLambda(), no args, double
	g. setLambda(double lambda), lambda, void

3. What are the class constants needed, their data type and value?
	double DEFAULT_LAMBDA = 0.05;
	double DEFAULT_QTY = 100;
*/

/*
Question 2 - Class Test Table - ExpDecay
Create a detailed test plan. You do not have to calculate expected results, 
but please explain why each test case was chosen as related to the problem. You
may need more or less rows than are shown.

|	Test Cases for constructors	 |					   |	Reason for Test Cases	| 

1. No input ExpDecay()    							   | Error checking on default constructor
2. Positive quantity and zero lambda(100,0)            | Error checking on set method for lambda
3. Positive quantity and negative lambda(100,-3)       | Error checking on lambda value
4. Positive quantity and positive lambda(100,2)        | Correct input check
5. Negative quantity and positive lambda(-200,3)       | Error checking on set method for quantity

6. Negative quantity and negative lambda (-200,-1)     | Error checking on both values
7. Negative quantity and zero lambda(-100,0)           | Error checking on both set methods
8  Zero quantity and positive lambda(0,0.8)            | Error checking on set quantity method

9. Zero quantity and negative lambda(0,-2)             | Error checking on both set methods
10. Zero quantity and zero lambda(0,0)                 | Error checking on both methods
11. Decimal quantity and lambda(100.5,5)               |Error checking on quantity type

| 	Test Cases for getTable ()		| 	Reason for Test Cases	|

1. (10,20,30)     | Correct input check
2. (5,10,15)      | Input format check
3. (10,5,15)      | Input should be increasing
4. (-5,10,-15)    | Negative input check
5. (100,150,200)  | Improper digits for input
6. (0,0,0)        | Zero input

*/

public class ExpDecay {

	// instance variables
	private double lambda;
	private int initialQty;

	DecimalFormat six_digits = new DecimalFormat("0.000000");

	// class constants

	private static final double DEFAULT_LAMBDA = 0.05;
	private static final int DEFAULT_QTY = 100;

	// default constructor

	public ExpDecay() {
		setInitial(DEFAULT_QTY);
		setLambda(DEFAULT_LAMBDA);
	}

	// non-default constructor

	public ExpDecay(int initialQty, double lambda) {
		setInitial(initialQty);
		setLambda(lambda);
	}

	// accessor methods

	public double getLambda() {
		return lambda;
	}

	public int getInitial() {
		return initialQty;
	}
	// mutator methods

	public void setInitial(int initialQty) {
		if (initialQty >= 100) {
			this.initialQty = initialQty;
		} else
			this.initialQty = DEFAULT_QTY;
	}

	public void setLambda(double lambda) {
		if (lambda >= 0) {
			this.lambda = lambda;
		} else {
			this.lambda = DEFAULT_LAMBDA;
		}
	}

	// other methods
	public String toString() {
		return "Initial Quantity: " + six_digits.format(initialQty) + " Lambda: " + six_digits.format(lambda);
	}

	public double futureQuantity(int t) {
		double fq;
		if (t > 0) {
			fq = initialQty * Math.exp(-1 * lambda * t);
		} else {
			fq = 0;
		}
		return fq;
	}

	public String getTable(String times) {
		int length = times.length();

		String[] arrOfStr = times.split(",");

		int t1 = Integer.parseInt(arrOfStr[0]);
		int t2 = Integer.parseInt(arrOfStr[1]);
		int t3 = Integer.parseInt(arrOfStr[2]);

		if ((length == 8) && (t3 > t2 && t2 > t1) && (t1 > 0 && t2 > 0 && t3 > 0)) {
			return six_digits.format(lambda) + ";" + six_digits.format(initialQty) + ";" + t1 + ";"
					+ six_digits.format(futureQuantity(t1)) + "\n" +
					six_digits.format(lambda) + ";" + six_digits.format(initialQty) + ";" + t2 + ";"
					+ six_digits.format(futureQuantity(t2)) + "\n" +
					six_digits.format(lambda) + ";" + six_digits.format(initialQty) + ";" + t3 + ";"
					+ six_digits.format(futureQuantity(t3));
		} else
			return "";
	}

}
