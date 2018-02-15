import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClassifyNumberTests {

	@Test
	public void isEvenTest() {
		assertTrue(ClassifyNumber.isEven(108));
		assertFalse(ClassifyNumber.isEven(5087));
		assertTrue(ClassifyNumber.isEven(-108));
		assertFalse(ClassifyNumber.isEven(-9));
		assertTrue(ClassifyNumber.isEven(0));
	}


	@Test
	public void isEvenAndPositiveTest(){
		assertTrue(ClassifyNumber.isEvenAndPositive(108));
		assertFalse(ClassifyNumber.isEvenAndPositive(-108));
		assertFalse(ClassifyNumber.isEvenAndPositive(107));
		assertFalse(ClassifyNumber.isEvenAndPositive(-107));
		assertFalse(ClassifyNumber.isEvenAndPositive(0));
	}


}
