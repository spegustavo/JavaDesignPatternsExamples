package pattern.depInjection.injectors;

import pattern.depInjection.Consumer;
import pattern.depInjection.MyDIApplication;
import pattern.depInjection.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector{
	
	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
