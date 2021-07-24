package hashmap;
import org.junit.jupiter.api.Test;

/* JUnit Test Case for testing Hashmap pairing
 * Class 'MatchIntegers' inherits target and array data
 */

class MatchIntegerTest {

	int[] values = {1,2,3,4,5}; //test array
	int target = 6; //test target to find
	
	@Test
	void test() {
		MatchIntegers s = new MatchIntegers();
		s.findPair();
	}
}
