package pattern.depInjection;

import pattern.depInjection.injectors.EmailServiceInjector;
import pattern.depInjection.injectors.MessageServiceInjector;
import pattern.depInjection.injectors.SMSServiceInjector;

public class DepInjectionMain {
	
	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
