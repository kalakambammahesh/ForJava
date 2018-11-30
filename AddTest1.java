import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AddTest1 {
	Add obj;
	@Before
	public void init() {
		obj = new Add();
	}

	@Test
	void testAdd() {
		assertEquals(3, obj.add(1, 2));
	}

	@Test
	void testMultiply() {
		assertEquals(2, obj.multiply(1, 2));
	}

	@Test
	void testConcatenation() {
		assertEquals("12", obj.concatenation("1", "2"));
	}

}
