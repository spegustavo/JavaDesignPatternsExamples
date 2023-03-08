package pattern.depInjection.injectors;

import pattern.depInjection.Consumer;
import pattern.depInjection.EmailServiceImpl;
import pattern.depInjection.MyDIApplication;

public class EmailServiceInjector implements MessageServiceInjector{
	
	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}
