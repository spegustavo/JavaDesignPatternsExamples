package pattern.proxy;

import java.io.IOException;

public interface CommandExecutor {
	
	public void runCommand(String cmd) throws IOException, Exception;

}
