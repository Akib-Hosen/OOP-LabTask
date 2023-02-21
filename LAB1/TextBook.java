import java.lang.*;

public class TextBook
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private int standard;
	private static double discountRate;
	
	
	public TextBook()
	{
		
	}
	
	
	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.standard = standard;	
	}
	
	
	
	public static void setDiscountRate(double rate)
	{
		discountRate = rate;
	}
	public static double getDiscountRate()
	{
		return discountRate;
	}
	
	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	
	
	public String getIsbn()
	{
		return this.isbn;
	}
	public String getBookTitle()
	{
		return this.bookTitle;
	}
	public String getAuthorName()
	{
		return this.authorName;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getAvailableQuantity()
	{
		return this.availableQuantity;
	}
	public int getStandard()
	{
		return this.standard;
	}
	
	public void addQuantity(int amount)
	{
		availableQuantity += amount;
        System.out.println(amount + " units added to the product quantity.");
	}
	
	public void sellQuantity(int amount)
	{
		if (availableQuantity < amount) {
            System.out.println("Error: not enough product quantity to sell.");
        } else {
            availableQuantity -= amount;
            System.out.println(amount + " units sold. Remaining quantity: " +availableQuantity);
        }
	}
	
	public void showDetails()
	{
		System.out.println("ISBN: " +isbn);
        System.out.println("Title: " +bookTitle);
        System.out.println("Author: " +authorName);
        System.out.println("Price: " +price);
        System.out.println("Available Quantity: " +availableQuantity);
        System.out.println("Standard: " +standard);
        System.out.println("Discount Rate: " +discountRate);
	}
}
