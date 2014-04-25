package BookServices;

import javax.inject.Inject;

@Loggable
public class BookService {
	
	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;
	
	public Book createBook(String title, Float price, String description){
		return new Book(title, price, description, numberGenerator.generateNumber());
	}
}
