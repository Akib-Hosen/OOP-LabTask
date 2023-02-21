import java.lang.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("-----------------------StoryBook--------------------");
		
		StoryBook s1 = new StoryBook();
		s1.setIsbn("67A48D");
		s1.setBookTitle("Durbin");
		s1.setAuthorName("Shirshendu");
		s1.setPrice(600);
		s1.setAvaiableQuantity(5);
		s1.setCategory("Fiction");
		s1.setDiscountRate(450);
		
		
		System.out.println("ISBN: " +s1.getIsbn());
        System.out.println("Title: " +s1.getBookTitle());
        System.out.println("Author: " +s1.getAuthorName());
        System.out.println("Price: " +s1.getPrice());
        System.out.println("Available Quantity: " +s1.getAvailableQuantity());
        System.out.println("Category: " +s1.getCategory());
        System.out.println("Discount Rate: " +s1.getDiscountRate());
		
		
		s1.addQuantity(10);
		System.out.println("Current quantity: " +s1.getAvailableQuantity());
		
		s1.sellQuantity(5);
		System.out.println("Current quantity: " +s1.getAvailableQuantity());
		
		s1.sellQuantity(2);
		System.out.println("Current quantity: " +s1.getAvailableQuantity());
		
		
		
		
		System.out.println("...............................................................");
		
		
		StoryBook s2 = new StoryBook("47D55F4", "Deyal","Humayun", 550.0, 4, "Novel");
		s2.showDetails();
		
		
		
		
		s2.addQuantity(15);
		System.out.println("Current quantity: " +s2.getAvailableQuantity());
		
		s2.sellQuantity(8);
		System.out.println("Current quantity: " +s2.getAvailableQuantity());
		
		s2.sellQuantity(10);
		System.out.println("Current quantity: " +s2.getAvailableQuantity());
		
		
		
		
		System.out.println("-----------------------TextBook--------------------");
		
		TextBook t1 = new TextBook();
		t1.setIsbn("97A48F");
		t1.setBookTitle("Physics");
		t1.setAuthorName("NCTB");
		t1.setPrice(400);
		t1.setAvaiableQuantity(12);
		t1.setStandard(9);
		t1.setDiscountRate(300);
		
		System.out.println("ISBN: " +t1.getIsbn());
        System.out.println("Title: " +t1.getBookTitle());
        System.out.println("Author: " +t1.getAuthorName());
        System.out.println("Price: " +t1.getPrice());
        System.out.println("Available Quantity: " +t1.getAvailableQuantity());
        System.out.println("Category: " +t1.getStandard());
        System.out.println("Discount Rate: " +t1.getDiscountRate());
		
		
		t1.addQuantity(10);
		System.out.println("Current quantity: " +t1.getAvailableQuantity());
		
		t1.sellQuantity(5);
		System.out.println("Current quantity: " +t1.getAvailableQuantity());
		
		t1.sellQuantity(10);
		System.out.println("Current quantity: " +t1.getAvailableQuantity());
		
		
		System.out.println("...............................................................");
		
		
		
		TextBook t2 = new TextBook("57G45H4", "Biology","NCTB", 350, 10, 9);
		t2.showDetails();
		
		
		
		t2.addQuantity(5);
		System.out.println("Current quantity: " +t2.getAvailableQuantity());
		
		t2.sellQuantity(5);
		System.out.println("Current quantity: " +t2.getAvailableQuantity());
		
		t2.sellQuantity(2);
		System.out.println("Current quantity: " +t2.getAvailableQuantity());
		
		
	}
}