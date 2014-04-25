package BookServices;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import java.util.logging.Logger;


public class LoggingProducer {
	
	@Produces
	public Logger produceLogger(InjectionPoint injP){
		return Logger.getLogger(injP.getMember().getDeclaringClass().getName());
	}
}
