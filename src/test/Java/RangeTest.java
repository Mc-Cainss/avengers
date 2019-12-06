import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Range;


public class RangeTest {
	
	private Range testRange = null;
	
	@Test
	public void defaultRangeTest() {
		testRange = new Range();
		assertEquals(((testRange.end-testRange.begin)+1),10);
		System.out.println("getpage"+testRange.getPages());
	}
	
	@Test
	public void setPageNumberTest() {
		testRange = new Range(11);
		assertEquals(testRange.getPages(),11);
	}	
	
	@Test
	public void setRangeTest() {
		int beginValue = 0;
		int endValue = 19;
		testRange = new Range(beginValue,endValue);
		assertEquals(((testRange.end-testRange.begin)+1),20);
		
	}

}
