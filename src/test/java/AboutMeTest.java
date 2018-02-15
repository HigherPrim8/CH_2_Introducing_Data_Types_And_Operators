import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AboutMeTest {

	private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@BeforeEach
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	public void cleanupStream() {
		System.setOut(null);
	}

	@Test
	public void escapeCharactersTest() {
		AboutMe.whoAmI();
		assertEquals("Ross \n35 \n I haven't decided on a pronoun yet so I can't really answer this question. ", outContent.toString());
	}
}
