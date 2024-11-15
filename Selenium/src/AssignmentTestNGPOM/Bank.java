package AssignmentTestNGPOM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bank {
	@Test
	public void createAccount() {
		Reporter.log("Accc Created",true);
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void editAccount() {
		Reporter.log("Acc Edited", true);
	}
	@Test(dependsOnMethods = "createAccount,editAccount")
	public void deleteAccount() {
		Reporter.log("Acc deleted",true);
	}
}
