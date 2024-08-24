
public class Main {

	public static void main(String[] args) {
		System.out.println("First, let's check some sample inputs.");
		ExpDecay test1 = new ExpDecay();
		ExpDecay test2 = new ExpDecay(-1, 0.8);
		ExpDecay test3 = new ExpDecay(2000, 0);
		ExpDecay test4 = new ExpDecay(2000, -0.05);
		ExpDecay test5 = new ExpDecay(-1, 0);
		ExpDecay test6 = new ExpDecay(2000, 2);
		ExpDecay test7 = new ExpDecay(2000, 0.08);
		ExpDecay test8 = new ExpDecay(0, 0.08);
		ExpDecay test9 = new ExpDecay(-1, -0.05);
		
		System.out.println("Test Case 1 is:" + test1);
		System.out.println("Test Case 2 is:" + test2);
		System.out.println("Test Case 3 is:" + test3);
		System.out.println("Test Case 4 is:" + test4);
		System.out.println("Test Case 5 is:" + test5);
		System.out.println("Test Case 6 is:" + test6);
		System.out.println("Test Case 7 is:" + test7);
		System.out.println("Test Case 8 is:" + test8);
		System.out.println("Test Case 9 is:" + test9);
		
		System.out.println("///////////////////////////////////////////////////////////////////");
		System.out.println("Then, let's test the decay tables for the above test cases.");
		System.out.println(test1.getTable("12,24,48") + "\n********************");
		System.out.println(test1.getTable("12,0,48") + "\n********************");
		System.out.println(test1.getTable("12,0,0") + "\n********************");
		System.out.println(test1.getTable("-2,24,48") + "\n********************");
		System.out.println(test1.getTable("-2,-1,0") + "\n********************");
		System.out.println(test1.getTable("100,200,300") + "\n********************");
		System.out.println(test2.getTable("12,24,48") + "\n********************");
		System.out.println(test3.getTable("12,24,48") + "\n********************");	
		System.out.println(test6.getTable("12,24,48") + "\n********************");
		System.out.println(test7.getTable("12,24,48") + "\n********************");
		System.out.println(test8.getTable("12,24,48") + "\n********************");
		
	}

}
