
public class Book {

	int id;
	String name_of_book;
	String author;
	String publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name_of_book=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
	void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name_of_book);
        System.out.println("author="+author);
        System.out.println("publisher="+publisher);
        System.out.println("quantity="+quantity);
    }
}
