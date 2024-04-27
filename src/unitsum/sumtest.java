
package unitsum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class sumtest {
	
	static sum test1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		test1 = new sum();
	}

	@Test
	void test() {
		int tes=test1.sum;
		assertEquals(4,tes);
	}

}
