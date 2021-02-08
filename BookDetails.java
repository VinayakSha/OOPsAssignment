package oopsAssignment;
class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return 21234;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return "Business of 21st Century";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return "Robert T Kiyosaki";
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return 560;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book
{
	private String category;
	
}
class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Book b=new Book();
 b.getBookNo();
 b.getTitle();
 b.getPrice();
 b.getAuthor();
 
 
 System.out.println("Book no is "+b.getBookNo());
 System.out.println("Tiltle is "+b.getTitle());
 System.out.println("Author is "+  b.getAuthor());
 System.out.println("Price is "+b.getPrice());
 
	}
 
	}


