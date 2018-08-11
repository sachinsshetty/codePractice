package refactor_book.chapterfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTest {

	FileReader _input;

	@Before
	public void setUp() {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			_input = new FileReader(classLoader.getResource("data.txt").getFile());
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to open test file");
		}
	}

	@After
	public void tearDown() {
		try {
			_input.close();

		} catch (IOException e) {
			throw new RuntimeException("Error on closing test file");
		}
	}

	@Test
	public void readTest() throws IOException {
		char ch = '&';
		for (int i = 0; i < 4; i++) {
			ch = (char) _input.read();
		}
		assert ('d' == ch);
	}

	// When you get a bug report, start by writing a unit test that exposes the
	// bug.

}
