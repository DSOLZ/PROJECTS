public class DateListClient {
	public static void main(String[] args) {

		System.out.println("Let's start with an empty DateList who contains four slots.");
		DateList DL1 = new DateList(4);

		System.out.println("The list DL1 is now empty, your answer is " + (DL1.isEmpty() ? "correct.\n" : "wrong.\n"));

		Date d1 = new Date(05, 02, 2018);
		Date d2 = new Date(012, 025, 2023);
		Date d3 = new Date(0004, 00001, 2024);
		Date d4 = new Date(2, 29, 2024);

		DL1.add(d1);
		DL1.add(d2);
		DL1.add(d3);
		DL1.add(d4);

		System.out.println("After adding four different dates to DL1, it is now full; your answer is "
				+ (DL1.isFull() ? "correct.\n" : "wrong.\n"));

		Date d5 = new Date(9, 17, 2020);
		Date d6 = new Date(5, 18, 2024);

		DL1.add(d5);
		DL1.add(d6);
		System.out.println("After adding two more different dates to DL1, its size becomes 6 now. Your answer says "
				+ DL1.size() + ".\n");

		System.out.println("These are the six dates in DL1 now:");
		System.out.println(DL1);
		System.out.println();

		System.out.println("The date at index 0 is 5/2/2018; your answer says: " + DL1.get(0) + ".\n");

		Date d7 = new Date(4, 1, 2024);
		System.out.println(
				"Date d7 and d3 are the same date written in different ways; adding d7 to DL1 will fail since DateList doesn't allow duplicates.");
		DL1.add(d7);
		System.out.println("After adding d7, the size of DL1 is still " + DL1.size() + ".\n");

		DL1.remove(d7);
		System.out.println("On the other hand, we can remove d3 from DL1 by calling the remove method with d7.");
		System.out.println("After removing d3, there are five dates left:");
		System.out.println(DL1);
		System.out.println();

		System.out.println("Date d4 is now at index 2; your answer says " + DL1.search(d4) + ".\n");
		System.out.println("Date d3 is not in DL1 anymore, so its index is -1; your answer says " + DL1.search(d3) + ".");

	}
} 
