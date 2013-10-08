import static org.junit.Assert.*;

import org.junit.Test;


public class MissingElementTests {
	MissingElement m = new MissingElement();
	@Test
	public void test() {
		assertEquals(m.solution(new int[]{2, 3, 1, 5, 4, 6, 7, 9}), 8);
	}

}
