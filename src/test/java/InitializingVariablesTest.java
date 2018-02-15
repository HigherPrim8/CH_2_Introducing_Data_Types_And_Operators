import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InitializingVariablesTest {


	@Test
	public void returnStringTest() {
		assertTrue(InitializingVariables.returnString("This is a string").getClass().equals(String.class));
	}


	@Test
	public void returnLongTest() {
		Object o = InitializingVariables.returnLong(12345678);
		assertTrue(o.getClass().equals(Long.class));
	}

	@Test
	public void returnCharacterTest() {
		Object c = InitializingVariables.returnCharacter('r');
		assertTrue(c.getClass().equals(Character.class));
	}


}
