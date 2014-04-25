package BookServices;

import java.util.Random;
import javax.inject.Inject;

import java.util.logging.Logger;

@ThirteenDigits 
public class IsbnGenerator implements NumberGenerator {
	
	@Inject
	private Logger logger;
	
	public String generateNumber(){
		String isbn = "13-84356" + Math.abs(new Random().nextInt());
		logger.info("Generated ISBN : " + isbn);
		return isbn;
	}

}
