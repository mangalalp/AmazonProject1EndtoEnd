package amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogicprogramm  implements IRetryAnalyzer{
   int retryCount=2;
   int initialCount=0;
	@Override
	public boolean retry(ITestResult result) {
		if(initialCount<retryCount)
		{
			initialCount++;
			return true;
		}
		
		return false;
	}

}
