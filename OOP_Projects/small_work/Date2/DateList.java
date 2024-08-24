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
		return (size == 0);
	}

	public boolean isFull() {
		return (size == dateArray.length);
	}

	public boolean isThere(Date d) {
		for (Date d1 : dateArray) {
			if (d1 != null && d.equals(d1)) {
				return true;
			}
		}
		return false;
	}

	public Date get(int index) {
		try {
			return dateArray[index].clone();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("null Date object!");
		}
		return null;
	}

	public int search(Date d) {
		int pointer = 0;
		while (pointer < size) {
			if (dateArray[pointer].equals(d)) {
				return pointer;
			}
			pointer++;
		}
		return -1;
	}

	public void remove(Date d) {
		int loc = search(d);
		if (loc == -1) {
			return;
		}
		for (int i = loc; i < size - 1; i++) {
			dateArray[i] = dateArray[i + 1];
		}

		size -= 1;

	}

	public void add(Date d) {

		if (isThere(d)) {
			return;
		}

		if (isFull()) {
			Date[] newDateList = new Date[size * 2];
			for (int i = 0; i < size; i++) {
				newDateList[i] = dateArray[i];
			}
			dateArray = newDateList;
		}

		dateArray[size] = d;
		size += 1;
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
	
	////////////////////////////////////////////
	/////// Lab Assignment 9 starts here ///////
	////////////////////////////////////////////

	public void sort() { // use insertion sort algorithm
        for (int i = 1; i < size; i++) {
            Date current = dateArray[i];
            int j = i - 1;
            while (j >= 0 && dateArray[j].compareTo(current) > 0) {
                dateArray[j + 1] = dateArray[j];
                j--;
            }
            dateArray[j + 1] = current;
        }
	}

	public void sortByMonth() { // use selection sort algorithm
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (dateArray[j].getMonth() < dateArray[minIndex].getMonth()) {
                    minIndex = j;
                }
            }
            Date temp = dateArray[minIndex];
            dateArray[minIndex] = dateArray[i];
            dateArray[i] = temp;
        }

	}

	public void sortByDay() { // use bubble sort algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (dateArray[j].getDay() > dateArray[j + 1].getDay()) {
                    Date temp = dateArray[j];
                    dateArray[j] = dateArray[j + 1];
                    dateArray[j + 1] = temp;
                }
            }
        }
	}

	public int binarySearch(Date d) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comp = dateArray[mid].compareTo(d);
            if (comp == 0) {
                return mid; 
            } else if (comp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

}