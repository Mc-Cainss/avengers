import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.data.redis.samples.retwisj.Range;


public class RangeTest {
	
	private Range testRange = null;
	private int defaultRange =10;
	private int testValue = 11;
	
	@Test
	public void defaultRangeTest() {
		testRange = new Range();
		assertEquals(((testRange.end-testRange.begin)+1),defaultRange);
	}
	
	@Test
	public void setPageNumberTest() {
		testRange = new Range(testValue);
		assertEquals(testRange.getPages(),testValue);
	}	
	
	@Test
	public void setRangeTest() {
		int beginValue = 0;
		int endValue = 19;
		int expectedResult = 20;
		testRange = new Range(beginValue,endValue);
		assertEquals(((testRange.end-testRange.begin)+1),expectedResult);
		
	}

}
