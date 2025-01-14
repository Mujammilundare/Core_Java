import java.util.*;

 class Book implements Comparable 
	{
    String title;
    int    isbn;

    Book(String title, int isbn) 
		{
        this.title = title;
        this.isbn  = isbn;
       }

    public int compareTo(Object object) 
		{
        Book other = (Book) object;
        if (this.title.equals(other.title))
			{
               return this.isbn - other.isbn;
            }

        return this.title.compareTo(other.title);
    }
}

 

public class TestCollections 
	{
    public static void main(String[] args) 
		{
        List list = new LinkedList();
        list.add(new Book("Patterns", 12345));
        list.add(new Book("Patterns", 34567));
        list.add(new Book("Examples", 23456));

        Collections.sort(list);

        Collections.sort(list, new Comparator() 
			{
            public int compare(Object obj1, Object obj2) 
				{
                Book book1 = (Book) obj1;
                Book book2 = (Book) obj2;
                return book1.isbn - book2.isbn;
              }
        });
    }
}

 
