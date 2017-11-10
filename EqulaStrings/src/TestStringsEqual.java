import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStringsEqual {
	
	@Test
	public void TestingStrings() {
		StringsAreEqual se = new StringsAreEqual();
		Assert.assertTrue(se.equalStrings("pavani", "ianvap"), "not equal");
	}
	

}
