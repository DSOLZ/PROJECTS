public class DateListClient2 {
	public static void main(String[] args) {

		System.out.println("Let's start with a DateList with 7 different dates.");
		DateList DL1 = new DateList(4);

		Date d1 = new Date(05, 02, 2018);
		Date d2 = new Date(12, 25, 2023);
		Date d3 = new Date(4, 1, 1977);
		Date d4 = new Date(2, 29, 2024);
		Date d5 = new Date(9, 17, 2020);
		Date d6 = new Date(1, 18, 2025);
		Date d7 = new Date(4, 1, 2024);

		DL1.add(d1);
		DL1.add(d2);
		DL1.add(d3);
		DL1.add(d4);
		DL1.add(d5);
		DL1.add(d6);
		DL1.add(d7);

		System.out.println(DL1);
		System.out.println();

		System.out.println("Let's sort these seven dates by their months:");
		DL1.sortByMonth();
		System.out.println(DL1);
		System.out.println();

		System.out.println("Then, let's sort these seven dates by their days:");
		DL1.sortByDay();
		System.out.println(DL1);
		System.out.println();

		System.out.println("Next, let's sort these seven dates in chronological order:");
		DL1.sort();
		System.out.println(DL1);
		System.out.println();

		System.out.println("Now since the dates are sorted, we can binary search for dates in the list.");
		Date d8 = new Date(9, 17, 2020);
		System.out.println(
				"09/17/2020 is a date at index 2, your binary search method returns " + DL1.binarySearch(d8) + ".");
		Date d9 = new Date(9, 18, 2020);
		System.out.println(
				"09/18/2020 is a date not in the list, your binary search method returns " + DL1.binarySearch(d9) + ".");
	}
}