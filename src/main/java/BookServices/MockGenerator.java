package BookServices;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import java.util.logging.Logger;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

	@Inject
	private Logger logger;
	
	public String generateNumber(){
		String mockstr = "MOCK-" + Math.abs(new java.util.Random().nextInt());
		logger.info("Generated MOCK : " + mockstr);
		return mockstr;
	}
	
}
