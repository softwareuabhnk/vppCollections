package performance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import sortingObjects.Book;

public class Main {

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		double[] result = new double[10];
		
		List<Book> list = new LinkedList<Book>();

		for (int noTimes = 0; noTimes < 10; noTimes++) {

			for (int i = 0; i < 100000; i++) {
				list.add(new Book(i, "test" + randomGenerator.nextInt(2000000), "test" + i));
			}

			Long start = System.nanoTime();
			Collections.sort(list, new TitleSort());
			Long end = System.nanoTime();
			
			result[noTimes] = ((end - start) / 1e6);
			System.out.println("ArrayList: " + result[noTimes]);
			
		}
	}
}
