public class DateList {
	private Date[] dateArray;
	private int size;
	private static final int DEFAULT_SIZE = 10;

	public DateList() {
		dateArray = new Date[DEFAULT_SIZE];
		size = 0;
	}

	public DateList(int arrayLength) {
		dateArray = new Date[arrayLength];
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == dateArray.length;
	}

	public boolean isThere(Date d) {
		for(Date date : dateArray){
			if (date != null && date.equals(d)){
				return true;
			}
		}
		return false;
	}

	public Date get(int index) {
		try {
			return dateArray[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("index out of bounds");
		}
		return null;
	}

	public int search(Date d) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (dateArray[i].equals(d)) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void remove(Date d) {

		int index = search(d);
		if (index == -1) {
			return;
		}

		for (int i = index; i < size - 1; i++) {
			dateArray[i] = dateArray[i + 1];
		}

		size--;

	}
	
	public void add(Date d) {

		if (isThere(d)) { // To prevent duplicates
			return;
		}

		if (isFull()) {
			Date[] newDateArray = new Date[size * 2];
			for (int i = 0; i < size; i++) {
				newDateArray[i] = dateArray[i];
			}
			dateArray = newDateArray;
		}

		dateArray[size] = d.clone();
		size++;
	}

	public String toString() {
		String output = "[";

		for (int i = 0; i < size; i++) {

			output += dateArray[i].toString();

			if (i != size - 1) {
				output += ",\n";
			} else {
				output += "]";
			}

		}

		return output;
	}
}