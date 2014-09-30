package MainPackage;

import org.junit.*;
import static org.junit.Assert.*;

public class MyClassTest {
	
@Test
	public void ReturnTrueTest() {
	assertTrue("This statement is true ", MyClass.ReturnTrue());
	}

@Test
	public void AddTwoNumbersTest(){
		assertNotNull("Should return a non-null number ", MyClass.AddTwoNumbers(10,10));
	}
}