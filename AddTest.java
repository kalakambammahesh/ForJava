import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void testAdd() {
		Add obj = new Add();
		int result = obj.add(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testMultiply() {
		Add obj = new Add();
		int result = obj.multiply(1, 2);
		assertEquals(2, result);
	}
	
	@Test
	public void testConcatenation() {
		Add obj = new Add();
		String result = obj.concatenation("Mahesh", "K");
		assertEquals("MaheshK", result);
	}

}
