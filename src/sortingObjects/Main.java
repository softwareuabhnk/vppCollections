package sortingObjects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;


public class Main {
	
	public static void main(String[] args) {
		
		Map<Book, Integer> books = new HashMap<Book, Integer>();

        
		Book book1 = new Book(1,"The Lord of the Rings","J. R. R. Tolkien");
		books.put(book1, 1);
		//books.put(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"), 1);
		
		books.put(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"), 2);
		books.put(new Book(3,"Harry Potter and the Philosopher's Stone","J.K. Rowling"), 3);
		books.put(new Book(4,"And Then There Were None","Agatha Christie"), 4);
		books.put(new Book(5,"Dream of the Red Chamber","Cao Xueqin"), 5);
		books.put(new Book(6,"The Hobbit","J. R. R. Tolkien"), 6);
		books.put(new Book(7,"She: A History of Adventure","H. Rider Haggard"), 7);
		books.put(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"), 8);
		books.put(new Book(9,"The Da Vinci Code","Dan Brown"), 9);
		books.put(new Book(10,"The Catcher in the Rye","J. D. Salinger"), 10);
		books.put(new Book(11,"The Hobbit","J. A. A. Milne"), 11);

		
		Integer result = books.get(new Book(6,"The Hobbit","J. R. R. Tolkien"));
		System.out.println(result);
		
		Integer result2 = books.get(book1);
		System.out.println(result2);
		
	}
}
