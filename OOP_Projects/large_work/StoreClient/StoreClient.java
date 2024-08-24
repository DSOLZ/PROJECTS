
public class StoreClient {

	public static void main(String[] args) {

		System.out.println("Let's create stores of different types.\n");
		System.out.println("Corner Grocery is a small grocery store, it's not a chain:");
		GroceryStore g1 = new GroceryStore("Corner Grocery", false, 8000);
		System.out.println(g1);
		System.out.println(g1.getName() + " has a monthly in-store income (before tax): "
				+ g1.MONEY.format(g1.getMonthlyInstoreIncome()) + "\n");

		System.out.println("Halsted Grocery is a grocery store, it is part of a chain:");
		GroceryStore g2 = new GroceryStore("Halsted Grocery", true, 20000);
		System.out.println(g2);
		System.out.println(g2.getName() + " has a monthly in-store income (before tax): "
				+ g2.MONEY.format(g2.getMonthlyInstoreIncome()) + "\n");

		System.out.println("Walmart (Halsted Store) is a super grocery store:");
		SuperGroceryStore sg3 = new SuperGroceryStore("Walmart (Halsted Store)", 30000, "walmart.com", 20000);
		System.out.println(sg3);
		System.out.println(sg3.getName() + " has a monthly in-store income (before tax): "
				+ sg3.MONEY.format(sg3.getMonthlyInstoreIncome()));
		System.out.println(sg3.getName() + " has a monthly online income (before tax): "
				+ sg3.MONEY.format(sg3.getMonthlyOnlineIncome()) + "\n");

		System.out.println("Wilde's is a restaurant:");
		Restaurant r4 = new Restaurant("Wilde's", 2000, 29.75, "wildes.com");
		System.out.println(r4);
		System.out.println(r4.getName() + " serves " + r4.getMonthlyGuest()
				+ " guests every month with an average price " + r4.MONEY.format(r4.getAveragePrice()) + "\n");

		System.out.println("Corner Tacos is also a restaurant:");
		Restaurant r5 = new Restaurant("Corner Tacos", 8000, 6.50, "cornertacos.com");
		System.out.println(r5);
		System.out.println(r5.getName() + " serves " + r5.getMonthlyGuest()
				+ " guests every month with an average price " + r5.MONEY.format(r5.getAveragePrice()) + "\n");

		System.out.println("Apple Music is a music store:");
		MusicStore m6 = new MusicStore("Apple Music", 35000000, 0.55, "apple.com");
		System.out.println(m6);
		System.out.println(m6.getName() + " has " + m6.getMonthlyDownloads()
				+ " downloads every month with an average price " + m6.MONEY.format(m6.getAveragePrice()) + "\n");
		System.out.println("***************************************************************************************");

		System.out.println("To show polymorphism, let's create an array of Stores.");

		Store[] stores = { g1, g2, sg3, r4, r5, m6 };
		System.out.println("Let's print out each store in this array together with their monthly income (after tax): \n");
		
		for (int i=0;i<stores.length;i++) {
			System.out.println(stores[i] + "; Monthly Income (after tax):" + stores[i].MONEY.format(stores[i].afterTaxIncome()));
		}

	}

}