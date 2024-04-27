
package unitsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class sumtest {
	
	static sum test;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		test = new sum();
	}

	@Test
	void test() {
		int tes=test.sum;
		assertEquals(4,tes);
	}

}
